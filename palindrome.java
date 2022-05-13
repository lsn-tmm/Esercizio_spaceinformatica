import java.util.*;

class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert an integer number: ");
        String number = scanner.nextLine();
        String test = "";
        for (int i = number.length() - 1; i >= 0; i--)  
            test += number.charAt(i);  
        if (test.equals(number))
            System.out.println("The number inserted is a palindrome.");  
        else  
            System.out.println("The number inserted isn't a palindrome."); 
    }
}
