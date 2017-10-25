package com.exposit.carsharing.configuration;

import com.exposit.carsharing.endpoint.*;
import com.exposit.carsharing.exception.MyExceptionMapper;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/api")
@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        // -------------------- Endpoints -------------
        register(CreditCardEndpoint.class);
        register(DriverLicenseEndpoint.class);
        register(PassportDataEndpoint.class);
        register(ProfileEndpoint.class);
        register(AdEndpoint.class);
        register(DealEndpoint.class);
        register(CurrentConditionEndpoint.class);
        register(CarEndpoint.class);
        register(GeneralParametersEndpoint.class);
        register(TechnicalParametersEndpoint.class);
        register(AdminEndpoint.class);
        register(MyExceptionMapper.class);
    }
}
