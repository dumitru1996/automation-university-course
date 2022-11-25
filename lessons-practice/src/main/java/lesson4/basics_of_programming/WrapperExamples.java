package lesson4.basics_of_programming;

public class WrapperExamples {

    public static void autoboxingAndAutounboxing(){
        int primitiveInt = 123;
        Integer referenceInt = primitiveInt; // autoboxing
        int anotherPrimitiveInt = referenceInt; // autounboxing
    }

   public static void boxingAndUnboxing(){
       long primitiveLong = 300L;
       Long referenceLong = Long.valueOf(primitiveLong); //boxing
       long anotherPrimitiveLong = referenceLong.longValue(); // unboxing
   }

    public static void sendStringToWrapClass(){
        Integer newInteger = Integer.valueOf("23323232"); // take a value from a string
    }

    public static void compareTwoReferenceTypes(){
        Long i1 = Long.valueOf( "2000" );
        Long i2 = Long.valueOf( "2000" );
        System.out.println(i1 == i2); // false
        System.out.println(i1.equals(i2)); // true
    }

    public static void wrappersNPEExamples(){
        Integer int1 = 100;
        Integer int2 = null;
        Integer result = int1 * int2; // NullPointerException
        int unboxingInt = int2; // NullPointerException
    }

    public static void wrapperMethods(){
        double negativeInfinity = Double.NEGATIVE_INFINITY; //local variable
        System.out.println(negativeInfinity);

        long newLong = Long.sum(1999,23);
        System.out.println(newLong);
    }
    public static void main(String[] args) {
    }
}
