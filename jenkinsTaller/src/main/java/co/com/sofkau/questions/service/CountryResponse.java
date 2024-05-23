package co.com.sofkau.questions.service;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CountryResponse implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        Response response = SerenityRest.lastResponse();
        String countryName = response.xmlPath().getString("Envelope.Body.CountryNameResponse.CountryNameResult");
        return countryName;
    }

    public static CountryResponse containsName(){
        return new CountryResponse();
    }
}
