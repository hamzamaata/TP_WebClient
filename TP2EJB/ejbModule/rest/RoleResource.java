package rest;

import jakarta.ejb.EJB;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import service.RoleService;
import entities.Role;

@Path("/roles")
@Produces("application/json")
@Consumes("application/json")
public class RoleResource {
    @EJB
    private RoleService roleService;

    @POST
    public Response createRole(Role role) {
        role = roleService.createRole(role);
        return Response.status(Response.Status.CREATED).entity(role).build();
    }

    @PUT
    @Path("/{id}")
    public Response updateRole(@PathParam("id") Long roleId, Role role) {
        role.setId(roleId);
        role = roleService.updateRole(role);
        return Response.ok().entity(role).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteRole(@PathParam("id") Long roleId) {
        roleService.deleteRole(roleId);
        return Response.noContent().build();
    }
}