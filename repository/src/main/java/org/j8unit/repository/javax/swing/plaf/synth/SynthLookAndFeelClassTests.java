package org.j8unit.repository.javax.swing.plaf.synth;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.synth.SynthLookAndFeel class javax.swing.plaf.synth.SynthLookAndFeel},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.swing.plaf.synth.SynthLookAndFeelTests}.
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
 * @see org.j8unit.repository.javax.swing.plaf.synth.SynthLookAndFeelTests
 */
@Category(J8UnitRepository.class)
public abstract interface SynthLookAndFeelClassTests<SUT extends Class<? extends javax.swing.plaf.synth.SynthLookAndFeel>>
extends org.j8unit.repository.javax.swing.plaf.basic.BasicLookAndFeelClassTests<SUT>
{

    /**
     * Test method for {@link javax.swing.plaf.synth.SynthLookAndFeel#SynthLookAndFeel() public javax.swing.plaf.synth.SynthLookAndFeel()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SynthLookAndFeel() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.plaf.synth.SynthLookAndFeel sut = null; // = new SynthLookAndFeel();
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.swing.plaf.synth.SynthLookAndFeel> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.plaf.synth.SynthLookAndFeel.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.synth.SynthLookAndFeel#getStyleFactory() public static javax.swing.plaf.synth.SynthStyleFactory javax.swing.plaf.synth.SynthLookAndFeel.getStyleFactory()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStyleFactory() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.synth.SynthLookAndFeel#getRegion(javax.swing.JComponent) public static javax.swing.plaf.synth.Region javax.swing.plaf.synth.SynthLookAndFeel.getRegion(javax.swing.JComponent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRegion_JComponent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.synth.SynthLookAndFeel#setStyleFactory(javax.swing.plaf.synth.SynthStyleFactory) public static void javax.swing.plaf.synth.SynthLookAndFeel.setStyleFactory(javax.swing.plaf.synth.SynthStyleFactory)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setStyleFactory_SynthStyleFactory() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.synth.SynthLookAndFeel#getStyle(javax.swing.JComponent,javax.swing.plaf.synth.Region) public static javax.swing.plaf.synth.SynthStyle javax.swing.plaf.synth.SynthLookAndFeel.getStyle(javax.swing.JComponent,javax.swing.plaf.synth.Region)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStyle_JComponent_Region() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.synth.SynthLookAndFeel#updateStyles(java.awt.Component) public static void javax.swing.plaf.synth.SynthLookAndFeel.updateStyles(java.awt.Component)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_updateStyles_Component() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.synth.SynthLookAndFeel#createUI(javax.swing.JComponent) public static javax.swing.plaf.ComponentUI javax.swing.plaf.synth.SynthLookAndFeel.createUI(javax.swing.JComponent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createUI_JComponent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
