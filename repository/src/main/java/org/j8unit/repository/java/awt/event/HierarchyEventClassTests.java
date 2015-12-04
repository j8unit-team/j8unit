package org.j8unit.repository.java.awt.event;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.event.HierarchyEvent class java.awt.event.HierarchyEvent}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.awt.event.HierarchyEventTests}.
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
 * @see org.j8unit.repository.java.awt.event.HierarchyEventTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HierarchyEventClassTests<SUT extends Class<? extends java.awt.event.HierarchyEvent>>
extends org.j8unit.repository.java.awt.AWTEventClassTests<SUT> {

    /**
     * Test method for
     * {@link java.awt.event.HierarchyEvent#HierarchyEvent(java.awt.Component,int,java.awt.Component,java.awt.Container)
     * public java.awt.event.HierarchyEvent(java.awt.Component,int,java.awt.Component,java.awt.Container)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_HierarchyEvent_Component_int_Component_Container()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.event.HierarchyEvent sut = null; // = new
                                                        // HierarchyEvent(java.awt.Component,int,java.awt.Component,java.awt.Container);
    }

    /**
     * Test method for
     * {@link java.awt.event.HierarchyEvent#HierarchyEvent(java.awt.Component,int,java.awt.Component,java.awt.Container,long)
     * public java.awt.event.HierarchyEvent(java.awt.Component,int,java.awt.Component,java.awt.Container,long)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_HierarchyEvent_Component_int_Component_Container_long()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.event.HierarchyEvent sut = null; // = new
                                                        // HierarchyEvent(java.awt.Component,int,java.awt.Component,java.awt.Container,long);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.awt.event.HierarchyEvent> sut = createNewSUT();
        // assert assignability
        assertTrue(java.awt.event.HierarchyEvent.class.isAssignableFrom(sut));
    }

}
