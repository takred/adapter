package takred.shop;

import takred.Weapon;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FirstWeaponShop {
    private final List<Weapon> assortmentProduct;

    public FirstWeaponShop() {
        this.assortmentProduct = new ArrayList<>();
        assortmentProduct.add(new Weapon(UUID.fromString("ede86745-ccf8-42f1-8745-83ab3bb8a3c9"), "Меч1", 1, 1, 1));
        assortmentProduct.add(new Weapon(UUID.fromString("13dd7c71-db8b-49de-a460-305fe5d4767f"), "Меч2", 2, 2, 2));
        assortmentProduct.add(new Weapon(UUID.fromString("e41d78dc-093d-4e87-a1fc-ff005799a1e1"), "Меч3", 3, 3, 3));
        assortmentProduct.add(new Weapon(UUID.fromString("b50f4009-be99-4278-8ae1-2c35389a54e4"), "Двуручный меч1", 11, 11, 11));
    }

    public Weapon getWeaponById(UUID id) {
        for (int i = 0; i < assortmentProduct.size(); i++) {
            if (assortmentProduct.get(i).getId().equals(id)) {
                return assortmentProduct.get(i);
            }
        }
        return null;
    }
}
