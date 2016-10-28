package org.j8unit.repository.javax.imageio.spi;

import javax.imageio.spi.ServiceRegistry;
import javax.imageio.spi.ServiceRegistry.Filter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceRegistryTest
implements org.j8unit.repository.javax.imageio.spi.ServiceRegistryTests<ServiceRegistry> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.spi.ServiceRegistry]

    @Override
    public ServiceRegistry createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.imageio.spi.ServiceRegistry], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.spi.ServiceRegistry]

    @RunWith(J8Unit4.class)
    public static class FilterTest
    implements org.j8unit.repository.javax.imageio.spi.ServiceRegistryTests.FilterTests<Filter> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.spi.ServiceRegistry$Filter]

        @Override
        public Filter createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.imageio.spi.ServiceRegistry.Filter], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.spi.ServiceRegistry$Filter]

    }

}
