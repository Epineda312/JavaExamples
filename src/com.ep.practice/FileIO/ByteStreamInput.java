package com.ep.practice.FileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ByteStreamInput {
    public static void main(String args[])throws FileNotFoundException, IOException {
        FileReader in = null;
        try{
            in = new FileReader("C:\\Users\\S\\IdeaProjects\\practice\\src\\com.ep.practice\\input.txt");
            int i = 0;
            //While Loop
            while((i = in.read()) != -1){
                System.out.println((char)i);
            }
        }finally {
            if(in != null){
                in.close();
            }
        }
    }
}
