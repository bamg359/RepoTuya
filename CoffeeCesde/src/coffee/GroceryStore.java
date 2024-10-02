package coffee;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class GroceryStore {

    static Scanner sc = new Scanner(System.in);

    // Users
    static int id;
    static String name;
    static String email;
    static String password;

    // Product

    static int productId;
    static String productName;
    static double productPrice;
    static double quantity;

    // Sale

    static int saleId;
    static Date date;
    static String costumer;
    static String product;
    static double price;
    static double quantityToSale;
    static double total;



    static String [][] costumers = new String[3][4];


    public static void main(String[] args) {


        agregateToCostumers();
        listCostumers();


    }

    public static String[] createCostumer(){

        String[] costumer = new String[4];

        System.out.println("Ingrese el id");
        id = sc.nextInt();
        costumer[0] = id +"";
        sc.nextLine();
        System.out.println("Ingrese el nombre");
        name = sc.nextLine();
        costumer[1] = name;
        System.out.println("Ingrese el Correo");
        email = sc.nextLine();
        costumer[2]= email;
        System.out.println("Ingrese el password");
        password = sc.nextLine();
        costumer[3] = password;

        return costumer;



    }

    static void agregateToCostumers(){

        int i = 0;
        while(i < costumers.length){

            costumers[i] = createCostumer();

            i++;
        }

    }

    static void agregateToCostumersForVersion(){

        for(int k = 0; k < costumers.length; k++){
            costumers[k] = createCostumer();
        }

    }

    public static void listCostumers(){
        for(int i = 0; i< costumers.length; i++){
            for(int j = 0 ; j < costumers[i].length; j++)
                System.out.print(costumers[i][j]);
        }
        System.out.println("/n");
    }

    public static void createAdmin(){

        String[] admin = new String[3];

        System.out.println("Ingrese el id");
        id = sc.nextInt();
        admin[0] = id +"";
        sc.nextLine();
        System.out.println("Ingrese el nombre");
        name = sc.nextLine();
        admin[1] = name;
        System.out.println("Ingrese el Correo");
        email = sc.nextLine();
        admin[2]= email;
        System.out.println("Ingrese el password");
        password = sc.nextLine();
        admin[3] = password;
    }




}
