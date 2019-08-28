package Java4week;

public class ArrayMerge {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10,11};
        int[] resultArray = mergeTwoArrays(arr1, arr2);
        MyArrayMethods.listAllElements(resultArray);

    }

    public static int[] mergeTwoArrays(int[] array1, int[] array2){
        int size = array1.length + array2.length;
        int [] mergedArray = new int [size];
        int count= 0;
        for(int i = 0; i<array1.length; i++){
            mergedArray[count]= array1[i];
            count++;
        }
        for(int j = 0; j< array2.length; j++){
            mergedArray[count]= array2[j];
            count++;
        }
        return mergedArray;


    }
}
