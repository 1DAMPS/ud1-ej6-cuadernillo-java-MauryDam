import java.util.Scanner;
public class ej04{
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
    int num1;
    int num2;

System.out.println("vamos a sumar dos números");
System.out.print("introduzca el primer número: ");
num1 = sc.nextInt();
System.out.print("introduzca el segundo número: ");
num2 = sc.nextInt();

System.out.println("la suma es: " + (num1 + num2));
    }
}
