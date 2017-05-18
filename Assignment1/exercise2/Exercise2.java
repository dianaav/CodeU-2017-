package exercise2;

public class Exercise2 {
  public static void main(String[] args){
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.add(1, new Integer(2));
    list.add(2, new Integer(7));
    list.add(3, new Integer(4));
    list.add(4, new Integer(5));
    System.out.println(list.getKth(3));
  }
}
