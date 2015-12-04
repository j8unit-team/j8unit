package org.j8unit.repository.javax.sql.rowset.spi;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.sql.rowset.spi.SyncFactory class javax.sql.rowset.spi.SyncFactory},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.sql.rowset.spi.SyncFactoryTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself.
 * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
 * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
 * provides a corresponding, inheritable test method:
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
 * runtime constraints and further class specific requirements.
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.sql.rowset.spi.SyncFactoryTests
 */
@Category(J8UnitRepository.class)
public abstract interface SyncFactoryClassTests<SUT extends Class<? extends javax.sql.rowset.spi.SyncFactory>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.sql.rowset.spi.SyncFactory> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.sql.rowset.spi.SyncFactory.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.spi.SyncFactory#setJNDIContext(javax.naming.Context) public static synchronized void javax.sql.rowset.spi.SyncFactory.setJNDIContext(javax.naming.Context) throws javax.sql.rowset.spi.SyncFactoryException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setJNDIContext_Context() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.spi.SyncFactory#unregisterProvider(java.lang.String) public static synchronized void javax.sql.rowset.spi.SyncFactory.unregisterProvider(java.lang.String) throws javax.sql.rowset.spi.SyncFactoryException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unregisterProvider_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.spi.SyncFactory#setLogger(java.util.logging.Logger,java.util.logging.Level) public static void javax.sql.rowset.spi.SyncFactory.setLogger(java.util.logging.Logger,java.util.logging.Level)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setLogger_Logger_Level() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.spi.SyncFactory#setLogger(java.util.logging.Logger) public static void javax.sql.rowset.spi.SyncFactory.setLogger(java.util.logging.Logger)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setLogger_Logger() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.spi.SyncFactory#getSyncFactory() public static javax.sql.rowset.spi.SyncFactory javax.sql.rowset.spi.SyncFactory.getSyncFactory()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSyncFactory() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.spi.SyncFactory#getLogger() public static java.util.logging.Logger javax.sql.rowset.spi.SyncFactory.getLogger() throws javax.sql.rowset.spi.SyncFactoryException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLogger() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.spi.SyncFactory#getInstance(java.lang.String) public static javax.sql.rowset.spi.SyncProvider javax.sql.rowset.spi.SyncFactory.getInstance(java.lang.String) throws javax.sql.rowset.spi.SyncFactoryException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstance_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.spi.SyncFactory#registerProvider(java.lang.String) public static synchronized void javax.sql.rowset.spi.SyncFactory.registerProvider(java.lang.String) throws javax.sql.rowset.spi.SyncFactoryException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_registerProvider_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.spi.SyncFactory#getRegisteredProviders() public static java.util.Enumeration javax.sql.rowset.spi.SyncFactory.getRegisteredProviders() throws javax.sql.rowset.spi.SyncFactoryException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRegisteredProviders() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
