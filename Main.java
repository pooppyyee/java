/******************************************************************************
to use keyboard.java, both codes must be in the same folder**/


public class Main
{
	public static void main(String[] args) {
		String word;
		String sentence;
		int valueInt;
		double valueDouble;
		boolean valueBool;
		char letter;
		
		System.out.println("Enter a sentence");
		sentence = Keyboard.readString();
		
		System.out.println("Enter a word");
		word = Keyboard.readWord();
		
		System.out.println("Enter an integer");
		valueInt = Keyboard.readInt();
		
		System.out.println("Enter a double value");
		valueDouble = Keyboard.readDouble();
		
		System.out.println("Enter a boolean");
		valueBool = Keyboard.readBoolean();
		
		System.out.println("Enter a letter");
		letter = Keyboard.readChar();
		
		System.out.println("The values entered were: "+sentence + "\n"+ word
		+ "\n"+ valueInt+ "\n"+ valueDouble+ "\n"+valueBool+ "\n"+letter);
	}
}
