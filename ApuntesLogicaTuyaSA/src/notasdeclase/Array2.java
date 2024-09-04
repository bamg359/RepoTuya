package notasdeclase;

import java.util.Scanner;

public class Array2 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] edades = new int[5];

        int i = 0;

        while (i < edades.length){

            System.out.println("Ingrese la edad " + (i+1));
            edades[i] = sc.nextInt();
            i++;

        }

        int j = 0;
        while ( j < edades.length ){

            System.out.println("la edad " + (j+1) + "es: " + edades[j]);

            j++;
        }






    }
}
