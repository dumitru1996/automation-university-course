package lesson4.basics_of_programming;

public class StringExamples {

    public void nullString(){
        String nullString = null; // reference data type can be null that means it isn't initialized yet
        System.out.println(nullString);
        nullString = "My New Value!";
        System.out.println(nullString);
    }

    public void compareTwoReferenceTypes(){
        String a = "222";
        String b = a;
        String c = new String("222");
        String d = c;

        System.out.println(a == b); // comparing reference, not value
        System.out.println(a == c);
        System.out.println(a.equals(c));

    }
    public static void main(String[] args) {
    }
}
