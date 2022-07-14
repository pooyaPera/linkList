public class LinkedList {
    private Link first;
    private Link last;

    public void LinkedList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){

        return (first == null);
    }
    public void insert(int d){

        Link newlink = new Link(d);

        if (first == null){
            first = newlink;
            last = newlink;
        }else{

            last.next = newlink; // new node will be added after the last
            last = newlink;
        }
    }

    public void display(){
        Link current = first;
        if (first == null)
            System.out.println("keine Elemente");
        while (current!= null){
            System.out.println(current.iData);
            current= current.next;
        }
    }
}
