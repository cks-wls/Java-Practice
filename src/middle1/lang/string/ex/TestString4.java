package middle1.lang.string.ex;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        // substring()을 사용해서 hello 부분과 .txt 부분을 분리해라
        int index = str.indexOf(".txt");
        String filename = str.substring(0, index);
        String extName = str.substring(index);
        System.out.println("filename = " + filename);
        System.out.println("extName = " + extName);
    }
}
