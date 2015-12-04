package org.j8unit.repository.javax.security.auth.x500;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.security.auth.x500.X500Principal class javax.security.auth.x500.X500Principal},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.security.auth.x500.X500PrincipalTests}.
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
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.security.auth.x500.X500PrincipalTests
 */
@Category(J8UnitRepository.class)
public abstract interface X500PrincipalClassTests<SUT extends Class<? extends javax.security.auth.x500.X500Principal>>
extends org.j8unit.repository.java.security.PrincipalClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link javax.security.auth.x500.X500Principal#X500Principal(java.io.InputStream) public
     * javax.security.auth.x500.X500Principal(java.io.InputStream)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_X500Principal_InputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.security.auth.x500.X500Principal sut = null; // = new X500Principal(java.io.InputStream);
    }

    /**
     * Test method for {@link javax.security.auth.x500.X500Principal#X500Principal(byte[]) public
     * javax.security.auth.x500.X500Principal(byte[])}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_X500Principal_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.security.auth.x500.X500Principal sut = null; // = new X500Principal(byte[]);
    }

    /**
     * Test method for {@link javax.security.auth.x500.X500Principal#X500Principal(java.lang.String,java.util.Map)
     * public javax.security.auth.x500.X500Principal(java.lang.String,java.util.Map)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_X500Principal_String_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.security.auth.x500.X500Principal sut = null; // = new X500Principal(java.lang.String,java.util.Map);
    }

    /**
     * Test method for {@link javax.security.auth.x500.X500Principal#X500Principal(java.lang.String) public
     * javax.security.auth.x500.X500Principal(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_X500Principal_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.security.auth.x500.X500Principal sut = null; // = new X500Principal(java.lang.String);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.security.auth.x500.X500Principal> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.security.auth.x500.X500Principal.class.isAssignableFrom(sut));
    }

}
