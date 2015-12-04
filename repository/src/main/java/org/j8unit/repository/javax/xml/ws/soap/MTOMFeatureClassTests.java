package org.j8unit.repository.javax.xml.ws.soap;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.ws.soap.MTOMFeature class javax.xml.ws.soap.MTOMFeature}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.xml.ws.soap.MTOMFeatureTests}.
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
 * @see org.j8unit.repository.javax.xml.ws.soap.MTOMFeatureTests
 */
@Category(J8UnitRepository.class)
public abstract interface MTOMFeatureClassTests<SUT extends Class<? extends javax.xml.ws.soap.MTOMFeature>>
extends org.j8unit.repository.javax.xml.ws.WebServiceFeatureClassTests<SUT> {

    /**
     * Test method for {@link javax.xml.ws.soap.MTOMFeature#MTOMFeature() public javax.xml.ws.soap.MTOMFeature()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MTOMFeature()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.ws.soap.MTOMFeature sut = null; // = new MTOMFeature();
    }

    /**
     * Test method for {@link javax.xml.ws.soap.MTOMFeature#MTOMFeature(boolean) public
     * javax.xml.ws.soap.MTOMFeature(boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MTOMFeature_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.ws.soap.MTOMFeature sut = null; // = new MTOMFeature(boolean);
    }

    /**
     * Test method for {@link javax.xml.ws.soap.MTOMFeature#MTOMFeature(boolean,int) public
     * javax.xml.ws.soap.MTOMFeature(boolean,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MTOMFeature_boolean_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.ws.soap.MTOMFeature sut = null; // = new MTOMFeature(boolean,int);
    }

    /**
     * Test method for {@link javax.xml.ws.soap.MTOMFeature#MTOMFeature(int) public javax.xml.ws.soap.MTOMFeature(int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MTOMFeature_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.ws.soap.MTOMFeature sut = null; // = new MTOMFeature(int);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.xml.ws.soap.MTOMFeature> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.xml.ws.soap.MTOMFeature.class.isAssignableFrom(sut));
    }

}
