import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

          Scanner input = new Scanner(System.in).useLocale(Locale.ROOT);

//        1. Develop a program that takes the weight (in kilograms)
//        and height (in meters) as input and calculates the BMI, then prints it

//        Input: Weight (kg) = 70, Height (m) = 1.75
//        Expected Output: BMI = 22.86
//        System.out.println("Enter your weight(kg): ");
//        float weight= input.nextFloat();
//        System.out.println("Enter your height(m): ");
//        float height= input.nextFloat();
//        float bmi =  weight / height / height;
//        System.out.println("BMI = "+bmi);


////        2. Write a program that takes the obtained marks and total marks as input and calculates the percentage, then prints it.
////        Input: Obtained Marks = 85, Total Marks = 100 Expected Output: Percentage = 85.0%

//        System.out.println("Enter total marks");
//        int totalmarks = input.nextInt();
//        System.out.println("Enter your marks");
//        int marks = input.nextInt();
//
//        int prec = (marks * 100) / totalmarks;
//        System.out.println("Percentage: "+prec+"%");

//        3. Create a program that takes an amount in one currency and an exchange rate as input, then converts and prints the amount in another currency.
//        Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85 Expected Output: Amount in EUR = 85.0

//        System.out.println("Enter amount to exchange ");
//        double amount = input.nextDouble();
//        System.out.println("Enter exchange rate");
//        double exchangerate = input.nextDouble();
//        System.out.println("Amount after the convert "+amount * exchangerate);

//       4. Create a program that takes a string as input, calculates its length, and then reverses the string using the StringBuilder class,
//       finally printing both the length and reversed string
//       'Input: "Hello, World!"
//       'Expected Output: Length of the string: 13 And Reversed string: "!dlroW ,olleH"

//        System.out.println("Enter a String");
//        String s = input.nextLine();
//        StringBuilder stringreversed = new StringBuilder(s);
//
//        System.out.println("Length of the string: "+s.length()+" And Reversed string: "+stringreversed.reverse());

//        5. Develop a program that takes a sentence as input and extracts a substring from it, then prints the extracted substring.
//        Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index = 10, End Index = 20 Expected Output: "brown fox"

//        System.out.println("Enter a String");
//        String strtosplit = input.nextLine();
//
//        System.out.println(strtosplit.substring(10,20));

//        6.Write a program that takes a sentence and a keyword as input, then check if the keyword is present in the sentence and prints the result.                                            input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword = "jumps"
//        Expected Output: Keyword "jumps" is present in the sentence.

//        System.out.println("Enter a sentence: ");
//        String sentence = input.nextLine();
//        System.out.println("Enter the key word: ");
//        String keyword = input.nextLine();
//        System.out.println("is Keyword "+keyword+" present in the sentence["+sentence.contains(keyword)+"]");


//        7- Develop a program that takes a sentence and a word to replace as input, then replace all occurrences of the word with another word and prints the modified
//        sentence.
//
//        Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to Replace = "fox", Replacement Word = "cat"
//        Expected Output: "The quick brown cat jumps over the lazy dog"

//        System.out.println("Enter a sentance ");
//        String sentance = input.nextLine();
//        System.out.println("Enter a word to replace");
//        String toreplace = input.nextLine();
//        System.out.println("Enter a replacement word");
//        String replacedword = input.nextLine();
//
//        System.out.println(""+sentance.replaceAll(toreplace, replacedword));


//        8. Write a program that takes two strings as input and check if they are equal, ignoring the case, then prints whether they are equal or not.
//        Input: String 1 = "Hello", String 2 = "hello" Expected Output: Strings are equal (ignoring case).

//        System.out.println("Enter String 1");
//        String s1 = input.nextLine();
//        System.out.println("Enter String 2");
//        String s2 = input.nextLine();
//        System.out.println("Is Strings are equal (ignoring case) ["+s1.equalsIgnoreCase(s2)+"]wo");
    }
}