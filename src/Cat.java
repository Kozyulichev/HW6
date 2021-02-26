public class Cat extends Animal {
    int maxRun = 100;
    int maxSwim = 0;

    @Override
    void run(int lenght) {
        if (lenght <= maxRun && lenght >= 0) {
            System.out.println("Котик пробежал " + lenght + " метров");
        } else if (lenght < 0) System.out.println("Котики не бегают задом наперед");
        else System.out.println("Котик не может пробежать больше 100 метров");
    }

    @Override
    void swimm(int lenght) {
        if (lenght != maxSwim) {
            System.out.println("Котик не умеет плавать");
        }
    }
}

