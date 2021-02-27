public abstract class Animal {
    int maxRun;
    int maxSwim;
    int swimLenght;
    int runLenght;
    String name;

    public Animal(String name, int maxRun, int maxSwim, int swimLenght, int runLenght) {
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.name = name;
        this.swimLenght = swimLenght;
        this.runLenght = runLenght;
    }


    abstract void run();

    abstract void swimm();


}
