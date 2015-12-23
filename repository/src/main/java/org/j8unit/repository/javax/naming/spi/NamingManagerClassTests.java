package org.j8unit.repository.javax.naming.spi;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.naming.spi.NamingManager class javax.naming.spi.NamingManager},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.naming.spi.NamingManagerTests}.
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
 * @see org.j8unit.repository.javax.naming.spi.NamingManagerTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.naming.spi.NamingManager
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NamingManagerClassTests<SUT extends javax.naming.spi.NamingManager>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.naming.spi.NamingManager#getContinuationContext(javax.naming.CannotProceedException)
     * public static javax.naming.Context
     * javax.naming.spi.NamingManager.getContinuationContext(javax.naming.CannotProceedException) throws
     * javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.naming.spi.NamingManager#getContinuationContext(javax.naming.CannotProceedException)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getContinuationContext_CannotProceedException()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.spi.NamingManager#getInitialContext(java.util.Hashtable) public static
     * javax.naming.Context javax.naming.spi.NamingManager.getInitialContext(java.util.Hashtable) throws
     * javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.naming.spi.NamingManager#getInitialContext(java.util.Hashtable)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInitialContext_Hashtable()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.naming.spi.NamingManager#getObjectInstance(java.lang.Object, javax.naming.Name, javax.naming.Context, java.util.Hashtable)
     * public static java.lang.Object
     * javax.naming.spi.NamingManager.getObjectInstance(java.lang.Object,javax.naming.Name,javax.naming.Context,java.util.Hashtable)
     * throws java.lang.Exception}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.naming.spi.NamingManager#getObjectInstance(java.lang.Object, javax.naming.Name,
     *             javax.naming.Context, java.util.Hashtable)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getObjectInstance_Object_Name_Context_Hashtable()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.naming.spi.NamingManager#getStateToBind(java.lang.Object, javax.naming.Name, javax.naming.Context, java.util.Hashtable)
     * public static java.lang.Object
     * javax.naming.spi.NamingManager.getStateToBind(java.lang.Object,javax.naming.Name,javax.naming.Context,java.util.Hashtable)
     * throws javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.naming.spi.NamingManager#getStateToBind(java.lang.Object, javax.naming.Name,
     *             javax.naming.Context, java.util.Hashtable)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStateToBind_Object_Name_Context_Hashtable()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.spi.NamingManager#getURLContext(java.lang.String, java.util.Hashtable) public
     * static javax.naming.Context javax.naming.spi.NamingManager.getURLContext(java.lang.String,java.util.Hashtable)
     * throws javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.naming.spi.NamingManager#getURLContext(java.lang.String, java.util.Hashtable)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getURLContext_String_Hashtable()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.spi.NamingManager#hasInitialContextFactoryBuilder() public static boolean
     * javax.naming.spi.NamingManager.hasInitialContextFactoryBuilder()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.naming.spi.NamingManager#hasInitialContextFactoryBuilder()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hasInitialContextFactoryBuilder()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.naming.spi.NamingManager#setInitialContextFactoryBuilder(javax.naming.spi.InitialContextFactoryBuilder)
     * public static synchronized void
     * javax.naming.spi.NamingManager.setInitialContextFactoryBuilder(javax.naming.spi.InitialContextFactoryBuilder)
     * throws javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.naming.spi.NamingManager#setInitialContextFactoryBuilder(javax.naming.spi.
     *             InitialContextFactoryBuilder)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setInitialContextFactoryBuilder_InitialContextFactoryBuilder()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.naming.spi.NamingManager#setObjectFactoryBuilder(javax.naming.spi.ObjectFactoryBuilder) public
     * static synchronized void
     * javax.naming.spi.NamingManager.setObjectFactoryBuilder(javax.naming.spi.ObjectFactoryBuilder) throws
     * javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.naming.spi.NamingManager#setObjectFactoryBuilder(javax.naming.spi.ObjectFactoryBuilder)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setObjectFactoryBuilder_ObjectFactoryBuilder()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.naming.spi.NamingManager#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.naming.spi.NamingManager.class.isAssignableFrom(sut));
    }

}
