package src.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;


public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static int OPCION_SALIR = 6;
    public static void main(String[] args) {
        Map<Integer,Accion> strategy = AccionHandler.getStrategy();


        int opcion;
        do {
            System.out.println( " Ingrese una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            Accion accion= strategy.get(opcion);
            if (opcion == OPCION_SALIR){
                continue;
            };

            if(accion == null && opcion !=5){
                System.out.println("Esta opción no existe");
            }else {
                accion.aplicar();
            }
        }while (opcion != OPCION_SALIR);
        System.out.println("Salida exitosa");



    }
}
