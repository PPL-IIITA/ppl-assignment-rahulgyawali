
package ppl;
import java.io.*;

public class pairup {
 
    
    public void pair(Boy[] b,Girl[] g) throws IOException{
        
        int i;
        int j;
        BufferedWriter br = null;
        File f = new File("couple.txt");
        
        if (!f.exists()) {
            
	     f.createNewFile();
	}
        
        FileWriter fw = new FileWriter(f);
	br = new BufferedWriter(fw);
        
        
        for (i = 0; i < 10; i++) {
                      
            for (j = 0; j < 20; j++) {
            
                    if ((b[j].pairedto.equals("x")) && (b[j].budget > g[i].mBudget)){
                        
                            if ((g[i].attractiveness >= b[j].minattr)) {
                                                       
                                b[j].pairedto = g[i].name;
                                g[i].pairedto = b[j].name;
                                
                                br.write(b[j].name + " "+" " +String.valueOf(b[j].budget)+ " "+ b[j].pairedto + " " +b[j].type);
                                br.newLine();
                                br.write(g[i].name + " " + " "+String.valueOf(g[i].mBudget)+ " "+ g[i].pairedto + " "+ g[i].type );
                                
                            }else if (b[j].xfactor == g[i].pref) {
                            
                                 b[j].pairedto = g[i].name;
                                 g[i].pairedto = b[j].name;
                                 
                                 br.write(b[j].name + " "+" " +String.valueOf(b[j].budget)+ " "+ b[j].pairedto + " " +b[j].type);
                                 br.newLine();
                                  br.write(g[i].name + " " + " "+String.valueOf(g[i].mBudget)+ " "+ g[i].pairedto + " "+ g[i].type );
                            }
                            
                    }
                
            }    
        }
                
        
        br.close();
    }
    
    
}
