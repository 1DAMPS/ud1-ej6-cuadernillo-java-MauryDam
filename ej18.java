/*Autor: @MauryDam
Fecha: 07/Octubre/2025
Proposito: Este es un programa básico en Java, cuya función principal
es la suma de dos numeros enteros. Tambien está diseñado para ver el 
uso de la clase "Scanner".*/ 

// Importamos la clase Scanner
import java.util.Scanner;
public class ej18{
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        // objeto creado de la clase Scanner
	
    int num1;
    int num2;

System.out.println("vamos a sumar dos números");
System.out.print("introduzca el primer número: ");
num1 = sc.nextInt();
System.out.print("introduzca el segundo número: ");
num2 = sc.nextInt();
// Este es el resultado de la suma de los dos numeros
System.out.println("la suma es: " + (num1 + num2));

sc.close(); // Cerramos el objeto Scanner. Buenas prácticas
    }
}