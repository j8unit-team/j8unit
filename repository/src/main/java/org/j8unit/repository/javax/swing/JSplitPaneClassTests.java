package org.j8unit.repository.javax.swing;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.JSplitPane class javax.swing.JSplitPane}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.JSplitPaneTests}.
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
 * @see org.j8unit.repository.javax.swing.JSplitPaneTests
 */
@Category(J8UnitRepository.class)
public abstract interface JSplitPaneClassTests<SUT extends Class<? extends javax.swing.JSplitPane>>
extends org.j8unit.repository.javax.accessibility.AccessibleClassTests<SUT>, org.j8unit.repository.javax.swing.JComponentClassTests<SUT> {

    /**
     * Test method for {@link javax.swing.JSplitPane#JSplitPane() public javax.swing.JSplitPane()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JSplitPane()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JSplitPane sut = null; // = new JSplitPane();
    }

    /**
     * Test method for {@link javax.swing.JSplitPane#JSplitPane(int) public javax.swing.JSplitPane(int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JSplitPane_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JSplitPane sut = null; // = new JSplitPane(int);
    }

    /**
     * Test method for {@link javax.swing.JSplitPane#JSplitPane(int,boolean) public javax.swing.JSplitPane(int,boolean)}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JSplitPane_int_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JSplitPane sut = null; // = new JSplitPane(int,boolean);
    }

    /**
     * Test method for {@link javax.swing.JSplitPane#JSplitPane(int,boolean,java.awt.Component,java.awt.Component)
     * public javax.swing.JSplitPane(int,boolean,java.awt.Component,java.awt.Component)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JSplitPane_int_boolean_Component_Component()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JSplitPane sut = null; // = new JSplitPane(int,boolean,java.awt.Component,java.awt.Component);
    }

    /**
     * Test method for {@link javax.swing.JSplitPane#JSplitPane(int,java.awt.Component,java.awt.Component) public
     * javax.swing.JSplitPane(int,java.awt.Component,java.awt.Component)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JSplitPane_int_Component_Component()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JSplitPane sut = null; // = new JSplitPane(int,java.awt.Component,java.awt.Component);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.JSplitPane> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.JSplitPane.class.isAssignableFrom(sut));
    }

}
