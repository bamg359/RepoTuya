package notasdeclase;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);


        // Operadores arimeticos (+,-,*,/,%,)

        int data = (100/4)* 25 + (4*2);

        // Operadores de comparacion

        int clave = 1234;
        int claveUser = 1234;

        if (clave == claveUser){
            System.out.println("Se permite el ingreso");
        }

        float estatura = 1.76f;
        float estIngresada = 1.77f;

        if (estatura > estIngresada ){
            System.out.println("Cobrar 5000 pesos");
        }else {
            System.out.println("No paga");
        }


        // Operadoreslogicos


        System.out.println("Ingrese un numero:");

        int num1 = leer.nextInt();

        System.out.println("Ingrese el segundo numero");

        int num2 = leer.nextInt();

        int suma = num1 + num2;

        System.out.println("num1: " + num1 + "\n" +
                        "num2: " + num2 + "\n" +
                "El resultado de suma es " + suma + "\n"
                );





    }


}
