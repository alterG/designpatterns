package behavior.strategy;

public class SpellStrategy implements DragonSlayerStrategy {


    @Override
    public void execute() {
        System.out.println("You attacked the dragon with Frost Ball.");
    }
}
