package takred;

import java.util.UUID;

public class MinWeapon {
    private final UUID id;
    private final String name;

    public MinWeapon(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
