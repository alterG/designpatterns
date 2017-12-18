package behavior.strategy;

public class MeleeStrategy implements DragonSlayerStrategy {


    @Override
    public void execute() {
        System.out.println("You attacked dragon with Iron Sword");
    }
}
