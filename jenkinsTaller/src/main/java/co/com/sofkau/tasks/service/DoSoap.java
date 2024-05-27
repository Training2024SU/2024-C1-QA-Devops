package co.com.sofkau.tasks.service;

import co.com.sofkau.interactions.OurSoap;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import java.util.Map;

public class DoSoap implements Task {
    private String resource;
    private Object body;
    private Map<String, Object> headers;

    public DoSoap withTheResource(String resource) {
        this.resource = resource;
        return this;
    }

    public DoSoap andTheBody(Object body) {
        this.body = body;
        return this;
    }

    public DoSoap andHeaders(Map<String, Object> headers) {
        this.headers = headers;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                OurSoap.resource(resource).with(
                        requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .headers(headers)
                                .relaxedHTTPSValidation()
                                .body(body)
                )

        );

    }

    public static DoSoap doSoap() {
        return new DoSoap();
    }
}
