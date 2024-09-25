package strategy.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("하늘을 날지 못합니다.");
    }
}
