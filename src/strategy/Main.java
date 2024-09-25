package strategy;

import strategy.fly.FlyNoWay;
import strategy.quack.Squeak;

public class Main {
    public static void main(String[] args){

        Duck duck1 = new MallardDuck();

        duck1.performFly();
        duck1.performQuack();
        System.out.println();

        // 동적으로 행동 지정 : setter로 원하는 행동 지정 가능
        Duck duck2 = new MallardDuck();
        duck2.setFlyBehavior(new FlyNoWay());
        duck2.setQuackBehavior(new Squeak());

        duck2.performFly();
        duck2.performQuack();

    }
}
