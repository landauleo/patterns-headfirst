/**
 * User: Anna Nosova
 * Time: 2019-06-09 17:23
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I’m a real Mallard duck");
    }
}
