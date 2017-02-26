
package ppl;
import java.io.*;
import java.util.Date;

/**
 *
 * @author rahul
 * @since 2017-02-24
 */

public class pairup {
 
    /**
     * This is method pairups the Girl[]g and Boy[]b
     * @param Boy[] b is first argument
     * @param Girl[] g is Secong argument
     * @return void
     * 
     */
    
    void pair(Boy[] b,Girl[] g) throws IOException{
        
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
                      
            for (j = 0; j < 50; j++) {
            
                    if ((b[j].pairedto.equals("none")) && (b[j].budget > g[i].mBudget)){
                        
                            if ((g[i].attractiveness >= b[j].minattr)) {
                                Date date = new Date();                       
                                b[j].pairedto = g[i].name;
                                g[i].pairedto = b[j].name;
                                
                                br.write(b[j].name + ","+String.valueOf(b[j].budget)+ ","+ b[j].pairedto + "," +b[j].type + ","+g[i].name + "," + String.valueOf(g[i].mBudget)+ ","+ g[i].pairedto + ","+ g[i].type+"," +g[i].intelligence +","+ date.toString());
                                br.newLine();
                            }else if (b[j].xfactor == g[i].pref) {
                                Date date = new Date(); 
                                b[j].pairedto = g[i].name;
                                g[i].pairedto = b[j].name;
                                 
                                 br.write(b[j].name + ","+String.valueOf(b[j].budget)+ ","+ b[j].pairedto + "," +b[j].type+ "," +g[i].name + "," + String.valueOf(g[i].mBudget)+ ","+ g[i].pairedto + ","+ g[i].type + "," + g[i].intelligence + ","+ date.toString());
                                 br.newLine();
                            }
                    }
                
            }    
        }
                
        
        br.close();
    }
    
    
}
