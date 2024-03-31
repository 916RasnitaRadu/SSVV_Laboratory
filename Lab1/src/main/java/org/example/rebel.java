package org.example;

/*
The Song class encapsulates the name of the song and a list of beats. It provide methods to retrieve the name of the song and the list of beats
The IntensityCalculator is a class created to respect the Single Responsability principle that will calculate the intensity for a song given as parameter
The interface Beat serves as a base for both normal beats and drops. Allows flexibility in representing different types of beats.
NormalBeat class represents a normal beat in a song. No other properties needed.
Drop class represents the special beat with an intensity level and a method to get it
The Factory design could be used for the NormalBeat and Drop instantiation, but I considered that here was not the case.
The method getTop3Songs in the SongPlaylist class gets the list of the songs entered by the user, sorts them and returns the top 3 that are closest to the average of the drops.
Because the beat must be mild, we compute the average of the total drop intensities for each song (getAverageOfDropIntensity method), than we take the song that has
the total drop intensity closest to the average (we do it 3 times) with the getClosestNumberInArray method.
*/

import java.util.*;

class Song {
    private final String name;
    private final List<Beat> beats;

    public Song(String name, List<Beat> beats) {
        this.name = name;
        this.beats = beats;
    }

    public String getName() {
        return name;
    }

    public List<Beat> getBeats() {
        return beats;
    }
}


interface Beat{ }

class NormalBeat implements Beat{

}

class Drop implements Beat {
    private final int intensity;

    public Drop(int inte) {
        this.intensity = inte;
    }

    public int getIntensity() {
        return intensity;
    }
}

class IntensityCalculator {
    public static int getTotalDropIntensity(Song song) {
        int totalIntensity = 0;
        for (Beat beat : song.getBeats()) {
            if (beat instanceof Drop) {
                Drop drop = (Drop) beat;
                totalIntensity += drop.getIntensity();
            }
        }
        return totalIntensity;
    }
}


class rebel {

    public static void main(String[] args) {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("Drugs From Amsterdam", Arrays.asList(new NormalBeat(), new Drop(5), new Drop(6), new NormalBeat())));
        songs.add(new Song("Astronaut in the Ocean", Arrays.asList(new NormalBeat(), new Drop(2), new Drop(4), new NormalBeat())));
        songs.add(new Song("Hearts on Stereo", Arrays.asList(new NormalBeat(), new Drop(1), new Drop(6), new NormalBeat())));
        songs.add(new Song("Riptide", Arrays.asList(new NormalBeat(), new Drop(1), new Drop(1), new NormalBeat())));

        List<String> top3Songs = getTop3Songs(songs);
        System.out.println("Top 3 songs:");
        for (String song : top3Songs) {
            System.out.println(song);
        }
    }

    // helper function
    public static List<Integer> getIntensities(List<Song> songs) {
        List<Integer> listOfIntensities = new ArrayList<>();
        for (Song song : songs) {
            Integer intensity = IntensityCalculator.getTotalDropIntensity(song);
            listOfIntensities.add(intensity);
        }
        return listOfIntensities;
    }

    public static double getAverageOfDropIntensity(List<Song> songs) {
        List<Integer> listOfIntensities = getIntensities(songs);


        int sum = 0;
        for (Integer num : listOfIntensities) {
            sum += num;
        }
        double averageIntensity = (double) sum / listOfIntensities.size();
        return averageIntensity;
    }


    public static List<String> getTop3Songs(List<Song> songs) {

        double averageIntensity = getAverageOfDropIntensity(songs); // compute the average intensity
        List<Integer> intensities = getIntensities(songs); // get the list of sum of intensities of each song


        List<String> topSongs = new ArrayList<>();
        if (songs.size() <= 3) { // if there are less than or equal 3 songs in the playlist we return them all
            for (Song s : songs) {
                topSongs.add(s.getName());
            }
        }
        else {
            int i = 0;
            while (i < 3) {
                int songIndex = getClosestNumberInArray(averageIntensity, intensities); // we take the song with the intensity closest to the average
                Song addedSong = songs.get(songIndex);

                topSongs.add(addedSong.getName()); // add it to the top songs
                songs.remove(addedSong); // and remove it from the list
                intensities.remove(songIndex); // and also from the intensities list

                i++;
            }

        }
        return topSongs;
    }

    // returns the index of the song with the value closest to the average
    public static int getClosestNumberInArray(double average, List<Integer> intensities) {
        double distance = Math.abs(intensities.get(0) - average);
        int index = 0;
        for (int c = 1; c < intensities.size(); c++) {
            double cdistance = Math.abs(intensities.get(c) - average);
            if (cdistance < distance)  {
                index = c;
            }
        }
        return index;
    }
}