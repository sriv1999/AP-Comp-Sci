package recursionChallenge;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.*;

public class Maze {
	private int[][] maze;

	public Maze(int size, String line) {
		maze = new int [size][size];
		int count = 0;
		for (int r = 0; r < line.length() / size; r++) {
			for (int c = 0; c < size; c++) {
				if (line.substring(count, count+1) != " ") {
					maze[r][c] = (int)(line.charAt(count));
					count++;
				}
			}
		}
	}

	public void returnString() {
		for (int r = 0; r < maze.length; r++) {
			for (int c = 0; c < maze[r].length; c++) {
				System.out.print(maze[r][c] + " ");
			}
			System.out.println();
		}
	}

	public boolean hasExitPath(int r, int c) {
		return false;
	}

	public String toString() {
		String output = "";
		return output;
	}

	public static void main(String args[]) throws IOException {
		BufferedReader inputFile = new BufferedReader(new FileReader("H:/Files/maze.txt"));
		int s = Integer.parseInt(inputFile.readLine());
		String line = inputFile.readLine();
		
		Maze one = new Maze(s, line);
		one.returnString();
	}
}