package org.j8unit.repository.java.awt;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.Color class java.awt.Color}, containing all class relevant test methods (at least the
 * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
 * containing the instance relevant test methods is {@link org.j8unit.repository.java.awt.ColorTests}.
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
 * @see org.j8unit.repository.java.awt.ColorTests
 */
@Category(J8UnitRepository.class)
public abstract interface ColorClassTests<SUT extends Class<? extends java.awt.Color>>
extends org.j8unit.repository.java.awt.PaintClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link java.awt.Color#Color(java.awt.color.ColorSpace,float[],float) public
     * java.awt.Color(java.awt.color.ColorSpace,float[],float)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Color_ColorSpace_floatArray_float()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.Color sut = null; // = new Color(java.awt.color.ColorSpace,float[],float);
    }

    /**
     * Test method for {@link java.awt.Color#Color(float,float,float) public java.awt.Color(float,float,float)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Color_float_float_float()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.Color sut = null; // = new Color(float,float,float);
    }

    /**
     * Test method for {@link java.awt.Color#Color(float,float,float,float) public
     * java.awt.Color(float,float,float,float)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Color_float_float_float_float()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.Color sut = null; // = new Color(float,float,float,float);
    }

    /**
     * Test method for {@link java.awt.Color#Color(int) public java.awt.Color(int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Color_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.Color sut = null; // = new Color(int);
    }

    /**
     * Test method for {@link java.awt.Color#Color(int,boolean) public java.awt.Color(int,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Color_int_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.Color sut = null; // = new Color(int,boolean);
    }

    /**
     * Test method for {@link java.awt.Color#Color(int,int,int) public java.awt.Color(int,int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Color_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.Color sut = null; // = new Color(int,int,int);
    }

    /**
     * Test method for {@link java.awt.Color#Color(int,int,int,int) public java.awt.Color(int,int,int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Color_int_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.Color sut = null; // = new Color(int,int,int,int);
    }

    /**
     * <p>
     * Test method for {@link java.awt.Color#decode(java.lang.String) public static java.awt.Color
     * java.awt.Color.decode(java.lang.String) throws java.lang.NumberFormatException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_decode_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.Color#getColor(java.lang.String) public static java.awt.Color
     * java.awt.Color.getColor(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getColor_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.Color#getColor(java.lang.String,java.awt.Color) public static java.awt.Color
     * java.awt.Color.getColor(java.lang.String,java.awt.Color)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getColor_String_Color()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.Color#getColor(java.lang.String,int) public static java.awt.Color
     * java.awt.Color.getColor(java.lang.String,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getColor_String_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.Color#getHSBColor(float,float,float) public static java.awt.Color
     * java.awt.Color.getHSBColor(float,float,float)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getHSBColor_float_float_float()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.Color#HSBtoRGB(float,float,float) public static int
     * java.awt.Color.HSBtoRGB(float,float,float)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_HSBtoRGB_float_float_float()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.Color#RGBtoHSB(int,int,int,float[]) public static float[]
     * java.awt.Color.RGBtoHSB(int,int,int,float[])}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_RGBtoHSB_int_int_int_floatArray()
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
        final Class<? extends java.awt.Color> sut = createNewSUT();
        // assert assignability
        assertTrue(java.awt.Color.class.isAssignableFrom(sut));
    }

}
