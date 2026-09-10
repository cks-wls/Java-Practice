package middle1.nested.annoymous;

import middle1.nested.local.Printer;

public class AnnoymousOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        Printer printer1 = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };
        printer1.print();
        System.out.println("printer1.class = " + printer1.getClass());
    }

    public static void main(String[] args) {
        AnnoymousOuter main = new AnnoymousOuter();
        main.process(2);
    }
}
