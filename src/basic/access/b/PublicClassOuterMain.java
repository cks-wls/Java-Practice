package basic.access.b;

//import basic.access.a.DefaultClass1;
//import basic.access.a.DefaultClass2;

import basic.access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        // 다른 패키지 이므로 사용할 수 없음
//        DefaultClass1 class1 = new DefaultClass1();
//        DefaultClass2 class2 = new DefaultClass2();

    }
}
