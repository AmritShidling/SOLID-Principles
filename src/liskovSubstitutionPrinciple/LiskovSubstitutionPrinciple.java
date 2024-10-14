package liskovSubstitutionPrinciple;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Objects of the superclass should be replaceable with the objects of the subclass without affecting
 */

class Bird1{
    public void canEat(){
        System.out.println("Bird can Eat");
    }
}

class FlyingBird extends Bird1{
    public void canFly(){
        System.out.println("Bird can fly");
    }
}

class Penguin1 extends Bird1{
    @Override
    public void canEat(){
        System.out.println("I can only eat");
    }
}
class Swan1 extends FlyingBird{
    @Override
    public void canEat(){
        System.out.println("I can eat");
    }
    @Override
    public void canFly(){
        System.out.println("I can fly");
    }
}
public class LiskovSubstitutionPrinciple {


    public static void canTheyFly(List<FlyingBird> birdList){
        for (FlyingBird bird: birdList){
            bird.canFly();
        }
    }
    public static void main(String[] args) {

        List<FlyingBird> flyingBirds = new ArrayList<>();
        flyingBirds.add(new Swan1());
        canTheyFly(flyingBirds);
    }
}
