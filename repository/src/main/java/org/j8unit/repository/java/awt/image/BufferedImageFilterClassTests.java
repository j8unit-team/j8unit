package org.j8unit.repository.java.awt.image;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.awt.image.BufferedImageFilter class
 * java.awt.image.BufferedImageFilter}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.java.awt.image.BufferedImageFilterTests}.
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
 * @see org.j8unit.repository.java.awt.image.BufferedImageFilterTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.awt.image.BufferedImageFilter
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BufferedImageFilterClassTests<SUT extends java.awt.image.BufferedImageFilter>
extends org.j8unit.repository.java.lang.CloneableClassTests<SUT>, org.j8unit.repository.java.awt.image.ImageFilterClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImageFilter#BufferedImageFilter(java.awt.image.BufferedImageOp)
     * public java.awt.image.BufferedImageFilter(java.awt.image.BufferedImageOp)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.image.BufferedImageFilter#BufferedImageFilter(java.awt.image.BufferedImageOp)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BufferedImageFilter_BufferedImageOp()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.image.BufferedImageFilter sut = null; // = new
                                                             // BufferedImageFilter(java.awt.image.BufferedImageOp);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.awt.image.BufferedImageFilter#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.awt.image.BufferedImageFilter.class.isAssignableFrom(sut));
    }

}
