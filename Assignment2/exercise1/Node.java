package exercise1;

public class Node<Integer>{
  private Integer elem;
  private Node<Integer> left;
  private Node<Integer> right;

  public Node(Integer elem){
    this.elem = elem;
  }
  public void setElem(Integer elem){
    this.elem = elem;
  }
  public Integer getElem(){
    return elem;
  }
  public void setLeft(Node<Integer> left){
    this.left = left;
  }
  public Node<Integer> getLeft(){
    return left;
  }
  public void setRight(Node<Integer> right){
    this.right = right;
  }
  public Node<Integer> getRight(){
    return right;
  }
}
