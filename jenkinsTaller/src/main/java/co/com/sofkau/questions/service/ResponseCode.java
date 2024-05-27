package co.com.sofkau.questions.service;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ResponseCode implements Question<Integer>{


    @Override
    public Integer answeredBy(Actor actor) {
        return SerenityRest.lastResponse().statusCode();
    }

    public static Question<Integer> was(){
        return new ResponseCode();
    }
}
