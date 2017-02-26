/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Math.*;

/**
 *
 * @author rahul
 */
public class Happiness {
    
    void swap (Couple x,Couple y) {
    
        String r;
        int tmp;
        
        r = x.boy;
        x.boy = y.boy;
        y.boy = r;
        
        r = x.girl;
        x.girl = y.girl;
        y.girl = r;
        
        r = x.btype;
        x.btype = y.btype;
        y.btype = r;
        
        r = x.gtype;
        x.gtype = y.gtype;
        y.gtype = r;
        
        tmp = x.bd;
        x.bd = y.bd;
        y.bd = tmp;
        
        tmp = x.bhp;
        x.bhp = y.bhp;
        y.bhp = tmp;
        
        tmp = x.extra;
        x.extra = y.extra;
        y.extra = tmp;
        
        tmp = x.ghp;
        x.ghp = y.ghp;
        y.ghp = tmp;
        
        tmp = x.hp;
        x.hp = y.hp;
        y.hp = tmp;
        
        tmp = x.in;
        x.in = y.in;
        y.in = tmp;
        
        tmp = x.lc;
        x.lc = y.lc;
        y.lc = tmp;
        
        tmp = x.lv;
        x.lv = y.lv;
        y.lv = tmp;
        
        tmp = x.m;
        x.m = y.m;
        y.m = tmp;
        
        tmp = x.spend;
        x.spend = y.spend;
        y.spend = tmp;
    }
        
    void cal(Couple[] v,int k) throws IOException{
        
        int i;
        int j;
        String kt;
        String kta;
        
        for (i = 0; i < 10; i++) {
        
                kt = v[i].gtype;
                kta = v[i].btype;
        
               if ("Choosy" == kt) {
                   
                   v[i].ghp = (int)Math.log((v[i].extra + 2*v[i].lv));
                   
                   
               } else if ("Desperate" == kt) {
                   
                   v[i].ghp = (int)Math.exp((v[i].extra + v[i].lv));
                 
                   
               }else if ("Normal" == kt) {
                   
                   v[i].ghp = v[i].extra + v[i].lv;
                  
               }
               
               if ("Geeky" == kta) {
                   
                   v[i].bhp = v[i].in;
                   
                   
               }else if ("Generous" == kta){
            
                   v[i].bhp = v[i].ghp;
                   
            
               }else if ("Miser" == kta) {
                   
                   
                   v[i].bhp = v[i].bd - v[i].spend;
                   
               }
               
               v[i].hp = v[i].ghp + v[i].bhp;
             
        }
        
        for ( i = 0; i < 9; i++) {
            
            for (j = 0; j < 9 - i; j++) {
            
                    if (v[j+1].hp < v[j].hp) {
                
                        swap(v[j+1],v[j]);
                
                    }
            }
        }
        
        BufferedWriter bw = null;
        File file = new File("Happycouple.txt");
        
        if (!file.exists()) {
            
	     file.createNewFile();
	}
        
        FileWriter fw = new FileWriter(file);
	bw = new BufferedWriter(fw);
        
        for ( i = 9; i > 9-k; i--) {
        
            bw.write(String.valueOf(v[i].hp) + "," + v[i].boy + "," + v[i].girl);
            bw.newLine();
        }
        
        bw.close();
    }
}