/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2;
import java.util.Random;
import java.util.*;

/**
 *
 * @author rahul
 */

public class GiftGenerator {
    
   
    
    Gift [] GiftGen() throws Exception {
        
        
        
        Gift[] arr = new Gift[100];
        Random r = new Random();
        int i;
        int j;
        int tmp;
        
        for (i = 0 ; i < 100; i++) {
            
            arr[i] = new Gift();
        }
        
      
        for (i = 0; i < 100; i++){
            
            arr[i].type = 0;
            arr[i].price = 0;
            arr[i].value = 0;
        }
        
      
        
        int y;
        int u;
      
        for (i = 0; i < 100; i++) {
        
            tmp = (r.nextInt(4-1) + 1);
            
            if (tmp == 1) {
                
                arr[i].type = 3;
                arr[i].price= ((int)(Math.random()*10))*400 + 8000 ;
                arr[i].value = 10;
                
                
            }else if (tmp == 2) {
              
                
                arr[i].type = 1;
                arr[i].price = ((int)(Math.random()*10))*100 + 3000;
                arr[i].value = 4;
                
                
            }else if (tmp == 3) {
                
                
                arr[i].type = 2;
                arr[i].price = ((int)(Math.random()*10))*250 + 5000;
                arr[i].value= 7 ;
                
                
            }
            
            
        }    
        
        for ( i = 0; i < 99; i++) {
            
            for (j = 0; j < 99 - i; j++) {
            
                    if (arr[j+1].price < arr[j].price) {
                
                        int x = arr[j+1].type;
                        arr[j+1].type = arr[j].type;
                        arr[j].type = x;
                        
                         x = arr[j+1].price;
                        arr[j+1].price = arr[j].price;
                        arr[j].price = x;
                        
                        x = arr[j+1].value;
                        arr[j+1].value = arr[j].value;
                        arr[j].value = x;
                    }
            }
            
            
        }
        
        for (i = 0; i < 100; i++) {
            System.out.println("Gift"+String.valueOf(i));
            System.out.println(String.valueOf(arr[i].type) +" "+ String.valueOf(arr[i].price) +" "+ String.valueOf(arr[i].value));
            System.out.println("\n");
            
            
        }
        
        
        return arr;
    }
    
}
