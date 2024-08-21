package notasdeclase;

import java.util.Scanner;

public class Condicional {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        //if es una estructura condicional , valida que se cumple una condicion y ejecuta si esta es true
        // dependiendo de si es compuesto, entonces genera una respuesta en caso que sea falso.


        double balance = 170000;


        System.out.println("INgrese el valor de la compra");
        double purchase =  123000;//sc.nextDouble();

        System.out.println("Numero de coutas ");

        if (purchase > 0 && purchase <= balance){
            System.out.println("Compra exitosa");
            balance -= purchase;
            System.out.println("Su nuevo saldo es" + balance);
        }else{

            System.out.println("Saldo insuficiente");

        }

        System.out.println(balance);



    }
}
