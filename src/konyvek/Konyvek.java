package konyvek;

import java.util.Scanner;

/**
 *
 * @author tothj
 */
public class Konyvek {

    public static void main(String[] args) {
        DB ab = new DB();
        Scanner bill = new Scanner(System.in, "cp1250");
        boolean tovabb = true;
        String szerzo, cim, eredeti;
        int ev;
        
        while (tovabb) {
            System.out.println("1-lista 2-új 3-törlés 0-kilépés");
            System.out.print("válasz: ");
            String v = bill.nextLine();
            switch (v.charAt(0)) {
                case '1':
                    System.out.print("Év: ");
                    ev = bill.nextInt();
                    bill.nextLine();
                    ab.kiir(ev);
                    break;
                case '2':
                    
                    break;
                case '3':
                    
                    break;
                default:
                    tovabb = false;
                    break;
            }
        }
        
    }
    
}
