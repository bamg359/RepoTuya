package notasdeclase;

import java.util.Scanner;

public class FuncionConRetorno {

    static Scanner sc = new Scanner(System.in);
    static double salario;
    static float auxTransporte = 162000;
    static double salarioNeto;
    static double descuentoSalud;
    static double descuentoPension;
    static double smlv = 1300000;
    static final float PORCDESCUENTOSALUD = 0.04f;
    static final float PORCDESCUENTOPENSION = 0.04f;





    public static void main(String[] args) {

        System.out.println("Ingrese salario");

        salario = sc.nextDouble();
        salarioNeto = calcularSalarioNeto(salario, PORCDESCUENTOPENSION, PORCDESCUENTOSALUD, auxTransporte);
        System.out.println("Salario Neto es: " + salarioNeto);
    }



    // Tuya va a pagar el salario de los nuevos developers, si el nivel del contrato
    // junior su salario es de 2500000 y si es Junior Advance es de 3100000
    // Se requiere calcular los descuentos de salud y pension. si el salario es menor
    // a 2 smlv se le debe pagar aux de transporte, de lo contrario no se pagaría.
    // Cree una funcionalidad que permita calcular el pago a cada uno de los nuevos devps.


    public static double calcularSalud(double salario, double porcSalud){
        return salario*porcSalud;
    }

    public static double calcularPension(double salario, float porcPension){
        return salario*porcPension;
    }

    public static double calcularSalarioNeto(double salario, float porcPension , float porcSalud , double auxTranp){


        if(salario <= 2*smlv){
            return salario - calcularPension(salario, porcPension ) - calcularSalud(salario, porcSalud) + auxTranp;
        }else {

            return salario - calcularPension(salario, porcPension) - calcularSalud(salario, porcSalud);
        }
    }



}





