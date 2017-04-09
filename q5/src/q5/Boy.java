/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q5;

/**
 *
 * @author rahul
 */
abstract public class Boy {
    String name;
    String pairedto;
    int intelligence;
    int attractiveness;
    int budget;
    int spent;
    int left;
    int min;

     Boy() {
        
    }
     
    Boy (String n,String p,String b,String i,String a, String m) {
        
        name = n;
        pairedto = p;
        spent = 0;
        left = 0;
        budget = Integer.parseInt(b);
        intelligence = Integer.parseInt(i);
        attractiveness = Integer.parseInt(a);
        min = Integer.parseInt(m);
    }
      
     abstract public double happiness(); 
}
