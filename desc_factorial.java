/*programa que haga la descomposicion factorial de un número divisible entre 2, 3 o 5 */

import java.util.Scanner;
public class desc_factorial {
    public static void main(String[] args) {
        Scanner sd =new Scanner(System.in);
        int  ll;
        System.out.println("introduzca el numero que desea descomponer");
        ll = sd .nextInt();

        while(ll !=1){
            if (ll%2==0){
                System.out.println(ll + "|2");
                ll= ll/2;
            }
            else if(ll%3==0){
                System.out.println(ll +"|3");
                ll=ll/3;
            }

            else if(ll%5==0){
                System.out.println(ll +"|5");
                ll=ll/5;
            }
            
        }//while
        System.out.println(ll+ "|");
    }
}//fin pulic static void