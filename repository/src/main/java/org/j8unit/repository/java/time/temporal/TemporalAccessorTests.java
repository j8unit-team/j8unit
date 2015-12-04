package org.j8unit.repository.java.time.temporal;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.time.temporal.TemporalAccessor interface java.time.temporal.TemporalAccessor}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.time.temporal.TemporalAccessorClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TemporalAccessorTests<SUT extends java.time.temporal.TemporalAccessor>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalAccessor#get(java.time.temporal.TemporalField) public default
     * int java.time.temporal.TemporalAccessor.get(java.time.temporal.TemporalField)}.
     * </p>
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
     * Test method for {@link java.time.temporal.TemporalAccessor#getLong(java.time.temporal.TemporalField) public
     * abstract long java.time.temporal.TemporalAccessor.getLong(java.time.temporal.TemporalField)}.
     * </p>
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

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalAccessor#isSupported(java.time.temporal.TemporalField) public
     * abstract boolean java.time.temporal.TemporalAccessor.isSupported(java.time.temporal.TemporalField)}.
     * </p>
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
     * Test method for {@link java.time.temporal.TemporalAccessor#query(java.time.temporal.TemporalQuery) public default
     * java.lang.Object java.time.temporal.TemporalAccessor.query(java.time.temporal.TemporalQuery)}.
     * </p>
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
     * Test method for {@link java.time.temporal.TemporalAccessor#range(java.time.temporal.TemporalField) public default
     * java.time.temporal.ValueRange java.time.temporal.TemporalAccessor.range(java.time.temporal.TemporalField)}.
     * </p>
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

}
