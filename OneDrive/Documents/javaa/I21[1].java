import java.util.Scanner;
class NoVowelException extends Exception{
NoVowelException(String s)
{
super(s);
}
}

class I21{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter any string to check vowels");
String str=sc.nextLine(); 
try{
	checkForVowels(str);
        System.out.println("String contains vowels.");
    } 
catch (NoVowelException e) 
	{
            System.out.println("Exception: " + e.getMessage());
        }

}
private static void checkForVowels(String str) throws NoVowelException {
        if (!containsVowel(str)) {
            throw new NoVowelException("String does not contain any vowels.");
        }
}

private static boolean containsVowel(String str) {
        for (char ch : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                return true; 
            }
        }
        return false;
}
}