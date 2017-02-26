package ppl;

import java.io.*;

public class Init {
    
    
    Boy[] BoysInitial() throws IOException
    {
        BufferedReader br = null;
        br = new BufferedReader(new FileReader("boys.txt"));	
        int i;
        Boy[] arr = new Boy[20];
        
        for (i = 0; i < 20; i++) {
        
            arr[i] = new Boy();
        }
        
        String name;
        int intelligence;
        int attractiveness;
        int budget;
        String pairedto;
        int minattr;
        String type;
        String xfactor;
        
        for(i = 0;i < 20;i++)
        {
            name = br.readLine();
            pairedto = br.readLine();
            intelligence = Integer.parseInt(br.readLine());
            attractiveness = Integer.parseInt(br.readLine());
            budget = Integer.parseInt(br.readLine());
            minattr = Integer.parseInt(br.readLine());
            type = br.readLine();
            xfactor = br.readLine();
            
            
            arr[i] = new Boy (name,pairedto,intelligence,attractiveness,budget,minattr,type,xfactor);
        }
        
        br.close();
        
        return arr;
    }
    
    Girl[] GirlsInitial() throws IOException
    {
        BufferedReader br = null;
        br = new BufferedReader(new FileReader("girls.txt"));	
        int i;
        Girl[] arr = new Girl[10];
        String name;
        int intelligence;
        int attractiveness;
        int mBudget; 
        String pairedto;
        String type;
        String pref;
       
        for (i = 0; i < 10; i++) {
        
            arr[i] = new Girl();
        }
        
        
        for(i = 0;i < 10;i++)
        {
            name = br.readLine();
            pairedto = br.readLine();
            intelligence = Integer.parseInt(br.readLine());
            attractiveness = Integer.parseInt(br.readLine());
            mBudget = Integer.parseInt(br.readLine());  
            type = br.readLine();
            pref = br.readLine();
            
            arr[i] = new Girl(name,pairedto,intelligence,attractiveness,mBudget,type,pref);
            
        }
        
        br.close();
        
        return arr;
    }
    
}
