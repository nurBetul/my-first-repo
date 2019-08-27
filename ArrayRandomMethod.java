package Java4week;

public class ArrayRandomMethod {
    public static int[] createRandomIntegers(int length){
        int[] arrRandom = new int[length];
        double num;
        for(int i = 0; i<arrRandom.length; i++){
          num= Math.random()*4000+1000;
          arrRandom[i]=(int)num;
        }

        return arrRandom;
    }

    public static void main(String[] args) {
        int[] returnedArray= createRandomIntegers(100);
        MyArrayMethods.listAllElements(returnedArray);

    }



}
