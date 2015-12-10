package org.j8unit.repository.javax.naming;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.naming.InitialContext class javax.naming.InitialContext}, containing all class relevant
 * test methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.naming.InitialContextTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a> Thus,
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable test
 * method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.naming.InitialContextTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InitialContextClassTests<SUT extends javax.naming.InitialContext>
extends org.j8unit.repository.javax.naming.ContextClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link javax.naming.InitialContext#InitialContext() public javax.naming.InitialContext() throws
     * javax.naming.NamingException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_InitialContext()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.naming.InitialContext sut = null; // = new InitialContext();
    }

    /**
     * Test method for {@link javax.naming.InitialContext#InitialContext(java.util.Hashtable) public
     * javax.naming.InitialContext(java.util.Hashtable) throws javax.naming.NamingException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_InitialContext_Hashtable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.naming.InitialContext sut = null; // = new InitialContext(java.util.Hashtable);
    }

    /**
     * <p>
     * Test method for {@link javax.naming.InitialContext#doLookup(javax.naming.Name) public static java.lang.Object
     * javax.naming.InitialContext.doLookup(javax.naming.Name) throws javax.naming.NamingException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_doLookup_Name()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.InitialContext#doLookup(java.lang.String) public static java.lang.Object
     * javax.naming.InitialContext.doLookup(java.lang.String) throws javax.naming.NamingException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_doLookup_String()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.naming.InitialContext.class.isAssignableFrom(sut));
    }

}
