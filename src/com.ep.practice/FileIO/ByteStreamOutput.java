package com.ep.practice.FileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ByteStreamOutput {
    public static void main(String args[])throws FileNotFoundException, IOException {
        FileReader in = null;
        FileWriter out = null;

        try{
            in = new FileReader("C:\\Users\\S\\IdeaProjects\\practice\\src\\com.ep.practice\\input.txt");
            out = new FileWriter("C:\\Users\\S\\IdeaProjects\\practice\\src\\com.ep.practice\\output.txt");
            int i = 0;
            //While Loop
            while((i = in.read()) != -1){
                out.write((char)i);
            }
        }finally {
            if(in != null){
                in.close();
                out.close();
            }
        }
    }
}
