package Sort;

public class Sort {
    public static void insertSort(int[] array){
        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;
            //递增排序
            while(j >= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[++j] = temp;
        }
    }


    public static void main(String[] args) {
        int a[] = {100,3,1,1,5,2,4};
        insertSort(a);

        for(int i : a){
            System.out.println(i);
        }

        //System.out.println(a);
    }
}
