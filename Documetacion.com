# ejercicio3Febrero10
Ejercicio3 
## Descripcion del problema
Se requiere un programa en Java para determinar cuál es el número más pequeño, cuál es el número más grande y cuál es el número intermedio de los tres ingresados.
## Definicion de la solucion
-Entrada
flost num1,num2,num3,mayor,menor,medio
-Proceso
Se requiere un programa en Java para determinar cuál es el número más pequeño, cuál es el número más grande y cuál es el número intermedio de los tres ingresados.
Ingresa el primer número
Ingresa el segundo número
Ingresa el tercer número
-Salida
El número mayor es: " + mayor +" El número medio es: " + medio+ "El número menor es: " + menor
## Diseño de la solucion
![ ] (https://github.com/progra005DSDS/ejercicio3Febrero10/blob/master/Ejercicio3.png)
## Desarollo de la 
if(num1 > num2 && num1> num3){
            mayor= num1;
            if(num2 > num3){

                medio = num2;
                menor = num3;
            }else{

                medio = num3;
                menor = num2;
## Depuracion y prueba
 si 3 es mayor a 2 y 3 es mayor a 1
 el  mayor es 3
 si 2 es mayor a 1 
 medio 2
 menor 1
 demas 
 medio 1
 menor 2
## Documentacion
documn.com
