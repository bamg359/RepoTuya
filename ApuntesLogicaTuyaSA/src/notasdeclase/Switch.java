package notasdeclase;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione 1. crear un usuario" +
                "Seleccione 2. Iniciar Sesión " +
                "3. Calcular el salario " +
                "4. Validar Su categoria de Salario" +
                "5. Ver Datos del usuario");


        int opcion = sc.nextInt();

        switch (opcion){

            case 1:
                System.out.println("Crea usuario");
                break;
            case 2:
                System.out.println("Login");
                break;
            case 3:
                System.out.println("Calcular Salario");
                break;
            case 4:
                System.out.println("Validar Categoria de salario");
                break;
            case 5:
                System.out.println("Ver datos del usuario");
                break;
            default:
                System.out.println("Seleccione una opción valida");
        }



    }

}
