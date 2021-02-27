public class Cat extends Animal {


    public Cat(String name,int maxRun, int maxSwim, int swimLenght, int runLenght) {
        super(name,maxRun, maxSwim, swimLenght , runLenght);
    }

    @Override
    void run() {
        if (runLenght <= maxRun &&runLenght >= 0) {
            System.out.println("Котик "+name+ "  пробежал " + runLenght + " метров");
        } else if (runLenght < 0) System.out.println("Котики не бегают задом наперед");
        else System.out.println("Котик "+name+ " не может пробежать больше "+ maxRun+ " метров");
    }

    @Override
    void swimm() {
        if (maxSwim==0) {
            System.out.println("Котик "+name+ " не умеет плавать");
        }else if (maxSwim>0&&maxSwim>=swimLenght){
            System.out.println("Котик "+name+" проплыл "+swimLenght);
        }else System.out.println("Котит не плавают задом наперед или не плавают вовсе");
    }
}

