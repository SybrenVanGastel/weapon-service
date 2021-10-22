package be.itf.weaponservice.controller;

import be.itf.weaponservice.model.Weapon;
import be.itf.weaponservice.repository.WeaponRepository;
import be.itf.weaponservice.response.WeaponResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class WeaponController {

    @Autowired
    private WeaponRepository weaponRepository;

    @GetMapping("/weapon/{name}")
    public ResponseEntity<Object> getOneWeaponByName(@PathVariable String name) {
        try {
            return new ResponseEntity<>(weaponRepository.findByName(name), HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/weapons")
    public ResponseEntity<Object> getAllWeapons() {
        try {
            return new ResponseEntity<>(weaponRepository.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
