package ejercicios;

import java.util.Scanner;

public class Login {


    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        // Base datos , array, iot , api

        String userName = "pp@mail.com";
        int key = 1234;
        String nameUser = "Pepito";


        // INterfaz
        System.out.println("INgrese su Usuario");

        String userInput = sc.nextLine();

        System.out.println("INgrese su password");

        int keyInput = sc.nextInt();


        if(userName.equals(userInput) && key == keyInput){

            System.out.println("Bienvenido " + nameUser);


        }else{

            System.out.println("Valide sus credenciales");
        }





    }




}
