package be.itf.weaponservice;

import be.itf.weaponservice.model.Ability;
import be.itf.weaponservice.model.Attribute;
import be.itf.weaponservice.model.Weapon;
import be.itf.weaponservice.repository.AbilityRepository;
import be.itf.weaponservice.repository.AttributeRepository;
import be.itf.weaponservice.repository.WeaponRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.*;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.mockito.BDDMockito.given;

@SpringBootTest
@AutoConfigureMockMvc
public class WeaponControllerUnitTests {

    @Autowired
    private MockMvc mockMvc;

    // uses Mockito to create the Repositories mock
    // which we can fully control as to which response it will give to which method call
    @MockBean
    private WeaponRepository weaponRepository;
    @MockBean
    private AbilityRepository abilityRepository;
    @MockBean
    private AttributeRepository attributeRepository;

    private ObjectMapper mapper = new ObjectMapper();

    // Weapon
    Weapon testweapon = new Weapon("TestWeapon", "A test weapon", "https://3dwarehouse.sketchup.com/warehouse/v1.0/publiccontent/6a830cbc-7cce-450c-b26b-b6f764109e42",
            Arrays.asList(new Ability("Test ability", "Slash and dash, hit and crit. You deal a lot of damage.", "https://cdn3.iconfinder.com/data/icons/role-playing-game-4/340/ability_skill_swords_game_slash-512.png", "SlashDasher", "#FF1234")),
            Arrays.asList(new Attribute("Test attribute", 1.0)));
    Weapon testweapon2 = new Weapon("TestWeapon2", "Another test weapon", "https://static.wikia.nocookie.net/elderscrolls/images/4/41/RuefulAxe.png/revision/latest/scale-to-width-down/213?cb=20170830120037",
            Arrays.asList(new Ability("Test ability2", "Chop and mock, your targets run amok.", "https://static.wikia.nocookie.net/skyblock_roblox/images/3/36/Iron_War_Axe_Render_2000x2000.png/revision/latest/scale-to-width-down/350?cb=20200608154335", "ChopChop", "#FF5678")),
            Arrays.asList(new Attribute("Test attribute2", 0.5)));

    private List<Weapon> allWeapons = Arrays.asList(testweapon, testweapon2);

    @Test
    public void givenWeapon_whenGetWeaponByWeaponName_thenReturnJsonWeapon() throws Exception {
        given(weaponRepository.findByName("TestWeapon")).willReturn(testweapon);

        mockMvc.perform(get("/weapon/{name}", testweapon.getName()))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is("TestWeapon")))
                .andExpect(jsonPath("$.description", is("A test weapon")))
                .andExpect(jsonPath("$.imageUrl", is("https://3dwarehouse.sketchup.com/warehouse/v1.0/publiccontent/6a830cbc-7cce-450c-b26b-b6f764109e42")))

                .andExpect(jsonPath("$.abilities[0].name", is("Test ability")))
                .andExpect(jsonPath("$.abilities[0].description", is("Slash and dash, hit and crit. You deal a lot of damage.")))
                .andExpect(jsonPath("$.abilities[0].imageUrl", is("https://cdn3.iconfinder.com/data/icons/role-playing-game-4/340/ability_skill_swords_game_slash-512.png")))
                .andExpect(jsonPath("$.abilities[0].category", is("SlashDasher")))
                .andExpect(jsonPath("$.abilities[0].color", is("#FF1234")))

                .andExpect(jsonPath("$.attributes[0].name", is("Test attribute")))
                .andExpect(jsonPath("$.attributes[0].scaleFactor", is(1.0)));    }

    @Test
    public void givenWeapons_whenGetAllWeapons_thenReturnJsonWeapons() throws Exception {
        given(weaponRepository.findAll()).willReturn(allWeapons);

        mockMvc.perform(get("/weapons"))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name", is("TestWeapon")))
                .andExpect(jsonPath("$[0].description", is("A test weapon")))
                .andExpect(jsonPath("$[0].imageUrl", is("https://3dwarehouse.sketchup.com/warehouse/v1.0/publiccontent/6a830cbc-7cce-450c-b26b-b6f764109e42")))
                .andExpect(jsonPath("$[0].abilities[0].name", is("Test ability")))
                .andExpect(jsonPath("$[0].abilities[0].description", is("Slash and dash, hit and crit. You deal a lot of damage.")))
                .andExpect(jsonPath("$[0].abilities[0].imageUrl", is("https://cdn3.iconfinder.com/data/icons/role-playing-game-4/340/ability_skill_swords_game_slash-512.png")))
                .andExpect(jsonPath("$[0].abilities[0].category", is("SlashDasher")))
                .andExpect(jsonPath("$[0].abilities[0].color", is("#FF1234")))
                .andExpect(jsonPath("$[0].attributes[0].name", is("Test attribute")))
                .andExpect(jsonPath("$[0].attributes[0].scaleFactor", is(1.0)))

                .andExpect(jsonPath("$[1].name", is("TestWeapon2")))
                .andExpect(jsonPath("$[1].description", is("Another test weapon")))
                .andExpect(jsonPath("$[1].imageUrl", is("https://static.wikia.nocookie.net/elderscrolls/images/4/41/RuefulAxe.png/revision/latest/scale-to-width-down/213?cb=20170830120037")))
                .andExpect(jsonPath("$[1].abilities[0].name", is("Test ability2")))
                .andExpect(jsonPath("$[1].abilities[0].description", is("Chop and mock, your targets run amok.")))
                .andExpect(jsonPath("$[1].abilities[0].imageUrl", is("https://static.wikia.nocookie.net/skyblock_roblox/images/3/36/Iron_War_Axe_Render_2000x2000.png/revision/latest/scale-to-width-down/350?cb=20200608154335")))
                .andExpect(jsonPath("$[1].abilities[0].category", is("ChopChop")))
                .andExpect(jsonPath("$[1].abilities[0].color", is("#FF5678")))
                .andExpect(jsonPath("$[1].attributes[0].name", is("Test attribute2")))
                .andExpect(jsonPath("$[1].attributes[0].scaleFactor", is(0.5)));
    }
}

