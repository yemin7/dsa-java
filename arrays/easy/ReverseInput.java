package arrays.easy;

public class ReverseInput {
    public static void main(String[] args) {
        System.out.println(f(-12345));
    }

    public static int f (int n) {
        int num = 0;

        while(n != 0) {
            num = (n%10) + (num*10);
            n = n/10;
        }
        return num;
    }
}
