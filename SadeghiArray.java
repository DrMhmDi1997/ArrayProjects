import java.util.Arrays;
import java.util.Scanner;

public class SadeghiArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("number of elements");
        int number = sc.nextInt();

        int [] array = new int[number];
        System.out.println("enter elements");

        for (int i = 0; i < number; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Elements are:");

        for (int i = 0; i < number; i++) {
            System.out.println(array[i]);

        }

        Arrays.sort(array);
        System.out.println("The sorted array is:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
