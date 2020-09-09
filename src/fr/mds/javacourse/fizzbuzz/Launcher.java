package fr.mds.javacourse.fizzbuzz;

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
