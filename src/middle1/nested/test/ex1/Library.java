package middle1.nested.test.ex1;

public class Library {
    // Book 클래스는 Library 클래스 내부에서만 사용
    // Library클래스는 Book 객체 배열만을 사용해서 관리해야 한다.
    private Book[] book;
    private int currentIndex = 0;

    public Library(int length) {
        // length 만큼 해당하는 Book 배열을 생성
        book = new Book[length];
        currentIndex = 0;
    }

    private static class Book {
        private String bookName;
        private String author;

        public Book(String bookName, String author) {
            this.bookName = bookName;
            this.author = author;
        }
    }


    public void addBook(String bookName, String author) {
        // 배열의 길이를 초과하면 에러 메시지 출력
        if (currentIndex >= book.length) {
            System.out.println("도서관 저장 정보가 부족합니다");
            return;
        }
        book[currentIndex++] = new Book(bookName, author);
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < currentIndex; i++) {
            System.out.println("도서 제목 : " + book[i].bookName + ", 저자 : " + book[i].author);
        }

    }

}
