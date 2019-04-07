package HashMap;

public class HashTable {

    private static final int DEFAULT_INITIAL_CAPACITY = 4;

    /**
     * 扩容因子
     */
    private static final float LOAD_FACTOR = 0.75f;

    private Entry[] table = new Entry[DEFAULT_INITIAL_CAPACITY];
    private int size = 0;
    private int use = 0;

    /**
     * 若hash后的值相同且value值相同，则会覆盖
     * 添加元素
     * @param key
     * @param value
     */
    public void put(int key,int value){
        int index = hash(key);
        //未被占用
        if(table[index] == null){
            table[index] = new Entry(-1,-1,null);
        }

        Entry e = table[index];
        if(e.next == null){
            table[index].next = new Entry(key,value,null);
            size++;
            use++;
            //本身存在值，修改已有的值
        }else{
            for(e = e.next; e != null; e = e.next){
                int k = e.key;
                if(k == key){
                    e.value = value;
                    return;
                }
            }
            //不存在相同的值，直接向链表中添加元素
            Entry temp = table[index].next;
            Entry newEntry = new Entry(key,value,temp);
            table[index].next = newEntry;
            size ++;
        }
    }

    private int hash(int key){
        return key % table.length;
    }

}
