package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println( "_(\\     |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        char z = 'Z';
        int hex = 0xface;
        int oct = 012;
        long lon = 80L;
        float flo = 44e-1f;
        float flo1 = 5.5f;
        double dou = 8.88e1;
        double dou1 = 99.9;

        int ch = (short) z;
        int i = (int) lon;
        int i1 = (int) flo;
        int i2 = (int) flo1;
        int i3 = (int) dou;
        int i4 = (int) dou1;
        int sum = ch + hex + oct + i + i1 + i2 + i3 + i4;
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();

        System.out.println("After Swap:");
        System.out.println("x: " + y);
        System.out.println("y: " + x);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();

        if(x > y) {
            System.out.println("x > y");
        }

        if(y > x) {
            System.out.println("y > x");
        }

        if(x == y) {
            System.out.println("x == y");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        int rev = scanner.nextInt();


        if(rev < 0 || rev >= 100000) {
            System.out.println("Invalid Revenue");
        }

        if(rev >= 0 && rev < 20000) {
            System.out.println("Poor Sales Revenue");
        }

        if(rev >= 20000 && rev < 50000) {
            System.out.println("Average Sales Revenue");
        }

        if(rev >= 50000 && rev < 80000) {
            System.out.println("Good Sales Revenue");
        }

        if(rev >= 80000 && rev < 100000) {
            System.out.println("Excellent Sales Revenue");
        }


    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int sales = scanner.nextInt();

        switch(sales) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;

            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;

            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;

            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;

            default:
                System.out.println("Your Commission Rate was set to 0.00");
        }
    }

    //todo Task 9
    public void leapyear(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Year: ");
        int year = scanner.nextInt();

        if(year % 4 == 0 && year % 400 == 0) {
            System.out.println("Leapyear");
        }
        else {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}