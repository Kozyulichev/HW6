public class Cat extends Animal{
    @Override
     void run(int lenght) {
        if (lenght<=100&&lenght>=0){
            System.out.println("Котик пробежал " +lenght+ " метров");
        }else if (lenght<0) System.out.println("Котики не бегают задом наперед");
        else System.out.println("Котик не может пробежать больше 100 метров");
        }

    @Override
    void swimm(int lenght) {
        if (lenght!=0){
            System.out.println("Котик не умеет плавать");
        }
    }
}

