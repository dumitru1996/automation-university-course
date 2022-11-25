package lesson4.basics_of_programming;

public class ConditionalStatementsExamples {

    public void ifStatement(){
        int myAge = 21;

        if(myAge > 100){ // expression inside if can be true or false
            System.out.println("Expired");
        }
    }

    public void ifElseStatement(){
        int number = 20;

        if(number % 2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public void ifElseIfStatement(){
        int income = 10_000;

        if(income < 7_000){
            System.out.println("Bad work, change it!");
        } else if (income < 15_000){
            System.out.println("Not enough, work harder!");
        } else if (income < 25_000) {
            System.out.println("Pretty good");
        } else {
            System.out.println("Perfect");
        }
    }

    public void switchStatement(){
        int season = 3;

        switch (season){
            case 1:
                System.out.println("Spring");
                break;
            case 2:
                System.out.println("Summer");
                break;
            case 3:
                System.out.println("Autumn");
                break;  //what if we'll remove the break?
            case 4:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Something wrong...");
        }
    }

    public void forLoopExample(){
        int num = 9;
        //  for(initialization; condition; modification)
        for (int i = 0; i < num; i++) {
            System.out.print(i + " ");
        }
    }

    public void nastedLoopExample(){
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.print(i *j + "\t");
            }
            System.out.println();
        }
    }

    public void whileLoopExample(){
        char myChar = 'A';

        while (myChar <= 'Z'){
            System.out.print(myChar + "\t");
            myChar++;
        }
    }

    public void doWhileLoopExample(){
        int n = 10;

        do {
            --n;
            System.out.println("There is " + n + " seconds left");
        } while (n>=0); //check the last iteration
    }

    public static void main(String[] args) {

    }
}
