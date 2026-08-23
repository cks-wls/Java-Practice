package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;
        System.out.println("dataA의 참조값 = " + dataA);
        System.out.println("dataB의 참조값 = " + dataB);
        System.out.println("dataA의 value = " + dataA.value);
        System.out.println("dataB의 value = " + dataB.value);

        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA의 value = " + dataA.value);
        System.out.println("dataB의 value = " + dataB.value);
        //dataB 변경
        dataA.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA의 value = " + dataA.value);
        System.out.println("dataB의 value = " + dataB.value);

    }
}
