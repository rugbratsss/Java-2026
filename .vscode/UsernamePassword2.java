import java.util.*; 
public class UsernamePassword2 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

            System.out.println("Enter password(USERNAME#PASSWORD) : ");
            String password = kb.nextLine();

            if(!password.contains("#")){
                System.out.print("Invalid password, must contain '#' ");
            };
    }
}
