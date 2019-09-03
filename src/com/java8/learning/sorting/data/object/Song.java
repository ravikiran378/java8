package com.java8.learning.sorting.data.object;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ravi Kiran Moguluri
 */
public class Song {
	
	private String  title;
	private String  artist;
	private Integer length;
	private String  album;
	
	public Song(String title, String artist, Integer length, String album) {
		super();
		this.title  = title;
		this.artist = artist;
		this.length = length;
		this.album  = album;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	private static final String toNChars(String str, int chars) {
		return String.format("%-"+chars+"S", str);
	}
	
	@Override
	public String toString() {
		return "Song [title=" + toNChars(title, 50) + ", artist=" + toNChars(artist, 20) + ", length=" + length + ", album=" + toNChars(album,20) + "]";
	}

	public static List<Song> getDummyData(){
		List<Song> songs = new ArrayList<>();
		songs.add(new Song("This is the end Hold your breath and count to ten","Adele",290,"Skyfall"));
		songs.add(new Song("Show me the meaning of being lonely ","Backstreet Boys",232,"Millennium"));
		songs.add(new Song("Billie Jean is not my lover","Michael Jackson",295,"Thriller 25"));
		songs.add(new Song("Jai ho, jai ho","A. R. Rahman",319,"Slumdog Millionaire"));
		songs.add(new Song("Bandhan Hai Rishton Mein ","A. R. Rahman",474,"Bombay"));
		return songs;
	}

}
