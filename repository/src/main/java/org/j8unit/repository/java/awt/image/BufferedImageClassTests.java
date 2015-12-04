package org.j8unit.repository.java.awt.image;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.image.BufferedImage class java.awt.image.BufferedImage}, containing all class relevant
 * test methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.awt.image.BufferedImageTests}.
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
 * @see org.j8unit.repository.java.awt.image.BufferedImageTests
 */
@Category(J8UnitRepository.class)
public abstract interface BufferedImageClassTests<SUT extends Class<? extends java.awt.image.BufferedImage>>
extends org.j8unit.repository.java.awt.image.WritableRenderedImageClassTests<SUT>, org.j8unit.repository.java.awt.TransparencyClassTests<SUT>,
org.j8unit.repository.java.awt.ImageClassTests<SUT> {

    /**
     * Test method for {@link java.awt.image.BufferedImage#BufferedImage(int,int,int,java.awt.image.IndexColorModel)
     * public java.awt.image.BufferedImage(int,int,int,java.awt.image.IndexColorModel)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BufferedImage_int_int_int_IndexColorModel()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.image.BufferedImage sut = null; // = new
                                                       // BufferedImage(int,int,int,java.awt.image.IndexColorModel);
    }

    /**
     * Test method for {@link java.awt.image.BufferedImage#BufferedImage(int,int,int) public
     * java.awt.image.BufferedImage(int,int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BufferedImage_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.image.BufferedImage sut = null; // = new BufferedImage(int,int,int);
    }

    /**
     * Test method for
     * {@link java.awt.image.BufferedImage#BufferedImage(java.awt.image.ColorModel,java.awt.image.WritableRaster,boolean,java.util.Hashtable)
     * public
     * java.awt.image.BufferedImage(java.awt.image.ColorModel,java.awt.image.WritableRaster,boolean,java.util.Hashtable)}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BufferedImage_ColorModel_WritableRaster_boolean_Hashtable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.image.BufferedImage sut = null; // = new
                                                       // BufferedImage(java.awt.image.ColorModel,java.awt.image.WritableRaster,boolean,java.util.Hashtable);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.awt.image.BufferedImage> sut = createNewSUT();
        // assert assignability
        assertTrue(java.awt.image.BufferedImage.class.isAssignableFrom(sut));
    }

}
