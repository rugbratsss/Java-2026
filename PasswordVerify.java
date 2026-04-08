import java.util.*;
public class PasswordVerify{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        String password;
        
        int iUpper = 0;
        int iLower = 0;
        int iDigit = 0;
        int iSpecial = 0;
        int iLetter = 0;

        System.out.print("Enter your password: ");
        password = kb.nextLine();

        if(password.length() <8){
            System.out.println("Password is invalid, must at least be 8");
        }
        else{
            for(int i = 0; i < password.length(); i++){
                char ch = password.charAt(i);

                if(Character.isUpperCase(ch))
                    iUpper++;
                else if(Character.isLowerCase(ch))
                    iLower++;
                else if(Character.isDigit(ch))
                    iDigit++;
                else if(!Character.isLetterOrDigit(ch))
                    iSpecial++;
            }
            if(iUpper >= 1 && iLower >= 1 && iDigit >= 1 && iSpecial >= 1){
                System.out.println("Grant succeded!");
            }
            else{
                System.out.println("Not Succeded!");
                if(iLower == 0) System.out.println("Upper case is missing!");
                if(iLower == 0) System.out.println("Lower case is missing!");
                if(iDigit == 0) System.out.println("Digit is missing!");
                if(iSpecial == 0) System.out.println("Special case is missing!");
                
            }   
        }

    }
}