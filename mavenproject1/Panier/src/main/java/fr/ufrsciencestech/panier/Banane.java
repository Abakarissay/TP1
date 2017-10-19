/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

/**
 *
 * @author sa665519
 */
public class Banane implements Fruit {
     double prix=50.0;
     private final String pays;

 public String  getOrigine() {
  
      return pays ;
     } 
 
  public double   getPrix() {
  
      return prix ;
     }
  
  public Banane(String pays) 
    {
        this.pays=pays;
    }
 
  @Override
     public String toString(){
        String res ="Banane \t";
        res += "origine = " + pays + "\t"; 
        res += "Prix =" + prix + "\t";
      return res;
     
     }
     
  @Override
    public boolean equals(Object o){
        if(o != null && o instanceof Banane){
            Banane b1 = (Banane) o;
            return (pays.equals(b1.pays));
        }
        return false;
    }
 
     
}