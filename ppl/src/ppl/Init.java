package ppl;

/**
 *
 * @author rahul
 * @since 2017-02-24
 */


import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Init {
    
    /**
     * <p> This Methods Initialiazes Boy[].</p>
     * @return Boy[]
     * @throws IOException 
     */
    
    Boy[] BoysInitial() throws IOException
    {
       	
        int i;
        Boy[] arr = new Boy[50];
        
        for (i = 0; i < 50; i++) {
        
            arr[i] = new Boy();
        }
        
        FileInputStream fstream = new FileInputStream("boys.txt");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        String strLine1 =  "";
        
        for(i = 0; i < 50; i++)
        {
            strLine1 = br.readLine();
            String tokens [] = strLine1.split(",");
            
            String name = tokens[0];
            String intelligence = tokens[2];
            String attractiveness = tokens[3];
            String budget = tokens[4];
            String pairedto = tokens[1];
            String minattr = tokens[5];
            String type = tokens[6];
            String xfactor = tokens[7];
               
            arr[i] = new Boy (name,pairedto,intelligence,attractiveness,budget,minattr,type,xfactor);
        }
        
        br.close();
        
        return arr;
    }
    
    /**
     * <p> This Method Initializes Girl[].</p>
     * @return Girl[]
     * @throws IOException 
     */
       
    Girl[] GirlsInitial() throws IOException
    {
        	
        int i;
        Girl[] arr = new Girl[10];
        
        for (i = 0; i < 10; i++) {
        
            arr[i] = new Girl();
        }
        
        FileInputStream fstream = new FileInputStream("girls.txt");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        String strLine1 =  "";
        
        for(i = 0;i < 10;i++)
        {
            strLine1 = br.readLine();
            String tokens [] = strLine1.split(",");
            
            String name = tokens[0];
            String intelligence = tokens[2];
            String attractiveness = tokens[3];
            String mBudget = tokens[4]; 
            String pairedto = tokens[1];
            String type = tokens[5];
            String pref = tokens[6];
            
      
            arr[i] = new Girl(name,pairedto,intelligence,attractiveness,mBudget,type,pref);
            
        }
        
        br.close();
        
        return arr;
    }
    
}
