package org.j8unit.repository.java.awt.image;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.image.ConvolveOp class java.awt.image.ConvolveOp}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.awt.image.ConvolveOpTests}.
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
 * @see org.j8unit.repository.java.awt.image.ConvolveOpTests
 */
@Category(J8UnitRepository.class)
public abstract interface ConvolveOpClassTests<SUT extends Class<? extends java.awt.image.ConvolveOp>>
extends org.j8unit.repository.java.awt.image.BufferedImageOpClassTests<SUT>, org.j8unit.repository.java.awt.image.RasterOpClassTests<SUT>,
org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link java.awt.image.ConvolveOp#ConvolveOp(java.awt.image.Kernel) public
     * java.awt.image.ConvolveOp(java.awt.image.Kernel)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ConvolveOp_Kernel()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.image.ConvolveOp sut = null; // = new ConvolveOp(java.awt.image.Kernel);
    }

    /**
     * Test method for {@link java.awt.image.ConvolveOp#ConvolveOp(java.awt.image.Kernel,int,java.awt.RenderingHints)
     * public java.awt.image.ConvolveOp(java.awt.image.Kernel,int,java.awt.RenderingHints)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ConvolveOp_Kernel_int_RenderingHints()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.image.ConvolveOp sut = null; // = new
                                                    // ConvolveOp(java.awt.image.Kernel,int,java.awt.RenderingHints);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.awt.image.ConvolveOp> sut = createNewSUT();
        // assert assignability
        assertTrue(java.awt.image.ConvolveOp.class.isAssignableFrom(sut));
    }

}
