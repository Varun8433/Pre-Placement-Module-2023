class Node{
    public int key;
    public int val;
    public Node next;
    
    public Node(int key, int val){
        this.key=key;
        this.val=val;
    }
}
class MyHashMap {
    private static final int size = 10000;
    Node[] map;

    public MyHashMap() {
        map = new Node[size];
    }
    
    public void put(int key, int value) {
        Node pointer = map[key%size];
        
        if(pointer==null){
            map[key%size] = new Node(key,value);
        }else{
            Node curr = pointer;
            
            while(curr.next != null){
                if(curr.key == key){
                    curr.val = value;
                    return;
                }
                curr = curr.next;
            }
            
            if(curr.key == key){
                curr.val = value;
            }else{
                curr.next = new Node(key,value);
            }   
            
        }
        
        
    }
    
    public int get(int key) {
        Node pointer = map[key%size];
   
        Node curr = pointer;
        
        while(curr != null){
            if(curr.key == key){
                return curr.val;
            }
            curr = curr.next;
        }

        return -1;
    }
    
    public void remove(int key) {
        Node pointer = map[key%size];
        
        Node curr = pointer;
        Node prev = null;
        
        while(curr != null){
            
            if(curr.key == key){
                
                if(prev == null){
                    map[key%size] = curr.next;
                }else{
                    prev.next = curr.next;
                }
                return;
            }
            
            prev = curr;
            curr = curr.next;   
        }
        
    }
    
}