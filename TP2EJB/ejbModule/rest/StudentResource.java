package rest;

import jakarta.ejb.EJB;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import service.StudentService;

import java.util.List;

import entities.Student;

@Path("/students")
@Produces("application/json")
@Consumes("application/json")
public class StudentResource {
    @EJB
    private StudentService studentService;

    @POST
    public Response createStudent(Student student) {
        student = studentService.createStudent(student);
        return Response.status(Response.Status.CREATED).entity(student).build();
    }

    @PUT
    @Path("/{id}")
    public Response updateStudent(@PathParam("id") Long studentId, Student student) {
        student.setId(studentId);
        student = studentService.updateStudent(student);
        return Response.ok().entity(student).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteStudent(@PathParam("id") Long studentId) {
        studentService.deleteStudent(studentId);
        return Response.noContent().build();
    }

    @GET
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GET
    @Path("/{id}")
    public Student getStudentById(@PathParam("id") Long studentId) {
        return studentService.getStudentById(studentId);
    }
}