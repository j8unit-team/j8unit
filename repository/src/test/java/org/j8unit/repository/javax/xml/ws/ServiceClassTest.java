package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.Service;
import javax.xml.ws.Service.Mode;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Service} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.ws.ServiceClassTests}).
 */
@RunWith(J8Unit4.class)
public class ServiceClassTest
implements ServiceClassTests<Service> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.Service]

    @Override
    public Class<Service> createNewSUT() {
        return Service.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.ws.Service#create(javax.xml.namespace.QName, javax.xml.ws.WebServiceFeature...) public static
     * javax.xml.ws.Service javax.xml.ws.Service.create(javax.xml.namespace.QName,javax.xml.ws.WebServiceFeature...)}.
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
    public void test_create_QName_WebServiceFeatureArray()
    throws Exception {
        // write some test for {@link javax.xml.ws.Service#create(javax.xml.namespace.QName,
        // javax.xml.ws.WebServiceFeature...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.ws.Service#create(java.net.URL, javax.xml.namespace.QName) public static javax.xml.ws.Service
     * javax.xml.ws.Service.create(java.net.URL,javax.xml.namespace.QName)}.
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
    public void test_create_URL_QName()
    throws Exception {
        // write some test for {@link javax.xml.ws.Service#create(java.net.URL, javax.xml.namespace.QName)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.ws.Service#create(java.net.URL, javax.xml.namespace.QName, javax.xml.ws.WebServiceFeature...)
     * public static javax.xml.ws.Service
     * javax.xml.ws.Service.create(java.net.URL,javax.xml.namespace.QName,javax.xml.ws.WebServiceFeature...)}.
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
    public void test_create_URL_QName_WebServiceFeatureArray()
    throws Exception {
        // write some test for {@link javax.xml.ws.Service#create(java.net.URL, javax.xml.namespace.QName,
        // javax.xml.ws.WebServiceFeature...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.ws.Service#create(javax.xml.namespace.QName) public static javax.xml.ws.Service
     * javax.xml.ws.Service.create(javax.xml.namespace.QName)}.
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
    public void test_create_QName()
    throws Exception {
        // write some test for {@link javax.xml.ws.Service#create(javax.xml.namespace.QName)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.Service]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.Service]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Mode} (by simply reusing the J8Unit
     * test interface {@link org.j8unit.repository.javax.xml.ws.ServiceClassTests.ModeClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class ModeClassTest
    implements org.j8unit.repository.javax.xml.ws.ServiceClassTests.ModeClassTests<Mode> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.Service$Mode]

        @Override
        public Class<Mode> createNewSUT() {
            return Mode.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link javax.xml.ws.Service.Mode#valueOf(String) public
         * static javax.xml.ws.Service$Mode javax.xml.ws.Service$Mode.valueOf(java.lang.String)}.
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
        public void test_valueOf_String()
        throws Exception {
            // write some test for {@link javax.xml.ws.Service.Mode#valueOf(String)}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link javax.xml.ws.Service.Mode#values() public static
         * javax.xml.ws.Service$Mode[] javax.xml.ws.Service$Mode.values()}.
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
        public void test_values()
        throws Exception {
            // write some test for {@link javax.xml.ws.Service.Mode#values()}
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.Service$Mode]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.Service$Mode]

    }

}
