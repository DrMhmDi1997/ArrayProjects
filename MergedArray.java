import java.util.Arrays;

public class MergedArray {

    public static void main(String[] args) {

        int[] array1 = {12, 67, 87 , 45};
        int[] array2 = {76,90,45,34};

        int[] result = new int[array1.length + array2.length];

        System.arraycopy(array1,0,result,0,array1.length);
        System.arraycopy(array2,0,result,array1.length,array2.length);
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));


    }
}
