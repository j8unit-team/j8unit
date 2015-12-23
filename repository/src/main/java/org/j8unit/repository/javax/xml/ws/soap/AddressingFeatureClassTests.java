package org.j8unit.repository.javax.xml.ws.soap;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.ws.soap.AddressingFeature class
 * javax.xml.ws.soap.AddressingFeature}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.javax.xml.ws.soap.AddressingFeatureTests}.
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
 * @see org.j8unit.repository.javax.xml.ws.soap.AddressingFeatureTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.ws.soap.AddressingFeature
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AddressingFeatureClassTests<SUT extends javax.xml.ws.soap.AddressingFeature>
extends org.j8unit.repository.javax.xml.ws.WebServiceFeatureClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.xml.ws.soap.AddressingFeature.Responses class
     * javax.xml.ws.soap.AddressingFeature$Responses}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.xml.ws.soap.AddressingFeatureTests.ResponsesTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.xml.ws.soap.AddressingFeatureTests.ResponsesTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.xml.ws.soap.AddressingFeature.Responses
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ResponsesClassTests<SUT extends javax.xml.ws.soap.AddressingFeature.Responses>
    extends org.j8unit.repository.java.lang.EnumClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.xml.ws.soap.AddressingFeature.Responses#valueOf(java.lang.String) public static
         * javax.xml.ws.soap.AddressingFeature$Responses
         * javax.xml.ws.soap.AddressingFeature$Responses.valueOf(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.xml.ws.soap.AddressingFeature.Responses#valueOf(java.lang.String)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_valueOf_String()
        throws Exception {
            // query fresh subject-under-test
            final Class<SUT> sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.xml.ws.soap.AddressingFeature.Responses#values() public static
         * javax.xml.ws.soap.AddressingFeature$Responses[] javax.xml.ws.soap.AddressingFeature$Responses.values()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.xml.ws.soap.AddressingFeature.Responses#values()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_values()
        throws Exception {
            // query fresh subject-under-test
            final Class<SUT> sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.xml.ws.soap.AddressingFeature.Responses#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.xml.ws.soap.AddressingFeature.Responses.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.soap.AddressingFeature#AddressingFeature() public
     * javax.xml.ws.soap.AddressingFeature()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.soap.AddressingFeature#AddressingFeature()
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

    /**
     * <p>
     * Test method for {@link javax.xml.ws.soap.AddressingFeature#AddressingFeature(boolean) public
     * javax.xml.ws.soap.AddressingFeature(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.soap.AddressingFeature#AddressingFeature(boolean)
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
     * <p>
     * Test method for {@link javax.xml.ws.soap.AddressingFeature#AddressingFeature(boolean, boolean) public
     * javax.xml.ws.soap.AddressingFeature(boolean,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.soap.AddressingFeature#AddressingFeature(boolean, boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_AddressingFeature_boolean_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.ws.soap.AddressingFeature sut = null; // = new AddressingFeature(boolean, boolean);
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.ws.soap.AddressingFeature#AddressingFeature(boolean, boolean, javax.xml.ws.soap.AddressingFeature.Responses)
     * public javax.xml.ws.soap.AddressingFeature(boolean,boolean,javax.xml.ws.soap.AddressingFeature$Responses)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.soap.AddressingFeature#AddressingFeature(boolean, boolean,
     *             javax.xml.ws.soap.AddressingFeature.Responses)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_AddressingFeature_boolean_boolean_Responses()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.ws.soap.AddressingFeature sut = null; // = new AddressingFeature(boolean, boolean,
                                                              // javax.xml.ws.soap.AddressingFeature.Responses);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.xml.ws.soap.AddressingFeature#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.xml.ws.soap.AddressingFeature.class.isAssignableFrom(sut));
    }

}
