package org.j8unit.repository.javax.swing.event;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.event.TreeModelEvent class javax.swing.event.TreeModelEvent}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.event.TreeModelEventTests}.
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
 *            the class' type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.event.TreeModelEventTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TreeModelEventClassTests<SUT extends javax.swing.event.TreeModelEvent>
extends org.j8unit.repository.java.util.EventObjectClassTests<SUT> {

    /**
     * Test method for {@link javax.swing.event.TreeModelEvent#TreeModelEvent(java.lang.Object,java.lang.Object[])
     * public javax.swing.event.TreeModelEvent(java.lang.Object,java.lang.Object[])}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TreeModelEvent_Object_ObjectArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.event.TreeModelEvent sut = null; // = new TreeModelEvent(java.lang.Object,java.lang.Object[]);
    }

    /**
     * Test method for
     * {@link javax.swing.event.TreeModelEvent#TreeModelEvent(java.lang.Object,java.lang.Object[],int[],java.lang.Object[])
     * public javax.swing.event.TreeModelEvent(java.lang.Object,java.lang.Object[],int[],java.lang.Object[])}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TreeModelEvent_Object_ObjectArray_intArray_ObjectArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.event.TreeModelEvent sut = null; // = new
                                                           // TreeModelEvent(java.lang.Object,java.lang.Object[],int[],java.lang.Object[]);
    }

    /**
     * Test method for
     * {@link javax.swing.event.TreeModelEvent#TreeModelEvent(java.lang.Object,javax.swing.tree.TreePath) public
     * javax.swing.event.TreeModelEvent(java.lang.Object,javax.swing.tree.TreePath)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TreeModelEvent_Object_TreePath()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.event.TreeModelEvent sut = null; // = new
                                                           // TreeModelEvent(java.lang.Object,javax.swing.tree.TreePath);
    }

    /**
     * Test method for
     * {@link javax.swing.event.TreeModelEvent#TreeModelEvent(java.lang.Object,javax.swing.tree.TreePath,int[],java.lang.Object[])
     * public javax.swing.event.TreeModelEvent(java.lang.Object,javax.swing.tree.TreePath,int[],java.lang.Object[])}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TreeModelEvent_Object_TreePath_intArray_ObjectArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.event.TreeModelEvent sut = null; // = new
                                                           // TreeModelEvent(java.lang.Object,javax.swing.tree.TreePath,int[],java.lang.Object[]);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.event.TreeModelEvent.class.isAssignableFrom(sut));
    }

}
