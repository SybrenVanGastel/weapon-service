package be.itf.weaponservice.repository;

import be.itf.weaponservice.model.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponRepository extends JpaRepository<Weapon, Integer> {
    Weapon findByName(String name);
}
