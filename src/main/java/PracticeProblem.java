import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner reader = new Scanner(System.in);

        // Ask for a number
        System.out.print("Input a number: ");
        double number = reader.nextDouble();

        // Get absolute value
        double absValue = Math.abs(number);

        // Output
        System.out.println(absValue);

        reader.close();
	}

	public static void q2() {
	 Scanner scanner = new Scanner(System.in);
        // Get input from user
        System.out.print("Input a number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Input another number: ");
        double num2 = scanner.nextDouble();
        
        // Divide the numbers
        double result = num1 / num2;
        
        // Calculate floor and ceiling
        double floorResult = Math.floor(result);
        double ceilingResult = Math.ceil(result);
        
        // Output the results as doubles (with decimal points)
        System.out.println(floorResult);
        System.out.println(ceilingResult);
        
        scanner.close();
     }

      
   
	

	public static void q3() {
		//Write question 3 code here
	Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        double num = sc.nextDouble();
        long result = Math.round(Math.sqrt(num));
        System.out.println(result);
        sc.close();
	}

	public static void q4() {
		//Write question 4 code here
		Scanner sc = new Scanner(System.in); 
		 System.out.print("Input a number: ");
        double base = sc.nextDouble();

        // Ask for second number (exponent)
        System.out.print("Input another number: ");
        double exponent = sc.nextDouble();

        // Power calculation
        double result = Math.pow(base, exponent);

        // Output
        System.out.println(result);

        sc.close();
	}

	public static void q5() {
		//Write question 5 code here
		Scanner sc = new Scanner(System.in);

        // Ask for three numbers
        System.out.print("Input a number: ");
        double num1 = sc.nextDouble();

        System.out.print("Input another number: ");
        double num2 = sc.nextDouble();

        System.out.print("Input one more number: ");
        double num3 = sc.nextDouble();

        // Find max and min
        double max = Math.max(num1, Math.max(num2, num3));
        double min = Math.min(num1, Math.min(num2, num3));

        // Output results as doubles (with decimal points)
        System.out.println(max);
        System.out.println(min);

        sc.close();
    }
    
	
	public static void q6() {
		//Write question 6 code here
		Scanner sc = new Scanner(System.in);

        // Ask for a sentence
        System.out.print("Input a sentence: ");
        String sentence = sc.nextLine();

        // Check if it includes "on"
        boolean hasOn = sentence.contains("on");

        // Output result
        System.out.println(hasOn);

        sc.close();
    
	}
	public static void q7() {
		//Write question 7 code here
		Scanner sc = new Scanner(System.in);

        // Ask for the word
        System.out.print("Input the word mango: ");
        String word = sc.nextLine();

        // Check if it's "mango" (any casing)
        boolean isMango = word.equalsIgnoreCase("mango");

        // Output result
        System.out.println(isMango);

        sc.close();
	}
	public static void q8() {
		//Write question 8 code here
		Scanner sc = new Scanner(System.in); 
		 System.out.print("Input a word: ");
        String word = sc.nextLine();

        // Ask for a letter
        System.out.print("Input a letter: ");
        char letter = sc.nextLine().charAt(0); // take first character from input

        // Find first and last index
        int firstIndex = word.indexOf(letter);
        int lastIndex = word.lastIndexOf(letter);

        // Output
        System.out.println(firstIndex);
        System.out.println(lastIndex);

        sc.close();
	}

	public static void q9() {
		//Write question 9 code here
		Scanner sc = new Scanner(System.in);

        // Ask for a sentence
        System.out.print("Input a sentence: ");
        String sentence = sc.nextLine();

        // Get length
        int length = sentence.length();

        // Output
        System.out.println("Your sentence is " + length + " characters long");

        sc.close();
    
	}
	public static void q10() {
		//Write question 10 code here
		Scanner sc = new Scanner(System.in);

        // Ask for a sentence
        System.out.print("Input a sentence: ");
        String sentence = sc.nextLine();

        // Ask for the word to replace
        System.out.print("Input a word to replace: ");
        String oldWord = sc.nextLine();

        // Ask for the replacement word
        System.out.print("What word would you like to replace it with: ");
        String newWord = sc.nextLine();

        // Replace all instances
        String result = sentence.replace(oldWord, newWord);

        // Output
        System.out.println(result);

        sc.close();
	}

	public static void q11() {
		//Write question 11 code here
		Scanner sc = new Scanner (System.in); 
		System.out.print("Input a sentence: ");
        String sentence = sc.nextLine();

        // Remove extra spaces at start and end
        sentence = sentence.trim();

        // Output uppercase and lowercase
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());

        sc.close();
    
	}

	public static void q12() {
		//Write question 12 code here
		 Scanner reader = new Scanner(System.in);

        System.out.print("Input a word: ");
        String word = reader.nextLine();

        // Make sure the word is at least 4 characters
        if (word.length() >= 4) {
            String firstFour = word.substring(0, 4);
            String lastFour = word.substring(word.length() - 4);

            System.out.println(firstFour);
            System.out.println(lastFour);
        } else {
            System.out.println("Word must be at least 4 characters long.");
        }
    
	}
	

}
