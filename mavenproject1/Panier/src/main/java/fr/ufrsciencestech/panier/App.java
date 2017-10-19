package fr.ufrsciencestech.panier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
         Panier p = new Panier(2);
         
     // Fruit o1=new Fruit("Tchad");
      Fruit o1=new Orange(15,"Tchad") ;
      Fruit b1=new Banane("Tchad");
       p.Ajout(o1); 
       p.Ajout(b1);
          
               
        System.out.println(p);
    }
}
