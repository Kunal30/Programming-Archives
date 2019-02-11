public class Linked_List {
	 Node head;
     int listCount;
    public Linked_List() {
        head = new Node(null);
        listCount = 0;
    }
    public void add(Object data)
    {
        Node Temp = new Node(data);
        Node Current = head;
        while (Current.next != null) {
            Current = Current.next;
        }
        Current.next=(Temp);
        listCount++;
    }
    public Object get(int index)
    { 
        Node Current = head.next;
        for (int i = 1; i < index; i++) {
            if (Current.next == null)
                return null;
            Current = Current.next;
        }
        return Current.data;
    }
    public void remove(int index)
    {
        Node Current = head;
        for (int i = 1; i < index; i++) {
            if (Current.next == null)
                return ;
            Current = Current.next;
        }
        Current.next=(Current.next.next);
        listCount--;
    }
    public int size()
    {
        return listCount;
    }
}