/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_josue.rivera;
import java.util.Scanner;

public class Lab2P1_JosueRivera {

    
    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
        System.out.println("Elige que ejercicio quiere" +""
                + " 1. Dibujando Triangulos, 2. Area de Figuras, 3. Evaluando numeros, 4. salir del programa");
      int opcion = input.nextInt();
      while (opcion != 4){
          if (opcion ==1){
              System.out.println("Ingese la longitud 1");
              int longitud1 = input.nextInt();
              while (longitud1 < 0){
                  System.out.println("Error, la longitud no puede ser menor a zero");
                  longitud1 = input.nextInt(); 
                  }
              System.out.println("Ingrese la longitud 2");
              int longitud2 = input.nextInt();
              while (longitud2 < 0){
                  System.out.println("Error, la longitud no puede ser menor a zero");
                  longitud2 = input.nextInt();
              }
              System.out.println("Ingrese la longitud 3");
              int longitud3 = input.nextInt();
              while (longitud3 < 0){
                  System.out.println("Error, la longitud no puede ser menor a zero");
                  longitud3 = input.nextInt();
              }
              if (longitud1 + longitud2 < longitud3 || 
                      longitud1 + longitud3 < longitud2 || longitud2 + longitud3 < longitud1){
                  System.out.println("La longitud ingresada no forma un triangulo");
              }
              else
                  System.out.println("las longitudes ingresadas forman un triangulo");
          }
          if (opcion == 2){
              double pi = 3.14159;
              double base,altura,radio;
              System.out.println("Elegir a que figura le quiere medir el area ");
              System.out.println("1. Rectangulo");
              System.out.println("2. Triangulo");
              System.out.println("3. Circulo");
              int figura = input.nextInt();
              char empezar = 's';
              while (empezar == 's'){
                 if (figura == 1 ){
                     System.out.println("Introduzca la base");
                     base = input.nextDouble();
                     System.out.println("Introduzca la altura");
                     altura = input.nextDouble();
                     double rec = base*altura;
                     System.out.println("el area del rectangulo es :"+rec);
                     
                 }
                 if (figura == 2 ){
                     System.out.println("Introduzca la base");
                     base = input.nextDouble();
                     System.out.println("Introduzca la altura");
                     altura = input.nextDouble();
                      double tri = 0.5*base*altura;
                      System.out.println(" el area del triangulo :"+tri);
                 }
                 if (figura == 3 ){
                     System.out.println("Introduzca el radio");
                     radio = input.nextDouble();
                     double cir = pi*Math.pow(radio, 2);
                     System.out.println("el area del circulo es :"+cir);
                 }
                  System.out.println("quiere sacar el area de otra figura s/n");
                  empezar = input.next().charAt(0);
                  if (empezar == 's'){
                     System.out.println("Elegir a que figura le quiere medir el area ");
                     System.out.println("1. Rectangulo");
                     System.out.println("2. Triangulo");
                     System.out.println("3. Circulo");
                     figura = input.nextInt();
                 }
              }
              
          }
          if (opcion == 3){
              System.out.println("introduxca el numero:");
              int numero = input.nextInt();
              int divisores = 0;
              int restante;
              boolean par = false;
              boolean primo = false;
              int contador = 1;
              if (numero % 2 == 0){
                  par = true;
              }
              while (contador <= numero){
                  restante = numero%contador;
                  if (restante == 0){
                      divisores = 1 + divisores;
                  }
                  contador ++;
              }
              if (divisores == 2){
                  primo = true;
              }
              else{
                  primo = false;
              }
              if (par == true && primo == true){
                  System.out.println("el numero ingresado es par y primo");
              }
              else if (par == false && primo == false){
                  System.out.println("el numero es impar");
              }
              else if (par == true && primo == false){
                  System.out.println("El numero es par");
              }
              else {
                  System.out.println("el numero es impar y primo");
                  
              }
              
              
              
          }
          System.out.println("Elige que ejercicio quiere" +""
                + " 1. Dibujando Triangulos, 2. Area de Figuras, 3. Evaluando numeros, 4. salir del programa");
          opcion = input.nextInt();
          
      }
              
      
        // TODO code application logic here
    }
    
}
