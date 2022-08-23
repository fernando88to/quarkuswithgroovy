package com.fernando

import com.fernando.dto.Pessoa
import groovy.transform.CompileStatic

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@CompileStatic
@Path("/hello2")
class IndexResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEas";
    }


    @GET
    @Path("/p")
    @Produces(MediaType.APPLICATION_JSON)
    Pessoa hello2() {
        Pessoa pessoa = new Pessoa();
        pessoa.setEmail("teste");
        pessoa.setNome("23423423");
        return pessoa;
    }
}
