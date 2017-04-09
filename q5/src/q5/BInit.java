/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q5;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author rahul
 */
public class BInit {
    
    public ArrayList<Boy> In () throws IOException {
   
        int i;
        
        ArrayList<Boy> arr = new ArrayList<>();
        
        FileInputStream fstream = new FileInputStream("Boys.txt");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        String strLine1 =  "";
        
        for(i = 0; i < 90; i++)
        {
            strLine1 = br.readLine();
            
            String tokens [] = strLine1.split(",");
            
            String name = tokens[0];
            String pairedto = tokens[1];
            String intelligence = tokens[2];
            String attractiveness = tokens[3];
            String budget = tokens[4];
            String minattr = tokens[5];
            String t = tokens[6];
            
            if (t == "Miser") {
                
                arr.add(new MiserBoy(name,pairedto,intelligence,attractiveness,budget,minattr));
            }
            
            else if (t ==  "Geeky") {
                
                arr.add(new GeeksBoy(name,pairedto,intelligence,attractiveness,budget,minattr));
            }
            
            else if (t == "Generous") {
                
                arr.add(new GenerousBoy(name,pairedto,intelligence,attractiveness,budget,minattr));
            }
            
            
        }
        
        br.close();
        
 
        return arr;
    } 
    
    
}
