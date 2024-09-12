package Variables_Condicionales;
import java.util.Scanner;
public class variables_4 {
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);
        int a;
        String b,c;
        System.out.print("Ingrese un numero entre el 1 y 9999: ");
        a = entrada.nextInt();
        b=Integer.toString(a);
        c="El número "+a+" con las cifras al revés es: ";
        if(a>9999||a<1){
            System.out.println("El número "+a+" está fuera del rango.");
        }
        else if(a>=1000){
            System.out.println(c+b.charAt(3)+b.charAt(2)+b.charAt(1)+b.charAt(0));
        }
        else if(a<1000&&a>=100){
            System.out.println(c+b.charAt(2)+b.charAt(1)+b.charAt(0));
        }
        else if(a<100&&a>=10){
            System.out.println(c+b.charAt(1)+b.charAt(0));
        }
        else if(a<10){
            System.out.println(c+a);
        }
        entrada.close();
    }
}