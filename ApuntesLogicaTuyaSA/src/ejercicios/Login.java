package ejercicios;

import java.util.Scanner;

public class Login {


    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        // Base datos , array, iot , api

        String userName = "pp@mail.com";
        int key = 1234;
        String nameUser = "Pepito";
        String phone = "3214567890";


        // INterfaz

        System.out.println("Ingrese su teléfono o su usuario");

        String input = sc.nextLine();

        System.out.println("Ingrese su password");

        int keyInput = sc.nextInt();


        if((userName.equals(input) || phone.equals(input)) && key == keyInput){

            System.out.println("Bienvenido " + nameUser);

        }else{

            System.out.println("Valide sus credenciales");
        }





    }




}
