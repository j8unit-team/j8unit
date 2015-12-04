package org.j8unit.repository.javax.imageio;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.imageio.ImageTypeSpecifier class javax.imageio.ImageTypeSpecifier}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.imageio.ImageTypeSpecifierTests}.
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
 * @see org.j8unit.repository.javax.imageio.ImageTypeSpecifierTests
 */
@Category(J8UnitRepository.class)
public abstract interface ImageTypeSpecifierClassTests<SUT extends Class<? extends javax.imageio.ImageTypeSpecifier>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link javax.imageio.ImageTypeSpecifier#ImageTypeSpecifier(java.awt.image.RenderedImage) public
     * javax.imageio.ImageTypeSpecifier(java.awt.image.RenderedImage)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ImageTypeSpecifier_RenderedImage()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.imageio.ImageTypeSpecifier sut = null; // = new ImageTypeSpecifier(java.awt.image.RenderedImage);
    }

    /**
     * Test method for
     * {@link javax.imageio.ImageTypeSpecifier#ImageTypeSpecifier(java.awt.image.ColorModel,java.awt.image.SampleModel)
     * public javax.imageio.ImageTypeSpecifier(java.awt.image.ColorModel,java.awt.image.SampleModel)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ImageTypeSpecifier_ColorModel_SampleModel()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.imageio.ImageTypeSpecifier sut = null; // = new
                                                           // ImageTypeSpecifier(java.awt.image.ColorModel,java.awt.image.SampleModel);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.imageio.ImageTypeSpecifier> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.imageio.ImageTypeSpecifier.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for
     * {@link javax.imageio.ImageTypeSpecifier#createBanded(java.awt.color.ColorSpace,int[],int[],int,boolean,boolean)
     * public static javax.imageio.ImageTypeSpecifier
     * javax.imageio.ImageTypeSpecifier.createBanded(java.awt.color.ColorSpace,int[],int[],int,boolean,boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createBanded_ColorSpace_intArray_intArray_int_boolean_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.ImageTypeSpecifier#createFromRenderedImage(java.awt.image.RenderedImage)
     * public static javax.imageio.ImageTypeSpecifier
     * javax.imageio.ImageTypeSpecifier.createFromRenderedImage(java.awt.image.RenderedImage)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createFromRenderedImage_RenderedImage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.imageio.ImageTypeSpecifier#createPacked(java.awt.color.ColorSpace,int,int,int,int,int,boolean)
     * public static javax.imageio.ImageTypeSpecifier
     * javax.imageio.ImageTypeSpecifier.createPacked(java.awt.color.ColorSpace,int,int,int,int,int,boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createPacked_ColorSpace_int_int_int_int_int_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.ImageTypeSpecifier#createGrayscale(int,int,boolean) public static
     * javax.imageio.ImageTypeSpecifier javax.imageio.ImageTypeSpecifier.createGrayscale(int,int,boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createGrayscale_int_int_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.ImageTypeSpecifier#createGrayscale(int,int,boolean,boolean) public static
     * javax.imageio.ImageTypeSpecifier javax.imageio.ImageTypeSpecifier.createGrayscale(int,int,boolean,boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createGrayscale_int_int_boolean_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.imageio.ImageTypeSpecifier#createInterleaved(java.awt.color.ColorSpace,int[],int,boolean,boolean)
     * public static javax.imageio.ImageTypeSpecifier
     * javax.imageio.ImageTypeSpecifier.createInterleaved(java.awt.color.ColorSpace,int[],int,boolean,boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createInterleaved_ColorSpace_intArray_int_boolean_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.ImageTypeSpecifier#createIndexed(byte[],byte[],byte[],byte[],int,int) public
     * static javax.imageio.ImageTypeSpecifier
     * javax.imageio.ImageTypeSpecifier.createIndexed(byte[],byte[],byte[],byte[],int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createIndexed_byteArray_byteArray_byteArray_byteArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.ImageTypeSpecifier#createFromBufferedImageType(int) public static
     * javax.imageio.ImageTypeSpecifier javax.imageio.ImageTypeSpecifier.createFromBufferedImageType(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createFromBufferedImageType_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
