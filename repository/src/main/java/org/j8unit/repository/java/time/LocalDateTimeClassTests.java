package org.j8unit.repository.java.time;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.time.LocalDateTime class java.time.LocalDateTime}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.time.LocalDateTimeTests}.
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
 *            the class' type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.time.LocalDateTimeTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LocalDateTimeClassTests<SUT extends java.time.LocalDateTime>
extends org.j8unit.repository.java.time.temporal.TemporalClassTests<SUT>, org.j8unit.repository.java.time.temporal.TemporalAdjusterClassTests<SUT>,
org.j8unit.repository.java.time.chrono.ChronoLocalDateTimeClassTests<SUT, java.time.LocalDate>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#from(java.time.temporal.TemporalAccessor) public static
     * java.time.LocalDateTime java.time.LocalDateTime.from(java.time.temporal.TemporalAccessor)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_from_TemporalAccessor()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#now() public static java.time.LocalDateTime
     * java.time.LocalDateTime.now()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_now()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#now(java.time.Clock) public static java.time.LocalDateTime
     * java.time.LocalDateTime.now(java.time.Clock)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_now_Clock()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#now(java.time.ZoneId) public static java.time.LocalDateTime
     * java.time.LocalDateTime.now(java.time.ZoneId)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_now_ZoneId()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#of(int,int,int,int,int) public static java.time.LocalDateTime
     * java.time.LocalDateTime.of(int,int,int,int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_of_int_int_int_int_int()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#of(int,int,int,int,int,int) public static java.time.LocalDateTime
     * java.time.LocalDateTime.of(int,int,int,int,int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_of_int_int_int_int_int_int()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#of(int,int,int,int,int,int,int) public static
     * java.time.LocalDateTime java.time.LocalDateTime.of(int,int,int,int,int,int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_of_int_int_int_int_int_int_int()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#of(int,java.time.Month,int,int,int) public static
     * java.time.LocalDateTime java.time.LocalDateTime.of(int,java.time.Month,int,int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_of_int_Month_int_int_int()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#of(int,java.time.Month,int,int,int,int) public static
     * java.time.LocalDateTime java.time.LocalDateTime.of(int,java.time.Month,int,int,int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_of_int_Month_int_int_int_int()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#of(int,java.time.Month,int,int,int,int,int) public static
     * java.time.LocalDateTime java.time.LocalDateTime.of(int,java.time.Month,int,int,int,int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_of_int_Month_int_int_int_int_int()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#of(java.time.LocalDate,java.time.LocalTime) public static
     * java.time.LocalDateTime java.time.LocalDateTime.of(java.time.LocalDate,java.time.LocalTime)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_of_LocalDate_LocalTime()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#ofEpochSecond(long,int,java.time.ZoneOffset) public static
     * java.time.LocalDateTime java.time.LocalDateTime.ofEpochSecond(long,int,java.time.ZoneOffset)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_ofEpochSecond_long_int_ZoneOffset()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#ofInstant(java.time.Instant,java.time.ZoneId) public static
     * java.time.LocalDateTime java.time.LocalDateTime.ofInstant(java.time.Instant,java.time.ZoneId)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_ofInstant_Instant_ZoneId()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#parse(java.lang.CharSequence) public static
     * java.time.LocalDateTime java.time.LocalDateTime.parse(java.lang.CharSequence)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_parse_CharSequence()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.LocalDateTime#parse(java.lang.CharSequence,java.time.format.DateTimeFormatter)
     * public static java.time.LocalDateTime
     * java.time.LocalDateTime.parse(java.lang.CharSequence,java.time.format.DateTimeFormatter)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_parse_CharSequence_DateTimeFormatter()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.time.LocalDateTime.class.isAssignableFrom(sut));
    }

}
