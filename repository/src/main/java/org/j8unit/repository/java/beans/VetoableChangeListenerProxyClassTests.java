package org.j8unit.repository.java.beans;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.beans.VetoableChangeListenerProxy class java.beans.VetoableChangeListenerProxy},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.beans.VetoableChangeListenerProxyTests}.
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
 * @see org.j8unit.repository.java.beans.VetoableChangeListenerProxyTests
 */
@Category(J8UnitRepository.class)
public abstract interface VetoableChangeListenerProxyClassTests<SUT extends Class<? extends java.beans.VetoableChangeListenerProxy>>
extends org.j8unit.repository.java.beans.VetoableChangeListenerClassTests<SUT>,
org.j8unit.repository.java.util.EventListenerProxyClassTests<SUT, java.beans.VetoableChangeListener> {

    /**
     * Test method for
     * {@link java.beans.VetoableChangeListenerProxy#VetoableChangeListenerProxy(java.lang.String,java.beans.VetoableChangeListener)
     * public java.beans.VetoableChangeListenerProxy(java.lang.String,java.beans.VetoableChangeListener)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_VetoableChangeListenerProxy_String_VetoableChangeListener()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.beans.VetoableChangeListenerProxy sut = null; // = new
                                                                 // VetoableChangeListenerProxy(java.lang.String,java.beans.VetoableChangeListener);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.beans.VetoableChangeListenerProxy> sut = createNewSUT();
        // assert assignability
        assertTrue(java.beans.VetoableChangeListenerProxy.class.isAssignableFrom(sut));
    }

}
