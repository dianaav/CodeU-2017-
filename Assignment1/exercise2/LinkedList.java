package exercise2;

public class LinkedList<Integer>{
  private Node<Integer> head;
  private int size;
  
  public LinkedList(){
    size = 0;
    head = null;
  }
  
  public int getLentgh() {
    return size;
  }
  
  private Node<Integer> getNodeAt(int givenPos){
    Node<Integer> curr = head;
    for (int i = 1; i < givenPos; i++){
      curr=curr.getNext();
    }
    return curr;
  }
  
  public void add(int givenPos, Integer newItem){
    if (1 <= givenPos && givenPos <= size+1){
      if (givenPos == 1){
        Node<Integer> newNode = new Node<>(newItem);
        newNode.setNext(head);
        head = newNode;
      } else{
        Node<Integer> newNode = new Node<>(newItem);
        Node<Integer> prev = getNodeAt(givenPos-1);
        newNode.setNext(prev.getNext( ));
        prev.setNext(newNode);
      }
      size++;
    }
  }

  public Integer getKth(int k){
    return getNodeAt(size-k).getElem();
  }
}
