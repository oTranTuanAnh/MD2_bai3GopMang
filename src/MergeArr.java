public class MergeArr {
    public static void main(String[] args) {
        int[] arr1 = new int[]{5, 23, 14, 6, 172, 65, 210};
        int[] arr2 = new int[]{60, 99, 5, 30, 2, };
        int size = arr1.length + arr2.length;
        int[] arr3 = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length+i] = arr2[i];
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+ " ");
        }
    }
}
