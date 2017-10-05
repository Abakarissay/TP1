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
         
       Orange o1=new Orange(10,"Tchad");
       Orange o2=new Orange(15,"Tchad");
       Orange o3=new Orange(15,"Tchad");
       p.Ajout(o1); 
       p.Ajout(o3);
      p.Ajout(o2);
        
               
        System.out.println(p);
    }
}
