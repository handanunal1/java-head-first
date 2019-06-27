package c16.e1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Exercise 16.e1 JukeBox1
 * 
 * Author: Handan Unal
 * 
 */
public class JukeBox1 {
	ArrayList<String> SongList = new ArrayList<String>();

	public static void main(String[] args) {
		new JukeBox1().go();

	}

	public void go() {
		getSongs();
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
		SongList.add(tokens[0]);   // we ony add the song title
	}

}
