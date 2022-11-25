package lesson4.basics_of_programming;

public class PrimitiveDataTypesExample {

//    int - data type, myInteger - Variable name, 10 - literal
    int myInteger = 10;

    byte myByte; // from -128 to 127
    short myShort; // from -32,768 to 32,767
    int mySecondInt; // from -2,147,483,648 to 2,147,483,647
    long myLong; // from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    double myDouble; // from 4.9E-324 to 1.7976931348623157E308, +/- infinity, NaN, +/-0
    char myChar; // takes char value as 'a', 'B', '#', '\u0000' in Unicode
    boolean myBoolean; // takes true or false

    public void binaryOperands(){
        System.out.println(8 / 3);
        System.out.println(41 / 5);

        System.out.println(10 % 3);
        System.out.println(12 % 4);

        System.out.println(1 + 3 * 4 - 2);
        System.out.println((1 + 3) * (4 - 2));
        System.out.println(-(100 + 4));
    }

    public void assignmentOperands(){
        int n = 10;
        n = n + 4;
        n += 4;
        n /= 2;
    }

    public void logicalOperands(){
        // OR operand
        boolean b1;
        b1= false || false;
        b1 = false || true;
        b1= true || false;
        b1 = true || true;

        // AND operand
        boolean b2;
        b2= false && false;
        b2 = false && true;
        b2= true && false;
        b2 = true && true;

        // NOT operand
        boolean b3 = false;
        boolean b4 = !b3;
    }

    public void relationalOperands(){
        int one = 1, two = 2, three = 3, four = 4;

        boolean oneIsOne = one == one; //true
        boolean response1 = two >= three; //true
        boolean response2 = one != two; //true
        boolean response3 = three > four; //false
    }

    public void prefixAndPostfix(){
        int n = 10;
        n++; // equals to n += 1
        n--;

        System.out.println(--n);
        System.out.println(n--);
        System.out.println(n);
    }

    public void escapeSequence(){
        System.out.println("\tprtining a tab");
        System.out.println("\nprinting new line");
        System.out.println("\\"); //prints one backslash
        System.out.println("\""); //prints double quotes
        System.out.println("\'"); //prints single quote
    }

    public void ternaryOperands(){
        int number = 10;
        System.out.println(number % 2 == 0 ? "even" : "odd"); // condition ? trueCase : falseCase
    }

    public static void main(String[] args) {
    }

}
