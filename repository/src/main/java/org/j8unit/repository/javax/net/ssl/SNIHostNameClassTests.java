package org.j8unit.repository.javax.net.ssl;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.net.ssl.SNIHostName class javax.net.ssl.SNIHostName}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.net.ssl.SNIHostNameTests}.
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
 * @see org.j8unit.repository.javax.net.ssl.SNIHostNameTests
 */
@Category(J8UnitRepository.class)
public abstract interface SNIHostNameClassTests<SUT extends Class<? extends javax.net.ssl.SNIHostName>>
extends org.j8unit.repository.javax.net.ssl.SNIServerNameClassTests<SUT> {

    /**
     * Test method for {@link javax.net.ssl.SNIHostName#SNIHostName(java.lang.String) public
     * javax.net.ssl.SNIHostName(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SNIHostName_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.net.ssl.SNIHostName sut = null; // = new SNIHostName(java.lang.String);
    }

    /**
     * Test method for {@link javax.net.ssl.SNIHostName#SNIHostName(byte[]) public javax.net.ssl.SNIHostName(byte[])}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SNIHostName_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.net.ssl.SNIHostName sut = null; // = new SNIHostName(byte[]);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.net.ssl.SNIHostName> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.net.ssl.SNIHostName.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SNIHostName#createSNIMatcher(java.lang.String) public static
     * javax.net.ssl.SNIMatcher javax.net.ssl.SNIHostName.createSNIMatcher(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createSNIMatcher_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
