package middle2.collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private Deque<String> stack = new ArrayDeque<>();

    public void visitPage(String webSite) {
        stack.push(webSite);
        System.out.println("방문 : " + stack.peek());
    }

    public String goBack() {
        String currentPage = stack.pop();
        String beforePage = stack.peek();
        return beforePage;
    }
}
