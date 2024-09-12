package Variables_Condicionales;
import java.util.Scanner;
public class variables_1 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        float a,b,c,discriminante,x1,x2;
        System.out.print("Digite el coeficiente principal: ");
        a=entrada.nextFloat();
        System.out.print("Digite el coeficiente lineal: ");
        b=entrada.nextFloat();
        System.out.print("Digite el término independiente: ");
        c=entrada.nextFloat();
        discriminante = (float)(Math.pow(b,2)-(4*a*c));
        x1 = (float)(-b + Math.sqrt(discriminante))/(2*a);
        x2 = (float)(-b - Math.sqrt(discriminante))/(2*a);
        System.out.println("\nSOLUCIONES DE LA ECUACIÓN:");
        if(discriminante>0){
            System.out.println("Obs: Raíces reales y diferentes.");
            soluciones(x1,x2);
        }
        else if(discriminante==0){
            System.out.println("Obs: Raíces reales e iguales.");
            soluciones(x1,x2);
        }
        else if(discriminante<0){
            System.out.println("La ecuación cuadrática no tiene solución en los números reales.");
        }
        entrada.close();
    }
    public static void soluciones(float a,float b){
        System.out.printf("La primera solución es: %.2f%n",a);
        System.out.printf("La segunda solución es: %.2f",b);
    }
  }