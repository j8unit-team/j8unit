package org.j8unit.repository.javax.swing.plaf.synth;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.synth.SynthTableHeaderUI class javax.swing.plaf.synth.SynthTableHeaderUI},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.plaf.synth.SynthTableHeaderUITests}.
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
 * @see org.j8unit.repository.javax.swing.plaf.synth.SynthTableHeaderUITests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SynthTableHeaderUIClassTests<SUT extends Class<? extends javax.swing.plaf.synth.SynthTableHeaderUI>>
extends org.j8unit.repository.java.beans.PropertyChangeListenerClassTests<SUT>, org.j8unit.repository.javax.swing.plaf.synth.SynthUIClassTests<SUT>,
org.j8unit.repository.javax.swing.plaf.basic.BasicTableHeaderUIClassTests<SUT> {

    /**
     * Test method for {@link javax.swing.plaf.synth.SynthTableHeaderUI#SynthTableHeaderUI() public
     * javax.swing.plaf.synth.SynthTableHeaderUI()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SynthTableHeaderUI()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.plaf.synth.SynthTableHeaderUI sut = null; // = new SynthTableHeaderUI();
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.synth.SynthTableHeaderUI#createUI(javax.swing.JComponent) public static
     * javax.swing.plaf.ComponentUI javax.swing.plaf.synth.SynthTableHeaderUI.createUI(javax.swing.JComponent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_createUI_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.plaf.synth.SynthTableHeaderUI> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.plaf.synth.SynthTableHeaderUI.class.isAssignableFrom(sut));
    }

}