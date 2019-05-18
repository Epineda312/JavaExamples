package com.ep.practice.FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CharacterStreamOutput {
    public static void main(String args[])throws FileNotFoundException, IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try{
            in = new FileInputStream("C:\\Users\\S\\IdeaProjects\\practice\\src\\com.ep.practice\\input.txt");
            out = new FileOutputStream("C:\\Users\\S\\IdeaProjects\\practice\\src\\com.ep.practice\\output2.txt");
            int i = 0;
            //While Loop
            while((i = in.read()) != -1){
                out.write((char)i);
            }
        }finally {
            if(in != null){
                in.close();
            }
            if(out != null){
                out.close();
            }
        }
    }
}
