/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q5;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 *
 * @author rahul
 */
public class GInit {
    
    public ArrayList<Girl> In () throws IOException {
   
        int i;
        
       ArrayList<Girl> arr = new ArrayList<>();
        
        FileInputStream fstream = new FileInputStream("Girls.txt");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        String strLine1 =  "";
        
        for(i = 0; i < 30; i++)
        {
            strLine1 = br.readLine();
            
            String tokens [] = strLine1.split(",");
            String name = tokens[0];
            String pairedto = tokens[1];
            String intelligence = tokens[2];
            String attractiveness = tokens[3];
            String budget = tokens[4]; 
            String t = tokens[5];
            
            if (t == "Normal") {
                
                arr.add(new NormalGirl(name,pairedto,intelligence,attractiveness,budget));
            }
            
            else if (t ==  "Choosy") {
                
                arr.add(new ChoosyGirl(name,pairedto,intelligence,attractiveness,budget));
            }
            
            else if (t == "Desperate") {
                
                arr.add(new DesperateGirl(name,pairedto,intelligence,attractiveness,budget));
            }
            
            
        }
        
        br.close();
        
        
        //System.out.println(arr[4].name + arr[4].pairedto + arr[4].attractiveness);
        
        return arr;
    } 
    
}
