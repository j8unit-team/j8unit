package org.j8unit.repository.javax.xml.crypto.dsig.keyinfo;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.crypto.dsig.keyinfo.KeyInfoFactory class
 * javax.xml.crypto.dsig.keyinfo.KeyInfoFactory}, containing all class relevant test methods (at least the test methods
 * of accessible constructors and of accessible {@code static} methods). The counterpart test class containing the
 * instance relevant test methods is {@link org.j8unit.repository.javax.xml.crypto.dsig.keyinfo.KeyInfoFactoryTests}.
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
 * @see org.j8unit.repository.javax.xml.crypto.dsig.keyinfo.KeyInfoFactoryTests
 */
@Category(J8UnitRepository.class)
public abstract interface KeyInfoFactoryClassTests<SUT extends Class<? extends javax.xml.crypto.dsig.keyinfo.KeyInfoFactory>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.keyinfo.KeyInfoFactory#getInstance() public static
     * javax.xml.crypto.dsig.keyinfo.KeyInfoFactory javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstance()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.keyinfo.KeyInfoFactory#getInstance(java.lang.String) public static
     * javax.xml.crypto.dsig.keyinfo.KeyInfoFactory
     * javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstance_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.keyinfo.KeyInfoFactory#getInstance(java.lang.String,java.security.Provider) public
     * static javax.xml.crypto.dsig.keyinfo.KeyInfoFactory
     * javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance(java.lang.String,java.security.Provider)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstance_String_Provider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.keyinfo.KeyInfoFactory#getInstance(java.lang.String,java.lang.String) public static
     * javax.xml.crypto.dsig.keyinfo.KeyInfoFactory
     * javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance(java.lang.String,java.lang.String) throws
     * java.security.NoSuchProviderException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstance_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.xml.crypto.dsig.keyinfo.KeyInfoFactory> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.class.isAssignableFrom(sut));
    }

}
