package org.j8unit.repository.java.rmi.activation;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.rmi.activation.ActivationGroupDesc class java.rmi.activation.ActivationGroupDesc},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.rmi.activation.ActivationGroupDescTests}.
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
 * @see org.j8unit.repository.java.rmi.activation.ActivationGroupDescTests
 */
@Category(J8UnitRepository.class)
public abstract interface ActivationGroupDescClassTests<SUT extends Class<? extends java.rmi.activation.ActivationGroupDesc>>
extends org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link java.rmi.activation.ActivationGroupDesc$CommandEnvironment class
     * java.rmi.activation.ActivationGroupDesc$CommandEnvironment}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.rmi.activation.ActivationGroupDescTests.CommandEnvironmentTests}.
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
     * @see org.j8unit.repository.java.rmi.activation.ActivationGroupDescTests.CommandEnvironmentTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface CommandEnvironmentClassTests<SUT extends Class<? extends java.rmi.activation.ActivationGroupDesc.CommandEnvironment>>
    extends org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for
         * {@link java.rmi.activation.ActivationGroupDesc.CommandEnvironment#CommandEnvironment(java.lang.String,java.lang.String[])
         * public java.rmi.activation.ActivationGroupDesc$CommandEnvironment(java.lang.String,java.lang.String[])}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_CommandEnvironment_String_StringArray()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.rmi.activation.ActivationGroupDesc.CommandEnvironment sut = null; // = new
                                                                                         // CommandEnvironment(java.lang.String,java.lang.String[]);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.rmi.activation.ActivationGroupDesc.CommandEnvironment> sut = createNewSUT();
            // assert assignability
            assertTrue(java.rmi.activation.ActivationGroupDesc.CommandEnvironment.class.isAssignableFrom(sut));
        }

    }

    /**
     * Test method for
     * {@link java.rmi.activation.ActivationGroupDesc#ActivationGroupDesc(java.util.Properties,java.rmi.activation.ActivationGroupDesc.CommandEnvironment)
     * public
     * java.rmi.activation.ActivationGroupDesc(java.util.Properties,java.rmi.activation.ActivationGroupDesc$CommandEnvironment)}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ActivationGroupDesc_Properties_CommandEnvironment()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.rmi.activation.ActivationGroupDesc sut = null; // = new
                                                                  // ActivationGroupDesc(java.util.Properties,java.rmi.activation.ActivationGroupDesc.CommandEnvironment);
    }

    /**
     * Test method for
     * {@link java.rmi.activation.ActivationGroupDesc#ActivationGroupDesc(java.lang.String,java.lang.String,java.rmi.MarshalledObject,java.util.Properties,java.rmi.activation.ActivationGroupDesc.CommandEnvironment)
     * public
     * java.rmi.activation.ActivationGroupDesc(java.lang.String,java.lang.String,java.rmi.MarshalledObject,java.util.Properties,java.rmi.activation.ActivationGroupDesc$CommandEnvironment)}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ActivationGroupDesc_String_String_MarshalledObject_Properties_CommandEnvironment()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.rmi.activation.ActivationGroupDesc sut = null; // = new
                                                                  // ActivationGroupDesc(java.lang.String,java.lang.String,java.rmi.MarshalledObject,java.util.Properties,java.rmi.activation.ActivationGroupDesc.CommandEnvironment);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.rmi.activation.ActivationGroupDesc> sut = createNewSUT();
        // assert assignability
        assertTrue(java.rmi.activation.ActivationGroupDesc.class.isAssignableFrom(sut));
    }

}
