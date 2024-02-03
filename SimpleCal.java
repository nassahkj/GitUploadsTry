//simple calculator application with parallel development

import java.util.Scanner;

public class SimpleCal{

    public static void getUserInput(){
        int choice;
        Scanner scanInputs = new Scanner(System.in);
        while (true) {
           
            System.out.print("1. Addition\n2. Subtraction\n3. Division\n4.Product\n7.quit\n\nEnter your choice: ");
            choice = scanInputs.nextInt();
                     
            switch(choice){
                case 1:
                     //addition();
                     break;
                case 2:
                     //subtract();
                     break;
                case 3: 
                     //division();
                     break;
                case 4: 
                     //product();
                     break;
                case 7:
                System.out.println("....To be handled later...!");
                break;                          
                               
                default:
                    break;
                
                   
        }
        
            
        }
       
      

    }

    public static void main(String[] args){
        getUserInput();//call the input function 


    }

}
