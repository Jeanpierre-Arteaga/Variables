package Variables_Condicionales;
import java.util.Scanner;
public class variables_2 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int a,b;
        System.out.print("Digite el primer numero: ");
        a = entrada.nextInt();
        System.out.print("Digite el segundo numero: ");
        b = entrada.nextInt();
        if (a%b==0){
            System.out.print("El numero "+a+" es multiplo de "+b+".");
        }
        else{
            if (b%a==0){
                System.out.print("El numero "+b+" es multiplo de "+a+".");
            }
            else{
                System.out.print("Ninguno de los numeros es multiplo del otro.");
            }
        }
        entrada.close();
    }
}
