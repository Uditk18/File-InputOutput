//Program that accepts the complete path of a file from user and count the number of lines in that file and print it on the console.

package com.capgemini.file1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LineCountApplication {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\Udit K\\Desktop\\assignments_io.txt");
		// Checking if file exists or not
		if (file.exists()) 
		{
			//Reading the file
			//Enter the file path
			
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Udit K\\Desktop\\sample.txt"));
			int lines = 0;
			while (reader.readLine() != null)
				lines++;
			//closing the file
			reader.close();
			System.out.println("Number of lines = "+lines);
		} 
		else 
		{
			System.out.println("File doesnot exist");
		}

	}

}
