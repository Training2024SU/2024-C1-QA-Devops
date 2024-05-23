package co.com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPaginaPrincipal implements Task {
    private String url;
    public AbrirPaginaPrincipal conLaUrl(String url){
        this.url = url;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.url(url));
    }

    public static AbrirPaginaPrincipal abrirPaginaPrincipal(){
        return new AbrirPaginaPrincipal();
    }
}