package middle1.lang.wrapper.ex;

public class WrapperTest2 {
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};
        // 배열에 입력된 모든 숫자의 합을 구하자
        double sum = 0;
        for (String s : array) {
            sum += Double.parseDouble(s);
        }
        System.out.println("합 : " + sum);
    }

}
