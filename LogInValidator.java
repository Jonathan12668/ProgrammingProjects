import java.util.Scanner;
public class LoginValidator {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        
       int attempt=0;
       
       while(attempt<5){
           
           System.out.println("Enter your username: ");
           String username =scanner.nextLine();
           System.out.println("Enter your password: ");
           String password =scanner.nextLine();
           
           String status = LoginValidator(username,password);
           if(status.equals("success")){
               
               System.out.println("Login successfully");
               break;
           
           }else if (status.equals("Failed")){
               System.out.println("Login Failed! Please try again.");
               attempt++;
               System.out.println("attempt"+attempt);
               
           }
         
       }
        if (attempt==5){
            System.out.println("You've reached 5 attempt. Please try again later");
            scanner.close();
        }
    }
    private static String LoginValidator (String username,String password){
    String defaultUsername="jonathan";
    String defaultPassword="12345";
    
    if(defaultUsername.equals(username)&& defaultPassword.equals(password)){
        System.out.println("Login successfully");
     return("Success");
   
    }else{
        return("Failed");
    }
    }
}

    


