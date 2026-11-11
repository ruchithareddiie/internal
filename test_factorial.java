import java.util.*;
class test_factorial {
    public static void main(String[] args) {
        int n=5;
        int exp_out=120;
        int act_out=Factorial.fact(n);
        if(act_out==exp_out) {
        System.out.println("passed");
        }
        else {
            System.out.println("failed");
        }
    }
}