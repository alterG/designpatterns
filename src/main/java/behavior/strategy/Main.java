package behavior.strategy;

public class Main {


    public static void main(String[] args) {
        DragonSlayerStrategy projectileStrategy = new ProjectileStrategy();
        DragonSlayerStrategy meleeStrategy = new MeleeStrategy();
        DragonSlayerStrategy spellStrategy = new SpellStrategy();

        DragonSlayer alterg = new DragonSlayer(projectileStrategy);
        alterg.goToBattle();

        alterg.changeStrategy(meleeStrategy);
        alterg.goToBattle();

        alterg.changeStrategy(spellStrategy);
        alterg.goToBattle();
    }

}
