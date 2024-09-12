package Variables_Condicionales;
import java.util.Scanner;
public class variables_6 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int d,m,a;
        System.out.println("INGRESAR FECHA: ");
        System.out.print("Ingrese el día: ");
        d = entrada.nextInt();
        System.out.print("Ingrese el mes (en números): ");
        m = entrada.nextInt();
        System.out.print("Ingrese el año: ");
        a = entrada.nextInt();
        if(dia(d)&&mes(m)&&año(a)){
            System.out.printf("\nLa fecha %02d / %02d / %04d es correcta.",d,m,a);
        }
        else{
            System.out.printf("\nLa fecha %02d / %02d / %04d es incorrecta.",d,m,a);
        }
        entrada.close();
    }
    public static boolean dia(int x){
        if(x>=1&&x<=31){return true;}
        return false;
    }
    public static boolean mes(int x){
        if(x>=1&&x<=12){return true;}
        return false;
    }
    public static boolean año(int x){
        if(x>=0){return true;}
        return false;
    }
}
