package ejercicios;

import java.util.Random;

public class RandomGame {


    public static void main(String[] args) {

        Random random = new Random();

        int points = 0;

        int life = 10;

        while(life > 0 && points < 20){

           // int num = (int)(Math.random()*10+1);

            int num = random.nextInt(10+1);


            if(num%2 == 0){
                points++;
                System.out.println("Tienes " + points + "puntos");
            }else{
                life--;
                System.out.println("Te quedan " +life + "vidas");
            }


        }


    }
}
