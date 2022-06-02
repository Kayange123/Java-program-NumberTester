import java.util.Scanner;
public class NumberTest {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.println("This program lets a user enter a number and tests for various issues.");
        System.out.println();
        System.out.print("Enter a number to test:");
        int number = keyboard.nextInt();
        System.out.println("What do you want to test?");
        System.out.println("[1] PALINDROME TEST");
        System.out.println("[2] ARMSTRONG TEST");
        System.out.println("[3] EVEN/ODD TEST");
        System.out.println("[4] QUIT TEST");
        System.out.print("Enter your choice(1,2,3,4): ");
        int choice = keyboard.next().charAt(0);
        System.out.println();

        switch (choice){
            case '1' : palindromeTest(number);
                        break;
            case '2' : armstrongTest(number);
                        break;
            case '3' : evenOrOdd(number);
                        break;
            case '4' : System.out.println("Quiting...");
                        break;
            default: System.out.println("Options are only 1 to 4.");
        }
    }

    private static void evenOrOdd(int number) {
        if (number%2==0){
            System.out.println(number+" is an EVEN NUMBER");
        }
        else System.out.println(number+" is an ODD NUMBER");
    }

    public static void armstrongTest(int number) {
        int sum=0;
        int temp = sum;
        while (temp !=0){
            int rem = temp%10;
            sum =sum + rem*rem*rem;
            temp = temp/10;
        }
        if (number==sum){
            System.out.println(number+" is a ARMSTRONG NUMBER");
        }
        else System.out.println(number+" is not a ARMSTRONG NUMBER");
    }
    private static void palindromeTest(int number) {
        int numberTest=0;
        int p=number;
        while (number!=0){
            numberTest = numberTest*10 + number%10;
            number=number/10;
        }
        if (numberTest==p){
            System.out.println(p+" is a PALINDROME NUMBER");
        }
        else System.out.println(p+" is not a PALINDROME NUMBER");
    }
}
