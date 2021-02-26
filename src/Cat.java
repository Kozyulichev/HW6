public class Cat extends Animal {


    public Cat(int maxRun, int maxSwim) {
        super(maxRun, maxSwim);
    }

    @Override
    void run(int lenght) {
        if (lenght <= maxRun && lenght >= 0) {
            System.out.println("Котик пробежал " + lenght + " метров");
        } else if (lenght < 0) System.out.println("Котики не бегают задом наперед");
        else System.out.println("Котик не может пробежать больше "+ maxRun+ " метров");
    }

    @Override
    void swimm(int lenght) {
        if (lenght != maxSwim) {
            System.out.println("Котик не умеет плавать");
        }
    }
}

