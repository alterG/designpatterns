package behavior.strategy;

public class ProjectileStrategy implements DragonSlayerStrategy {


    @Override
    public void execute() {
        System.out.println("You attacked dragon with elf bow.");
    }
}
