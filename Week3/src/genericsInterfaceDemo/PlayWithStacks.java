package genericsInterfaceDemo;

import java.util.ArrayList;
import java.util.List;

// NOTE:
// This code should work once you fix Stack to use generics and complete ArrayListStack appropriately

public class PlayWithStacks {

    public static void main(String[] args) {
        Stack<String> s = new ArrayListStack<String>();
        Stack<String> s2 = new LLStack<String>();
        playWithStack(s);
        playWithStack(s2);

        // Using generics:
        List<String> list = new ArrayList<String>();
        list.add("A");
        String out = list.get(0);
    }

    private static void playWithStack(Stack<String> s) {
        // We don't know whether s refers to an ArrayListStack or a LLStack.
        // Java uses dynamic binding to figure out which push method to call.
        s.push("A");
        s.push("B");
        s.push("C");
        System.out.println(s.top());
        System.out.println(s.pop());
        System.out.println(s.size());
        String out = s.pop();
    }

}

