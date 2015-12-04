package org.j8unit.repository.javax.xml.ws.soap;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.ws.soap.AddressingFeature class javax.xml.ws.soap.AddressingFeature}, containing all
 * class relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.xml.ws.soap.AddressingFeatureTests}.
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
 * @see org.j8unit.repository.javax.xml.ws.soap.AddressingFeatureTests
 */
@Category(J8UnitRepository.class)
public abstract interface AddressingFeatureClassTests<SUT extends Class<? extends javax.xml.ws.soap.AddressingFeature>>
extends org.j8unit.repository.javax.xml.ws.WebServiceFeatureClassTests<SUT> {

    /**
     * Test method for
     * {@link javax.xml.ws.soap.AddressingFeature#AddressingFeature(boolean,boolean,javax.xml.ws.soap.AddressingFeature.Responses)
     * public javax.xml.ws.soap.AddressingFeature(boolean,boolean,javax.xml.ws.soap.AddressingFeature$Responses)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_AddressingFeature_boolean_boolean_Responses()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.ws.soap.AddressingFeature sut = null; // = new
                                                              // AddressingFeature(boolean,boolean,javax.xml.ws.soap.AddressingFeature.Responses);
    }

    /**
     * Test method for {@link javax.xml.ws.soap.AddressingFeature#AddressingFeature(boolean,boolean) public
     * javax.xml.ws.soap.AddressingFeature(boolean,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_AddressingFeature_boolean_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.ws.soap.AddressingFeature sut = null; // = new AddressingFeature(boolean,boolean);
    }

    /**
     * Test method for {@link javax.xml.ws.soap.AddressingFeature#AddressingFeature(boolean) public
     * javax.xml.ws.soap.AddressingFeature(boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_AddressingFeature_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.ws.soap.AddressingFeature sut = null; // = new AddressingFeature(boolean);
    }

    /**
     * Test method for {@link javax.xml.ws.soap.AddressingFeature#AddressingFeature() public
     * javax.xml.ws.soap.AddressingFeature()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_AddressingFeature()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.ws.soap.AddressingFeature sut = null; // = new AddressingFeature();
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.xml.ws.soap.AddressingFeature> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.xml.ws.soap.AddressingFeature.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test class for {@link javax.xml.ws.soap.AddressingFeature$Responses class
     * javax.xml.ws.soap.AddressingFeature$Responses}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.xml.ws.soap.AddressingFeatureTests.ResponsesTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.xml.ws.soap.AddressingFeatureTests.ResponsesTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ResponsesClassTests<SUT extends Class<? extends javax.xml.ws.soap.AddressingFeature.Responses>>
    extends org.j8unit.repository.java.lang.EnumClassTests<SUT, javax.xml.ws.soap.AddressingFeature.Responses> {

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.xml.ws.soap.AddressingFeature.Responses> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.xml.ws.soap.AddressingFeature.Responses.class.isAssignableFrom(sut));
        }

        /**
         * <p>
         * Test method for {@link javax.xml.ws.soap.AddressingFeature.Responses#valueOf(java.lang.String) public static
         * javax.xml.ws.soap.AddressingFeature$Responses
         * javax.xml.ws.soap.AddressingFeature$Responses.valueOf(java.lang.String)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_valueOf_String()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.xml.ws.soap.AddressingFeature.Responses#values() public static
         * javax.xml.ws.soap.AddressingFeature$Responses[] javax.xml.ws.soap.AddressingFeature$Responses.values()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_values()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
