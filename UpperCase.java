import java.util.*;
public class UpperCase{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String sentence = kb.nextLine();

        String result = "";

        for(int i = 0; i < sentence.length(); i++){
            result += Character.toUpperCase(sentence.charAt(i));
        }

        System.out.println(result);
    }
}