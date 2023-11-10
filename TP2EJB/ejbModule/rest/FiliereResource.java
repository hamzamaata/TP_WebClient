package rest;

import jakarta.ejb.EJB;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import service.FiliereService;

import java.util.List;

import entities.Filiere;

@Path("/filieres")
@Produces("application/json")
@Consumes("application/json")
public class FiliereResource {
    @EJB
    private FiliereService filiereService;

    @POST
    public Response createFiliere(Filiere filiere) {
        filiere = filiereService.createFiliere(filiere);
        return Response.status(Response.Status.CREATED).entity(filiere).build();
    }

    @PUT
    @Path("/{id}")
    public Response updateFiliere(@PathParam("id") Long filiereId, Filiere filiere) {
        filiere.setId(filiereId);
        filiere = filiereService.updateFiliere(filiere);
        return Response.ok().entity(filiere).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteFiliere(@PathParam("id") Long filiereId) {
        filiereService.deleteFiliere(filiereId);
        return Response.noContent().build();
    }

    @GET
    public List<Filiere> getAllFilieres() {
        return filiereService.getAllFilieres();
    }

    @GET
    @Path("/{id}")
    public Filiere getFiliereById(@PathParam("id") Long filiereId) {
        return filiereService.getFiliereById(filiereId);
    }
}