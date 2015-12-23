package org.j8unit.repository.javax.swing;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.JLayer class javax.swing.JLayer}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.JLayerTests}.
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
 * @see org.j8unit.repository.javax.swing.JLayerTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.JLayer
 */
@SuppressWarnings("rawtypes")
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JLayerClassTests<SUT extends javax.swing.JLayer>
extends org.j8unit.repository.javax.swing.ScrollableClassTests<SUT>, org.j8unit.repository.java.beans.PropertyChangeListenerClassTests<SUT>,
org.j8unit.repository.javax.accessibility.AccessibleClassTests<SUT>, org.j8unit.repository.javax.swing.JComponentClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.JLayer#JLayer() public javax.swing.JLayer()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JLayer#JLayer()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JLayer()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JLayer<?> sut = null; // = new JLayer();
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JLayer#JLayer(java.awt.Component) public
     * javax.swing.JLayer(java.awt.Component)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JLayer#JLayer(java.awt.Component)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JLayer_Component()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JLayer<?> sut = null; // = new JLayer(java.awt.Component);
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JLayer#JLayer(java.awt.Component, javax.swing.plaf.LayerUI) public
     * javax.swing.JLayer(java.awt.Component,javax.swing.plaf.LayerUI)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JLayer#JLayer(java.awt.Component, javax.swing.plaf.LayerUI)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JLayer_Component_LayerUI()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JLayer<?> sut = null; // = new JLayer(java.awt.Component, javax.swing.plaf.LayerUI);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.swing.JLayer#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.JLayer.class.isAssignableFrom(sut));
    }

}
