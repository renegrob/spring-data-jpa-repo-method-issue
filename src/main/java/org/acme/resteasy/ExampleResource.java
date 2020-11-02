package org.acme.resteasy;

import org.acme.resteasy.entities.ClassicCarEntity;
import org.acme.resteasy.springdata.ClassicCarRepository;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

@Path("/resteasy/hello")
public class ExampleResource {

    @Inject
    ClassicCarRepository classicCarRepository;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }

    @Path("cars/classic/{brandId}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String classicCars(@PathParam("brandId") String brandId, @QueryParam("horsePower") int horsePower) {
        List<ClassicCarEntity> cars = classicCarRepository.findByCarBrandIdAndHorsePowerGreaterThan(brandId, horsePower);
        return cars.stream().map(ClassicCarEntity::getName).collect(Collectors.joining(", "));
    }

    @Path("cars/team/{teamName}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String classicCars(@PathParam("teamName") String teamName) {
        List<ClassicCarEntity> cars = classicCarRepository.findByRaceCarDriverTeamName(teamName);
        return cars.stream().map(ClassicCarEntity::getName).collect(Collectors.joining(", "));
    }
}