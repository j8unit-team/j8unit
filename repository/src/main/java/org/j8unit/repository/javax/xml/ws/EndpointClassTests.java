package org.j8unit.repository.javax.xml.ws;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.ws.Endpoint class javax.xml.ws.Endpoint}, containing all class relevant test methods
 * (at least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
 * class containing the instance relevant test methods is {@link org.j8unit.repository.javax.xml.ws.EndpointTests}.
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
 * @see org.j8unit.repository.javax.xml.ws.EndpointTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface EndpointClassTests<SUT extends javax.xml.ws.Endpoint>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link javax.xml.ws.Endpoint#Endpoint() public javax.xml.ws.Endpoint()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Endpoint()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.ws.Endpoint sut = null; // = new Endpoint();
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.Endpoint#create(java.lang.Object) public static javax.xml.ws.Endpoint
     * javax.xml.ws.Endpoint.create(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_create_Object()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.Endpoint#create(java.lang.Object,javax.xml.ws.WebServiceFeature...) public
     * static javax.xml.ws.Endpoint javax.xml.ws.Endpoint.create(java.lang.Object,javax.xml.ws.WebServiceFeature...)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_create_Object_WebServiceFeatureArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.Endpoint#create(java.lang.String,java.lang.Object) public static
     * javax.xml.ws.Endpoint javax.xml.ws.Endpoint.create(java.lang.String,java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_create_String_Object()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.ws.Endpoint#create(java.lang.String,java.lang.Object,javax.xml.ws.WebServiceFeature...) public
     * static javax.xml.ws.Endpoint
     * javax.xml.ws.Endpoint.create(java.lang.String,java.lang.Object,javax.xml.ws.WebServiceFeature...)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_create_String_Object_WebServiceFeatureArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.Endpoint#publish(java.lang.String,java.lang.Object) public static
     * javax.xml.ws.Endpoint javax.xml.ws.Endpoint.publish(java.lang.String,java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_publish_String_Object()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.ws.Endpoint#publish(java.lang.String,java.lang.Object,javax.xml.ws.WebServiceFeature...) public
     * static javax.xml.ws.Endpoint
     * javax.xml.ws.Endpoint.publish(java.lang.String,java.lang.Object,javax.xml.ws.WebServiceFeature...)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_publish_String_Object_WebServiceFeatureArray()
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
        assertTrue(javax.xml.ws.Endpoint.class.isAssignableFrom(sut));
    }

}
