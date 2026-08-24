package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();
        // title, author만 매개변수로 받음
        Book book2 = new Book("Hello Java", "Seo");
        book2.displayInfo();
        // 모든 필드를 매개변수로 받음
        Book book3 = new Book("JPA프로그래밍", "kim", 700);
        book3.displayInfo();
    }
}
