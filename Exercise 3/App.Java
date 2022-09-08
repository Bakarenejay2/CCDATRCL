public class App {
  public static void main(String[] args) {

    // Create new Stack Object
    Stack Pancakestack = new Stack(5);

    // Insert new elements into the stack
    Pancakestack.push("Plain pancake");
    Pancakestack.push("Chocolate pancake");
    Pancakestack.push("Ube pancake");
    Pancakestack.push("Cinnamon pancake");
    
     // Remove top element in the stack
    Pancakestack.pop();

    System.out.println("After pop");

    // Show the size of the stack
    System.out.println("There are " + Pancakestack.size() " pancakes in total.");

    // Show top element in the stack
    System.out.println("The pancake on the top is: " + Pancakestack.peek());

    // Show all elements in Stack
    Pancakestack.printStack();

    
  }
}
