package dsjavatraining;

import java.util.Random;

public class OTPGenrate {
    public static void main(String[] args) {
        //to generate 6 digit otp random class used
        Random  random = new Random();
        int myotp = random.nextInt(1000000); //6digit
        System.out.println("Your otp is :" + myotp);
        System.out.println("don't share anybody");

    }
}

