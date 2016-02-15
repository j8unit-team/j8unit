package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain ThreadLocal class java.lang.ThreadLocal}. The complementary j8unit test
 * interface containing the class relevant aspects is {@link ThreadLocalClassTests}.
 * </p>
 *
 * @see ThreadLocal class java.lang.ThreadLocal (the hereby targeted class-under-test class)
 * @see ThreadLocalClassTests ThreadLocalClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ThreadLocalTests<SUT extends ThreadLocal<T>, T>
extends ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link ThreadLocal#set(Object) public void java.lang.ThreadLocal.set(T)}.
     *
     * <p>
     * Test method for {@link ThreadLocal#set(Object) public void java.lang.ThreadLocal.set(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see ThreadLocal#set(Object) public void java.lang.ThreadLocal.set(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link ThreadLocal#get() public T java.lang.ThreadLocal.get()}.
     *
     * <p>
     * Test method for {@link ThreadLocal#get() public java.lang.Object java.lang.ThreadLocal.get()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see ThreadLocal#get() public java.lang.Object java.lang.ThreadLocal.get() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link ThreadLocal#remove() public void java.lang.ThreadLocal.remove()}.
     *
     * <p>
     * Test method for {@link ThreadLocal#remove() public void java.lang.ThreadLocal.remove()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see ThreadLocal#remove() public void java.lang.ThreadLocal.remove() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_remove()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
