package org.j8unit.repository.java.lang.reflect;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.reflect.Member interface java.lang.reflect.Member}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link MemberClassTests}.
 * </p>
 *
 * @see java.lang.reflect.Member interface java.lang.reflect.Member (the hereby targeted class-under-test class)
 * @see MemberClassTests MemberClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MemberTests<SUT extends java.lang.reflect.Member>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Member#getName() public abstract java.lang.String
     * java.lang.reflect.Member.getName()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Member#getName() public abstract java.lang.String
     * java.lang.reflect.Member.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Member#getName() public abstract java.lang.String java.lang.reflect.Member.getName() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Member#getDeclaringClass() public abstract java.lang.Class
     * <?> java.lang.reflect.Member.getDeclaringClass()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Member#getDeclaringClass() public abstract java.lang.Class
     * java.lang.reflect.Member.getDeclaringClass()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Member#getDeclaringClass() public abstract java.lang.Class
     *      java.lang.reflect.Member.getDeclaringClass() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDeclaringClass()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Member#getModifiers() public abstract int
     * java.lang.reflect.Member.getModifiers()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Member#getModifiers() public abstract int
     * java.lang.reflect.Member.getModifiers()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Member#getModifiers() public abstract int java.lang.reflect.Member.getModifiers() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getModifiers()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Member#isSynthetic() public abstract boolean
     * java.lang.reflect.Member.isSynthetic()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Member#isSynthetic() public abstract boolean
     * java.lang.reflect.Member.isSynthetic()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Member#isSynthetic() public abstract boolean java.lang.reflect.Member.isSynthetic() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isSynthetic()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
