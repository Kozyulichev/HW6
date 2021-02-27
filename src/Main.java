public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Чупа", 10, 2, 10, 10);
        Cat cat1 = new Cat("Улюка",100,0,2,98);
        Dog dog = new Dog("Киану", 470, 23, 10, 500);
        Animal[] animals = {cat,cat1, dog};
        for (int i = 0; i < animals.length; i++) {
            animals[i].run();
            animals[i].swimm();
            System.out.println("Количество созданных животных = "+(i+1));
        }
    }


}






