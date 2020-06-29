package takred;

import java.util.UUID;

public class Weapon {
    private final UUID id;
    private final String name;
    private final int weight;
    private final int bladeLength;
    private final int bladeWidth;

    public Weapon(String name, int weight, int bladeLength, int bladeWidth) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.weight = weight;
        this.bladeLength = bladeLength;
        this.bladeWidth = bladeWidth;
    }

    public Weapon(UUID id ,String name, int weight, int bladeLength, int bladeWidth) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.bladeLength = bladeLength;
        this.bladeWidth = bladeWidth;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getBladeLength() {
        return bladeLength;
    }

    public int getBladeWidth() {
        return bladeWidth;
    }
}
