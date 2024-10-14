package liskovSubstitutionPrinciple;


import java.util.ArrayList;
import java.util.List;

class Bird{
    public void canEat(){
        System.out.println("Birds Can Eat");
    }
    public void canFly(){
        System.out.println("Birds Can Fly");
    }
}
class Swan extends Bird{
    @Override
    public void canEat(){
        System.out.println("I can eat food!");
    }

    @Override
    public void canFly(){
        System.out.println("I can fly!");
    }
}

class Penguin extends Bird{
    @Override
    public void canEat(){
        System.out.println("I can eat food!");
    }

    @Override
    public void canFly(){
        throw new UnsupportedOperationException("Penguin can not fly");
    }
}
public class WithoutLiskovPrinciple {

    public static void theyCanFly(List<Bird> birds){
        for (Bird bird: birds){
            bird.canFly();
        }
    }
    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<>();
        birds.add(new Swan());
        birds.add(new Penguin());
        theyCanFly(birds);
    }
}
