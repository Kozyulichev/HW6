public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Чупа", 10, 2, 10, 10);
        Cat cat1 = new Cat("Улюка", 100, 0, 2, 98);
        Dog dog = new Dog("Киану", 470, 23, 10, 500);
        Dog dog1 = new Dog("Лиза",20,10,5,1);
        Animal[] animals = {cat, cat1, dog,dog1};
        for (Animal animal : animals) {
            animal.run();
            animal.swimm();
            System.out.println();
        }
        System.out.println("Количество созданных животных = " + animals.length);
    }


}






