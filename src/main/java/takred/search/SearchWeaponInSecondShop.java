package takred.search;

import takred.MinWeapon;
import takred.Weapon;
import takred.shop.SecondWeaponShop;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SearchWeaponInSecondShop implements SearchWeapon {
    private final SecondWeaponShop secondWeaponShop = new SecondWeaponShop();

    @Override
    public Weapon searchWeaponById(UUID id) {
        List<MinWeapon> minWeapons = new ArrayList<>(secondWeaponShop.getAssortmentProduct());
        for (int i = 0; i < minWeapons.size(); i++) {
            MinWeapon weapon = minWeapons.get(i);
            if (weapon.getId().equals(id)) {
                return secondWeaponShop.getWeaponByName(weapon.getName());
            }
        }
        return null;
    }
}
