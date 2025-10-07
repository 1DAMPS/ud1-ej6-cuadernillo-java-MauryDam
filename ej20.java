/**Programa para mostrar el resultado de una multiplicación
 * Autor: @MauryDam
 * Version: 1.0
 * fecha: 09/Octubre/2024
 */
import java.util.Scanner;// Importamos la clase Scanner
public class ej20{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // objeto creado de la clase Scanner

        System.out.println("Vamos a multiplicar dos números");
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();// pedimos y almacenamos el primer numero
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();// pedimos y almacenamos el segundo numero
        int resultado = num1 * num2;

        System.out.println("El resultado de la multiplicación es: " + resultado);
        sc.close(); // Cerramos el objeto Scanner. Buenas prácticas
 }
}