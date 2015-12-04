package org.j8unit.repository.java.lang.reflect;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.lang.reflect.WildcardType interface java.lang.reflect.WildcardType},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.lang.reflect.WildcardTypeClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface WildcardTypeTests<SUT extends java.lang.reflect.WildcardType>
extends org.j8unit.repository.java.lang.reflect.TypeTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.lang.reflect.WildcardType#getUpperBounds() public abstract java.lang.reflect.Type[] java.lang.reflect.WildcardType.getUpperBounds()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUpperBounds() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.WildcardType#getLowerBounds() public abstract java.lang.reflect.Type[] java.lang.reflect.WildcardType.getLowerBounds()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLowerBounds() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
