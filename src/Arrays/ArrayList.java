package Arrays;

import java.util.Arrays;

public class ArrayList {

    private static final int INITIAL_SIZE = 10;

    private int size = 0;

    private int[] array;

    public ArrayList(){
        array = new int[INITIAL_SIZE];
    }

    /**
     * 在数组中添加元素
     * @param num
     */
    public void add(int num){
        if(size == array.length){
            array = Arrays.copyOf(array,size * 2);
        }
        array[size++] = num;
    }
}
