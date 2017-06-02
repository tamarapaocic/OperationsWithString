
public class StringOperations {
	
	public StringOperations(String input){}
	
	public void stringSize(String input) {
   		System.out.println("Size of string: " + input.length());
   	}
   	
   	public void charactersOnEvenPositions(String userInput) {
   		System.out.print("Characters on even positions: ");
   		for (int i = 1; i < userInput.length() ; i += 2){
			System.out.print(userInput.charAt(i) + " ");
		}
   	}

   	public void charactersOnOddPositions(String userInput) {
   		System.out.print("\nCharacters on odd positions: ");
   		for (int i = 0; i < userInput.length() ; i += 2){
			System.out.print(userInput.charAt(i) + " ");
		}
	}
   	
   	
   	public void numberOfUppercaseChar(String userInput) {
   		
   	}

   	
   	public void numberOfLowercaseChar(String userInput) {
   		
   	}

   	public void allCharactersWithoutLetters(String userInput) {
   		
   	}


	
}
