package org.j8unit.repository.java.rmi.activation;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.rmi.activation.ActivationDesc class
 * java.rmi.activation.ActivationDesc}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.java.rmi.activation.ActivationDescTests}.
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
 * @see org.j8unit.repository.java.rmi.activation.ActivationDescTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.rmi.activation.ActivationDesc
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ActivationDescClassTests<SUT extends java.rmi.activation.ActivationDesc>
extends org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.rmi.activation.ActivationDesc#ActivationDesc(java.rmi.activation.ActivationGroupID, java.lang.String, java.lang.String, java.rmi.MarshalledObject)
     * public
     * java.rmi.activation.ActivationDesc(java.rmi.activation.ActivationGroupID,java.lang.String,java.lang.String,java.rmi.MarshalledObject)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.rmi.activation.ActivationDesc#ActivationDesc(java.rmi.activation.ActivationGroupID,
     *             java.lang.String, java.lang.String, java.rmi.MarshalledObject)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ActivationDesc_ActivationGroupID_String_String_MarshalledObject()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.rmi.activation.ActivationDesc sut = null; // = new
                                                             // ActivationDesc(java.rmi.activation.ActivationGroupID,
                                                             // java.lang.String, java.lang.String,
                                                             // java.rmi.MarshalledObject);
    }

    /**
     * <p>
     * Test method for
     * {@link java.rmi.activation.ActivationDesc#ActivationDesc(java.rmi.activation.ActivationGroupID, java.lang.String, java.lang.String, java.rmi.MarshalledObject, boolean)
     * public
     * java.rmi.activation.ActivationDesc(java.rmi.activation.ActivationGroupID,java.lang.String,java.lang.String,java.rmi.MarshalledObject,boolean)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.rmi.activation.ActivationDesc#ActivationDesc(java.rmi.activation.ActivationGroupID,
     *             java.lang.String, java.lang.String, java.rmi.MarshalledObject, boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ActivationDesc_ActivationGroupID_String_String_MarshalledObject_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.rmi.activation.ActivationDesc sut = null; // = new
                                                             // ActivationDesc(java.rmi.activation.ActivationGroupID,
                                                             // java.lang.String, java.lang.String,
                                                             // java.rmi.MarshalledObject, boolean);
    }

    /**
     * <p>
     * Test method for
     * {@link java.rmi.activation.ActivationDesc#ActivationDesc(java.lang.String, java.lang.String, java.rmi.MarshalledObject)
     * public java.rmi.activation.ActivationDesc(java.lang.String,java.lang.String,java.rmi.MarshalledObject) throws
     * java.rmi.activation.ActivationException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.rmi.activation.ActivationDesc#ActivationDesc(java.lang.String, java.lang.String,
     *             java.rmi.MarshalledObject)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ActivationDesc_String_String_MarshalledObject()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.rmi.activation.ActivationDesc sut = null; // = new ActivationDesc(java.lang.String, java.lang.String,
                                                             // java.rmi.MarshalledObject);
    }

    /**
     * <p>
     * Test method for
     * {@link java.rmi.activation.ActivationDesc#ActivationDesc(java.lang.String, java.lang.String, java.rmi.MarshalledObject, boolean)
     * public java.rmi.activation.ActivationDesc(java.lang.String,java.lang.String,java.rmi.MarshalledObject,boolean)
     * throws java.rmi.activation.ActivationException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.rmi.activation.ActivationDesc#ActivationDesc(java.lang.String, java.lang.String,
     *             java.rmi.MarshalledObject, boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ActivationDesc_String_String_MarshalledObject_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.rmi.activation.ActivationDesc sut = null; // = new ActivationDesc(java.lang.String, java.lang.String,
                                                             // java.rmi.MarshalledObject, boolean);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.rmi.activation.ActivationDesc#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.rmi.activation.ActivationDesc.class.isAssignableFrom(sut));
    }

}
