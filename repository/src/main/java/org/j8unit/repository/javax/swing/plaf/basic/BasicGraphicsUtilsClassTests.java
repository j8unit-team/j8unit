package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.basic.BasicGraphicsUtils class javax.swing.plaf.basic.BasicGraphicsUtils},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.swing.plaf.basic.BasicGraphicsUtilsTests}.
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
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicGraphicsUtilsTests
 */
@Category(J8UnitRepository.class)
public abstract interface BasicGraphicsUtilsClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicGraphicsUtils>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    /**
     * Test method for {@link javax.swing.plaf.basic.BasicGraphicsUtils#BasicGraphicsUtils() public javax.swing.plaf.basic.BasicGraphicsUtils()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BasicGraphicsUtils() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.plaf.basic.BasicGraphicsUtils sut = null; // = new BasicGraphicsUtils();
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.swing.plaf.basic.BasicGraphicsUtils> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.plaf.basic.BasicGraphicsUtils.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicGraphicsUtils#drawLoweredBezel(java.awt.Graphics,int,int,int,int,java.awt.Color,java.awt.Color,java.awt.Color,java.awt.Color) public static void javax.swing.plaf.basic.BasicGraphicsUtils.drawLoweredBezel(java.awt.Graphics,int,int,int,int,java.awt.Color,java.awt.Color,java.awt.Color,java.awt.Color)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_drawLoweredBezel_Graphics_int_int_int_int_Color_Color_Color_Color() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicGraphicsUtils#drawString(java.awt.Graphics,java.lang.String,int,int,int) public static void javax.swing.plaf.basic.BasicGraphicsUtils.drawString(java.awt.Graphics,java.lang.String,int,int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_drawString_Graphics_String_int_int_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicGraphicsUtils#drawGroove(java.awt.Graphics,int,int,int,int,java.awt.Color,java.awt.Color) public static void javax.swing.plaf.basic.BasicGraphicsUtils.drawGroove(java.awt.Graphics,int,int,int,int,java.awt.Color,java.awt.Color)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_drawGroove_Graphics_int_int_int_int_Color_Color() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicGraphicsUtils#drawEtchedRect(java.awt.Graphics,int,int,int,int,java.awt.Color,java.awt.Color,java.awt.Color,java.awt.Color) public static void javax.swing.plaf.basic.BasicGraphicsUtils.drawEtchedRect(java.awt.Graphics,int,int,int,int,java.awt.Color,java.awt.Color,java.awt.Color,java.awt.Color)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_drawEtchedRect_Graphics_int_int_int_int_Color_Color_Color_Color() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicGraphicsUtils#getGrooveInsets() public static java.awt.Insets javax.swing.plaf.basic.BasicGraphicsUtils.getGrooveInsets()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getGrooveInsets() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicGraphicsUtils#drawBezel(java.awt.Graphics,int,int,int,int,boolean,boolean,java.awt.Color,java.awt.Color,java.awt.Color,java.awt.Color) public static void javax.swing.plaf.basic.BasicGraphicsUtils.drawBezel(java.awt.Graphics,int,int,int,int,boolean,boolean,java.awt.Color,java.awt.Color,java.awt.Color,java.awt.Color)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_drawBezel_Graphics_int_int_int_int_boolean_boolean_Color_Color_Color_Color() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicGraphicsUtils#drawStringUnderlineCharAt(java.awt.Graphics,java.lang.String,int,int,int) public static void javax.swing.plaf.basic.BasicGraphicsUtils.drawStringUnderlineCharAt(java.awt.Graphics,java.lang.String,int,int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_drawStringUnderlineCharAt_Graphics_String_int_int_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicGraphicsUtils#getEtchedInsets() public static java.awt.Insets javax.swing.plaf.basic.BasicGraphicsUtils.getEtchedInsets()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEtchedInsets() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicGraphicsUtils#drawDashedRect(java.awt.Graphics,int,int,int,int) public static void javax.swing.plaf.basic.BasicGraphicsUtils.drawDashedRect(java.awt.Graphics,int,int,int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_drawDashedRect_Graphics_int_int_int_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicGraphicsUtils#getPreferredButtonSize(javax.swing.AbstractButton,int) public static java.awt.Dimension javax.swing.plaf.basic.BasicGraphicsUtils.getPreferredButtonSize(javax.swing.AbstractButton,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPreferredButtonSize_AbstractButton_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
