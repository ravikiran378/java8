package com.java8.learning.sorting.main;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.learning.sorting.data.object.Song;

public class MultiFieldSort {
	public static void main(String[] args) {
		List<Song> songsDataToSort = Song.getDummyData();
		printMessage("Sample sort by artist field");
		songsDataToSort.stream().sorted(Comparator.comparing(Song::getArtist)).collect(Collectors.toList()).forEach(System.out::println);
		printLine();
		printMessage("Sample sort by album field");
		songsDataToSort.stream().sorted(Comparator.comparing(Song::getAlbum)).collect(Collectors.toList()).forEach(System.out::println);
		printLine();
		printMessage("Sample sort by artist and then title field");
		songsDataToSort.stream().sorted(Comparator.comparing(Song::getArtist).thenComparing(Song::getTitle)).collect(Collectors.toList()).forEach(System.out::println);
		printLine();
		printMessage("Sample sort by artist and then length field");
		songsDataToSort.stream().sorted(Comparator.comparing(Song::getArtist).thenComparing(Song::getLength)).collect(Collectors.toList()).forEach(System.out::println);
		printLine();
		printMessage("Sample sort by artist and then album field");
		songsDataToSort.stream().sorted(Comparator.comparing(Song::getArtist).thenComparing(Song::getAlbum)).collect(Collectors.toList()).forEach(System.out::println);
		printLine();
		printMessage("Sample sort by artist and then album field reverse order");
		songsDataToSort.stream().sorted(Comparator.comparing(Song::getArtist).thenComparing(Song::getAlbum, Comparator.reverseOrder())).collect(Collectors.toList()).forEach(System.out::println);
	}
	
	private static void printLine() {
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
	}
	
	private static void printMessage(String message) {
		System.out.println(String.format("%"+100+"S",String.format("%-"+50+"S", message)));
		printLine();
	}
}
