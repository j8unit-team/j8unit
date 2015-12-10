package org.j8unit.repository.javax.imageio.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceRegistryTest
implements org.j8unit.repository.javax.imageio.spi.ServiceRegistryTests<javax.imageio.spi.ServiceRegistry> {

    @Override
    public javax.imageio.spi.ServiceRegistry createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.imageio.spi.ServiceRegistry] available.");
    }

}
