package javastream;

public class ReverseNumber {
    public static void main(String[] args) {

        int n = 121;
        int temp = n;
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        //check number is pallindrom or not
        if (temp == rev)
            System.out.println(rev);
        else
            System.out.println("not pallindrom");
    }
}
