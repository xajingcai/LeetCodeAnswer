package Arrays;

/**
 * 基于无序链表的顺序查找
 */
public class SequentialSerch<Key,Value> {
    private Node first;

    private class Node{
        Key key;
        Value value;
        Node next;

        public Node(Key key,Value value,Node next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

//    public SequentialSerch(Node first){
//        this.first = first;
//    }

    /**
     * 查找链表中指定键的值
     * @param key
     * @return
     */
    public Value get(Key key){
        for(Node x = first; x != null; x = x.next) {
            if (key.equals(x.key))
                return x.value; // 命中
        }
            return null;
    }

    /**
     * 查找指定的键，若命中则更新键对应的值，否则在链表末尾添加节点
     * @param key
     * @param value
     */
    public void put(Key key, Value value){
        for(Node x = first; x != null; x = x.next){
            if(key.equals(x.key)){
                x.value = value;
            }
        }
        first = new Node(key,value,first);
    }

    /**
     * 返回链表的长度
     * @return
     */
    //todo
    public int size(){
        return 0;
    }

    public static void main(String[] args) {

        SequentialSerch sequentialSerch = new SequentialSerch();

        sequentialSerch.put(0,1);
        sequentialSerch.put(9,9);

        System.out.println(sequentialSerch.get(0));
    }
}
