package fr.ufrsciencestech.panier;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sa665519
 */

public class Orange implements Fruit {

    private static Object get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private double prix;
    private String pays;
    
    
    public Orange(double p1 , String p2){
    
         this.prix = p1;
         this.pays = p2 ;
    
    }
   
   public double   getPrix() {
  
      return prix ;
     }
    
     public String  getOrigine() {
  
      return pays ;
     }
     
     public void setPrix(double pr) throws Prixnegatif {
     
         if(pr<0){
             
                 throw new  Prixnegatif();
           
            
         } 
         else 
        prix= pr;
     }
     
    @Override
     public String toString(){
        String res ="Orange  ";
        res += "origine = " + pays + "\t";
        res += "prix = " + prix;
        
      return res;
     
     }
     
    @Override
    public boolean equals(Object o){
        if(o != null && o instanceof Orange){
            Orange or = (Orange) o;
            return (prix == or.prix && pays.equals(or.pays));
        }
        return false;
    }
     
}


