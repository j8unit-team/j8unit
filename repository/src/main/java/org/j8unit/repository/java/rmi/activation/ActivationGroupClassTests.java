package org.j8unit.repository.java.rmi.activation;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.rmi.activation.ActivationGroup class java.rmi.activation.ActivationGroup},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.rmi.activation.ActivationGroupTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself.
 * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
 * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
 * provides a corresponding, inheritable test method:
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
 * runtime constraints and further class specific requirements.
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.rmi.activation.ActivationGroupTests
 */
@Category(J8UnitRepository.class)
public abstract interface ActivationGroupClassTests<SUT extends Class<? extends java.rmi.activation.ActivationGroup>>
extends org.j8unit.repository.java.rmi.activation.ActivationInstantiatorClassTests<SUT>,
        org.j8unit.repository.java.rmi.server.UnicastRemoteObjectClassTests<SUT>
{

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.rmi.activation.ActivationGroup> sut = createNewSUT();
        // assert assignability
        assertTrue(java.rmi.activation.ActivationGroup.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link java.rmi.activation.ActivationGroup#createGroup(java.rmi.activation.ActivationGroupID,java.rmi.activation.ActivationGroupDesc,long) public static synchronized java.rmi.activation.ActivationGroup java.rmi.activation.ActivationGroup.createGroup(java.rmi.activation.ActivationGroupID,java.rmi.activation.ActivationGroupDesc,long) throws java.rmi.activation.ActivationException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createGroup_ActivationGroupID_ActivationGroupDesc_long() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.activation.ActivationGroup#getSystem() public static synchronized java.rmi.activation.ActivationSystem java.rmi.activation.ActivationGroup.getSystem() throws java.rmi.activation.ActivationException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSystem() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.activation.ActivationGroup#setSystem(java.rmi.activation.ActivationSystem) public static synchronized void java.rmi.activation.ActivationGroup.setSystem(java.rmi.activation.ActivationSystem) throws java.rmi.activation.ActivationException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSystem_ActivationSystem() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.activation.ActivationGroup#currentGroupID() public static synchronized java.rmi.activation.ActivationGroupID java.rmi.activation.ActivationGroup.currentGroupID()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_currentGroupID() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
