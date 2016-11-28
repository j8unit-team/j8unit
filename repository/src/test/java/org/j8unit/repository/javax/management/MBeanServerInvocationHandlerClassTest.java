package org.j8unit.repository.javax.management;

import javax.management.MBeanServerInvocationHandler;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MBeanServerInvocationHandler} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.MBeanServerInvocationHandlerClassTests}).
 */
@RunWith(J8Unit4.class)
public class MBeanServerInvocationHandlerClassTest
implements MBeanServerInvocationHandlerClassTests<MBeanServerInvocationHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.MBeanServerInvocationHandler]

    @Override
    public Class<MBeanServerInvocationHandler> createNewSUT() {
        return MBeanServerInvocationHandler.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.MBeanServerInvocationHandler#MBeanServerInvocationHandler(javax.management.MBeanServerConnection, javax.management.ObjectName)
     * public
     * javax.management.MBeanServerInvocationHandler(javax.management.MBeanServerConnection,javax.management.ObjectName)}.
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
    public void create_MBeanServerInvocationHandler_MBeanServerConnection_ObjectName()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MBeanServerInvocationHandler sut = null; // = new
                                                       // MBeanServerInvocationHandler(javax.management.MBeanServerConnection,
                                                       // javax.management.ObjectName);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.MBeanServerInvocationHandler#MBeanServerInvocationHandler(javax.management.MBeanServerConnection, javax.management.ObjectName, boolean)
     * public
     * javax.management.MBeanServerInvocationHandler(javax.management.MBeanServerConnection,javax.management.ObjectName,boolean)}.
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
    public void create_MBeanServerInvocationHandler_MBeanServerConnection_ObjectName_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MBeanServerInvocationHandler sut = null; // = new
                                                       // MBeanServerInvocationHandler(javax.management.MBeanServerConnection,
                                                       // javax.management.ObjectName, boolean);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.management.MBeanServerInvocationHandler#newProxyInstance(javax.management.MBeanServerConnection, javax.management.ObjectName, Class, boolean)
     * public static <T> T
     * javax.management.MBeanServerInvocationHandler.newProxyInstance(javax.management.MBeanServerConnection,javax.management.ObjectName,java.lang.Class<T>,boolean)}.
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
    public void test_newProxyInstance_MBeanServerConnection_ObjectName_Class_boolean()
    throws Exception {
        // write some test for {@link
        // javax.management.MBeanServerInvocationHandler#newProxyInstance(javax.management.MBeanServerConnection,
        // javax.management.ObjectName, Class, boolean)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.MBeanServerInvocationHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.MBeanServerInvocationHandler]

}
