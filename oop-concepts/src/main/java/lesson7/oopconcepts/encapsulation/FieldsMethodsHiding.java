package lesson7.oopconcepts.encapsulation;

public class FieldsMethodsHiding {

    public String publicString;
    int defaultField;
    private boolean privateField;
    protected String protectedField;

    public FieldsMethodsHiding(String field1, int defaultField, boolean privateField, String protectedField) {
        this.publicString = field1;
        this.defaultField = defaultField;
        this.privateField = privateField;
        this.protectedField = protectedField;
    }

    public int getDefaultField() {
        return defaultField;
    }

    public boolean isPrivateField() {
        return privateField;
    }

    public void setPrivateField(boolean privateField) {
        this.privateField = privateField;
    }

    public void setDefaultField(int defaultField) {
        this.defaultField = defaultField;
    }

}
