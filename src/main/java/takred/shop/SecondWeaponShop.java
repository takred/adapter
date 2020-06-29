package takred.shop;

import takred.MinWeapon;
import takred.Weapon;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SecondWeaponShop {
    private final List<Weapon> assortmentProduct;

    public SecondWeaponShop() {
        this.assortmentProduct = new ArrayList<>();
        assortmentProduct.add(new Weapon(UUID.fromString("0c997f80-d837-4723-abe6-c3fc9ea82723"), "Двуручный меч2", 22, 22, 22));
        assortmentProduct.add(new Weapon(UUID.fromString("d09b4c25-7d83-4679-9905-e323d8cb857f"), "Двуручный меч3", 33, 33, 33));
        assortmentProduct.add(new Weapon(UUID.fromString("4c81a5ea-f30e-438a-948a-da41d975197a"), "Двуручный меч4", 44, 44, 44));
        assortmentProduct.add(new Weapon(UUID.fromString("d384ec58-e29a-4e37-bb45-448fe1e723b5"), "Меч4", 4, 4, 4));
    }

    public Weapon getWeaponByName(String name) {
        for (int i = 0; i < assortmentProduct.size(); i++) {
            if (assortmentProduct.get(i).getName().equals(name)) {
                return assortmentProduct.get(i);
            }
        }
        return null;
    }

    public List<MinWeapon> getAssortmentProduct() {
        List<MinWeapon> minWeapons = new ArrayList<>();

        for (int i = 0; i < assortmentProduct.size(); i++) {
            Weapon weapon = assortmentProduct.get(i);
            minWeapons.add(new MinWeapon(weapon.getId(), weapon.getName()));
        }
        return minWeapons;
    }
}
