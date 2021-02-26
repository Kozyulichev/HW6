public abstract class Animal {
    int maxRun;
    int maxSwim;

    public Animal(int maxRun, int maxSwim){
        this.maxRun=maxRun;
        this.maxSwim=maxSwim;
    }


    abstract void run(int lenght);

    abstract void swimm(int lenght);
}
