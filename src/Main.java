import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        boolean b = true;
        while (b){
            b = main.menu();
        }
    }

    private static int validacion(Scanner scan) {
        while (true){
            try{
                int opcion;
                System.out.println("Ingrese el numero de opcion del menu: --> ");
                opcion = Integer.parseInt(scan.next());
                return opcion;
            }catch (Exception ValueError){
                System.out.println("Ingrese un valor entero por favor ...\n");
            }
        }
    }

    public boolean menu(){
        System.out.println("Estoy en menu");
        HashMap<String, Runnable> menu_calc = new HashMap<>();
        menu_calc.put("1. Sumar", Calculadora::sumar);
        menu_calc.put("2. Restar", Calculadora::restar);
        menu_calc.put("3. Multiplicar", Calculadora::multiplicar);
        menu_calc.put("4. Dividir", Calculadora::dividir);
        menu_calc.put("5. Cuadratica", Calculadora::cuadratica);

        for (String key : menu_calc.keySet()){
            System.out.println(key);
        }
        Scanner scan = new Scanner(System.in);
        int opcion = validacion(scan);

        switch(opcion) {
            case 1:
                menu_calc.get("1. Sumar").run();
                return true;
            case 2:
                menu_calc.get("2. Restar").run();
                return true;
            case 3:
                menu_calc.get("3. Multiplicar").run();
                return true;
            case 4:
                menu_calc.get("4. Dividir").run();
                return true;
            case 5:
                menu_calc.get("5. Cuadratica").run();
                return true;
            case 0:
                return false;
        }
        return true;
    }
}