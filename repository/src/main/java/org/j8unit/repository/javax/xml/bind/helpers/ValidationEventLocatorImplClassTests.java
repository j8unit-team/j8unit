package org.j8unit.repository.javax.xml.bind.helpers;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.bind.helpers.ValidationEventLocatorImpl class
 * javax.xml.bind.helpers.ValidationEventLocatorImpl}, containing all class relevant test methods (at least the test
 * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class containing
 * the instance relevant test methods is
 * {@link org.j8unit.repository.javax.xml.bind.helpers.ValidationEventLocatorImplTests}.
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
 * @see org.j8unit.repository.javax.xml.bind.helpers.ValidationEventLocatorImplTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ValidationEventLocatorImplClassTests<SUT extends javax.xml.bind.helpers.ValidationEventLocatorImpl>
extends org.j8unit.repository.javax.xml.bind.ValidationEventLocatorClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link javax.xml.bind.helpers.ValidationEventLocatorImpl#ValidationEventLocatorImpl() public
     * javax.xml.bind.helpers.ValidationEventLocatorImpl()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ValidationEventLocatorImpl()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.bind.helpers.ValidationEventLocatorImpl sut = null; // = new ValidationEventLocatorImpl();
    }

    /**
     * Test method for
     * {@link javax.xml.bind.helpers.ValidationEventLocatorImpl#ValidationEventLocatorImpl(org.xml.sax.Locator) public
     * javax.xml.bind.helpers.ValidationEventLocatorImpl(org.xml.sax.Locator)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ValidationEventLocatorImpl_Locator()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.bind.helpers.ValidationEventLocatorImpl sut = null; // = new
                                                                            // ValidationEventLocatorImpl(org.xml.sax.Locator);
    }

    /**
     * Test method for
     * {@link javax.xml.bind.helpers.ValidationEventLocatorImpl#ValidationEventLocatorImpl(org.w3c.dom.Node) public
     * javax.xml.bind.helpers.ValidationEventLocatorImpl(org.w3c.dom.Node)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ValidationEventLocatorImpl_Node()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.bind.helpers.ValidationEventLocatorImpl sut = null; // = new
                                                                            // ValidationEventLocatorImpl(org.w3c.dom.Node);
    }

    /**
     * Test method for
     * {@link javax.xml.bind.helpers.ValidationEventLocatorImpl#ValidationEventLocatorImpl(java.lang.Object) public
     * javax.xml.bind.helpers.ValidationEventLocatorImpl(java.lang.Object)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ValidationEventLocatorImpl_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.bind.helpers.ValidationEventLocatorImpl sut = null; // = new
                                                                            // ValidationEventLocatorImpl(java.lang.Object);
    }

    /**
     * Test method for
     * {@link javax.xml.bind.helpers.ValidationEventLocatorImpl#ValidationEventLocatorImpl(org.xml.sax.SAXParseException)
     * public javax.xml.bind.helpers.ValidationEventLocatorImpl(org.xml.sax.SAXParseException)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ValidationEventLocatorImpl_SAXParseException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.bind.helpers.ValidationEventLocatorImpl sut = null; // = new
                                                                            // ValidationEventLocatorImpl(org.xml.sax.SAXParseException);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.xml.bind.helpers.ValidationEventLocatorImpl.class.isAssignableFrom(sut));
    }

}
