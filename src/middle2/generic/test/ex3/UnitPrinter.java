package middle2.generic.test.ex3;

import middle2.generic.test.ex3.unit.BioUnit;

public class UnitPrinter {
    // printv1 -> 제너릭 메서드
    // printv2 -> 와일드 카드

    public static <T extends Shuttle> void printV1(T unit) {
        unit.showInfo();
    }

    public static void printV2(Shuttle<? extends BioUnit> unit) {
        unit.showInfo();
    }
}
