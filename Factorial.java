import java.util.*;
class Factorial {
    public static void main(String[] args) {
        int n=5;
        System.out.println("Fcatorial of n:"+fact(n));
    }
    public static int fact(int n) {
        int f=1;
        for(int i=1;i<=n;i++) {
            f=f*i;
        }
        return f;
    }
}