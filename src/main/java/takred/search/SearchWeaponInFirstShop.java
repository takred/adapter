package takred.search;

import takred.shop.FirstWeaponShop;
import takred.Weapon;

import java.util.UUID;

public class SearchWeaponInFirstShop implements SearchWeapon{
    private final FirstWeaponShop firstWeaponShop = new FirstWeaponShop();

    @Override
    public Weapon searchWeaponById(UUID id) {
        return firstWeaponShop.getWeaponById(id);
    }
}
