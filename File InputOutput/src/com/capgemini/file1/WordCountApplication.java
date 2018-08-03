//Program that accepts the path of a file from user and count the number of words in that file and print it on the console
package com.capgemini.file1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class WordCountApplication {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		File file = new File("C:\\Users\\Udit K\\Desktop\\sample.txt");
		String line="";
		int wordCount = 0;
		

		// Checking if file exists or not
		if (file.exists()) 
		{
			//Reading the file
			//Enter the file path
			br = new BufferedReader(new FileReader("C:\\Users\\Udit K\\Desktop\\sample.txt"));
			//End of line
			while ((line = br.readLine()) != null) 
			{
				String[] words = line.split(" ");
				wordCount = wordCount + words.length;
			}
		
		}
		else 
		{
			System.out.println("File doesnot exist");
		}
		System.out.println("Number of words = "+wordCount);
		//closing the file
		br.close();
	}

}
