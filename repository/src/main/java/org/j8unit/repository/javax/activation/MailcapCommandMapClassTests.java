package org.j8unit.repository.javax.activation;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.activation.MailcapCommandMap class javax.activation.MailcapCommandMap}, containing all
 * class relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.activation.MailcapCommandMapTests}.
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
 * @see org.j8unit.repository.javax.activation.MailcapCommandMapTests
 */
@Category(J8UnitRepository.class)
public abstract interface MailcapCommandMapClassTests<SUT extends Class<? extends javax.activation.MailcapCommandMap>>
extends org.j8unit.repository.javax.activation.CommandMapClassTests<SUT> {

    /**
     * Test method for {@link javax.activation.MailcapCommandMap#MailcapCommandMap() public
     * javax.activation.MailcapCommandMap()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MailcapCommandMap()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.activation.MailcapCommandMap sut = null; // = new MailcapCommandMap();
    }

    /**
     * Test method for {@link javax.activation.MailcapCommandMap#MailcapCommandMap(java.io.InputStream) public
     * javax.activation.MailcapCommandMap(java.io.InputStream)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MailcapCommandMap_InputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.activation.MailcapCommandMap sut = null; // = new MailcapCommandMap(java.io.InputStream);
    }

    /**
     * Test method for {@link javax.activation.MailcapCommandMap#MailcapCommandMap(java.lang.String) public
     * javax.activation.MailcapCommandMap(java.lang.String) throws java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MailcapCommandMap_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.activation.MailcapCommandMap sut = null; // = new MailcapCommandMap(java.lang.String);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.activation.MailcapCommandMap> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.activation.MailcapCommandMap.class.isAssignableFrom(sut));
    }

}
