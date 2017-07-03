package exercise2;
import java.util.*;

public class Main{
  public static void main(String[] args){

    Node<Integer> root = new Node<>(new Integer(16));
    Node<Integer> node1 = new Node<>(new Integer(9));
    Node<Integer> node2 = new Node<>(new Integer(18));
    Node<Integer> node3 = new Node<>(new Integer(3));
    Node<Integer> node4 = new Node<>(new Integer(14));
    Node<Integer> node5 = new Node<>(new Integer(19));
    Node<Integer> node6 = new Node<>(new Integer(1));
    Node<Integer> node7 = new Node<>(new Integer(5));
	  BinaryTree<Integer> list = new BinaryTree<>(root);
    
    // 0-left, 1-right
    list.insert(root, 0, node1);
    list.insert(root, 1, node2);
    list.insert(node1, 0, node3);
    list.insert(node1, 1, node4);
    list.insert(node2, 1, node5);
    list.insert(node3, 0, node6);
    list.insert(node3, 1, node7);

    ArrayList<Integer> path1 = new ArrayList<Integer>();
    ArrayList<Integer> path2 = new ArrayList<Integer>();
    list.findPath(root, path1, 19); 
    list.findPath(root, path2, 18);
    int i = 0;
    for(i = 0; i < path1.size() && i < path2.size(); i++){
    	if(path1.get(i) != path2.get(i)){
    		break;
        }
    }
    System.out.println(path1.get(i-1));        
  }
}
