package construct.ex;

public class Book {
    String title;
    String author;
    int page;

    // 모든 필드에 대한 입력을 받는 constructor
    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    // title / author만 입력받는 상속자
    Book(String title, String author) {
        this(title, author, 0);
    }

    // 필드를 하나도 입력하지 않은 경우
    Book() {
        this("", "", 0);
    }

    void displayInfo() {
        System.out.println("제목 : " + title + " 저자 : " + author + " 페이지 : " + page);
    }
}
