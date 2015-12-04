package org.j8unit.repository.java.lang.reflect;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.lang.reflect.AnnotatedWildcardType interface java.lang.reflect.AnnotatedWildcardType},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.lang.reflect.AnnotatedWildcardTypeClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AnnotatedWildcardTypeTests<SUT extends java.lang.reflect.AnnotatedWildcardType>
extends org.j8unit.repository.java.lang.reflect.AnnotatedTypeTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.reflect.AnnotatedWildcardType#getAnnotatedLowerBounds() public abstract
     * java.lang.reflect.AnnotatedType[] java.lang.reflect.AnnotatedWildcardType.getAnnotatedLowerBounds()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAnnotatedLowerBounds()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.AnnotatedWildcardType#getAnnotatedUpperBounds() public abstract
     * java.lang.reflect.AnnotatedType[] java.lang.reflect.AnnotatedWildcardType.getAnnotatedUpperBounds()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAnnotatedUpperBounds()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
