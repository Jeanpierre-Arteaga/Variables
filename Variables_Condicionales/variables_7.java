import java.util.Scanner;
public class variables_7 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int a;
        System.out.print("Ingrese un número entre 0 y 99: ");
        a = entrada.nextInt();
        if(a>99||a<0){
            System.out.println("El número "+a+" está fuera del rango.");
        }
        else{
            System.out.println("El número "+a+" escrito es: "+escrito(a));
        }
        entrada.close();
    }
    public static String escrito(int x){
        int z;
        if(x>=10){z=x%10;}
        else{z=0;}
        String y="",w=z!=0 ? " y " + escrito(z) : "";
        switch(x){
            case 0: y="cero";break;
            case 1: y="uno";break;
            case 2: y="dos";break;
            case 3: y="tres";break;
            case 4: y="cuatro";break;
            case 5: y="cinco";break;
            case 6: y="seis";break;
            case 7: y="siete";break;
            case 8: y="ocho";break;
            case 9: y="nueve";break;
            case 10: y="diez";break;
            case 11: y="once";break;
            case 12: y="doce";break;
            case 13: y="trece";break;
            case 14: y="catorce";break;
            case 15: y="quince";break;
            case 20: y="veinte";break;
        }
        if(x>=16&&x<=19){y = "dieci" + escrito(x-10);}
        else if(x>20&&x<30){y = "veinti" + escrito(x-20);}
        else if (x>=30&&x<40){y = "treinta" + w;}
        else if (x>=40&&x<50){y = "cuarenta" + w;}
        else if (x>=50&&x<60){y = "cincuenta" + w;}
        else if (x>=60&&x<70){y = "sesenta" + w;}
        else if (x>=70&&x<80){y = "setenta" + w;}
        else if (x>=80&&x<90){y = "ochenta" + w;}
        else if (x>=90&&x<100){y = "noventa" + w;}
        return y;
    }
}