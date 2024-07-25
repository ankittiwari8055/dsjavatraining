import java.util.Scanner;

public class Main{

public static void main(String[] args) {
    //  Scanner scanner = new Scanner(System.in);
   /* System.out.println("Enter your Name");
    String name = scanner.nextLine();
    System.out.println("enter your age");
    int age = scanner.nextInt();
    System.out.println(" age is " + age );
    System.out.println("Name is" + name);
   */
   /* int age =23;

    String output =(age >=18)?"You are eligible to vote ": "You are eligible to vote ";

     System.out.println(output);*/
   /* int i;
    for(i=0;i<11;i++){
        System.out.print("  " + i);
    }
    System.out.println();

    int j=10;
    do {
        System.out.print("  " +j);
        j--;


    }
    while (j>=0);*/

    int i = 0;
    int sum = 0;
    for (i = 0; i < 11; i++) {

        System.out.print("The value is" + i);

        sum = sum + i;
        System.out.print(sum);
    }
}
}

