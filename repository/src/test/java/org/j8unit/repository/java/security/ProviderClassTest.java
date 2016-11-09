package org.j8unit.repository.java.security;

import java.security.Provider;
import java.security.Provider.Service;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Provider} (by simply reusing the J8Unit
 * test interface {@link ProviderClassTests}).
 */

@RunWith(J8Unit4.class)
public class ProviderClassTest
implements ProviderClassTests<Provider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.Provider]

    @Override
    public Class<Provider> createNewSUT() {
        return Provider.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.Provider]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.Provider]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Service} (by simply reusing the
     * J8Unit test interface {@link ServiceClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ServiceClassTest
    implements ServiceClassTests<Service> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.Provider$Service]

        @Override
        public Class<Service> createNewSUT() {
            return Service.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link java.security.Provider.Service#Service(java.security.Provider, String, String, String, java.util.List, java.util.Map)
         * public
         * java.security.Provider$Service(java.security.Provider,java.lang.String,java.lang.String,java.lang.String,java.util.List<java.lang.String>,java.util.Map<java.lang.String,
         * java.lang.String>)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_Service_Provider_String_String_String_List_Map()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final Service sut = null; // = new Service(java.security.Provider, String, String, String, java.util.List,
                                      // java.util.Map);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.Provider$Service]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.security.Provider$Service]

    }

}
