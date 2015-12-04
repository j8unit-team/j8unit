package org.j8unit.repository.java.awt.event;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.event.InvocationEvent class java.awt.event.InvocationEvent}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.awt.event.InvocationEventTests}.
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
 * @see org.j8unit.repository.java.awt.event.InvocationEventTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvocationEventClassTests<SUT extends Class<? extends java.awt.event.InvocationEvent>>
extends org.j8unit.repository.java.awt.ActiveEventClassTests<SUT>, org.j8unit.repository.java.awt.AWTEventClassTests<SUT> {

    /**
     * Test method for {@link java.awt.event.InvocationEvent#InvocationEvent(java.lang.Object,java.lang.Runnable) public
     * java.awt.event.InvocationEvent(java.lang.Object,java.lang.Runnable)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_InvocationEvent_Object_Runnable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.event.InvocationEvent sut = null; // = new InvocationEvent(java.lang.Object,java.lang.Runnable);
    }

    /**
     * Test method for
     * {@link java.awt.event.InvocationEvent#InvocationEvent(java.lang.Object,java.lang.Runnable,java.lang.Object,boolean)
     * public java.awt.event.InvocationEvent(java.lang.Object,java.lang.Runnable,java.lang.Object,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_InvocationEvent_Object_Runnable_Object_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.event.InvocationEvent sut = null; // = new
                                                         // InvocationEvent(java.lang.Object,java.lang.Runnable,java.lang.Object,boolean);
    }

    /**
     * Test method for
     * {@link java.awt.event.InvocationEvent#InvocationEvent(java.lang.Object,java.lang.Runnable,java.lang.Runnable,boolean)
     * public java.awt.event.InvocationEvent(java.lang.Object,java.lang.Runnable,java.lang.Runnable,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_InvocationEvent_Object_Runnable_Runnable_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.event.InvocationEvent sut = null; // = new
                                                         // InvocationEvent(java.lang.Object,java.lang.Runnable,java.lang.Runnable,boolean);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.awt.event.InvocationEvent> sut = createNewSUT();
        // assert assignability
        assertTrue(java.awt.event.InvocationEvent.class.isAssignableFrom(sut));
    }

}
