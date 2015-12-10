package org.j8unit.repository.javax.management;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.management.ObjectName class javax.management.ObjectName}, containing all class relevant
 * test methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.management.ObjectNameTests}.
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
 * @see org.j8unit.repository.javax.management.ObjectNameTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ObjectNameClassTests<SUT extends javax.management.ObjectName>
extends org.j8unit.repository.java.lang.ComparableClassTests<SUT, javax.management.ObjectName>, org.j8unit.repository.javax.management.QueryExpClassTests<SUT>,
org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link javax.management.ObjectName#ObjectName(java.lang.String) public
     * javax.management.ObjectName(java.lang.String) throws javax.management.MalformedObjectNameException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ObjectName_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.ObjectName sut = null; // = new ObjectName(java.lang.String);
    }

    /**
     * Test method for {@link javax.management.ObjectName#ObjectName(java.lang.String,java.util.Hashtable) public
     * javax.management.ObjectName(java.lang.String,java.util.Hashtable) throws
     * javax.management.MalformedObjectNameException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ObjectName_String_Hashtable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.ObjectName sut = null; // = new ObjectName(java.lang.String,java.util.Hashtable);
    }

    /**
     * Test method for {@link javax.management.ObjectName#ObjectName(java.lang.String,java.lang.String,java.lang.String)
     * public javax.management.ObjectName(java.lang.String,java.lang.String,java.lang.String) throws
     * javax.management.MalformedObjectNameException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ObjectName_String_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.ObjectName sut = null; // = new
                                                      // ObjectName(java.lang.String,java.lang.String,java.lang.String);
    }

    /**
     * <p>
     * Test method for {@link javax.management.ObjectName#getInstance(javax.management.ObjectName) public static
     * javax.management.ObjectName javax.management.ObjectName.getInstance(javax.management.ObjectName)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstance_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.ObjectName#getInstance(java.lang.String) public static
     * javax.management.ObjectName javax.management.ObjectName.getInstance(java.lang.String) throws
     * javax.management.MalformedObjectNameException,java.lang.NullPointerException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstance_String()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.ObjectName#getInstance(java.lang.String,java.util.Hashtable) public
     * static javax.management.ObjectName javax.management.ObjectName.getInstance(java.lang.String,java.util.Hashtable)
     * throws javax.management.MalformedObjectNameException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstance_String_Hashtable()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.ObjectName#getInstance(java.lang.String,java.lang.String,java.lang.String) public static
     * javax.management.ObjectName
     * javax.management.ObjectName.getInstance(java.lang.String,java.lang.String,java.lang.String) throws
     * javax.management.MalformedObjectNameException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstance_String_String_String()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.ObjectName#quote(java.lang.String) public static java.lang.String
     * javax.management.ObjectName.quote(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_quote_String()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.ObjectName#unquote(java.lang.String) public static java.lang.String
     * javax.management.ObjectName.unquote(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unquote_String()
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
        assertTrue(javax.management.ObjectName.class.isAssignableFrom(sut));
    }

}
