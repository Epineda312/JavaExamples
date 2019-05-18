package com.ep.practice.FileIO;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

public class CharacterStreamInput {
    public static void main(String args[])throws FileNotFoundException, IOException {
       FileInputStream in = null;
        try{
            in = new FileInputStream("C:\\Users\\S\\IdeaProjects\\practice\\src\\com.ep.practice\\input.txt");
            int i = 0;
            //While Loop
            while((i = in.read()) != -1){
                System.out.print((char)i);
            }
        }finally {
            if(in != null){
                in.close();
            }
        }
    }
}
