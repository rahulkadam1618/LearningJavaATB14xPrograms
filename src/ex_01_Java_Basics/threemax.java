package ex_01_Java_Basics;

public class threemax {
    public static void main(String[] args) {
        int n1 = 11;

        int n2 = 2;
        int n3 = 3;

        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : (n2 > n3) ? n2 : n3;
        System.out.printf("Max Number is =%d", max);


    }
}
