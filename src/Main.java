import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Float num1, num2, num3, mayor, menor, medio;
        System.out.println("Se requiere un programa en Java para determinar cuál es el número más pequeño, cuál es el número más grande y cuál es el número intermedio de los tres ingresados.");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el primer número");
        num1=entrada.nextFloat();
        System.out.println("Ingresa el segundo número");
        num2=entrada.nextFloat();
        System.out.println("Ingresa el tercer número");
        num3=entrada.nextFloat();
        if(num1 > num2 && num1> num3){
            mayor= num1;
            if(num2 > num3){

                medio = num2;
                menor = num3;
            }else{

                medio = num3;
                menor = num2;
            }
            System.out.println("El número mayor es: " + mayor +" El número medio es: " + medio+ "El número menor es: " + menor);
        }

        if(num2 > num1 && num2 > num3){
            mayor= num2;
            if(num1 > num3){

                medio = num1;
                menor = num3;
            }else{

                medio = num3;
                menor = num1;
            }
            System.out.println("El número mayor es: " + mayor +" El número medio es: " + medio+ "El número menor es: " + menor);

        }

        if(num3 > num1 && num3 > num2){
            mayor= num3;
            if(num2 > num1){

                medio = num2;
                menor = num1;
            }else{

                medio = num1;
                menor = num1;
            }

            System.out.println("El número mayor es: " + mayor +" El número medio es: " + medio+ " El número menor es: " + menor);

        }

    }
}