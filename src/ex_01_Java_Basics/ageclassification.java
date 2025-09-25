package ex_01_Java_Basics;

public class ageclassification{
    public static void main(String[] args) {
        int age=4;

        String result = (age<18)? "Minor" : (age>60)? "Senior":"adult";
        System.out.println(result);

    }
}
