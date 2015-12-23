package org.j8unit.repository.java.time.temporal;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.time.temporal.TemporalAmount interface
 * java.time.temporal.TemporalAmount}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.time.temporal.TemporalAmountTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.time.temporal.TemporalAmountClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.time.temporal.TemporalAmount
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TemporalAmountTests<SUT extends java.time.temporal.TemporalAmount>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalAmount#addTo(java.time.temporal.Temporal) public abstract
     * java.time.temporal.Temporal java.time.temporal.TemporalAmount.addTo(java.time.temporal.Temporal)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.time.temporal.TemporalAmount#addTo(java.time.temporal.Temporal)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addTo_Temporal()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalAmount#get(java.time.temporal.TemporalUnit) public abstract
     * long java.time.temporal.TemporalAmount.get(java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.time.temporal.TemporalAmount#get(java.time.temporal.TemporalUnit)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_TemporalUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalAmount#getUnits() public abstract java.util.List
     * java.time.temporal.TemporalAmount.getUnits()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.time.temporal.TemporalAmount#getUnits()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUnits()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalAmount#subtractFrom(java.time.temporal.Temporal) public
     * abstract java.time.temporal.Temporal java.time.temporal.TemporalAmount.subtractFrom(java.time.temporal.Temporal)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.time.temporal.TemporalAmount#subtractFrom(java.time.temporal.Temporal)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_subtractFrom_Temporal()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
