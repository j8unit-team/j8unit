package org.j8unit.repository.javax.security.auth.kerberos;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.security.auth.kerberos.KeyTab class javax.security.auth.kerberos.KeyTab},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.security.auth.kerberos.KeyTabTests}.
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
 * @see org.j8unit.repository.javax.security.auth.kerberos.KeyTabTests
 */
@Category(J8UnitRepository.class)
public abstract interface KeyTabClassTests<SUT extends Class<? extends javax.security.auth.kerberos.KeyTab>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.security.auth.kerberos.KeyTab> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.security.auth.kerberos.KeyTab.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KeyTab#getInstance(java.io.File) public static javax.security.auth.kerberos.KeyTab javax.security.auth.kerberos.KeyTab.getInstance(java.io.File)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstance_File() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KeyTab#getInstance(javax.security.auth.kerberos.KerberosPrincipal) public static javax.security.auth.kerberos.KeyTab javax.security.auth.kerberos.KeyTab.getInstance(javax.security.auth.kerberos.KerberosPrincipal)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstance_KerberosPrincipal() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KeyTab#getInstance() public static javax.security.auth.kerberos.KeyTab javax.security.auth.kerberos.KeyTab.getInstance()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstance() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KeyTab#getInstance(javax.security.auth.kerberos.KerberosPrincipal,java.io.File) public static javax.security.auth.kerberos.KeyTab javax.security.auth.kerberos.KeyTab.getInstance(javax.security.auth.kerberos.KerberosPrincipal,java.io.File)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstance_KerberosPrincipal_File() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KeyTab#getUnboundInstance() public static javax.security.auth.kerberos.KeyTab javax.security.auth.kerberos.KeyTab.getUnboundInstance()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUnboundInstance() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KeyTab#getUnboundInstance(java.io.File) public static javax.security.auth.kerberos.KeyTab javax.security.auth.kerberos.KeyTab.getUnboundInstance(java.io.File)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUnboundInstance_File() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
