package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.lang.model.element.AnnotationMirror interface
 * javax.lang.model.element.AnnotationMirror}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.lang.model.element.AnnotationMirrorTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.lang.model.element.AnnotationMirrorClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.lang.model.element.AnnotationMirror
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AnnotationMirrorTests<SUT extends javax.lang.model.element.AnnotationMirror>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.AnnotationMirror#getAnnotationType() public abstract
     * javax.lang.model.type.DeclaredType javax.lang.model.element.AnnotationMirror.getAnnotationType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.lang.model.element.AnnotationMirror#getAnnotationType()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAnnotationType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.AnnotationMirror#getElementValues() public abstract java.util.Map
     * javax.lang.model.element.AnnotationMirror.getElementValues()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.lang.model.element.AnnotationMirror#getElementValues()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getElementValues()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
