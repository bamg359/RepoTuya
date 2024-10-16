package domain;

import java.util.Scanner;

public class Costumer {

    Scanner sc = new Scanner(System.in);

    // Atributos
    int userId;
    String userName;
    String userLastName;
    String userPhone;
    String userMail;
    String password;
    String costumerType;
    int costumerPoints;

    //Comportamientos

    Object[][] costumers = new Object[2][8];


    public Object createUser() {

        Object[] costumer = new Object[8];

        System.out.println("Ingrese el id del usuario");
        userId = sc.nextInt();
        costumer[0] = userId;
        sc.nextLine();
        System.out.println("Ingrese el nombre del usuario:");
        userName = sc.nextLine();
        costumer[1] = userName;
        System.out.println("Ingrese el apellido");
        userLastName = sc.nextLine();
        costumer[2] = userLastName;
        System.out.println("Ingrese el Telefono");
        userPhone = sc.nextLine();
        costumer[3] = userPhone;
        System.out.println("Ingrese el correo");
        userMail = sc.nextLine();
        costumer[4] = userMail;
        System.out.println("Cree el password");
        password = sc.nextLine();
        costumer[5] = password;
        System.out.println("Ingrese el tipo");
        costumerType = sc.nextLine();
        costumer[6] = costumerType;
        System.out.println("Ingrese los puntos iniciales");
        costumerPoints = sc.nextInt();
        costumer[7] = costumerPoints;

        return costumer;

    }


    public void agregateCostumer(){

        for(int i= 0 ; i < costumers.length; i++){

            costumers[i] = (Object[]) createUser();
        }
    }



    public void listUser(){

        for(int i= 0 ; i < costumers.length; i++){
            Object[] costumer = (Object[]) createUser();
            System.out.println(costumer[i]);
        }





    }

    public void listUsers(){

        for(int i = 0; i< costumers.length; i++){
            for(int j = 0; j< costumers[i].length; j++){
                System.out.println(costumers[i][j]);
            }
        }


    }

    public void updateUser(){

    }


    public void deleteUser(){

    }







}
