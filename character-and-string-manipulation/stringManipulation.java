import java.util.Scanner;
public class stringManipulation{
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = kb.nextLine();
		
		int length = str.length();
		System.out.println("Length of " + str + " is " + length);
		
		if(str.length() < 4){
			System.out.println("Valid");
		}else{
			System.out.println("Invalid length");
		}
		
		for(int i = 0; i < str.length(); i++){
			System.out.println(str.charAt(i));
		}
	}

}
