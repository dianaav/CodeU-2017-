package exercise2;
 
public class Node<Integer>{
  private Integer elem;
  private Node<Integer> next;

  public Node(Integer elem){
    this.elem = elem;
  }
  public void setElem(Integer elem){
    this.elem = elem;
  }
  public Integer getElem(){
    return elem;
  }
  public void setNext(Node<Integer> next){
    this.next = next;
  }
  public Node<Integer> getNext(){
    return next;
  }
}
