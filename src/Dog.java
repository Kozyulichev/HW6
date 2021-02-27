public class Dog extends Animal {


    public Dog(String name, int maxRun, int maxSwim, int swimLenght, int runLenght) {
        super(name, maxRun, maxSwim, swimLenght, runLenght);
    }


    @Override
    void run() {
        if (runLenght <= maxRun && runLenght >= 0) {
            System.out.println("Песель " + name + " пробежал " + runLenght + " метров");
        } else if (runLenght < 0) System.out.println("Песики не бегают задом наперед");
        else System.out.println("Песель " + name + " не может пробежать больше " + maxRun + " метров");
    }

    @Override
    void swimm() {
        if (swimLenght <= maxSwim && swimLenght > 0) System.out.println("Песик " + name + " проплыл " + swimLenght +
                " метров");
        else if (swimLenght < 0) System.out.println("Песики не могут грести хвостом");
        else System.out.println("Песик " + name + " не может проплыть более " + maxSwim + " метров");

    }

}
