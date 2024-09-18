package notasdeclase;

import java.util.Scanner;

public class Funcion {


    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String [] prendas = new String[5];
        String preferencias[] = new String[5];

        menu(prendas, preferencias);



    }


    public static void guardarPrendas(String[] prendas){

        int numPrenda = 0;

        while(numPrenda < prendas.length){
            System.out.println("Ingrese la prenda" + (numPrenda + 1) );
            prendas[numPrenda] = sc.nextLine();
            numPrenda++;
        }

    }

    public static void listarPrendas(String[] prendas){

        for(int i = 0; i< prendas.length; i++){

            System.out.println(prendas[i]);
        }
    }

    public static void guardarPreferencia(String [] preferencias){

        for(int i = 0; i< preferencias.length; i++){

            System.out.println("Ingrese la preferencia " + (i+1));
            preferencias[i] = sc.nextLine();
        }
    }


    public static void listarPreferencias(String[] preferencias){

        //Esto es un foreach

        for(String item: preferencias){

            System.out.println(item);
        }
    }

    public static void generarMatriz(String[] prendas, String [] preferencias){

        for(int i = 0; i< preferencias.length;i++){

            System.out.println(prendas[i]+ ": " + preferencias[i]);
        }

    }


    public static void menu(String[] prendas, String [] preferencias){

        System.out.println("oprima 1 para comenzar");

        int init = sc.nextInt();

        sc.nextLine();

        while(init != 0) {


            System.out.println("Seleccione 1. guardar prendas 2. Guardar preferencias 3. Listar prendas 4. Listar Preferencias 5. imprimir consolidado");

            int opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {

                case 1:
                    System.out.println("Guardar Prendas");
                    guardarPrendas(prendas);
                    break;
                case 2:
                    System.out.println("Guardar Preferencias: ");
                    guardarPreferencia(preferencias);
                    break;
                case 3:
                    System.out.println("Listar Prendas");
                    listarPrendas(prendas);
                    break;
                case 4:
                    System.out.println("Listar Preferencias");
                    listarPreferencias(preferencias);
                    break;
                case 5:
                    System.out.println("Consolidado: ");
                    generarMatriz(prendas, preferencias);
                    break;
                case 6:
                    System.out.println("Salir");
                    init = 0;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }

        }
    }


}
