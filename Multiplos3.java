/**
Exercici 3
Fes un programa que:
●	Demani un nombre enter positiu
●	Calculi la suma de tots els nombres múltiples de 3 compresos entre u i 
	l’enter proporcionat al programa**/
/** importamos Scanner para introducir datos por teclado**/ 	
import java.util.Scanner;
public class Multiplos3 {
	/**iniciamos programa principal by Simonius**/
	public static void main (String [] args){
		/**Inicializamos Scanner**/
		System.out.println("Introduce un numero positivo");
		/**Declaramos variables**/
		Scanner scan=new Scanner(System.in);
		int opcion = scan.nextInt();
		int divisor=3;
		int acumulador=1;
		int incremento=0;
		/**verificamos que el numero es positivo**/
		if(opcion>0){
			/**iniciamos bucle para ir sumando los divisores de 3 **/
			while(acumulador<=opcion){
				if(incremento%divisor==0){
					acumulador=acumulador+incremento;
				}
				incremento=incremento +1;
				
			}
			/**imprimimos la suma de los divisores**/
			System.out.println("La suma de los divisores es: " + acumulador);
		}else{
				System.out.println("Error el numero introducido no es positivo");
				/**Este es el mensaje de error si el numero no es positivo**/
		}	
	}	
}