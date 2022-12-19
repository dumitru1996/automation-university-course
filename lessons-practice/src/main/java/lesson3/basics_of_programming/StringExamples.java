package lesson3.basics_of_programming;

public class StringExamples {

    public static void nullString() {
        String nullString = null; // reference data type can be null that means it isn't initialized yet
        System.out.println(nullString);
        nullString = "My New Value!";
        System.out.println(nullString);
    }

    public static void compareTwoReferenceTypes() {
        String a = "222";
        String b = a;
        String c = new String("222");
        String d = c;

        System.out.println(a == b); // comparing reference, not value
        System.out.println(a == c);
        System.out.println(a.equals(c));
    }

    public static void stringMethods() {
        String hello = " Hello World!   ";

        String helloUpper = hello.toUpperCase();
        String helloLower = hello.toLowerCase();
        String helloSubstring = hello.substring(0, 4);
        int helloLength = hello.length();
        boolean helloIsEmpty = hello.isEmpty();
        boolean compareTwoStrings = hello.equals(helloLower);
        String[] splitStringInArray = hello.split(" ");
        String trimmedHello = hello.trim();
        String concatString = hello.concat(" It's me");
    }

    public static void main(String[] args) {

    }
}
