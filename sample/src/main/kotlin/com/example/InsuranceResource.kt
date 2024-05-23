package com.example

import jakarta.enterprise.context.ApplicationScoped
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.PathParam
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType


@ApplicationScoped
@Path("/insurance")
class InsuranceResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{policyId}")
    fun getPolicy(@PathParam("policyId") policyId: String): Policy {
        // This is a simple stub. In a real application, you would pull this data from your database
        return Policy(policyId, "Car Insurance", "This is a car insurance policy.")
    }

    data class Policy(val id: String, val type: String, val description: String)
}