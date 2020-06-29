package takred;

import takred.search.SearchWeaponInFirstShop;
import takred.search.SearchWeaponInSecondShop;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        SearchWeaponInFirstShop searchWeaponInFirstShop = new SearchWeaponInFirstShop();
        SearchWeaponInSecondShop searchWeaponInSecondShop = new SearchWeaponInSecondShop();

        UUID id = UUID.fromString("d384ec58-e29a-4e37-bb45-448fe1e723b5");
        Weapon weapon = searchWeaponInFirstShop.searchWeaponById(id);

        if (weapon == null) {
            weapon = searchWeaponInSecondShop.searchWeaponById(id);
        }

        System.out.println(weapon.getName());
    }
}