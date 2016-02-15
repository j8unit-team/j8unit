package org.j8unit.repository.java.time.zone;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.zone.ZoneRules class java.time.zone.ZoneRules}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ZoneRulesClassTests}.
 * </p>
 *
 * @see java.time.zone.ZoneRules class java.time.zone.ZoneRules (the hereby targeted class-under-test class)
 * @see ZoneRulesClassTests ZoneRulesClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ZoneRulesTests<SUT extends java.time.zone.ZoneRules>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.time.zone.ZoneRules#isFixedOffset() public boolean
     * java.time.zone.ZoneRules.isFixedOffset()}.
     *
     * <p>
     * Test method for {@link java.time.zone.ZoneRules#isFixedOffset() public boolean
     * java.time.zone.ZoneRules.isFixedOffset()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.zone.ZoneRules#isFixedOffset() public boolean java.time.zone.ZoneRules.isFixedOffset() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isFixedOffset()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.zone.ZoneRules#equals(Object) public boolean
     * java.time.zone.ZoneRules.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.time.zone.ZoneRules#equals(Object) public boolean
     * java.time.zone.ZoneRules.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.zone.ZoneRules#equals(Object) public boolean java.time.zone.ZoneRules.equals(java.lang.Object)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.zone.ZoneRules#getTransition(java.time.LocalDateTime) public
     * java.time.zone.ZoneOffsetTransition java.time.zone.ZoneRules.getTransition(java.time.LocalDateTime)}.
     *
     * <p>
     * Test method for {@link java.time.zone.ZoneRules#getTransition(java.time.LocalDateTime) public
     * java.time.zone.ZoneOffsetTransition java.time.zone.ZoneRules.getTransition(java.time.LocalDateTime)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.zone.ZoneRules#getTransition(java.time.LocalDateTime) public java.time.zone.ZoneOffsetTransition
     *      java.time.zone.ZoneRules.getTransition(java.time.LocalDateTime) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTransition_LocalDateTime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.zone.ZoneRules#getValidOffsets(java.time.LocalDateTime) public java.util.List
     * <java.time.ZoneOffset> java.time.zone.ZoneRules.getValidOffsets(java.time.LocalDateTime)}.
     *
     * <p>
     * Test method for {@link java.time.zone.ZoneRules#getValidOffsets(java.time.LocalDateTime) public java.util.List
     * java.time.zone.ZoneRules.getValidOffsets(java.time.LocalDateTime)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.zone.ZoneRules#getValidOffsets(java.time.LocalDateTime) public java.util.List
     *      java.time.zone.ZoneRules.getValidOffsets(java.time.LocalDateTime) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getValidOffsets_LocalDateTime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.zone.ZoneRules#hashCode() public int java.time.zone.ZoneRules.hashCode()}.
     *
     * <p>
     * Test method for {@link java.time.zone.ZoneRules#hashCode() public int java.time.zone.ZoneRules.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.zone.ZoneRules#hashCode() public int java.time.zone.ZoneRules.hashCode() (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.time.zone.ZoneRules#isValidOffset(java.time.LocalDateTime, java.time.ZoneOffset)
     * public boolean java.time.zone.ZoneRules.isValidOffset(java.time.LocalDateTime,java.time.ZoneOffset)}.
     *
     * <p>
     * Test method for {@link java.time.zone.ZoneRules#isValidOffset(java.time.LocalDateTime, java.time.ZoneOffset)
     * public boolean java.time.zone.ZoneRules.isValidOffset(java.time.LocalDateTime,java.time.ZoneOffset)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.zone.ZoneRules#isValidOffset(java.time.LocalDateTime, java.time.ZoneOffset) public boolean
     *      java.time.zone.ZoneRules.isValidOffset(java.time.LocalDateTime,java.time.ZoneOffset) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isValidOffset_LocalDateTime_ZoneOffset()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.zone.ZoneRules#isDaylightSavings(java.time.Instant) public boolean
     * java.time.zone.ZoneRules.isDaylightSavings(java.time.Instant)}.
     *
     * <p>
     * Test method for {@link java.time.zone.ZoneRules#isDaylightSavings(java.time.Instant) public boolean
     * java.time.zone.ZoneRules.isDaylightSavings(java.time.Instant)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.zone.ZoneRules#isDaylightSavings(java.time.Instant) public boolean
     *      java.time.zone.ZoneRules.isDaylightSavings(java.time.Instant) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isDaylightSavings_Instant()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.zone.ZoneRules#toString() public java.lang.String
     * java.time.zone.ZoneRules.toString()}.
     *
     * <p>
     * Test method for {@link java.time.zone.ZoneRules#toString() public java.lang.String
     * java.time.zone.ZoneRules.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.zone.ZoneRules#toString() public java.lang.String java.time.zone.ZoneRules.toString() (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.time.zone.ZoneRules#getStandardOffset(java.time.Instant) public java.time.ZoneOffset
     * java.time.zone.ZoneRules.getStandardOffset(java.time.Instant)}.
     *
     * <p>
     * Test method for {@link java.time.zone.ZoneRules#getStandardOffset(java.time.Instant) public java.time.ZoneOffset
     * java.time.zone.ZoneRules.getStandardOffset(java.time.Instant)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.zone.ZoneRules#getStandardOffset(java.time.Instant) public java.time.ZoneOffset
     *      java.time.zone.ZoneRules.getStandardOffset(java.time.Instant) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStandardOffset_Instant()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.zone.ZoneRules#nextTransition(java.time.Instant) public
     * java.time.zone.ZoneOffsetTransition java.time.zone.ZoneRules.nextTransition(java.time.Instant)}.
     *
     * <p>
     * Test method for {@link java.time.zone.ZoneRules#nextTransition(java.time.Instant) public
     * java.time.zone.ZoneOffsetTransition java.time.zone.ZoneRules.nextTransition(java.time.Instant)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.zone.ZoneRules#nextTransition(java.time.Instant) public java.time.zone.ZoneOffsetTransition
     *      java.time.zone.ZoneRules.nextTransition(java.time.Instant) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_nextTransition_Instant()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.zone.ZoneRules#getTransitionRules() public java.util.List
     * <java.time.zone.ZoneOffsetTransitionRule> java.time.zone.ZoneRules.getTransitionRules()}.
     *
     * <p>
     * Test method for {@link java.time.zone.ZoneRules#getTransitionRules() public java.util.List
     * java.time.zone.ZoneRules.getTransitionRules()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.zone.ZoneRules#getTransitionRules() public java.util.List
     *      java.time.zone.ZoneRules.getTransitionRules() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTransitionRules()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.zone.ZoneRules#previousTransition(java.time.Instant) public
     * java.time.zone.ZoneOffsetTransition java.time.zone.ZoneRules.previousTransition(java.time.Instant)}.
     *
     * <p>
     * Test method for {@link java.time.zone.ZoneRules#previousTransition(java.time.Instant) public
     * java.time.zone.ZoneOffsetTransition java.time.zone.ZoneRules.previousTransition(java.time.Instant)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.zone.ZoneRules#previousTransition(java.time.Instant) public java.time.zone.ZoneOffsetTransition
     *      java.time.zone.ZoneRules.previousTransition(java.time.Instant) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_previousTransition_Instant()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.zone.ZoneRules#getOffset(java.time.LocalDateTime) public java.time.ZoneOffset
     * java.time.zone.ZoneRules.getOffset(java.time.LocalDateTime)}.
     *
     * <p>
     * Test method for {@link java.time.zone.ZoneRules#getOffset(java.time.LocalDateTime) public java.time.ZoneOffset
     * java.time.zone.ZoneRules.getOffset(java.time.LocalDateTime)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.zone.ZoneRules#getOffset(java.time.LocalDateTime) public java.time.ZoneOffset
     *      java.time.zone.ZoneRules.getOffset(java.time.LocalDateTime) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOffset_LocalDateTime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.zone.ZoneRules#getOffset(java.time.Instant) public java.time.ZoneOffset
     * java.time.zone.ZoneRules.getOffset(java.time.Instant)}.
     *
     * <p>
     * Test method for {@link java.time.zone.ZoneRules#getOffset(java.time.Instant) public java.time.ZoneOffset
     * java.time.zone.ZoneRules.getOffset(java.time.Instant)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.zone.ZoneRules#getOffset(java.time.Instant) public java.time.ZoneOffset
     *      java.time.zone.ZoneRules.getOffset(java.time.Instant) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOffset_Instant()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.zone.ZoneRules#getTransitions() public java.util.List
     * <java.time.zone.ZoneOffsetTransition> java.time.zone.ZoneRules.getTransitions()}.
     *
     * <p>
     * Test method for {@link java.time.zone.ZoneRules#getTransitions() public java.util.List
     * java.time.zone.ZoneRules.getTransitions()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.zone.ZoneRules#getTransitions() public java.util.List java.time.zone.ZoneRules.getTransitions()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTransitions()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.zone.ZoneRules#getDaylightSavings(java.time.Instant) public java.time.Duration
     * java.time.zone.ZoneRules.getDaylightSavings(java.time.Instant)}.
     *
     * <p>
     * Test method for {@link java.time.zone.ZoneRules#getDaylightSavings(java.time.Instant) public java.time.Duration
     * java.time.zone.ZoneRules.getDaylightSavings(java.time.Instant)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.zone.ZoneRules#getDaylightSavings(java.time.Instant) public java.time.Duration
     *      java.time.zone.ZoneRules.getDaylightSavings(java.time.Instant) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDaylightSavings_Instant()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
