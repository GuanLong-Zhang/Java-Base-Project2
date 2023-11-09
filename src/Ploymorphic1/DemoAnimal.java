package Ploymorphic1;

public class DemoAnimal {
    public static void main(String[] args){
        AnimalUse an  = new AnimalUse();
        Cat c = new Cat();
        an.use(c);

        Dog d = new Dog();
        an.use(d);

        Pig p = new Pig();
        an.use(p);

    }
}
