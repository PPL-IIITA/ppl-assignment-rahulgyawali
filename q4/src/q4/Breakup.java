/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q4;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.*;

/**
 *
 * @author rahul
 */
public class Breakup {
    
    /**This is the Break Method.This is used to reshuffle k least happy couples couples.
     * @param args unsed
     * @exception IOException On input error.
     * @see IOException
     * 
     */
    
    
      public void Break()throws IOException {
          
        FileInputStream fstream = new FileInputStream("../pp2/LHappycouple.txt");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        String strLine1 = "";
        
        String [] boy = new String[5];
        String [] girl = new String[5];
         
        int i;
        int j ;
      
        for (i = 0; i < 5; i++) {
      
            j = (i+1)%5;
            strLine1 = br.readLine();
            String tokens [] = strLine1.split(",");
            String b = tokens[1];
            String g = tokens[2];
          
            boy[i] = b;
            girl[j] = g;
        }
        
        
        BufferedWriter bw = null;
        File file = new File("PairingOfLeastHappiest.txt");
        
        if (!file.exists()) {
            
	     file.createNewFile();
	}
        
        FileWriter fw = new FileWriter(file);
	bw = new BufferedWriter(fw);
        
        
        for (i = 0; i < 5; i++){
            
           bw.write(boy[i] + "," + girl[i]);
           bw.newLine();
        } 
        bw.close();
    }
      
}
