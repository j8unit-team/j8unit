package org.j8unit.repository.javax.activation;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.activation.DataHandler class javax.activation.DataHandler},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.activation.DataHandlerTests}.
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
 * @see org.j8unit.repository.javax.activation.DataHandlerTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.activation.DataHandler
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DataHandlerClassTests<SUT extends javax.activation.DataHandler>
extends org.j8unit.repository.java.awt.datatransfer.TransferableClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.activation.DataHandler#DataHandler(javax.activation.DataSource) public
     * javax.activation.DataHandler(javax.activation.DataSource)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.activation.DataHandler#DataHandler(javax.activation.DataSource)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DataHandler_DataSource()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.activation.DataHandler sut = null; // = new DataHandler(javax.activation.DataSource);
    }

    /**
     * <p>
     * Test method for {@link javax.activation.DataHandler#DataHandler(java.lang.Object, java.lang.String) public
     * javax.activation.DataHandler(java.lang.Object,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.activation.DataHandler#DataHandler(java.lang.Object, java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DataHandler_Object_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.activation.DataHandler sut = null; // = new DataHandler(java.lang.Object, java.lang.String);
    }

    /**
     * <p>
     * Test method for {@link javax.activation.DataHandler#DataHandler(java.net.URL) public
     * javax.activation.DataHandler(java.net.URL)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.activation.DataHandler#DataHandler(java.net.URL)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DataHandler_URL()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.activation.DataHandler sut = null; // = new DataHandler(java.net.URL);
    }

    /**
     * <p>
     * Test method for
     * {@link javax.activation.DataHandler#setDataContentHandlerFactory(javax.activation.DataContentHandlerFactory)
     * public static synchronized void
     * javax.activation.DataHandler.setDataContentHandlerFactory(javax.activation.DataContentHandlerFactory)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.activation.DataHandler#setDataContentHandlerFactory(javax.activation.DataContentHandlerFactory)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDataContentHandlerFactory_DataContentHandlerFactory()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.activation.DataHandler#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.activation.DataHandler.class.isAssignableFrom(sut));
    }

}
