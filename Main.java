import java.util.Scanner;

public class Main  {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome! ");
        System.out.println("Enter the string:");
        
        String userInput = input.nextLine();
    
        StringOperations operations = new StringOperations(userInput);
        
        operations.stringSize(userInput);
        operations.charactersOnEvenPositions(userInput);
        operations.charactersOnOddPositions(userInput);
        operations.numberOfUppercaseChar(userInput);
        operations.numberOfLowercaseChar(userInput);
        operations.allCharactersWithoutLetters(userInput);
        
        input.close();
	
	}
}
