import java.util.LinkedList;
import java.util.Queue;
public class Main
{
    public static void main(String[] args) {
         Queue<String> MyClassmates = new LinkedList<>();

        // Adds classmates to the queue
        MyClassmates.add("Luis Miguel Verzosa");
        MyClassmates.add("Jap Bolanos");
        MyClassmates.add("Idel Lawrence Aranilla");
        MyClassmates.add("Jul Seth Mari Mercado");
        MyClassmates.add("Rizjake Jaime Pineda");

        // Size of the queue
        System.out.println(MyClassmates.size());
        //Front of the queue
        System.out.println(MyClassmates.peek());
        

        // dequeue the 5 classmates
        MyClassmates.remove();
        MyClassmates.remove();
        MyClassmates.remove();
        MyClassmates.remove();
        MyClassmates.remove();
        
        //enqueue another 5 Classmates
         MyClassmates.add("Winna Bablis");
         MyClassmates.add("Marianne Papina");
         MyClassmates.add("Jonnah Hermosura");
         MyClassmates.add("Ma. Teresa Jesmari Erl Labon");
         MyClassmates.add("Jenina Velle Masangcay");
         
         // Size of the new queue
        System.out.println(MyClassmates.size());
        //Front of the new queue
        System.out.println(MyClassmates.peek());
       
    }
}
