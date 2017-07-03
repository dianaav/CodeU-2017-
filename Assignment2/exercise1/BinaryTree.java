package exercise1;

public class BinaryTree<Integer>{
  private Node<Integer> root;
  private int size;
  
  public BinaryTree(){
    size=0;
    root=null;
  }
  
  public BinaryTree(Node<Integer> root){
    size=1;
    this.root=root;
  }
  
  public void insert(Node<Integer> parent, int way, Node<Integer> newNode){
    if (parent != null) {
      if (way == 0) parent.setLeft(newNode);
      else parent.setRight(newNode);
    }
  }
  
  public boolean printAncestors(Node<Integer> node, int key){
    if (node == null)
    	return false;
    if (node.getElem().equals(key))
        return true;
    if (printAncestors(node.getLeft(), key)
                || printAncestors(node.getRight(), key)) {
        System.out.print(node.getElem() + " ");
        return true;
    }
    return false; 
    }
   
}
 
