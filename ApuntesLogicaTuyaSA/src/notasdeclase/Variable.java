package notasdeclase;

public class Variable {

    public static void main(String [] args){

        int idCliente;  //Declarar una variable

        idCliente = 12345678; // Inicializar una variable

        String nombreCliente = "Pepito";

        int num1, num2;

        num1 = 5;
        num2 = 10;

        byte edad = 127;
        short mesada = 32767;
        short ahorroMesada = mesada;

        // Vamos a usar el casteo de variables

        int ahorro = (int) ahorroMesada;

        ahorro = ahorroMesada + mesada;

        System.out.println(ahorro);
        //Parsing o parseo de variables
        //Saque el promedio de las edades
        int edad1 = 19;
        String edad2 = "22";
        int edadConv2 = Integer.parseInt(edad2);
        System.out.println(edadConv2);
        float promedio = (edad1 + edadConv2)/2;

        System.out.println(promedio);

        String promedioConv = promedio + "";

        System.out.println(promedioConv);


        //Tipos de datos


        float nota = 4.5f;

        long bigNumber = 232545884555654l;


    }
}
