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

            last.next = newlink; // newLink becomes the last element of the element
            last = newlink;
        }
    }
}
