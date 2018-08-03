//Program that accepts the complete path of a file from the user and display whether the file exist or not.
package com.capgemini.file1;

import java.io.File;

public class FileExistApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Importing the file
		File file=new File("C:/JavaP/mypack/mydate1.class");
		//Checking if file exists or not
		if(file.exists())
		{
			System.out.println("File exists!!");
		}
		else
		{
			System.out.println("File doesnot exist");
		}

	}

}
