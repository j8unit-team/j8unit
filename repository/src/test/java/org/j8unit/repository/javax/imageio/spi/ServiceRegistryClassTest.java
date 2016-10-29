package org.j8unit.repository.javax.imageio.spi;

import javax.imageio.spi.ServiceRegistry;
import javax.imageio.spi.ServiceRegistry.Filter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceRegistryClassTest
implements org.j8unit.repository.javax.imageio.spi.ServiceRegistryClassTests<ServiceRegistry> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.spi.ServiceRegistry]

    @Override
    public Class<ServiceRegistry> createNewSUT() {
        return ServiceRegistry.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.imageio.spi.ServiceRegistry#ServiceRegistry(java.util.Iterator) public
     * javax.imageio.spi.ServiceRegistry(java.util.Iterator<java.lang.Class<?>>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_ServiceRegistry_Iterator()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ServiceRegistry sut = null; // = new ServiceRegistry(java.util.Iterator);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.imageio.spi.ServiceRegistry#lookupProviders(Class, ClassLoader) public static <T>
     * java.util.Iterator<T>
     * javax.imageio.spi.ServiceRegistry.lookupProviders(java.lang.Class<T>,java.lang.ClassLoader)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_lookupProviders_Class_ClassLoader()
    throws Exception {
        // write some test for {@link javax.imageio.spi.ServiceRegistry#lookupProviders(Class, ClassLoader)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.imageio.spi.ServiceRegistry#lookupProviders(Class) public static <T> java.util.Iterator<T>
     * javax.imageio.spi.ServiceRegistry.lookupProviders(java.lang.Class<T>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_lookupProviders_Class()
    throws Exception {
        // write some test for {@link javax.imageio.spi.ServiceRegistry#lookupProviders(Class)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.spi.ServiceRegistry]

    @RunWith(J8Unit4.class)
    public static class FilterClassTest
    implements org.j8unit.repository.javax.imageio.spi.ServiceRegistryClassTests.FilterClassTests<Filter> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.spi.ServiceRegistry$Filter]

        @Override
        public Class<Filter> createNewSUT() {
            return Filter.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.spi.ServiceRegistry$Filter]

    }

}
