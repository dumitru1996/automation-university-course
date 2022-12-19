package lesson7.oopconcepts.encapsulation;

public class SubClass extends FieldsMethodsHiding {

    public SubClass(String publicField, int defaultField, boolean privateField, String protectedField) {
        super(publicField, defaultField, privateField, protectedField);
    }

    public void printProtectedField() {
        System.out.println(protectedField);
    }

    public void printPrivateField() {
        System.out.println(isPrivateField());
    }

}
