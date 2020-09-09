package fr.mds.javacourse.fizzbuzz;

/*	
	Si  le_nombre%10 == 9 alors « \r »
	Sinon 3% le_nombre == 0 et 5%le_nombre ==0 alors fizzbuzz
	Sinon si le je fais 3% le_nombre  == 0 alors fizz
	Sinon si je fait 5% pénombre == 0 alors buzz
	Sinon affiche le_nombre
*/

public class Launcher {

	public static void main(String[] args) {
		
		System.out.println("FizzBuzzProject");
				
		for(int i = 1; i<=100; i++){
			
			if((i%3) == 0 && (i%5) == 0){
				System.out.print("fizzbuzz ");
			}else if ((i%3) == 0) {
				System.out.print("fizz ");
			} else if ((i%5) == 0) {
				System.out.print("buzz ");
			} else {
				System.out.print(i + " ");	
			}
			
			if (i % 10 == 9) {
				System.out.println("");
			}
		}	
	}
	
}
