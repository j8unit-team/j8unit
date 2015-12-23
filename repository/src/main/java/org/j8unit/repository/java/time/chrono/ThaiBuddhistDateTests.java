package org.j8unit.repository.java.time.chrono;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.time.chrono.ThaiBuddhistDate class
 * java.time.chrono.ThaiBuddhistDate}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.time.chrono.ThaiBuddhistDateTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.time.chrono.ThaiBuddhistDateClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.time.chrono.ThaiBuddhistDate
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ThaiBuddhistDateTests<SUT extends java.time.chrono.ThaiBuddhistDate>
extends org.j8unit.repository.java.time.chrono.ChronoLocalDateTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
org.j8unit.repository.java.time.temporal.TemporalTests<SUT>, org.j8unit.repository.java.time.temporal.TemporalAdjusterTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>interface java.time.temporal.TemporalAdjuster</li>
     * <li>interface java.time.chrono.ChronoLocalDate</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test method within the super test classes. To solve this situation,
     * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_adjustInto_Temporal()
    throws Exception {
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ThaiBuddhistDate#atTime(java.time.LocalTime) public final
     * java.time.chrono.ChronoLocalDateTime java.time.chrono.ThaiBuddhistDate.atTime(java.time.LocalTime)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.time.chrono.ThaiBuddhistDate#atTime(java.time.LocalTime)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_atTime_LocalTime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ThaiBuddhistDate#equals(java.lang.Object) public boolean
     * java.time.chrono.ThaiBuddhistDate.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.time.chrono.ThaiBuddhistDate#equals(java.lang.Object)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ThaiBuddhistDate#getChronology() public
     * java.time.chrono.ThaiBuddhistChronology java.time.chrono.ThaiBuddhistDate.getChronology()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.time.chrono.ThaiBuddhistDate#getChronology()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getChronology()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ThaiBuddhistDate#getEra() public java.time.chrono.ThaiBuddhistEra
     * java.time.chrono.ThaiBuddhistDate.getEra()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.time.chrono.ThaiBuddhistDate#getEra()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getEra()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ThaiBuddhistDate#getLong(java.time.temporal.TemporalField) public long
     * java.time.chrono.ThaiBuddhistDate.getLong(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.time.chrono.ThaiBuddhistDate#getLong(java.time.temporal.TemporalField)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getLong_TemporalField()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ThaiBuddhistDate#hashCode() public int
     * java.time.chrono.ThaiBuddhistDate.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.time.chrono.ThaiBuddhistDate#hashCode()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>interface java.time.chrono.ChronoLocalDate</li>
     * <li>interface java.time.temporal.TemporalAccessor</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test method within the super test classes. To solve this situation,
     * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_isSupported_TemporalField()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>interface java.time.chrono.ChronoLocalDate</li>
     * <li>interface java.time.temporal.Temporal</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test method within the super test classes. To solve this situation,
     * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_isSupported_TemporalUnit()
    throws Exception {
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ThaiBuddhistDate#lengthOfMonth() public int
     * java.time.chrono.ThaiBuddhistDate.lengthOfMonth()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.time.chrono.ThaiBuddhistDate#lengthOfMonth()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_lengthOfMonth()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ThaiBuddhistDate#minus(long, java.time.temporal.TemporalUnit) public
     * java.time.chrono.ThaiBuddhistDate java.time.chrono.ThaiBuddhistDate.minus(long,java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.time.chrono.ThaiBuddhistDate#minus(long, java.time.temporal.TemporalUnit)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_minus_long_TemporalUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ThaiBuddhistDate#minus(java.time.temporal.TemporalAmount) public
     * java.time.chrono.ThaiBuddhistDate java.time.chrono.ThaiBuddhistDate.minus(java.time.temporal.TemporalAmount)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.time.chrono.ThaiBuddhistDate#minus(java.time.temporal.TemporalAmount)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_minus_TemporalAmount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ThaiBuddhistDate#plus(long, java.time.temporal.TemporalUnit) public
     * java.time.chrono.ThaiBuddhistDate java.time.chrono.ThaiBuddhistDate.plus(long,java.time.temporal.TemporalUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.time.chrono.ThaiBuddhistDate#plus(long, java.time.temporal.TemporalUnit)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_plus_long_TemporalUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ThaiBuddhistDate#plus(java.time.temporal.TemporalAmount) public
     * java.time.chrono.ThaiBuddhistDate java.time.chrono.ThaiBuddhistDate.plus(java.time.temporal.TemporalAmount)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.time.chrono.ThaiBuddhistDate#plus(java.time.temporal.TemporalAmount)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_plus_TemporalAmount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>interface java.time.chrono.ChronoLocalDate</li>
     * <li>interface java.time.temporal.TemporalAccessor</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test method within the super test classes. To solve this situation,
     * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_query_TemporalQuery()
    throws Exception {
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ThaiBuddhistDate#range(java.time.temporal.TemporalField) public
     * java.time.temporal.ValueRange java.time.chrono.ThaiBuddhistDate.range(java.time.temporal.TemporalField)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.time.chrono.ThaiBuddhistDate#range(java.time.temporal.TemporalField)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_range_TemporalField()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ThaiBuddhistDate#toEpochDay() public long
     * java.time.chrono.ThaiBuddhistDate.toEpochDay()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.time.chrono.ThaiBuddhistDate#toEpochDay()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_toEpochDay()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>class java.lang.Object</li>
     * <li>interface java.time.chrono.ChronoLocalDate</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test method within the super test classes. To solve this situation,
     * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_toString()
    throws Exception {
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ThaiBuddhistDate#until(java.time.chrono.ChronoLocalDate) public
     * java.time.chrono.ChronoPeriod java.time.chrono.ThaiBuddhistDate.until(java.time.chrono.ChronoLocalDate)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.time.chrono.ThaiBuddhistDate#until(java.time.chrono.ChronoLocalDate)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_until_ChronoLocalDate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>interface java.time.chrono.ChronoLocalDate</li>
     * <li>interface java.time.temporal.Temporal</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test method within the super test classes. To solve this situation,
     * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_until_Temporal_TemporalUnit()
    throws Exception {
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ThaiBuddhistDate#with(java.time.temporal.TemporalAdjuster) public
     * java.time.chrono.ThaiBuddhistDate java.time.chrono.ThaiBuddhistDate.with(java.time.temporal.TemporalAdjuster)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.time.chrono.ThaiBuddhistDate#with(java.time.temporal.TemporalAdjuster)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_with_TemporalAdjuster()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.ThaiBuddhistDate#with(java.time.temporal.TemporalField, long) public
     * java.time.chrono.ThaiBuddhistDate java.time.chrono.ThaiBuddhistDate.with(java.time.temporal.TemporalField,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.time.chrono.ThaiBuddhistDate#with(java.time.temporal.TemporalField, long)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_with_TemporalField_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
