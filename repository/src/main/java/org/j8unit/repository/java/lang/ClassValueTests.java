package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain ClassValue class java.lang.ClassValue}. The complementary j8unit test
 * interface containing the class relevant aspects is {@link ClassValueClassTests}.
 * </p>
 *
 * @see ClassValue class java.lang.ClassValue (the hereby targeted class-under-test class)
 * @see ClassValueClassTests ClassValueClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ClassValueTests<SUT extends ClassValue<T>, T>
extends ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link ClassValue#get(Class) public T java.lang.ClassValue.get(java.lang.Class<?>)}.
     *
     * <p>
     * Test method for {@link ClassValue#get(Class) public java.lang.Object java.lang.ClassValue.get(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see ClassValue#get(Class) public java.lang.Object java.lang.ClassValue.get(java.lang.Class) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link ClassValue#remove(Class) public void java.lang.ClassValue.remove(java.lang.Class<?>)}.
     *
     * <p>
     * Test method for {@link ClassValue#remove(Class) public void java.lang.ClassValue.remove(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see ClassValue#remove(Class) public void java.lang.ClassValue.remove(java.lang.Class) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_remove_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
