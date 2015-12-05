package org.j8unit.repository.org.omg.stub.javax.management.remote.rmi;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.stub.javax.management.remote.rmi._RMIServerImpl_Tie class
 * org.omg.stub.javax.management.remote.rmi._RMIServerImpl_Tie}, containing all class relevant test methods (at least
 * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
 * containing the instance relevant test methods is
 * {@link org.j8unit.repository.org.omg.stub.javax.management.remote.rmi._RMIServerImpl_TieTests}.
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
 * @see org.j8unit.repository.org.omg.stub.javax.management.remote.rmi._RMIServerImpl_TieTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface _RMIServerImpl_TieClassTests<SUT extends Class<? extends org.omg.stub.javax.management.remote.rmi._RMIServerImpl_Tie>>
extends org.j8unit.repository.javax.rmi.CORBA.TieClassTests<SUT>, org.j8unit.repository.org.omg.CORBA_2_3.portable.ObjectImplClassTests<SUT> {

    /**
     * Test method for {@link org.omg.stub.javax.management.remote.rmi._RMIServerImpl_Tie#_RMIServerImpl_Tie() public
     * org.omg.stub.javax.management.remote.rmi._RMIServerImpl_Tie()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create__RMIServerImpl_Tie()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.stub.javax.management.remote.rmi._RMIServerImpl_Tie sut = null; // = new _RMIServerImpl_Tie();
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends org.omg.stub.javax.management.remote.rmi._RMIServerImpl_Tie> sut = createNewSUT();
        // assert assignability
        assertTrue(org.omg.stub.javax.management.remote.rmi._RMIServerImpl_Tie.class.isAssignableFrom(sut));
    }

}