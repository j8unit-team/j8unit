package org.j8unit.repository.java.security;

import java.security.Provider;
import java.security.Provider.Service;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProviderTest
implements org.j8unit.repository.java.security.ProviderTests<Provider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.Provider]

    @Override
    public Provider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.Provider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.Provider]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.Provider]

    @RunWith(J8Unit4.class)
    public static class ServiceTest
    implements org.j8unit.repository.java.security.ProviderTests.ServiceTests<Service> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.Provider$Service]

        @Override
        public Service createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.Provider.Service], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.Provider$Service]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.Provider$Service]

    }

}
