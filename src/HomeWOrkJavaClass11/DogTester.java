package HomeWOrkJavaClass11;

public class DogTester {
    Dog dog1() {
        Dog dog1 = new Dog();
        dog1.name = "Leo";
        dog1.breed = "Husky";
        dog1.color = "black";
        dog1.age = 7;
        dog1.weight = 50.60;
        dog1.barks();
        dog1.sleep();
        System.out.println();
    return dog1;
    }
Dog dog2() {
    Dog dog2 = new Dog();
    dog2.name = "Bruno";
    dog2.breed = "Bulldog";
    dog2.color = "brown";
    dog2.age = 5;
    dog2.weight = 40.00;
    dog2.eat();
    dog2.sleep();
    System.out.println();
    return dog2;
}
Dog dog3() {
    Dog dog3 = new Dog();
    dog3.name = "Sccoby";
    dog3.breed = "Labrador";
    dog3.color = "black";
    dog3.age = 9;
    dog3.weight = 45.80;
    dog3.playFetch();
    dog3.sleep();
    System.out.println();
    return dog3;

}
}

