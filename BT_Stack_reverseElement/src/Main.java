import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stackNum = new Stack<>();
        stackNum.push(1);
        stackNum.push(2);
        stackNum.push(3);
        System.out.println("cac phan tu ban dau: " + stackNum);
        System.out.println("Dao nnguoc phan tu: ");
        int size = stackNum.size();
        for (int i = 0; i < size ; i++) {
            System.out.print(stackNum.pop());
        }

        System.out.println("\n" + "-------------------");

        Stack<String> wStack = new Stack<>();
        String word = "mWord";

        System.out.println("String ban dau: " + wStack.push(word));
        System.out.println("dao nguoc: ");
        for (int i = 0; i < word.length(); i++) {
            wStack.push(word.charAt(i)+"");
        }

        for (int i = 0; i < word.length(); i++) {
            System.out.print(wStack.pop());
        }
    }
}