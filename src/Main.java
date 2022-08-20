import java.util.Arrays;

public class Main {
    static boolean isFind(int[] array,int value){
        for (int i:array){
            if (i == value){
                return true;
            }
        }
        return false;
    }
    static void repeat(int[] array){
        int[] repeatArray=new int[array.length];
        int count=0;
        for (int i =0 ;i< array.length;i++){
            for (int j=0;j < array.length;j++){
                if ((i != j) && (array[i]==array[j]) && (array[i]%2==0)){
                    if (!isFind(repeatArray,array[i])){
                        repeatArray[count++]=array[i];
                    }

                    break;

                }

            }
        }
        System.out.print("Tekrar Eden Çift Sayılar : ");
        for (int i:repeatArray){

            if (i!=0){
                System.out.print(i+" ,");
            }
        }
       // System.out.println(Arrays.toString(repeatArray));
    }


    public static void main(String[] args) {
        int[] array = {1,1,15,17,0,19,5,1,16,4,3,2,24,19,98,17,15,4,3,1,17,19,5,2,16,24,98,0};

        repeat(array);



    }
}
