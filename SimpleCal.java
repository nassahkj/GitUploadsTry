//simple calculator application with parallel development

import java.util.Scanner;

public class SimpleCal{

    public static int addition(int num1, int num2){
        return (num1+num2);
    }

    public static void getUserInput(){
        int choice;
        Scanner scanInputs = new Scanner(System.in);
        while (true) {
           
            System.out.print("1. Addition\n2. Subtraction\n3. Division\n4.Product\n7.quit\n\nEnter your choice: ");
            choice = scanInputs.nextInt();
                     
            switch(choice){
                case 1:
                     System.out.println("Enter the numbers as follows...");
                     System.out.print("First Number: ");
                     int num1 = scanInputs.nextInt();
                     System.out.print("Second Number: ");
                     int num2 = scanInputs.nextInt();
                     System.out.println("Sum : "+addition(num1,num2));

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
