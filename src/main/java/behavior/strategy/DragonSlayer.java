package behavior.strategy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DragonSlayer {
    private DragonSlayerStrategy strategy;

    public void changeStrategy(DragonSlayerStrategy strategy) {
        this.strategy = strategy;
    }

    public void goToBattle() {
        strategy.execute();
    }

}
