public class Dog extends Animal{
    int maxRun=500;
    int maxSwim=10;
    @Override
    void run(int lenght) {
        if (lenght<=maxRun&&lenght>=0){
            System.out.println("Песель пробежал " +lenght+ " метров");
        }else if (lenght<0) System.out.println("Песики не бегают задом наперед");
        else System.out.println("Песель не может пробежать больше 500 метров");
    }

    @Override
    void swimm(int lenght) {
        if (lenght<=maxSwim&&lenght>0) System.out.println("Песик проплыл "+lenght+ " метров");
        else if (lenght<0) System.out.println("Песики не может грести хвостом");
        else System.out.println("Песик не может проплыть более 10 метров");

    }
}
