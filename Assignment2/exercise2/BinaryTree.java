package exercise2;

public class BinaryTree<Integer>{
  private Node<Integer> root;
  
  public BinaryTree(Node<Integer> root){
    this.root=root;
  }
  
  public void insert(Node<Integer> parent, int way, Node<Integer> newNode){
  	if (parent != null) {
    	if (way == 0) parent.setLeft(newNode);
    	else parent.setRight(newNode);
    }
  }
  
  public boolean findPath(Node<Integer> node, ArrayList<Integer> path, int val){
  	if(node == null)
    	return false;
    path.add(node.getElem());
    if(node.getElem().equals(val))
    	return true;
    if  ((node.getLeft() != null && findPath(node.getLeft(), path, val))
       		|| (node.getRight() != null && findPath(node.getRight(), path, val)))
        return true;
    path.remove(path.size()-1);
    return false;
    }
  
}
