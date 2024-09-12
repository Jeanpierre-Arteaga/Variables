package Variables_Condicionales;
import java.util.Scanner;
public class variables_5 {
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);
        int a,b;
        System.out.print("Ingrese un número entre el 1 y 9999: ");
        a = entrada.nextInt();
        if(a>9999||a<1){
            System.out.println("El número "+a+" está fuera del rango.");
        }
        else{
            b = al_reves(a);
            if(a==b){
                System.out.print("El número "+a+" es capicúa.");
            }
            else{
                System.out.print("El número "+a+" no es capicúa.");
            }
        }
        entrada.close();
    }
    public static int al_reves (int x){
        String y=Integer.toString(x),z="";
        if(x>=1000){
            z=""+y.charAt(3)+y.charAt(2)+y.charAt(1)+y.charAt(0);
        }
        else if(x<1000&&x>=100){
            z=""+y.charAt(2)+y.charAt(1)+y.charAt(0);
        }
        else if(x<100&&x>=10){
            z=""+y.charAt(1)+y.charAt(0);
        }
        else if(x<10){
            z=y;
        }
        return Integer.parseInt(z);
    }
}