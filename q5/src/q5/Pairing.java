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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author rahul
 */
public class Pairing {
    
    /**
     * This Method Swaps two Boy Objects.
     * @param p This is the first parameter.
     * @param q This is the second parameter.
     */
    public void swap (Boy p ,Boy q)
    {
        String s;
        int i;
        
        s = p.name;
        p.name = q.name;
        q.name = s;
        
        s = p.pairedto;
        p.pairedto = q.pairedto;
        q.pairedto = s;
        
        i = p.attractiveness;
        p.attractiveness = q.attractiveness;
        q.attractiveness = i;
        
        i = p.budget;
        p.budget = q.budget;
        q.budget = i;
        
        i = p.intelligence;
        p.intelligence = q.intelligence;
        q.intelligence = i;
        
        i = p.left;
        p.left = q.left;
        q.left = i;
        
        i = p.min;
        p.min = q.min;
        q.min = i;
        
        i = p.spent;
        p.spent = q.spent;
        q.spent = i;
        
    }
    
     
    /**
     * This Method Swaps two Girl Objects.
     * @param a This is the first parameter.
     * @param b This is the Second parameter.
     */
    
    public void swap (Girl a, Girl b)
    {
        String s;
        int i;
        
        s = a.name;
        a.name = b.name;
        b.name = s;
        
        s = a.pairedto;
        a.pairedto = b.pairedto;
        b.pairedto = s;
        
        i = a.attractiveness;
        a.attractiveness = b.attractiveness;
        b.attractiveness = i;
        
        i = a.intelligence;
        a.intelligence = b.intelligence;
        b.intelligence = i;
        
        i = a.mBudget;
        a.mBudget = b.mBudget;
        b.mBudget = i;
        
    }
    
    /**
     * This Method Forms Couple from ArrayList<Boy>B and ArrayList<Girl>G.
     * @param B This is the first paramter.
     * @param G This is the second parameter.
     */
    
    public void pair (ArrayList <Boy> B,ArrayList <Girl> G) {
        
        int i;
        int j;
        int k;
        int temp;
        
        for (i = 0; i < B.size() -1;i++) {
        
            for (j = 0; j < B.size()-i-1;j++) {
                
                if ((B.get(j).attractiveness ) > (B.get(j+1).attractiveness)) {
                    
                    swap(B.get(j),B.get(j+1));
                    
                }
                
                
            }
            
        }
        
        for (i = 0; i < G.size() -1;i++) {
        
            for (j = 0; j < G.size()-i-1;j++) {
                
                if ((G.get(j).mBudget ) > (G.get(j+1).mBudget) ){
                      
                
                swap(G.get(j),G.get(j+1));
            }
            
          }
        
        
        }
    
        ArrayList<Couple> arr = new ArrayList<>();
        String p;
        String q;
        int index = G.size();
        
        for (i = 0 ; i < 2*G.size(); i++) {
            
            if (i % 2 == 0) {
                
                for (j = 0;j < B.size();j++) {
                    
                   if ((G.get(i/2).pairedto == "none")&& (B.get(i/2).pairedto == "none") && (G.get(i/2).mBudget <= B.get(j).budget) && (G.get(i/2).attractiveness >= B.get(j).min)){
                   
                        p = G.get(i/2).name;
                        q = B.get(j).name;
                       
                        arr.add(new Couple(p,q));
                    }
                }   
            
            }else{
                
                for (j = 0; j < G.size(); j++) {
                    
                    if ((G.get(j).pairedto == "none") && (B.get(i/2).pairedto == "none") && (G.get(i/2).mBudget <= B.get(j).budget) && (G.get(i/2).attractiveness >= B.get(j).min)) { 
                    
                        Girl t = G.get(index);
                        index--;
                        
                        p = B.get(i/2).name;
                        q = t.name;                
                        arr.add(new Couple(p,q));
                    }
                }                 
                
            }
            
        }
        
       
    
    }
    
    
}

