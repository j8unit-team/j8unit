package org.j8unit.repository.javax.imageio.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceRegistryClassTest
implements org.j8unit.repository.javax.imageio.spi.ServiceRegistryClassTests<javax.imageio.spi.ServiceRegistry> {

    @RunWith(J8Unit4.class)
    public static class FilterClassTest
    implements org.j8unit.repository.javax.imageio.spi.ServiceRegistryClassTests.FilterClassTests<javax.imageio.spi.ServiceRegistry.Filter> {

        @Override
        public Class<javax.imageio.spi.ServiceRegistry.Filter> createNewSUT() {
            return javax.imageio.spi.ServiceRegistry.Filter.class;
        }

    }

    @Override
    public Class<javax.imageio.spi.ServiceRegistry> createNewSUT() {
        return javax.imageio.spi.ServiceRegistry.class;
    }

}
