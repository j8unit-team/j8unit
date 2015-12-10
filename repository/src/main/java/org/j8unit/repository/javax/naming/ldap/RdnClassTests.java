package org.j8unit.repository.javax.naming.ldap;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.naming.ldap.Rdn class javax.naming.ldap.Rdn}, containing all class relevant test methods
 * (at least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
 * class containing the instance relevant test methods is {@link org.j8unit.repository.javax.naming.ldap.RdnTests}.
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
 * @see org.j8unit.repository.javax.naming.ldap.RdnTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RdnClassTests<SUT extends javax.naming.ldap.Rdn>
extends org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.lang.ComparableClassTests<SUT>,
org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link javax.naming.ldap.Rdn#Rdn(javax.naming.directory.Attributes) public
     * javax.naming.ldap.Rdn(javax.naming.directory.Attributes) throws javax.naming.InvalidNameException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Rdn_Attributes()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.naming.ldap.Rdn sut = null; // = new Rdn(javax.naming.directory.Attributes);
    }

    /**
     * Test method for {@link javax.naming.ldap.Rdn#Rdn(javax.naming.ldap.Rdn) public
     * javax.naming.ldap.Rdn(javax.naming.ldap.Rdn)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Rdn_Rdn()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.naming.ldap.Rdn sut = null; // = new Rdn(javax.naming.ldap.Rdn);
    }

    /**
     * Test method for {@link javax.naming.ldap.Rdn#Rdn(java.lang.String) public javax.naming.ldap.Rdn(java.lang.String)
     * throws javax.naming.InvalidNameException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Rdn_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.naming.ldap.Rdn sut = null; // = new Rdn(java.lang.String);
    }

    /**
     * Test method for {@link javax.naming.ldap.Rdn#Rdn(java.lang.String,java.lang.Object) public
     * javax.naming.ldap.Rdn(java.lang.String,java.lang.Object) throws javax.naming.InvalidNameException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Rdn_String_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.naming.ldap.Rdn sut = null; // = new Rdn(java.lang.String,java.lang.Object);
    }

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.Rdn#escapeValue(java.lang.Object) public static java.lang.String
     * javax.naming.ldap.Rdn.escapeValue(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_escapeValue_Object()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.Rdn#unescapeValue(java.lang.String) public static java.lang.Object
     * javax.naming.ldap.Rdn.unescapeValue(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unescapeValue_String()
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
        assertTrue(javax.naming.ldap.Rdn.class.isAssignableFrom(sut));
    }

}
