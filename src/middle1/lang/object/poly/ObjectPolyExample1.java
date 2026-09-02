package middle1.lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        action(dog);
        action(car);
    }

    private static void action(Object obj) {
//        obj.sound // 컴파일 에러. Object는 sound가 없음 -> 다운 캐스팅
//        obj.move // 컴파일 에러. Object는 move 없음 -> 다운 캐스팅

        // 객체에 맞는 다운 캐스팅이 필요
        if (obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}
