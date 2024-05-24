package co.com.sofkau.stepDefinitions.service;

import co.com.sofkau.interactions.OurGet;
import co.com.sofkau.stepDefinitions.SetupService;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofkau.utils.Constante.COMIC_ENDPOINT;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;

public class GetSingleComicStepDefinition extends SetupService {
    @When("sends a GET request using id {int}")
    public void sendsAGETRequestUsingId(Integer comicId) {
        String apiKey = System.getenv("MARVEL_KEY");
        String HASH = System.getenv("MARVEL_HASH");
        actor.attemptsTo(
                OurGet.resource(COMIC_ENDPOINT).with(request ->
                        request.queryParam("ts", 1)
                                .queryParam("apikey", apiKey)
                                .queryParam("hash", HASH)
                                .pathParam("id", comicId)
                )
        );
    }

    @Then("comic name should be {string}")
    public void comicNameShouldBe(String expectedComicTitle) {
        actor.should(
                seeThatResponse("Title should be equal",
                        response -> response
                                .body("data.results[0].title", equalTo(expectedComicTitle)))
        );
    }
}
