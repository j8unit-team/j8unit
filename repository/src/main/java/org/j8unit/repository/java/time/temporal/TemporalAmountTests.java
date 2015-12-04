package org.j8unit.repository.java.time.temporal;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.time.temporal.TemporalAmount interface java.time.temporal.TemporalAmount}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.time.temporal.TemporalAmountClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface TemporalAmountTests<SUT extends java.time.temporal.TemporalAmount>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalAmount#addTo(java.time.temporal.Temporal) public abstract
     * java.time.temporal.Temporal java.time.temporal.TemporalAmount.addTo(java.time.temporal.Temporal)}.
     * </p>
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
     * Test method for {@link java.time.temporal.TemporalAmount#getUnits() public abstract java.util.List
     * java.time.temporal.TemporalAmount.getUnits()}.
     * </p>
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
     * Test method for {@link java.time.temporal.TemporalAmount#get(java.time.temporal.TemporalUnit) public abstract
     * long java.time.temporal.TemporalAmount.get(java.time.temporal.TemporalUnit)}.
     * </p>
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
     * Test method for {@link java.time.temporal.TemporalAmount#subtractFrom(java.time.temporal.Temporal) public
     * abstract java.time.temporal.Temporal java.time.temporal.TemporalAmount.subtractFrom(java.time.temporal.Temporal)}
     * .
     * </p>
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
