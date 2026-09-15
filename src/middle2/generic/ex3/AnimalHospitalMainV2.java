package middle2.generic.ex3;

import middle2.generic.animal.Animal;
import middle2.generic.animal.Cat;
import middle2.generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogAnimalHospitalV2 = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catAnimalHospitalV2 = new AnimalHospitalV2<>();
        AnimalHospitalV2<Animal> animalHospitalV2 = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospitalV2 = new AnimalHospitalV2<>();
    }
}
