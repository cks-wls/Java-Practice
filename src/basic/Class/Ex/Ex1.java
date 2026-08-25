package basic.Class.Ex;

public class Ex1 {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "타이타닉";
        movieReview1.review = "굿굿";
        MovieReview[] arr = {movieReview1};
        for (MovieReview value : arr) {
            System.out.println("제목 : " + value.title + " 리뷰 : " + value.review);
        }

    }
}
