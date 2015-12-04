package org.j8unit.repository.javax.lang.model;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.lang.model.AnnotatedConstruct interface javax.lang.model.AnnotatedConstruct},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.lang.model.AnnotatedConstructClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AnnotatedConstructTests<SUT extends javax.lang.model.AnnotatedConstruct>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.lang.model.AnnotatedConstruct#getAnnotationsByType(java.lang.Class) public abstract java.lang.annotation.Annotation[] javax.lang.model.AnnotatedConstruct.getAnnotationsByType(java.lang.Class)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAnnotationsByType_Class() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.AnnotatedConstruct#getAnnotation(java.lang.Class) public abstract java.lang.annotation.Annotation javax.lang.model.AnnotatedConstruct.getAnnotation(java.lang.Class)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAnnotation_Class() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.AnnotatedConstruct#getAnnotationMirrors() public abstract java.util.List javax.lang.model.AnnotatedConstruct.getAnnotationMirrors()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAnnotationMirrors() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
