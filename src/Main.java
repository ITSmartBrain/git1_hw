import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int input = 0;
        switch (input){
            case 1->System.out.println(a+b);
            case 2->System.out.println(a-b);
        }
    }
}