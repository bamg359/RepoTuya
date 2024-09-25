package notasdeclase;

public class Matriz {


    public static void main(String[] args) {


        int [][] edades = new int[2][5];

        int [] edades0 = {23,14,45,53,17};

        int [][] edades1 = {{23,14,45,53,17},{16,34,57,89,12}};

        int [][][] edades2 = {{{23,14,45,53,17},{16,34,57,89,12}},{{23,14,45,53,17},{16,34,57,89,12}}};


        for (int i = 0; i< edades1.length; i++){
            for(int j = 0; j < edades1[i].length; j++){

                System.out.print(edades1[i][j]+" ");
            }
            System.out.println("\n");
        }


    }
}
