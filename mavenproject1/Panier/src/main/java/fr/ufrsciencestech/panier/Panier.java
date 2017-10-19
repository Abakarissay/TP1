/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.ArrayList;

/**
 *
 * @author sa665519
 */

public  class Panier{
    private int taillemax ;
    
    private ArrayList<Fruit> panier ;
    
    
    /**
     * @return the taillemax
     */
    public int getTaillemax() {
        return taillemax;
    }

    /**
     * @param taillemax the taillemax to set
     */
    public void setTaillemax(int taillemax) {
        this.taillemax = taillemax;
    }

    /**
     * @return the panier
     */
    public ArrayList<Fruit> getPanier() {
        return panier;
    }

    /**
     * @param panier the panier to set
     */
    public void setPanier(ArrayList<Fruit> panier) {
        this.panier = panier;
    }
    

    public Panier( int t)
    {
       this.taillemax = t;
    
          this.panier= new ArrayList<Fruit> (t);
    }

  public boolean estPlein()
  {
      if (panier.size()==this.taillemax)
          return true;
      return false;
 
     }
  
  public boolean estVide()
  {

             return panier.size()==0 ;

   }
  
    @Override
  public String toString(){
        String res ="";
        
      
        for (Fruit f : panier)
        {
            res += f.toString() + "\n";
        }    
        
  
      return res;
  }
          
          
          
  public void Ajout (Fruit f)
  
  {
      if (!estPlein())
          panier.add(f);
           else 
              System.out.println("votre panier est plein");
    
  
  
  }
    
  
  
    public void Retire (Fruit f)
  
  {
      if (!estVide())
          panier.remove(f);
           else 
              System.out.println("votre panier est vide");
    
   }

    private void printf(String la_liste_des_fruits_dans_le_panier) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
   

}