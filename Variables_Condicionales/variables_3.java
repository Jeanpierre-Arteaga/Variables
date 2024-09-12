package Variables_Condicionales;
import java.util.Scanner;
public class variables_3 {
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);
        int a,b,c;
        System.out.print("Ingrese el primer número: ");
        a=entrada.nextInt();
        System.out.print("Ingrese el segundo número: ");
        b=entrada.nextInt();
        System.out.print("Ingrese el tercer número: ");
        c=entrada.nextInt();
        String x="ORDEN DESCENDENTE: %d , %d , %d";
        if(a>b){
            if(b>c){System.out.printf(x,a,b,c);}
            else{
                if(a>c){System.out.printf(x,a,c,b);}
                else{System.out.printf(x,c,a,b);}
            }
        }
        else if(b>a){
            if(a>c){System.out.printf(x,b,a,c);}
            else{
                if(b>c){System.out.printf(x,b,c,a);}
                else{System.out.printf(x,c,b,a);}
            }
        }
        entrada.close();
    }
}