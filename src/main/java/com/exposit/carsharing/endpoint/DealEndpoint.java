package com.exposit.carsharing.endpoint;

import com.exposit.carsharing.dto.DealRequest;
import com.exposit.carsharing.exception.EntityNotFoundException;
import com.exposit.carsharing.exception.PrivilegeException;
import com.exposit.carsharing.exception.UnauthorizedException;
import com.exposit.carsharing.service.DealService;
import com.exposit.carsharing.service.SecurityService;
import org.springframework.stereotype.Component;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Component
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
@Path("/deal")
public class DealEndpoint {
    private final DealService dealService;
    private final SecurityService securityService;

    public DealEndpoint(DealService dealService, SecurityService securityService) {
        this.dealService = dealService;
        this.securityService = securityService;
    }

    @POST
    @Path("/{ad_id}/{owner_id}")
    public Response createDeal(@PathParam("ad_id") Long adId, @PathParam("owner_id") Long ownerId,
                               @Valid DealRequest dealRequest) throws EntityNotFoundException, UnauthorizedException {
        Long customerId = securityService.getPrincipalId();
        dealService.create(dealRequest, adId, ownerId, customerId);
        return Response.status(201).entity(dealRequest).build();
    }

    @GET
    public Response getAllDeals() {
        return Response.status(200).entity(dealService.getAll()).build();
    }

    @GET
    @Path("/my")
    public Response getAllMyDeals() throws EntityNotFoundException, UnauthorizedException {
        Long customerId = securityService.getPrincipalId();
        return Response.status(200).entity(dealService.getAllByCustomer(customerId)).build();
    }

    @GET
    @Path("/by-me")
    public Response getAllDealsWithMe() throws EntityNotFoundException, UnauthorizedException {
        Long ownerId = securityService.getPrincipalId();
        return Response.status(200).entity(dealService.getAllByOwner(ownerId)).build();
    }

    @GET
    @Path("{id}")
    public Response getDeal(@PathParam("id") Long dealId)
            throws EntityNotFoundException, UnauthorizedException, PrivilegeException {
        Long principalId = securityService.getPrincipalId();
        return Response.status(200).entity(dealService.get(dealId, principalId)).build();
    }
}
