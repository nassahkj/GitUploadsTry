//simple calculator application with parallel development

import java.util.Scanner;

public class SimpleCal{

    public static double division(int num1, int num2){
        return ((double)num1/(double)num2);
    }

    public static int addition(int num1, int num2){
        return (num1+num2);
    }

    public static double product(int num1, int num2){
        return ((double)num1*(double)num2);
    }


    public static int subtract(int num1, int num2){
        return (num1-num2);

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
                     System.out.println("Enter the numbers as below...");
                     System.out.println("First number: ");
                     int num3 = scanInputs.nextInt();
                     System.out.println("Second number: ");
                     int num4 = scanInputs.nextInt();
                     System.out.println("Difference : "+subtract(num3,num4));
                     break;
                case 3: 
                     System.out.println("Enter the numbers as below...");
                     System.out.print("First Number: ");
                     int num7 = scanInputs.nextInt();
                     System.out.print("Second Number: ");
                     int num8 = scanInputs.nextInt();
                     System.out.println("Division: "+division(num7,num8));
                     break;
                case 4: 
                      System.out.println("Enter the numbers as below...");
                      System.out.print("First Number: ");
                      int num9 = scanInputs.nextInt();
                      System.out.print("Second Number: ");
                      int num10 = scanInputs.nextInt();
                      System.out.println("Product: "+product(num9,num10));
                     break;
                case 7:
                System.out.println("....To be handled later...!");
                break;                          
                               
                default:
                    break;
                
                   
        }
        scanInputs.close();
            
        }
       
      

    }

    public static void main(String[] args){
        getUserInput();//call the input function 


    }

}
