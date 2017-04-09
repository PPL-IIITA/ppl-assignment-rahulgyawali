
package q5;

import java.util.*;

public class Q5 {

    public static void main(String[] args) throws Exception {
        
        Randomx p = new Randomx();
        p.Randfilein(30, 90);
        
        BInit by = new BInit();
        ArrayList<Boy> Boys = by.In();
        
        GInit gr = new GInit();
        ArrayList<Girl> Girls = gr.In();
        
        Pairing h = new Pairing();
        h.pair(Boys, Girls);
        
        Gifting g =  new Gifting();
        ArrayList<Gift> Gifts = g.Gen();
        
    }
    
}
