package be.itf.weaponservice.response;

import be.itf.weaponservice.model.Ability;
import be.itf.weaponservice.model.Attribute;
import be.itf.weaponservice.model.Weapon;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WeaponResponseBuilder {
    public static ResponseEntity<Object> generateOneWeapon(String message, HttpStatus status, Weapon weapon) {

        Map<String, Object> weaponMap = new LinkedHashMap<>();

        weaponMap.put("id", weapon.getId());
        weaponMap.put("name", weapon.getName());

        return new ResponseEntity<>(weaponMap, status);
    }

    public static ResponseEntity<Object> generateAllWeapons(String message, HttpStatus status, List<Weapon> weapons) {

        List<Object> weaponList = new ArrayList<>();

        for (Weapon weapon : weapons) {
            Map<String, Object> weaponMap = new LinkedHashMap<>();

            weaponMap.put("id", weapon.getId());
            weaponMap.put("name", weapon.getName());

            weaponList.add(weaponMap);
        }

        return new ResponseEntity<>(weaponList, status);
    }

    public static ResponseEntity<Object> generateOneWeaponDetailed(String message, HttpStatus status, Weapon weapon) {

        Map<String, Object> weaponMap = new LinkedHashMap<>();

        weaponMap.put("id", weapon.getId());
        weaponMap.put("name", weapon.getName());
        weaponMap.put("description", weapon.getDescription());
        weaponMap.put("image_url", weapon.getImageUrl());

        List<Object> attributeList = new ArrayList<>();
        List<Object> abilityList = new ArrayList<>();

        for (Attribute attribute : weapon.getAttributes()) {
            Map<String, Object> attributeMap = new LinkedHashMap<>();

            attributeMap.put("id", attribute.getId());
            attributeMap.put("name", attribute.getName());
            attributeMap.put("scale_factor", attribute.getScaleFactor());

            if (attribute.getScaleFactor() > 0) {
                attributeList.add(attributeMap);
            }
        }

        for (Ability ability : weapon.getAbilities()) {
            Map<String, Object> abilityMap = new LinkedHashMap<>();

            abilityMap.put("id", ability.getId());
            abilityMap.put("name", ability.getName());
            abilityMap.put("description", ability.getDescription());
            abilityMap.put("image_url", ability.getImageUrl());

            abilityList.add(abilityMap);
        }

        weaponMap.put("attributes", attributeList);
        weaponMap.put("abilities", abilityList);

        return new ResponseEntity<>(weaponMap, status);
    }
}
