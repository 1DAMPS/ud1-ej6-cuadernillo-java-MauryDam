import java.util.Scanner; // Importamos la clase Scanner para poder leer datos de entrada
// Nombre de la clase
public class ej13{
	public static void main(String[]args){
// Declaracion de variables y asignacion de valores
final double IRPF = 0.15; // constante declarada con un valor determinado.
Scanner sc = new Scanner(System.in); // Creamos un objeto Scanner para leer datos de entrada

 // Solicitar sueldo al usuario
        System.out.print("Introduce tu sueldo bruto: ");
        double sueldoBruto = sc.nextDouble();

double descuento = sueldoBruto * IRPF; // cantidad exacta de IRPF que hay que descontar 
double sueldoNeto = sueldoBruto - descuento; // calculo de sueldo bruto - IRPF
// Imprimimos por pantalla el resultado del sueldo neto
	System.out.println("El total de su sueldo neto en su nomina es de: " + sueldoNeto);

 // Cerramos el scanner como buena practica que hemos visto en clase.
sc.close();

}
}
