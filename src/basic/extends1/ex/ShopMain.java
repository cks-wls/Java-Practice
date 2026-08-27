package basic.extends1.ex;

public class ShopMain {
    public static void main(String[] args) {
        Book book = new Book("JAVA", 10000, "han", "12345");
        Album album = new Album("앨범1", 15000, "seo");
        Movie movie = new Movie("영화1", 18000, "감독1", "배우1");

        book.print(); // 이름 : , 가격 :
                      // - 저자 : , isbn :
        album.print(); // 이름 : , 가격 :
                       // - 아티스트 :
        movie.print(); // 이름 : , 가격 :
                       // - 감독 :

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 가격의 합 : " + sum);
    }
}
