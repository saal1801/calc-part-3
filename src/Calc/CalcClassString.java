package Calc;

import java.util.Scanner;

public class CalcClassString {
	
	public void Calculator() {
		int sumA = 0;
		int sumB = 0;
		boolean status = true;
		while (status) {

			String stringA ="a";
			String stringB = "b";
			
			
			System.out.println("A or B");
			
			Scanner scanner ;
			
			if(stringA.equalsIgnoreCase("a")) {
				
				
				

				Scanner sca = new Scanner(System.in);
				char op = sca.next().charAt(0);

				if (!(op == 'a' || op == 'b')) {
					System.err.println("Invalid Operator. Please choose only A or B ");
				}
				
			}else
				{
				scanner = new Scanner(System.in);
				char operation = scanner.next().charAt(0);
				
				System.out.println("The first number: "+ sumA);
				
				
				System.out.print("Enter the second number: ");
				int num2 = scanner.nextInt();
				
				if (operation == '+') {
					sumA = sumA + num2;
					System.out.println("The new sum is " + (sumA));
				}

				if (operation == '-') {
					sumA = sumA - num2;
					System.out.println("The new sum is " +(sumA));
				}
				if (operation == '*') {
					sumA = sumA * num2;
					System.out.println("The new sum is " +(sumA));
				}
				if (operation == '/') {
					sumA = sumA / num2;
					System.out.println("The new sum is " +(sumA));
					
				}
				
			}
				
			System.out.println("Following operations are supported : \n" + "1. Addition (+) \n"
					+ "2. Subtraction (-) \n" + "3. Multiplication (*) \n" + "4. Division (/) \n");
				
			if(sumA<=1) {
			scanner = new Scanner(System.in);
			char operation = scanner.next().charAt(0);
			
			System.out.print("Enter the first number: ");
			
			
			int num1 = scanner.nextInt();
			
			
			
//			char num1 = scanner.next(".").charAt(0);
			System.out.print("Enter the b value: ");
			char letter2 = scanner.next().charAt(0);
			
			int num2 = 0;
			if (letter2 == 'a') {
			System.out.print("Add value to b letter: ");
			num2 = scanner.nextInt();
			}
			
			

			if (!(operation == '+' || operation == '-' || operation == '*' || operation == '/')) {
				System.err.println("Invalid Operator. Please use only + or - or * or / or Please choose only A or B");

			}
			

			/*
			 * if(!(operation == '/' && num2 == 0.0)) {
			 * System.err.println("The second number cannot be zero for division operation."
			 * ); }
			 */

			if (operation == '+') {
				sumA = num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + (sumA));

			}

			if (operation == '-') {
				sumA = num1 - num2;
				System.out.println(num1 + " - " + num2 + " = " + (sumA));
			}
			if (operation == '*') {
				sumA = num1 * num2;
				System.out.println(num1 + " * " + num2 + " = " + (sumA));
			}
			if (operation == '/') {
				sumA = num1 / num2;
				System.out.println(num1 + " / " + num2 + " = " + (sumA));
			}

			
			
	}
			if(stringB.equalsIgnoreCase("b")) {
//				if(stringB == "a") {
//					System.out.println("a");
//				}
				
				if(sumB<=1) {
					scanner = new Scanner(System.in);
					char operation = scanner.next().charAt(0);
					
					System.out.print("Enter the first number: ");
//					String str = scanner.nextLine();
					
					
					int num1 = scanner.nextInt();
//					int num1 = Integer.parseInt(str);
//					char num1 = scanner.next().trim().charAt(0);
					
					if(scanner.equals("a")) {
						sumA = sumA + num1;
						System.out.println("The new sum is " + (sumA));
						
					}
					
					System.out.print("Enter the second number: ");
					int num2 = scanner.nextInt();

					if (!(operation == '+' || operation == '-' || operation == '*' || operation == '/')) {
						System.err.println("Invalid Operator. Please use only + or - or * or / or Please choose only A or B");

					}
					

					/*
					 * if(!(operation == '/' && num2 == 0.0)) {
					 * System.err.println("The second number cannot be zero for division operation."
					 * ); }
					 */

					if (operation == '+'|| scanner.equals("b")) {
						sumB = num1 + num2;
						System.out.println(num1 + " + " + num2 + " = " + (sumB));

					}

					if (operation == '-') {
						sumB = num1 - num2;
						System.out.println(num1 + " - " + num2 + " = " + (sumB));
					}
					if (operation == '*') {
						sumB = num1 * num2;
						System.out.println(num1 + " * " + num2 + " = " + (sumB));
					}
					if (operation == '/') {
						sumB = num1 / num2;
						System.out.println(num1 + " / " + num2 + " = " + (sumB));
						
					}

					System.out.println("A or B");

					Scanner sca = new Scanner(System.in);
					char op = sca.next().charAt(0);

					if (!(op == 'a' || op == 'b')) {
						System.err.println("Invalid Operator. Please choose only A or B ");
					}
					
					
				} if(stringB == "a" ) { // New
					
					scanner = new Scanner(System.in);
					char operation = scanner.next().charAt(0);
					
					System.out.println("The first number: "+ sumA);
					
					
					System.out.print("Enter the second number: ");
					int num2 = scanner.nextInt();
					
					if (operation == '+') {
						sumA = sumA + num2;
						System.out.println("The new sum is " + (sumA));
					}

					if (operation == '-') {
						sumA = sumA - num2;
						System.out.println("The new sum is " +(sumA));
					}
					if (operation == '*') {
						sumA = sumA * num2;
						System.out.println("The new sum is " +(sumA));
					}
					if (operation == '/') {
						sumA = sumA / num2;
						System.out.println("The new sum is " +(sumA));
						
					}
				}
				else 
					{
					
					scanner = new Scanner(System.in);
					char operation = scanner.next().charAt(0);
					
					System.out.println("The first number: "+ sumA);
					
					
					System.out.print("Enter the second number: ");
					int num2 = scanner.nextInt();
					
					if (operation == '+') {
						sumA = sumA + num2;
						System.out.println("The new sum is " + (sumA));
					}

					if (operation == '-') {
						sumA = sumA - num2;
						System.out.println("The new sum is " +(sumA));
					}
					if (operation == '*') {
						sumA = sumA * num2;
						System.out.println("The new sum is " +(sumA));
					}
					if (operation == '/') {
						sumA = sumA / num2;
						System.out.println("The new sum is " +(sumA));
						
					}
					
				}
				
				
				
		}else {
				System.out.println("Something is wrong");
			}

			
		}
		
		
	}

	public static void main(String[] args) {
		CalcClassString calcClassString = new CalcClassString();
		calcClassString.Calculator();

	}

}
