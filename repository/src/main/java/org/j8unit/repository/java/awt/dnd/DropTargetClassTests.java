package org.j8unit.repository.java.awt.dnd;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.dnd.DropTarget class java.awt.dnd.DropTarget}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.awt.dnd.DropTargetTests}.
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
 * @see org.j8unit.repository.java.awt.dnd.DropTargetTests
 */
@Category(J8UnitRepository.class)
public abstract interface DropTargetClassTests<SUT extends Class<? extends java.awt.dnd.DropTarget>>
extends org.j8unit.repository.java.awt.dnd.DropTargetListenerClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link java.awt.dnd.DropTarget#DropTarget() public java.awt.dnd.DropTarget() throws
     * java.awt.HeadlessException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DropTarget()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.dnd.DropTarget sut = null; // = new DropTarget();
    }

    /**
     * Test method for {@link java.awt.dnd.DropTarget#DropTarget(java.awt.Component,java.awt.dnd.DropTargetListener)
     * public java.awt.dnd.DropTarget(java.awt.Component,java.awt.dnd.DropTargetListener) throws
     * java.awt.HeadlessException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DropTarget_Component_DropTargetListener()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.dnd.DropTarget sut = null; // = new
                                                  // DropTarget(java.awt.Component,java.awt.dnd.DropTargetListener);
    }

    /**
     * Test method for {@link java.awt.dnd.DropTarget#DropTarget(java.awt.Component,int,java.awt.dnd.DropTargetListener)
     * public java.awt.dnd.DropTarget(java.awt.Component,int,java.awt.dnd.DropTargetListener) throws
     * java.awt.HeadlessException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DropTarget_Component_int_DropTargetListener()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.dnd.DropTarget sut = null; // = new
                                                  // DropTarget(java.awt.Component,int,java.awt.dnd.DropTargetListener);
    }

    /**
     * Test method for
     * {@link java.awt.dnd.DropTarget#DropTarget(java.awt.Component,int,java.awt.dnd.DropTargetListener,boolean) public
     * java.awt.dnd.DropTarget(java.awt.Component,int,java.awt.dnd.DropTargetListener,boolean) throws
     * java.awt.HeadlessException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DropTarget_Component_int_DropTargetListener_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.dnd.DropTarget sut = null; // = new
                                                  // DropTarget(java.awt.Component,int,java.awt.dnd.DropTargetListener,boolean);
    }

    /**
     * Test method for
     * {@link java.awt.dnd.DropTarget#DropTarget(java.awt.Component,int,java.awt.dnd.DropTargetListener,boolean,java.awt.datatransfer.FlavorMap)
     * public
     * java.awt.dnd.DropTarget(java.awt.Component,int,java.awt.dnd.DropTargetListener,boolean,java.awt.datatransfer.FlavorMap)
     * throws java.awt.HeadlessException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DropTarget_Component_int_DropTargetListener_boolean_FlavorMap()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.dnd.DropTarget sut = null; // = new
                                                  // DropTarget(java.awt.Component,int,java.awt.dnd.DropTargetListener,boolean,java.awt.datatransfer.FlavorMap);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.awt.dnd.DropTarget> sut = createNewSUT();
        // assert assignability
        assertTrue(java.awt.dnd.DropTarget.class.isAssignableFrom(sut));
    }

}
