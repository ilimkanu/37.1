import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Stack<Autos> autos = new Stack<>();
        autos.push(new Autos("Honda"));
        autos.push(new Autos("Toyota"));
        autos.push(new Autos("Lexus"));
        autos.push(new Autos("Tesla"));
        autos.push(new Autos("BMW"));

        System.out.println(autos);

        System.out.println(autos.pop());
        System.out.println(autos.peek());
    }
}
