package tareaprograiipoo;

import java.util.Scanner;

public class TareaPrograIIPOO {
    
   
    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
       CalculadoraEspecial calculadoraquecalculadeioni = new CalculadoraEspecial("Calculadoraquecalculadeioni");
       boolean salir = false;
       int opcion; 

       do{
           System.out.println("");
           System.out.println("1. Suma");
           System.out.println("2. Resta");
           System.out.println("3. Multiplicacion");
           System.out.println("4. Dividicion");
           System.out.println("5. Raiz Cuadrada");
           System.out.println("6. Numero Primo");
           System.out.println("7. Factorial");
           System.out.println("8. Seno");
           System.out.println("9. Coseno");
           System.out.println("10. Tangente");
           System.out.println("11. Redondear");
           System.out.println("12. Valor Aleatorio");
           System.out.println("13. Salir");
           System.out.println("Selecciona lo que quieras, mientras sea algo que pueda hacer...");
           opcion = sn.nextInt();
            switch(opcion){
                case 1:
                   System.out.println("El resultado de la suma es = " + calculadoraquecalculadeioni.sumar(22, 9));
                   break;
                case 2:
                   System.out.println("El resultado de la resta es = " +calculadoraquecalculadeioni.restar(99, 98));
                   break;
                case 3:
                   System.out.println("El resultado de la multiplicacion es = " +calculadoraquecalculadeioni.multiplicar(69, 1));
                   break;
                case 4:
                    System.out.println("El resultado de la division es = " +calculadoraquecalculadeioni.dividir(20, 2));
                    break;
                case 5:
                    System.out.println("El resultado de la raiz cuadrada es = " +calculadoraquecalculadeioni.raizCuadrada(64));
                    break;
                case 6:
                    System.out.println("El numero es primo? = " +calculadoraquecalculadeioni.esPrimo(11));
                    break;
                case 7:
                    System.out.println("El resultado del factorial es = " +calculadoraquecalculadeioni.Factorial(9));
                    break;
                case 8:
                    System.out.println("El resultado del calculo de seno es = "+calculadoraquecalculadeioni.seno(50));
                    break;
                case 9:
                    System.out.println("El resultado del calculo de coseno es = "+calculadoraquecalculadeioni.coseno(40));
                    break;
                case 10:
                    System.out.println("El resultado del calculo de tangente es = "+calculadoraquecalculadeioni.tangente(30));
                    break;
                case 11:
                    System.out.println("El resultado del calculo de redondear es = "+calculadoraquecalculadeioni.redondear(45.8));
                    break;
                case 12:
                    System.out.println("El resultado del calculo del valor Aleatorio es = "+calculadoraquecalculadeioni.valorAleatorio());
                    break;
                case 13:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo se pueden números entre 1 y 7 paaa.");
            }
       }
        while(!salir);   

    }
}

