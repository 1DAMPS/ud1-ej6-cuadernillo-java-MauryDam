public class ej16{ //Asignamos nombre a la clase
    public static void main(String[]args){
        // Declaracion de variable asignando valor
       short num = 30000;
       short desborde = num * 10;
        // Imprimimos por pantalla el valor de la variable desborde
        System.out.println("El valor de desborde es: " + desborde);
    }
}
/*El programa me arroja un error por desborde, ya que se exede el 
rango permitido del tipo primito "short" creo que habria dos opciones 
o convertir directamente la variable "desborde" a int directamente
para que pueda operar dentro del rango o has un "cast" */ */