import java.lang.reflect.Constructor;

public class PR431Main{
    public static void main(String[] args){
        
        System.out.println("Iniciant 1");
        PR431Objecte instanceTwo1 = PR431Objecte.getNewDestroyedInstance("Puri", "Lopez","18");

        System.out.println("Iniciant 2");
        PR431Objecte instanceTwo2 = PR431Objecte.getNewDestroyedInstance("Pepe", "Garcia","30");

        System.out.println("Iniciant 3");
        PR431Objecte instanceTwo3 = PR431Objecte.getNewDestroyedInstance("Carla", "Perez","5");

        System.out.println(instanceTwo1.toString());
        System.out.println(instanceTwo2.toString());
        System.out.println(instanceTwo3.toString());
    }
}