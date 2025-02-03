import java.util.*;
public class StringGCD 
{
    
    public String gcdOfStrings(String str1, String str2) {
        
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
    
        int gcdLength = gcd(str1.length(), str2.length());
        
        return str1.substring(0, gcdLength);
    }
    

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        

        StringGCD solution = new StringGCD();
        String result = solution.gcdOfStrings(str1, str2);

        System.out.println("Largest common divisor string: " + result);
        
        scanner.close();
    }
}
