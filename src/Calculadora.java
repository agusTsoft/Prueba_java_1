import java.util.Scanner;
import java.util.Scanner.*;
public class Calculadora {
    private static double validacion(Scanner scan, String msj) {
        while (true){
            try{
                double num;
                System.out.println(msj);
                num = Double.parseDouble(scan.next());
                return num;
            }catch (Exception ValueError){
                System.out.println("VALOR NO VALIDO ...\n");
            }
        }
    }
    public static void sumar(){
        Scanner scan = new Scanner(System.in);
        double n1 = validacion(scan, "Ingrese el primer numero de la suma --> ");
        double n2 = validacion(scan, "Ingrese el segundo numero --> ");
        System.out.println(n1 + n2);
    }

    public static void restar(){
        Scanner scan = new Scanner(System.in);
        double n1 = validacion(scan, "Ingrese el primer numero de la RESTA --> ");
        double n2 = validacion(scan, "Ingrese el segundo numero --> ");
        System.out.println(n1 - n2);
    }

    public static void multiplicar(){
        Scanner scan = new Scanner(System.in);
        double n1 = validacion(scan, "Ingrese el primer numero del PRODUCTO --> ");
        double n2 = validacion(scan, "Ingrese el segundo numero --> ");
        System.out.println(n1 * n2);
    }

    public static void dividir(){
        Scanner scan = new Scanner(System.in);
        double n1 = validacion(scan, "Ingrese el primer numero de la DIVISION --> ");
        double n2 = validacion(scan, "Ingrese el segundo numero --> ");
        System.out.println(n1 / n2);
    }

    public static void cuadratica(){
        System.out.println("Recordar expresion de una cuadratica: y = ax^2 + bx + c\n");
        System.out.println("Reconrdar expresión de Fórmula Resolvente: \nx1,2 = (-b +- -/(b^2 - 4*a*c) )\n------------\n       2*a");
        Scanner scan = new Scanner(System.in);
        double a = validacion(scan, "Ingrese a --> ");
        double b = validacion(scan, "Ingrese b --> ");
        double c = validacion(scan, "Ingrese c --> ");
        try{
            double d = (b*b - 4 * a * c);
            if (d < 0){
                System.out.println("No se puede calcular una raiz negativa...");
            }else{
                double x1 = (- b + Math.sqrt(d));
                double x2 = (-b - Math.sqrt(d));
                System.out.println("x1 = " + x1 + ", x2 = " + x2);
            }

        }catch (Exception e){
            System.out.println("Error en el cálculo de raiz...");
        }
    }
}
