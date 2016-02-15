package org.j8unit.repository.java.time.temporal;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.temporal.TemporalAccessor interface
 * java.time.temporal.TemporalAccessor}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link TemporalAccessorClassTests}.
 * </p>
 *
 * @see java.time.temporal.TemporalAccessor interface java.time.temporal.TemporalAccessor (the hereby targeted
 *      class-under-test class)
 * @see TemporalAccessorClassTests TemporalAccessorClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TemporalAccessorTests<SUT extends java.time.temporal.TemporalAccessor>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalAccessor#isSupported(java.time.temporal.TemporalField) public
     * abstract boolean java.time.temporal.TemporalAccessor.isSupported(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.temporal.TemporalAccessor#isSupported(java.time.temporal.TemporalField) public
     * abstract boolean java.time.temporal.TemporalAccessor.isSupported(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.TemporalAccessor#isSupported(java.time.temporal.TemporalField) public abstract boolean
     *      java.time.temporal.TemporalAccessor.isSupported(java.time.temporal.TemporalField) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isSupported_TemporalField()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalAccessor#range(java.time.temporal.TemporalField) public default
     * java.time.temporal.ValueRange java.time.temporal.TemporalAccessor.range(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.temporal.TemporalAccessor#range(java.time.temporal.TemporalField) public default
     * java.time.temporal.ValueRange java.time.temporal.TemporalAccessor.range(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.TemporalAccessor#range(java.time.temporal.TemporalField) public default
     *      java.time.temporal.ValueRange java.time.temporal.TemporalAccessor.range(java.time.temporal.TemporalField)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_range_TemporalField()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalAccessor#get(java.time.temporal.TemporalField) public default
     * int java.time.temporal.TemporalAccessor.get(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.temporal.TemporalAccessor#get(java.time.temporal.TemporalField) public default
     * int java.time.temporal.TemporalAccessor.get(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.TemporalAccessor#get(java.time.temporal.TemporalField) public default int
     *      java.time.temporal.TemporalAccessor.get(java.time.temporal.TemporalField) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_TemporalField()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalAccessor#query(java.time.temporal.TemporalQuery) public default
     * <R> R java.time.temporal.TemporalAccessor.query(java.time.temporal.TemporalQuery<R>)}.
     *
     * <p>
     * Test method for {@link java.time.temporal.TemporalAccessor#query(java.time.temporal.TemporalQuery) public default
     * java.lang.Object java.time.temporal.TemporalAccessor.query(java.time.temporal.TemporalQuery)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.TemporalAccessor#query(java.time.temporal.TemporalQuery) public default java.lang.Object
     *      java.time.temporal.TemporalAccessor.query(java.time.temporal.TemporalQuery) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_query_TemporalQuery()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalAccessor#getLong(java.time.temporal.TemporalField) public
     * abstract long java.time.temporal.TemporalAccessor.getLong(java.time.temporal.TemporalField)}.
     *
     * <p>
     * Test method for {@link java.time.temporal.TemporalAccessor#getLong(java.time.temporal.TemporalField) public
     * abstract long java.time.temporal.TemporalAccessor.getLong(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.temporal.TemporalAccessor#getLong(java.time.temporal.TemporalField) public abstract long
     *      java.time.temporal.TemporalAccessor.getLong(java.time.temporal.TemporalField) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLong_TemporalField()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
