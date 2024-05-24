package co.com.sofkau.stepDefinitions;

import co.com.sofkau.models.service.Character;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class ParameterDefinitions {
    @DataTableType
    public Character mapToCharacter(Map<String, String> heroesData){
        return new Character(
                heroesData.get("id"),
                heroesData.get("name")
        );
    }
}
