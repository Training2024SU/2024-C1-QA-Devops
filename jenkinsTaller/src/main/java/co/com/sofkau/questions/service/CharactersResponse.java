package co.com.sofkau.questions.service;


import co.com.sofkau.models.service.Character;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

public class CharactersResponse implements Question<Iterable<Character>> {

    public static CharactersResponse was() {
        return new CharactersResponse();
    }

    public List<Character> answeredBy(Actor actor) {
        return SerenityRest.lastResponse().jsonPath().getList("data.results", Character.class);
    }
}
