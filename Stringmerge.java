import java.util.*;

public class Stringmerge {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder builder=new StringBuilder();
        int i=0;
        while(i<word1.length() || i<word2.length())
        {
            if(i<word1.length())
            {
            builder.append(word1.charAt(i));
            }
            if(i<word2.length())
            {
             builder.append(word2.charAt(i));
             
            }
             i++;
        }
        return builder.toString(); 
    }
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter first word: ");
        String word1 = scanner.nextLine();
        
        System.out.print("Enter second word: ");
        String word2 = scanner.nextLine();
        
        // Creating Solution object and calling the method
        Stringmerge str   = new Stringmerge();
        String result = str.mergeAlternately(word1, word2);
        
        // Printing the result
        System.out.println("Merged String: " + result);
        
        scanner.close();  // Closing the scanner
    }
}


