package ispisi.sve.proste.brojeve.manje.od.unesenog.broja;
import java.util.*;

public class IspisiSveProsteBrojeveManjeOdUnesenogBroja {

    public static void main(String[] args) {
       
        Scanner tastatura = new Scanner (System.in);
        
        System.out.println("Program ispisuje sve proste brojeve manje od unesenog broja.");
        
        System.out.println("Unesite broj do kojeg želite da program ispiše proste brojeve:");
        
        int a=tastatura.nextInt();
        System.out.print("Prosti brojevi su: ");
        
        for (int b=1;b<a;b++) 
        {
         boolean prost=true;
         for (int c=2;c<b; c++)
         {
             if (b%c==0)
             {
                 prost=false;
                 break;
             }
         }
         if (prost)
             System.out.print(b+", ");
        }
    }
    
}
