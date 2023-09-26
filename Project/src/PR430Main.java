
import java.lang.reflect.Constructor;

public class PR430Main{
    public static void main(String[] args){
        System.out.println("Iniciant 1");
        PR430Object instance1 = PR430Object.getInstance("Edu", "Amoros","21");

        System.out.println("Iniciant 2");
        PR430Object instance2 = PR430Object.getInstance("Pepe", "Garcia","30");

        System.out.println("Iniciant 3");
        PR430Object instance3 = PR430Object.getInstance("Carla", "Perez","5");

        System.out.println(instance1.toString());
        System.out.println(instance2.toString());
        System.out.println(instance3.toString());

    }
}
