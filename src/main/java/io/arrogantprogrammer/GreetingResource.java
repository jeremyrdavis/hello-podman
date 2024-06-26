package io.arrogantprogrammer;

import io.quarkus.logging.Log;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Path("/hello")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class GreetingResource {

    private List<Greeting> allGreetings;

    @POST
    public Greeting addGreeting(Greeting greeting) {
        if(allGreetings == null || allGreetings.isEmpty()) {
            initializeGreetings();
        }
        Log.infof("Adding %s", greeting);
        allGreetings.add(greeting);
        Log.infof("All greetings: %s", allGreetings.size());
        return greeting;
    }

    private void initializeGreetings() {
        allGreetings = new ArrayList<>(){{
            add(new Greeting("Roger", "Hello", "Southern Company"));
            add(new Greeting("Norman", "Bonjour", "Southern Company"));
        }};
    }

    @GET
    public Greeting hello() {
        if(allGreetings == null || allGreetings.isEmpty()) {
            initializeGreetings();
        }
        Greeting greeting = getGreeting();
        Log.infof("Returning %s", greeting);
        return greeting;
    }

    private Greeting getGreeting() {
        Random random = new Random();
        return allGreetings.get(random.nextInt(allGreetings.size()));
    }
}
