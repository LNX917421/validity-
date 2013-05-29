//Validity 1.00 
//Sumanth Nelluru, May 29, 2013
//Works for 16-digit card numbers only

import java.util.*;

public class Credit
{
    public static void main(String[] args)
    {
        String cardNumber = new String("");
        int sum = 0;

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your credit card number: ");
        cardNumber = reader.nextLine();
        
        char[] cNumber = cardNumber.toCharArray();
        
        //Add doubles of every other number starting from the first number
        for (int i = 0; i < 15; i+=2)
        {
            switch (cNumber[i])
            {
                case '5':
                    sum+=1;
                    break;
                case '6':
                    sum+=3;
                    break;   
                case '7':
                    sum+=5;
                    break;
                case '8':
                    sum+=7;
                    break;
                case '9':
                    sum+=9;
                    break;
                default:
                    sum+=((cNumber[i]-48)*2); //ASCII adjustment
                    break;
                    
            }
        }
        
        //Add every other number starting from the second number
        for (int j = 1; j < 16; j+=2)
        {
            sum+=((cNumber[j])-48);
            
        }
        
        
        //Use mod 10 test to check if card is valid
        if (sum % 10 == 0)
        {
            System.out.println("Validation successful.");
        }
        
        else
        {
            System.out.println("Invalid card number. Plese try again.");
        }
        
    }
    
}
