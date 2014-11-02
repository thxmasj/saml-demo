package it.thomasjohansen.hello;

import it.thomasjohansen.hello.types.HelloRequest;
import it.thomasjohansen.hello.types.HelloResponse;

import javax.annotation.Resource;
import javax.xml.ws.WebServiceContext;
import java.security.Principal;

public class HelloImpl implements Hello {

    @Resource
    WebServiceContext context;

    @Override
    public HelloResponse sayHello(HelloRequest request) {
        String responseText = null;
        if (context == null) {
            responseText = "I don't know who you are!";
        } else {
            Principal p = context.getUserPrincipal();
            if (p == null)
                responseText = "Are you hiding?";
            else
                responseText = "Howdy, " + p.getName() + "!";
        }
        HelloResponse response = new HelloResponse();
        response.setResponseText(responseText);
        return response;
    }

}
