package org.j8unit.repository.java.sql;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.sql.Wrapper interface java.sql.Wrapper}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link WrapperClassTests}.
 * </p>
 *
 * @see java.sql.Wrapper interface java.sql.Wrapper (the hereby targeted class-under-test class)
 * @see WrapperClassTests WrapperClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface WrapperTests<SUT extends java.sql.Wrapper>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.sql.Wrapper#isWrapperFor(Class) public abstract boolean
     * java.sql.Wrapper.isWrapperFor(java.lang.Class<?>) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link java.sql.Wrapper#isWrapperFor(Class) public abstract boolean
     * java.sql.Wrapper.isWrapperFor(java.lang.Class) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.sql.Wrapper#isWrapperFor(Class) public abstract boolean java.sql.Wrapper.isWrapperFor(java.lang.Class)
     *      throws java.sql.SQLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isWrapperFor_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.sql.Wrapper#unwrap(Class) public abstract <T> T
     * java.sql.Wrapper.unwrap(java.lang.Class<T>) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link java.sql.Wrapper#unwrap(Class) public abstract java.lang.Object
     * java.sql.Wrapper.unwrap(java.lang.Class) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.sql.Wrapper#unwrap(Class) public abstract java.lang.Object java.sql.Wrapper.unwrap(java.lang.Class)
     *      throws java.sql.SQLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unwrap_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
