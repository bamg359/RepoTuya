package notasdeclase;

public class Array {


    public static void main(String[] args) {


        //int edades[] = new int[6];

        int [] edades= {16,41, 20, 31, 24};

        System.out.println(edades[2]);

        edades[4] = 29;

        int i = 0;

        while ( i < edades.length ){

            System.out.println("la edad " + (i+1) + "es: " + edades[i]);

            i++;
        }
    }
}
