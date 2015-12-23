package org.j8unit.repository.javax.naming.ldap;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.naming.ldap.InitialLdapContext class
 * javax.naming.ldap.InitialLdapContext}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.javax.naming.ldap.InitialLdapContextTests}.
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
 * @see org.j8unit.repository.javax.naming.ldap.InitialLdapContextTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.naming.ldap.InitialLdapContext
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InitialLdapContextClassTests<SUT extends javax.naming.ldap.InitialLdapContext>
extends org.j8unit.repository.javax.naming.ldap.LdapContextClassTests<SUT>, org.j8unit.repository.javax.naming.directory.InitialDirContextClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.InitialLdapContext#InitialLdapContext() public
     * javax.naming.ldap.InitialLdapContext() throws javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.naming.ldap.InitialLdapContext#InitialLdapContext()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_InitialLdapContext()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.naming.ldap.InitialLdapContext sut = null; // = new InitialLdapContext();
    }

    /**
     * <p>
     * Test method for
     * {@link javax.naming.ldap.InitialLdapContext#InitialLdapContext(java.util.Hashtable, javax.naming.ldap.Control[])
     * public javax.naming.ldap.InitialLdapContext(java.util.Hashtable,javax.naming.ldap.Control[]) throws
     * javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.naming.ldap.InitialLdapContext#InitialLdapContext(java.util.Hashtable,
     *             javax.naming.ldap.Control[])
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_InitialLdapContext_Hashtable_ControlArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.naming.ldap.InitialLdapContext sut = null; // = new InitialLdapContext(java.util.Hashtable,
                                                               // javax.naming.ldap.Control[]);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.naming.ldap.InitialLdapContext#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.naming.ldap.InitialLdapContext.class.isAssignableFrom(sut));
    }

}
