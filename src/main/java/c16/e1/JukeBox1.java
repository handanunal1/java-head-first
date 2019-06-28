package c16.e1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Exercise 16.e1 JukeBox1
 * 
 * Author: Handan Unal
 * 
 */
public class JukeBox1  {
	ArrayList<Song> SongList = new ArrayList<Song>();

	public static void main(String[] args) {
		new JukeBox1().go();

	}

	public void go() {
		getSongs();
		Collections.sort(SongList);
		System.out.println(SongList);
	}

	private void getSongs() {
		try {
			File file = new File("SongList.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine()) != null) {
				addSong(line);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	private void addSong(String line) {
		String tokens[] = line.split("/");
		Song nextSong = new Song(tokens[0] , tokens[1], tokens [2] , tokens[3]);
		SongList.add(nextSong);
	
	}

}
