import java.util.Arrays;
import java.util.Scanner;

public class ArrayShow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The number of elements of array are:");
        int n = sc.nextInt();

        int [] array = new int[n];
        System.out.println("Enter the Elements");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }


        System.out.println("Array elements are:");


        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

        Arrays.sort(array);
        System.out.println("The Elements of this array have been sorted:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }



    }
}
