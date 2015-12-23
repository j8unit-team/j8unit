package org.j8unit.repository.javax.management;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.management.MBeanServerInvocationHandler class
 * javax.management.MBeanServerInvocationHandler}, containing all class relevant test methods (at least the test methods
 * of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface
 * containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.management.MBeanServerInvocationHandlerTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable
 * test method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @see org.j8unit.repository.javax.management.MBeanServerInvocationHandlerTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.management.MBeanServerInvocationHandler
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MBeanServerInvocationHandlerClassTests<SUT extends javax.management.MBeanServerInvocationHandler>
extends org.j8unit.repository.java.lang.reflect.InvocationHandlerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerInvocationHandler#MBeanServerInvocationHandler(javax.management.MBeanServerConnection, javax.management.ObjectName)
     * public
     * javax.management.MBeanServerInvocationHandler(javax.management.MBeanServerConnection,javax.management.ObjectName)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.MBeanServerInvocationHandler#MBeanServerInvocationHandler(javax.management.
     *             MBeanServerConnection, javax.management.ObjectName)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MBeanServerInvocationHandler_MBeanServerConnection_ObjectName()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.MBeanServerInvocationHandler sut = null; // = new
                                                                        // MBeanServerInvocationHandler(javax.management.MBeanServerConnection,
                                                                        // javax.management.ObjectName);
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerInvocationHandler#MBeanServerInvocationHandler(javax.management.MBeanServerConnection, javax.management.ObjectName, boolean)
     * public
     * javax.management.MBeanServerInvocationHandler(javax.management.MBeanServerConnection,javax.management.ObjectName,boolean)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.MBeanServerInvocationHandler#MBeanServerInvocationHandler(javax.management.
     *             MBeanServerConnection, javax.management.ObjectName, boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MBeanServerInvocationHandler_MBeanServerConnection_ObjectName_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.MBeanServerInvocationHandler sut = null; // = new
                                                                        // MBeanServerInvocationHandler(javax.management.MBeanServerConnection,
                                                                        // javax.management.ObjectName, boolean);
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerInvocationHandler#newProxyInstance(javax.management.MBeanServerConnection, javax.management.ObjectName, java.lang.Class, boolean)
     * public static java.lang.Object
     * javax.management.MBeanServerInvocationHandler.newProxyInstance(javax.management.MBeanServerConnection,javax.management.ObjectName,java.lang.Class,boolean)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.MBeanServerInvocationHandler#newProxyInstance(javax.management.
     *             MBeanServerConnection, javax.management.ObjectName, java.lang.Class, boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newProxyInstance_MBeanServerConnection_ObjectName_Class_boolean()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.management.MBeanServerInvocationHandler#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.management.MBeanServerInvocationHandler.class.isAssignableFrom(sut));
    }

}
