package org.j8unit.repository.java.time.temporal;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.time.temporal.TemporalAdjusters class java.time.temporal.TemporalAdjusters}, containing
 * all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.time.temporal.TemporalAdjustersTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a> Thus,
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable test
 * method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.time.temporal.TemporalAdjustersTests
 */
@Category(J8UnitRepository.class)
public abstract interface TemporalAdjustersClassTests<SUT extends Class<? extends java.time.temporal.TemporalAdjusters>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.time.temporal.TemporalAdjusters> sut = createNewSUT();
        // assert assignability
        assertTrue(java.time.temporal.TemporalAdjusters.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalAdjusters#lastDayOfYear() public static
     * java.time.temporal.TemporalAdjuster java.time.temporal.TemporalAdjusters.lastDayOfYear()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lastDayOfYear()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalAdjusters#previousOrSame(java.time.DayOfWeek) public static
     * java.time.temporal.TemporalAdjuster java.time.temporal.TemporalAdjusters.previousOrSame(java.time.DayOfWeek)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_previousOrSame_DayOfWeek()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalAdjusters#dayOfWeekInMonth(int,java.time.DayOfWeek) public
     * static java.time.temporal.TemporalAdjuster
     * java.time.temporal.TemporalAdjusters.dayOfWeekInMonth(int,java.time.DayOfWeek)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dayOfWeekInMonth_int_DayOfWeek()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalAdjusters#firstInMonth(java.time.DayOfWeek) public static
     * java.time.temporal.TemporalAdjuster java.time.temporal.TemporalAdjusters.firstInMonth(java.time.DayOfWeek)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_firstInMonth_DayOfWeek()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalAdjusters#nextOrSame(java.time.DayOfWeek) public static
     * java.time.temporal.TemporalAdjuster java.time.temporal.TemporalAdjusters.nextOrSame(java.time.DayOfWeek)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_nextOrSame_DayOfWeek()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalAdjusters#firstDayOfMonth() public static
     * java.time.temporal.TemporalAdjuster java.time.temporal.TemporalAdjusters.firstDayOfMonth()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_firstDayOfMonth()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalAdjusters#firstDayOfNextYear() public static
     * java.time.temporal.TemporalAdjuster java.time.temporal.TemporalAdjusters.firstDayOfNextYear()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_firstDayOfNextYear()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalAdjusters#lastDayOfMonth() public static
     * java.time.temporal.TemporalAdjuster java.time.temporal.TemporalAdjusters.lastDayOfMonth()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lastDayOfMonth()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalAdjusters#next(java.time.DayOfWeek) public static
     * java.time.temporal.TemporalAdjuster java.time.temporal.TemporalAdjusters.next(java.time.DayOfWeek)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_next_DayOfWeek()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalAdjusters#ofDateAdjuster(java.util.function.UnaryOperator)
     * public static java.time.temporal.TemporalAdjuster
     * java.time.temporal.TemporalAdjusters.ofDateAdjuster(java.util.function.UnaryOperator)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_ofDateAdjuster_UnaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalAdjusters#firstDayOfYear() public static
     * java.time.temporal.TemporalAdjuster java.time.temporal.TemporalAdjusters.firstDayOfYear()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_firstDayOfYear()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalAdjusters#previous(java.time.DayOfWeek) public static
     * java.time.temporal.TemporalAdjuster java.time.temporal.TemporalAdjusters.previous(java.time.DayOfWeek)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_previous_DayOfWeek()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalAdjusters#lastInMonth(java.time.DayOfWeek) public static
     * java.time.temporal.TemporalAdjuster java.time.temporal.TemporalAdjusters.lastInMonth(java.time.DayOfWeek)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lastInMonth_DayOfWeek()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalAdjusters#firstDayOfNextMonth() public static
     * java.time.temporal.TemporalAdjuster java.time.temporal.TemporalAdjusters.firstDayOfNextMonth()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_firstDayOfNextMonth()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
