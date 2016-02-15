package org.j8unit.repository.java.time.chrono;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.chrono.AbstractChronology class
 * java.time.chrono.AbstractChronology}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link AbstractChronologyClassTests}.
 * </p>
 *
 * @see java.time.chrono.AbstractChronology class java.time.chrono.AbstractChronology (the hereby targeted
 *      class-under-test class)
 * @see AbstractChronologyClassTests AbstractChronologyClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AbstractChronologyTests<SUT extends java.time.chrono.AbstractChronology>
extends ChronologyTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.time.chrono.AbstractChronology#toString() public java.lang.String
     * java.time.chrono.AbstractChronology.toString()}.
     *
     * <p>
     * Test method for {@link java.time.chrono.AbstractChronology#toString() public java.lang.String
     * java.time.chrono.AbstractChronology.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.AbstractChronology#toString() public java.lang.String
     *      java.time.chrono.AbstractChronology.toString() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.AbstractChronology#compareTo(java.time.chrono.Chronology) public int
     * java.time.chrono.AbstractChronology.compareTo(java.time.chrono.Chronology)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.AbstractChronology#compareTo(java.time.chrono.Chronology) public int
     * java.time.chrono.AbstractChronology.compareTo(java.time.chrono.Chronology)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.AbstractChronology#compareTo(java.time.chrono.Chronology) public int
     *      java.time.chrono.AbstractChronology.compareTo(java.time.chrono.Chronology) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_compareTo_Chronology()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.AbstractChronology#hashCode() public int
     * java.time.chrono.AbstractChronology.hashCode()}.
     *
     * <p>
     * Test method for {@link java.time.chrono.AbstractChronology#hashCode() public int
     * java.time.chrono.AbstractChronology.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.AbstractChronology#hashCode() public int java.time.chrono.AbstractChronology.hashCode()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.chrono.AbstractChronology#equals(Object) public boolean
     * java.time.chrono.AbstractChronology.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.time.chrono.AbstractChronology#equals(Object) public boolean
     * java.time.chrono.AbstractChronology.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.AbstractChronology#equals(Object) public boolean
     *      java.time.chrono.AbstractChronology.equals(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.time.chrono.AbstractChronology#resolveDate(java.util.Map, java.time.format.ResolverStyle) public
     * java.time.chrono.ChronoLocalDate
     * java.time.chrono.AbstractChronology.resolveDate(java.util.Map<java.time.temporal.TemporalField,
     * java.lang.Long>,java.time.format.ResolverStyle)}.
     *
     * <p>
     * Test method for
     * {@link java.time.chrono.AbstractChronology#resolveDate(java.util.Map, java.time.format.ResolverStyle) public
     * java.time.chrono.ChronoLocalDate
     * java.time.chrono.AbstractChronology.resolveDate(java.util.Map,java.time.format.ResolverStyle)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.chrono.AbstractChronology#resolveDate(java.util.Map, java.time.format.ResolverStyle) public
     *      java.time.chrono.ChronoLocalDate
     *      java.time.chrono.AbstractChronology.resolveDate(java.util.Map,java.time.format.ResolverStyle) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_resolveDate_Map_ResolverStyle()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
