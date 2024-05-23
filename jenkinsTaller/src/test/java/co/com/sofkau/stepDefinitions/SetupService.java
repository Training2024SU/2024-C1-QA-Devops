package co.com.sofkau.stepDefinitions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import java.util.HashMap;

public class SetupService {

    protected static final Actor actor = new Actor("Devon");

    protected void setupService(String urlBase){
        actor.can(CallAnApi.at(urlBase));
    }

    protected HashMap<String, Object> headers(){
        HashMap<String, Object> headersCollection = new HashMap<>();
        headersCollection.put("Content-Type","text/xml;charset=UTF-8");
        headersCollection.put("SOAPAction","");
        return headersCollection;
    }

    protected HashMap<String, Object> headers(String header){
        HashMap<String, Object> headersCollection = new HashMap<>();
        headersCollection.put("Content-Type","text/xml;charset=UTF-8");
        headersCollection.put("SOAPAction", header);
        return headersCollection;
    }
}
