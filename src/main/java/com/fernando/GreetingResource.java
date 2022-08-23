package com.fernando;

import com.fernando.dto.Pessoa;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @GET
    @Path("/p")
    @Produces(MediaType.APPLICATION_JSON)
    public Pessoa hello2() {
        Pessoa pessoa = new Pessoa();
        pessoa.setEmail("teste");
        pessoa.setNome("teste");
        return pessoa;
    }
}