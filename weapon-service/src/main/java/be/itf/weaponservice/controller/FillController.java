package be.itf.weaponservice.controller;

import be.itf.weaponservice.model.Ability;
import be.itf.weaponservice.model.Weapon;
import be.itf.weaponservice.repository.AbilityRepository;
import be.itf.weaponservice.repository.AttributeRepository;
import be.itf.weaponservice.repository.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FillController {
    @Autowired
    private WeaponRepository weaponRepository;
    @Autowired
    private AbilityRepository abilityRepository;
    @Autowired
    private AttributeRepository attributeRepository;

    //fill table
    @GetMapping("/fill")
    public String fillDB() {
        Weapon weapon1 = new Weapon("Rapier", "A battle-worn rapier that still holds its point.", "https://cdn.newworldfans.com/db_images/db/items_hires/1hswordbt3.png");
        Weapon weapon2 = new Weapon("Sword", "1-Handed. Favors Strength for dealing damage, but Dexterity also contributes.", "https://cdn.newworldfans.com/db_images/db/items_hires/1hlongsworddropt2.png");
        Weapon weapon3 = new Weapon("Hatchet", "It is clearly an older weapon, yet the haft shows no sign of rot.", "https://cdn.newworldfans.com/db_images/db/items_hires/1hthrowingaxeancientt2.png");
        Weapon weapon4 = new Weapon("Spear", "Though it has seen many battles, this spear shows no signs of age or rot.", "https://cdn.newworldfans.com/db_images/db/items_hires/2hspeart5.png");
        Weapon weapon5 = new Weapon("Great axe", "Though this axe shows clear signs of use, the blades are sharp as ever.", "https://cdn.newworldfans.com/db_images/db/items_hires/2hgreataxeancientt2.png");
        Weapon weapon6 = new Weapon("War hammer", "Even though it appears to have seen many battles, the leather on the haft shows little wear.", "https://cdn.newworldfans.com/db_images/db/items_hires/2hwarhammerdropt2.png");
        Weapon weapon7 = new Weapon("Bow", "Though old, this bow draws as though it was strung mere days ago.", "https://cdn.newworldfans.com/db_images/db/items_hires/2hbowancientt2.png");
        Weapon weapon8 = new Weapon("Musket", "While relatively modern, it is clear this weapon was here before you.", "https://cdn.newworldfans.com/db_images/db/items_hires/2hmusketdropt2.png");
        Weapon weapon9 = new Weapon("Fire staff", "A vestige of an ancient civilization that had mastered pyromancy.", "https://cdn.newworldfans.com/db_images/db/items_hires/2hstafffiredropt5.png");
        Weapon weapon10 = new Weapon("Life staff", "A vestige of an ancient civilization that had mastered arcana.", "https://cdn.newworldfans.com/db_images/db/items_hires/2hstafflifedropt2.png");
        Weapon weapon11 = new Weapon("Ice gauntlet", "This Ice Gauntlet has clearly seen much use, but it is none the worse for wear.", "https://cdn.newworldfans.com/db_images/db/items_hires/1helementalgauntlet_icet2.png");

        weaponRepository.save(weapon1);
        weaponRepository.save(weapon2);
        weaponRepository.save(weapon3);
        weaponRepository.save(weapon4);
        weaponRepository.save(weapon5);
        weaponRepository.save(weapon6);
        weaponRepository.save(weapon7);
        weaponRepository.save(weapon8);
        weaponRepository.save(weapon9);
        weaponRepository.save(weapon10);
        weaponRepository.save(weapon11);

        // Rapier abilities
        abilityRepository.save(new Ability("Tondo", "Slash so quickly that it extends the reach of your blade up to 5m. This strike deals 50.0% direct weapon damage but also applies a bleed that will deal 85% weapon damage over 12.0 seconds. This can stack up to 3 times refreshing previous applications.", "https://cdn.newworldfans.com/db_images/db/abilities/rapier_ability1_slash.png", "Blood", "#FF0000", weapon1));
        abilityRepository.save(new Ability("Flurry", "Enter a posed stance and unleash a series of five quick thrust attacks with each strike dealing more damage. Flurry can be dodge canceled at any time.", "https://cdn.newworldfans.com/db_images/db/abilities/rapier_ability2_flurry.png", "Blood", "#FF0000", weapon1));
        abilityRepository.save(new Ability("Flourish and Finish", "Flourish performs an attack knocking back enemies. Pressing 'Light Attack' at the end of Flourish will continue this ability by automatically performing 'Finish'. Finish lunges forward, consuming all Rapier bleeds on any target hit dealing 110.0% of their damage immediately.", "https://cdn.newworldfans.com/db_images/db/abilities/rapier_ability3_flourish.png", "Blood", "#FF0000", weapon1));
        abilityRepository.save(new Ability("Evade", "Perform a small, reliable sidestep in your current movement direction that cancels any current activity and provides momentary invulnerability. 'Light Attack's made during Evade are performed exceptionally fast. ", "https://cdn.newworldfans.com/db_images/db/abilities/rapier_ability6_evade.png", "Grace", "#FFA500", weapon1));
        abilityRepository.save(new Ability("Riposte", "Enter into a defensive stance for 1 second. If struck during this ability, counter the attacker stunning them briefly for 1.5 seconds. You are briefly invulnerable upon a successful Riposte. ", "https://cdn.newworldfans.com/db_images/db/abilities/rapier_ability4_riposte.png", "Grace", "#800080", weapon1));
        abilityRepository.save(new Ability("Fleche", "Leave the ground lunging forward for 10m in a stabbing motion piercing through enemies dealing 145.0% damage. ", "https://cdn.newworldfans.com/db_images/db/abilities/rapier_ability5_aeriallunge.png", "Grace", "#FF0000", weapon1));

        // Sword abilities
        abilityRepository.save(new Ability("Whirling Blade", "Deal 145.0% weapon damage to all foes within 2 meters.", "https://cdn.newworldfans.com/db_images/db/abilities/swordability1.png", "Swordmaster", "#FF0000", weapon2));
        abilityRepository.save(new Ability("Reverse Stab", "A stab attack that deal 175.0% weapon damage.", "https://cdn.newworldfans.com/db_images/db/abilities/swordability2.png", "Swordmaster", "#FF0000", weapon2));
        abilityRepository.save(new Ability("Leaping Strike", "Leap 6 meters and deal 135.0% weapon damage.", "https://cdn.newworldfans.com/db_images/db/abilities/swordability3.png", "Swordmaster", "#808080", weapon2));
        abilityRepository.save(new Ability("Shield Rush", "Rush forward 5 meters knocking back foes and dealing 125.4% weapon damage.", "https://cdn.newworldfans.com/db_images/db/abilities/swordability5.png", "Defender", "#FFA500", weapon2));
        abilityRepository.save(new Ability("Shield Bash", "Deals 50.0% weapon damage and stuns foes in front of you for 2.0s.", "https://cdn.newworldfans.com/db_images/db/abilities/swordability4.png", "Defender", "#800080", weapon2));
        abilityRepository.save(new Ability("Defiant Stance", "For 8s, reduce the incoming base damage from attackers by 30.0%.", "https://cdn.newworldfans.com/db_images/db/abilities/swordability6.png", "Defender", "#FFA500", weapon2));

        // Hatchet abilities
        abilityRepository.save(new Ability("Berserk", "Triggers a Berserk Mode that increases all attack damage by 20.0% while active. Berserk Mode will be active for 12.0 seconds. Cooldown will trigger once Berserk ends.", "https://cdn.newworldfans.com/db_images/db/abilities/hatchetability5.png", "Berserker", "#FFA500", weapon3));
        abilityRepository.save(new Ability("Feral Rush", "A sprinting melee attack that causes the player to leap forward, hitting twice. The first hit deals 115.0% and the 2nd deals 130.0% weapon damage.", "https://cdn.newworldfans.com/db_images/db/abilities/hatchetability4.png", "Berserker", "#FF0000", weapon3));
        abilityRepository.save(new Ability("Raging Torrent", "Perform four fast attacks each dealing 90.0% weapon damage.", "https://cdn.newworldfans.com/db_images/db/abilities/hatchetability1_mod3.png", "Berserker", "#FF0000", weapon3));
        abilityRepository.save(new Ability("Rending Throw", "Throw an axe dealing 110.0% weapon damage and applying Rend, reducing target's damage absorption by 10.0% for 10.0s.", "https://cdn.newworldfans.com/db_images/db/abilities/hatchetability2.png", "Throwing", "#FFFF00", weapon3));
        abilityRepository.save(new Ability("Social Distancing", "Throw an axe forward and dodge backwards, dealing 130.0% weapon damage and slowing targets by 15.0% for 3.0 seconds.", "https://cdn.newworldfans.com/db_images/db/abilities/hatchetability2_mod1.png", "Throwing", "#FFFF00", weapon3));
        abilityRepository.save(new Ability("Infected Throw", "Throw an axe that deals 150.0% weapon damage and triggers Disease and weakens target for 5.0s.", "https://cdn.newworldfans.com/db_images/db/abilities/hatchetability3.png", "Throwing", "#FFFF00", weapon3));

        // Spear abilities
        abilityRepository.save(new Ability("Javelin", "Throw your spear, dealing 125.0% weapon damage and staggering on hit.", "https://cdn.newworldfans.com/db_images/db/abilities/spear_javelin.png", "Zoner", "#FFFF00", weapon4));
        abilityRepository.save(new Ability("Sweep", "Sweep the target's legs, dealing 75.0% weapon damage and knocking them down.", "https://cdn.newworldfans.com/db_images/db/abilities/spear_sweep.png", "Zoner", "#800080", weapon4));
        abilityRepository.save(new Ability("Cyclone", "Spin attack that deals 110.0% weapon damage, pushes targets back 3.0m and applies 50.0% Slow for 3.0s.", "https://cdn.newworldfans.com/db_images/db/abilities/spear_cyclone.png", "Zoner", "#800080", weapon4));
        abilityRepository.save(new Ability("Skewer", "Rush forward and skewer your target, dealing 125.0% weapon damage. Applies Bleed (10.0% weapon damage) every 1.0 second for 10.0 seconds.", "https://cdn.newworldfans.com/db_images/db/abilities/spear_skewer.png", "Impaler", "#FF0000", weapon4));
        abilityRepository.save(new Ability("Perforate", "Three quick piercing strikes that each deal 70.0% weapon damage and apply Rend, reducing the target's damage absorption by 5.0% for 10.0 seconds.", "https://cdn.newworldfans.com/db_images/db/abilities/spear_perforate.png", "Impaler", "#FF0000", weapon4));
        abilityRepository.save(new Ability("Vault Kick", "Use your spear to vault forward and kick your target, dealing 75.0% weapon damage. Applies Stun for 1.5 seconds.", "https://cdn.newworldfans.com/db_images/db/abilities/spear_vaultkick.png", "Impaler", "#800080", weapon4));

        // Great axe abilities
        abilityRepository.save(new Ability("Reap", "Extend your axe 5m pulling foes to you and dealing 110.0% weapon damage.", "https://cdn.newworldfans.com/db_images/db/abilities/greataxe_ability4_judgementsreach.png", "Reaper", "#FF0000", weapon5));
        abilityRepository.save(new Ability("Charge", "Charge 10m dealing 120.0% weapon damage when you reach a target or Press LMB.", "https://cdn.newworldfans.com/db_images/db/abilities/greataxe_ability2_engage.png", "Reaper", "#FF0000", weapon5));
        abilityRepository.save(new Ability("Execute", "A powerful overhead attack dealing 200.0% weapon damage. Deals 300% weapon damage vs foes under 50.0% health.", "https://cdn.newworldfans.com/db_images/db/abilities/greataxe_ability3_executioner.png", "Reaper", "#FF0000", weapon5));
        abilityRepository.save(new Ability("Maelstrom", "Fast-spinning attack that pulls targets closer to you and deals 110.0% weapon damage.", "https://cdn.newworldfans.com/db_images/db/abilities/greataxe_ability5_maelstrom.png", "Mauler", "#FF0000", weapon5));
        abilityRepository.save(new Ability("Whirlwind", "Spin attack dealing 50.0% weapon damage to all nearby foes. If you hit a foe spin again (Max 4 spins.) You can move while spinning. This attack cannot backstab.", "https://cdn.newworldfans.com/db_images/db/abilities/greataxe_ability1_whirlwind.png", "Mauler", "#FF0000", weapon5));
        abilityRepository.save(new Ability("Gravity Well", "Throw an axe to create a vortex that pulls foes to its center for 3s. Ends with a damaging Burst dealing 125.0% weapon damage. Range 10m.", "https://cdn.newworldfans.com/db_images/db/abilities/greataxe_ability6_gravitywell.png", "Mauler", "#800080", weapon5));

        // War hammer abilities
        abilityRepository.save(new Ability("Armor Breaker", "A Powerful swing that penetrates 35.0% of the Target's armor and deals 140.0% Weapon damage.", "https://cdn.newworldfans.com/db_images/db/abilities/warhammerability1.png", "Juggernaut", "#FF0000", weapon6));
        abilityRepository.save(new Ability("Mighty Gavel", "An overhead leaping attack that crushes down on enemies dealing 160.0% weapon damage.", "https://cdn.newworldfans.com/db_images/db/abilities/warhammerability3.png", "Juggernaut", "#FF0000", weapon6));
        abilityRepository.save(new Ability("Wrecking Ball", "Strike the ground around a target with Hammer dealing 120.0% weapon damage and flattening enemy.", "https://cdn.newworldfans.com/db_images/db/abilities/warhammerability6.png", "Juggernaut", "#FF0000", weapon6));
        abilityRepository.save(new Ability("Clear Out", "A wide swing that knocks enemies back 4 meters to create distance, deals 115.0% weapon damage.", "https://cdn.newworldfans.com/db_images/db/abilities/warhammerability2.png", "Crowd Crusher", "#800080", weapon6));
        abilityRepository.save(new Ability("Shockwave", "Slam the Hammer into the ground causing a 3.0 meter radius AOE earthquake that deals 80.0% weapon damage. Applies Stun to all impacted targets for 2.0 Seconds.", "https://cdn.newworldfans.com/db_images/db/abilities/warhammerability5.png", "Crowd Crusher", "#800080", weapon6));
        abilityRepository.save(new Ability("Path Of Destiny", "A powerful ground strike that erupts a linear wave of energy in front of the player, dealing 110.0% weapon damage to all targets in its path.", "https://cdn.newworldfans.com/db_images/db/abilities/warhammerability4.png", "Crowd Crusher", "#800080", weapon6));

        // Bow abilities
        abilityRepository.save(new Ability("Evade Shot", "Leap back 5m and shoot an arrow dealing 125.0% weapon damage.", "https://cdn.newworldfans.com/db_images/db/abilities/bowability2.png", "Skirmisher", "#FFA500", weapon7));
        abilityRepository.save(new Ability("Rain of Arrows", "Shoot a barrage of arrows 7 meters wide that deals 150.0% weapon damage.", "https://cdn.newworldfans.com/db_images/db/abilities/bowability6.png", "Skirmisher", "#FFFF00", weapon7));
        abilityRepository.save(new Ability("Poison Shot", "Shoot a poison arrow that on hit or land creates a cloud of poison 3m wide that lasts 6s. Foes entering the cloud are poisoned dealing 10.0% weapon damage per second for 20.0s.", "https://cdn.newworldfans.com/db_images/db/abilities/bowability5.png", "Skirmisher", "#FFFF00", weapon7));
        abilityRepository.save(new Ability("Penetrating Shot", "Shoot an arrow dealing 150.0% weapon damage that passes through targets and continues for 100 meters.", "https://cdn.newworldfans.com/db_images/db/abilities/bowability3.png", "Hunter", "#FFFF00", weapon7));
        abilityRepository.save(new Ability("Splinter Shot", "Shoot an arrow out 10 meters it then splits into 3 arrows dealing 50.0% weapon damage.", "https://cdn.newworldfans.com/db_images/db/abilities/bowability4.png", "Hunter", "#FFFF00", weapon7));
        abilityRepository.save(new Ability("Rapid Shot", "Shoot 3 consecutive arrows. The first two dealing 100.0% weapon damage each. The last shot causes a knockback and deal 125.0% weapon damage.", "https://cdn.newworldfans.com/db_images/db/abilities/bowability1.png", "Hunter", "#FFFF00", weapon7));

        // Musket abilities
        abilityRepository.save(new Ability("Power Shot", "Overload musket with gun powder, causing the next shot to deal 150.0% Weapon Damage. Does not stack or combine with other overload shots.", "https://cdn.newworldfans.com/db_images/db/abilities/musketability1.png", "Sharpshooter", "#FFA500", weapon8));
        abilityRepository.save(new Ability("Powder Burn", "Overload musket with gun powder, causing the next shot to deal 110.0% Weapon Damage and cause a Burn status effect that deals 20.0% Weapon Damage per second for 9.0 seconds. Does not stack or combine with other overload shots.", "https://cdn.newworldfans.com/db_images/db/abilities/musketability1_mod3.png", "Sharpshooter", "#FFFF00", weapon8));
        abilityRepository.save(new Ability("Shooter's Stance", "Player enters a shooting aim stance to enhance shooting performance. Shots deal 100.0% Weapon damage. While in stance mobility is reduced to zero and reload time is reduced by 75%. Mode will exit after three shots.", "https://cdn.newworldfans.com/db_images/db/abilities/musketability2.png", "Sharpshooter", "#FFA500", weapon8));
        abilityRepository.save(new Ability("Traps", "Throw a trap that last for 20 seconds. When triggered it causes target to be Rooted, immobilizing target for 3.0 seconds.", "https://cdn.newworldfans.com/db_images/db/abilities/musketability4.png", "Trapper", "#800080", weapon8));
        abilityRepository.save(new Ability("Stopping Power", "Overload musket with gun powder, causing the next shot to deal 120.0% Weapon Damage, staggering target and knocking them back 3.0 meters. Does not stack or combine with other Overloaded shots.", "https://cdn.newworldfans.com/db_images/db/abilities/musketability2_mod2.png", "Trapper", "#FFFF00", weapon8));
        abilityRepository.save(new Ability("Sticky Bomb", "A bomb that can be thrown a short range and sticks to anything it makes contact with. Detonation will occur 3 seconds after impact dealing 175.0% weapon damage to all targets within 3.0 meters.", "https://cdn.newworldfans.com/db_images/db/abilities/musketability6.png", "Trapper", "#FFFF00", weapon8));

        // Fire staff abilities
        abilityRepository.save(new Ability("Pillar of Fire", "A targeted spell that deals 134.0% weapon damage.  ", "https://cdn.newworldfans.com/db_images/db/abilities/firestaffability2.png", "Fire Mage", "#0000FF", weapon9));
        abilityRepository.save(new Ability("Meteor Shower", "Channel a spell that rains down meteors, dealing 34.0% weapon damage on initial impact and an additional 20.0% weapon damage per second while targets remain in the AOE.", "https://cdn.newworldfans.com/db_images/db/abilities/firestaffability3.png", "Fire Mage", "#0000FF", weapon9));
        abilityRepository.save(new Ability("Fireball", "Fire off a heavy fireball that deals 140.0% weapon damage on impact and leave a 3m burning field that lasts 6s. The burning field dealing 10.0% weapon damage each second.  ", "https://cdn.newworldfans.com/db_images/db/abilities/firestaffability1.png", "Fire Mage", "#0000FF", weapon9));
        abilityRepository.save(new Ability("FlameThrower", "Create a jet of flame from the tip of staff dealing 34.0% weapon damage each second. Each hit catches enemies on fire dealing 3.0% weapon damage each second for 6.0s.", "https://cdn.newworldfans.com/db_images/db/abilities/firestaffability4.png", "Pyromancer", "#0000FF", weapon9));
        abilityRepository.save(new Ability("Incinerate", "Cause a fiery explosion dealing 130.0% weapon damage and pushes back all enemies 3.0m. Catches enemies on fire dealing 3.0% weapon damage each second for 6.0s.  ", "https://cdn.newworldfans.com/db_images/db/abilities/firestaffability6.png", "Pyromancer", "#0000FF", weapon9));
        abilityRepository.save(new Ability("Burn Out", "Dash through targets dealing 129.0% weapon damage on hit. Passing through a target will catch the target on fire applying a Burn that deals 10.0% weapon damage each second for 8.0s.  ", "https://cdn.newworldfans.com/db_images/db/abilities/firestaffability5.png", "Pyromancer", "#0000FF", weapon9));

        // Life staff abilities
        abilityRepository.save(new Ability("Divine Embrace", "Heal target for 150.0% weapon damage. ", "https://cdn.newworldfans.com/db_images/db/abilities/lifestaffability3.png", "Healing", "#00FF00 ", weapon10));
        abilityRepository.save(new Ability("Sacred Ground", "Create an area on the ground that lasts for 15s and heals 20.0% weapon damage every second. ", "https://cdn.newworldfans.com/db_images/db/abilities/lifestaffability2.png", "Healing", "#808080", weapon10));
        abilityRepository.save(new Ability("Splash of Light", "You and all group members within 100m are healed for 50.0% weapon damage.  ", "https://cdn.newworldfans.com/db_images/db/abilities/lifestaffpassive5.png", "Healing", "#00FF00 ", weapon10));
        abilityRepository.save(new Ability("Orb of Protection", "Shoot out a light projectile that grants 10.0% Fortify for 20.0s, heals an ally for 10% of weapon damage, and deals 146.0% weapon damage when it hits an enemy. (Fortify reduces incoming damage.)  ", "https://cdn.newworldfans.com/db_images/db/abilities/firestaffability1.png", "Protector", "#808080", weapon10));
        abilityRepository.save(new Ability("Beacon", "Shoot out a light projectile that deals 146.0% weapon damage to enemies, attaches to it's target and heals all nearby allies for 20.0% weapon damage each second for 10s.  ", "https://cdn.newworldfans.com/db_images/db/abilities/hatchetpassive3.png", "Protector", "#808080", weapon10));
        abilityRepository.save(new Ability("Light's Embrace", "Targeted heal for 100.0% weapon damage +30.0% more for each buff on that target.  ", "https://cdn.newworldfans.com/db_images/db/abilities/lifestaffability4_mod3.png", "Protector", "#808080", weapon10));

        // Ice gauntlet abilities
        abilityRepository.save(new Ability("Ice Spikes", "Creates a trail of spikes that start from the player and go out in a straight line for 8 meters dealing 56.0% weapon damage. The path ends with a Mighty Spike that will deal 157.0% weapon damage and apply pushback. Pressing LMB before reaching the end of the path will spawn the Mighty Spike early. ", "https://cdn.newworldfans.com/db_images/db/abilities/icemagic_ability1.png", "Ice Tempest", "#0000FF ", weapon11));
        abilityRepository.save(new Ability("Ice Storm", "A ranged attack that deals 17.0% weapon damage every 0.25 seconds and slows enemies within a 5 meter radius frosted area. 25% slow, 20 meter range, and 5 second duration.", "https://cdn.newworldfans.com/db_images/db/abilities/icemagic_ability2.png", "Ice Tempest", "#0000FF ", weapon11));
        abilityRepository.save(new Ability("Wind Chill", "A player aimable attack that blasts a column of freezing winds that push back enemies 5 meters while dealing 16.0% weapon damage each hit. Wind Chill has a total range of 7 meters with the farthest 2 meters increasing damage 20% without pushing enemies.Player is able to move during the attack.", "https://cdn.newworldfans.com/db_images/db/abilities/icemagic_ability3.png", "Ice Tempest", "#0000FF ", weapon11));
        abilityRepository.save(new Ability("Ice Pylon", "A placed Ice Pylon that fires ice projectiles dealing 50.0% weapon damage at enemies within a 20 meter range for 15 seconds or until killed. Ice Pylon creates a 1 meter radius frost area that enables frost powers.", "https://cdn.newworldfans.com/db_images/db/abilities/icemagic_ability4.png", "Builder", "#0000FF ", weapon11));
        abilityRepository.save(new Ability("Ice Shower", "Summon a shower of ice that creates a frosted area approximately 1 meter by 5 meters. Enemies that enter the Ice Shower will be stricken with a powerful Frostbite. Frostbite roots for 1 second, blocks sprinting and dodging, slows speed by 50%, and will remain on target for 3 second after exiting the Ice Shower. Ice Shower has a lifetime of 4 seconds.", "https://cdn.newworldfans.com/db_images/db/abilities/icemagic_ability5.png", "Builder", "#0000FF ", weapon11));
        abilityRepository.save(new Ability("Entombed", "Player can entomb themselves in ice to become invulnerable and greatly increase mana regen. The Ice Tomb has a lifetime of 10 seconds and can be destroyed. Players have two options to cancel Entomb, exit by pressing RMB or break out of the Ice Tomb by pressing LMB causing a damaging knockback for 20 mana.", "https://cdn.newworldfans.com/db_images/db/abilities/icemagic_ability6.png", "Builder", "#0000FF ", weapon11));

        return "Succes!";
    }
}
