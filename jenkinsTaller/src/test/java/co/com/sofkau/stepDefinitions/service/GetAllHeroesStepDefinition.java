package co.com.sofkau.stepDefinitions.service;

import co.com.sofkau.interactions.OurGet;
import co.com.sofkau.models.service.Character;
import co.com.sofkau.questions.service.CharactersResponse;
import co.com.sofkau.stepDefinitions.SetupService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;

import java.util.List;

import static co.com.sofkau.utils.Constante.CHARACTERS_ENDPOINT;
import static co.com.sofkau.utils.Constante.MARVEL_BASE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.hasItems;

public class GetAllHeroesStepDefinition extends SetupService {

    @Given("the user is connected to the Marvel Developer API")
    public void theUserIsConnectedToTheMarvelDeveloperAPI() {
        setupService(MARVEL_BASE);
    }

    @When("sends a GET request to retrieve all heroes")
    public void sendsAGETRequestToRetrieveAllHeroes() {
        String apiKey = System.getenv("MARVEL_KEY");
        String HASH = System.getenv("MARVEL_HASH");
        actor.attemptsTo(
                OurGet.resource(CHARACTERS_ENDPOINT).with(request ->
                        request.queryParams(
                                "ts", 1,
                                "apikey", apiKey,
                                "hash", HASH
                        )
                )
        );
    }

    @Then("response should contain information about all heroes including")
    public void responseShouldContainInformationAboutAllHeroesIncluding(List<Character> expectedCharacters) {
        // converts list to array
        Character[] expectedArray = expectedCharacters.toArray(new Character[0]);
        actor.should(seeThat(
                CharactersResponse.was(), hasItems(expectedArray)
        ));
    }

    @Then("should receive a response of {int}")
    public void shouldReceiveAResponseOf(Integer statusCode) {
        SerenityRest.then().statusCode(statusCode);
    }
}