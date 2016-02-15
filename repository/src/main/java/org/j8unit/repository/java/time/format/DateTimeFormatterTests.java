package org.j8unit.repository.java.time.format;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.format.DateTimeFormatter class
 * java.time.format.DateTimeFormatter}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link DateTimeFormatterClassTests}.
 * </p>
 *
 * @see java.time.format.DateTimeFormatter class java.time.format.DateTimeFormatter (the hereby targeted
 *      class-under-test class)
 * @see DateTimeFormatterClassTests DateTimeFormatterClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DateTimeFormatterTests<SUT extends java.time.format.DateTimeFormatter>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.time.format.DateTimeFormatter#formatTo(java.time.temporal.TemporalAccessor, Appendable) public void
     * java.time.format.DateTimeFormatter.formatTo(java.time.temporal.TemporalAccessor,java.lang.Appendable)}.
     *
     * <p>
     * Test method for
     * {@link java.time.format.DateTimeFormatter#formatTo(java.time.temporal.TemporalAccessor, Appendable) public void
     * java.time.format.DateTimeFormatter.formatTo(java.time.temporal.TemporalAccessor,java.lang.Appendable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.format.DateTimeFormatter#formatTo(java.time.temporal.TemporalAccessor, Appendable) public void
     *      java.time.format.DateTimeFormatter.formatTo(java.time.temporal.TemporalAccessor,java.lang.Appendable) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_formatTo_TemporalAccessor_Appendable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#toFormat(java.time.temporal.TemporalQuery) public
     * java.text.Format java.time.format.DateTimeFormatter.toFormat(java.time.temporal.TemporalQuery<?>)}.
     *
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#toFormat(java.time.temporal.TemporalQuery) public
     * java.text.Format java.time.format.DateTimeFormatter.toFormat(java.time.temporal.TemporalQuery)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.format.DateTimeFormatter#toFormat(java.time.temporal.TemporalQuery) public java.text.Format
     *      java.time.format.DateTimeFormatter.toFormat(java.time.temporal.TemporalQuery) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toFormat_TemporalQuery()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#toFormat() public java.text.Format
     * java.time.format.DateTimeFormatter.toFormat()}.
     *
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#toFormat() public java.text.Format
     * java.time.format.DateTimeFormatter.toFormat()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.format.DateTimeFormatter#toFormat() public java.text.Format
     *      java.time.format.DateTimeFormatter.toFormat() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toFormat()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#withChronology(java.time.chrono.Chronology) public
     * java.time.format.DateTimeFormatter
     * java.time.format.DateTimeFormatter.withChronology(java.time.chrono.Chronology)}.
     *
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#withChronology(java.time.chrono.Chronology) public
     * java.time.format.DateTimeFormatter
     * java.time.format.DateTimeFormatter.withChronology(java.time.chrono.Chronology)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.format.DateTimeFormatter#withChronology(java.time.chrono.Chronology) public
     *      java.time.format.DateTimeFormatter
     *      java.time.format.DateTimeFormatter.withChronology(java.time.chrono.Chronology) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_withChronology_Chronology()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#withDecimalStyle(java.time.format.DecimalStyle) public
     * java.time.format.DateTimeFormatter
     * java.time.format.DateTimeFormatter.withDecimalStyle(java.time.format.DecimalStyle)}.
     *
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#withDecimalStyle(java.time.format.DecimalStyle) public
     * java.time.format.DateTimeFormatter
     * java.time.format.DateTimeFormatter.withDecimalStyle(java.time.format.DecimalStyle)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.format.DateTimeFormatter#withDecimalStyle(java.time.format.DecimalStyle) public
     *      java.time.format.DateTimeFormatter
     *      java.time.format.DateTimeFormatter.withDecimalStyle(java.time.format.DecimalStyle) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_withDecimalStyle_DecimalStyle()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#parseUnresolved(CharSequence, java.text.ParsePosition)
     * public java.time.temporal.TemporalAccessor
     * java.time.format.DateTimeFormatter.parseUnresolved(java.lang.CharSequence,java.text.ParsePosition)}.
     *
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#parseUnresolved(CharSequence, java.text.ParsePosition)
     * public java.time.temporal.TemporalAccessor
     * java.time.format.DateTimeFormatter.parseUnresolved(java.lang.CharSequence,java.text.ParsePosition)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.format.DateTimeFormatter#parseUnresolved(CharSequence, java.text.ParsePosition) public
     *      java.time.temporal.TemporalAccessor
     *      java.time.format.DateTimeFormatter.parseUnresolved(java.lang.CharSequence,java.text.ParsePosition) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_parseUnresolved_CharSequence_ParsePosition()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#getLocale() public java.util.Locale
     * java.time.format.DateTimeFormatter.getLocale()}.
     *
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#getLocale() public java.util.Locale
     * java.time.format.DateTimeFormatter.getLocale()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.format.DateTimeFormatter#getLocale() public java.util.Locale
     *      java.time.format.DateTimeFormatter.getLocale() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLocale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#withResolverFields(java.util.Set) public
     * java.time.format.DateTimeFormatter java.time.format.DateTimeFormatter.withResolverFields(java.util.Set
     * <java.time.temporal.TemporalField>)}.
     *
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#withResolverFields(java.util.Set) public
     * java.time.format.DateTimeFormatter java.time.format.DateTimeFormatter.withResolverFields(java.util.Set)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.format.DateTimeFormatter#withResolverFields(java.util.Set) public
     *      java.time.format.DateTimeFormatter java.time.format.DateTimeFormatter.withResolverFields(java.util.Set) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_withResolverFields_Set()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#withResolverFields(java.time.temporal.TemporalField...)
     * public java.time.format.DateTimeFormatter
     * java.time.format.DateTimeFormatter.withResolverFields(java.time.temporal.TemporalField...)}.
     *
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#withResolverFields(java.time.temporal.TemporalField...)
     * public java.time.format.DateTimeFormatter
     * java.time.format.DateTimeFormatter.withResolverFields(java.time.temporal.TemporalField...)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.format.DateTimeFormatter#withResolverFields(java.time.temporal.TemporalField...) public
     *      java.time.format.DateTimeFormatter
     *      java.time.format.DateTimeFormatter.withResolverFields(java.time.temporal.TemporalField[]) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_withResolverFields_TemporalFieldArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#getChronology() public java.time.chrono.Chronology
     * java.time.format.DateTimeFormatter.getChronology()}.
     *
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#getChronology() public java.time.chrono.Chronology
     * java.time.format.DateTimeFormatter.getChronology()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.format.DateTimeFormatter#getChronology() public java.time.chrono.Chronology
     *      java.time.format.DateTimeFormatter.getChronology() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getChronology()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#toString() public java.lang.String
     * java.time.format.DateTimeFormatter.toString()}.
     *
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#toString() public java.lang.String
     * java.time.format.DateTimeFormatter.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.format.DateTimeFormatter#toString() public java.lang.String
     *      java.time.format.DateTimeFormatter.toString() (the hereby targeted method-under-test)
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
     * Test method for {@link java.time.format.DateTimeFormatter#getResolverFields() public java.util.Set
     * <java.time.temporal.TemporalField> java.time.format.DateTimeFormatter.getResolverFields()}.
     *
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#getResolverFields() public java.util.Set
     * java.time.format.DateTimeFormatter.getResolverFields()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.format.DateTimeFormatter#getResolverFields() public java.util.Set
     *      java.time.format.DateTimeFormatter.getResolverFields() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getResolverFields()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#getResolverStyle() public
     * java.time.format.ResolverStyle java.time.format.DateTimeFormatter.getResolverStyle()}.
     *
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#getResolverStyle() public
     * java.time.format.ResolverStyle java.time.format.DateTimeFormatter.getResolverStyle()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.format.DateTimeFormatter#getResolverStyle() public java.time.format.ResolverStyle
     *      java.time.format.DateTimeFormatter.getResolverStyle() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getResolverStyle()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#withResolverStyle(java.time.format.ResolverStyle)
     * public java.time.format.DateTimeFormatter
     * java.time.format.DateTimeFormatter.withResolverStyle(java.time.format.ResolverStyle)}.
     *
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#withResolverStyle(java.time.format.ResolverStyle)
     * public java.time.format.DateTimeFormatter
     * java.time.format.DateTimeFormatter.withResolverStyle(java.time.format.ResolverStyle)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.format.DateTimeFormatter#withResolverStyle(java.time.format.ResolverStyle) public
     *      java.time.format.DateTimeFormatter
     *      java.time.format.DateTimeFormatter.withResolverStyle(java.time.format.ResolverStyle) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_withResolverStyle_ResolverStyle()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#withZone(java.time.ZoneId) public
     * java.time.format.DateTimeFormatter java.time.format.DateTimeFormatter.withZone(java.time.ZoneId)}.
     *
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#withZone(java.time.ZoneId) public
     * java.time.format.DateTimeFormatter java.time.format.DateTimeFormatter.withZone(java.time.ZoneId)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.format.DateTimeFormatter#withZone(java.time.ZoneId) public java.time.format.DateTimeFormatter
     *      java.time.format.DateTimeFormatter.withZone(java.time.ZoneId) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_withZone_ZoneId()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.time.format.DateTimeFormatter#parseBest(CharSequence, java.time.temporal.TemporalQuery...) public
     * java.time.temporal.TemporalAccessor
     * java.time.format.DateTimeFormatter.parseBest(java.lang.CharSequence,java.time.temporal.TemporalQuery<?>...)}.
     *
     * <p>
     * Test method for
     * {@link java.time.format.DateTimeFormatter#parseBest(CharSequence, java.time.temporal.TemporalQuery...) public
     * java.time.temporal.TemporalAccessor
     * java.time.format.DateTimeFormatter.parseBest(java.lang.CharSequence,java.time.temporal.TemporalQuery...)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.format.DateTimeFormatter#parseBest(CharSequence, java.time.temporal.TemporalQuery...) public
     *      java.time.temporal.TemporalAccessor
     *      java.time.format.DateTimeFormatter.parseBest(java.lang.CharSequence,java.time.temporal.TemporalQuery[]) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_parseBest_CharSequence_TemporalQueryArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#withLocale(java.util.Locale) public
     * java.time.format.DateTimeFormatter java.time.format.DateTimeFormatter.withLocale(java.util.Locale)}.
     *
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#withLocale(java.util.Locale) public
     * java.time.format.DateTimeFormatter java.time.format.DateTimeFormatter.withLocale(java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.format.DateTimeFormatter#withLocale(java.util.Locale) public java.time.format.DateTimeFormatter
     *      java.time.format.DateTimeFormatter.withLocale(java.util.Locale) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_withLocale_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#getDecimalStyle() public java.time.format.DecimalStyle
     * java.time.format.DateTimeFormatter.getDecimalStyle()}.
     *
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#getDecimalStyle() public java.time.format.DecimalStyle
     * java.time.format.DateTimeFormatter.getDecimalStyle()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.format.DateTimeFormatter#getDecimalStyle() public java.time.format.DecimalStyle
     *      java.time.format.DateTimeFormatter.getDecimalStyle() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDecimalStyle()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#parse(CharSequence, java.time.temporal.TemporalQuery)
     * public <T> T java.time.format.DateTimeFormatter.parse(java.lang.CharSequence,java.time.temporal.TemporalQuery
     * <T>)}.
     *
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#parse(CharSequence, java.time.temporal.TemporalQuery)
     * public java.lang.Object
     * java.time.format.DateTimeFormatter.parse(java.lang.CharSequence,java.time.temporal.TemporalQuery)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.format.DateTimeFormatter#parse(CharSequence, java.time.temporal.TemporalQuery) public
     *      java.lang.Object
     *      java.time.format.DateTimeFormatter.parse(java.lang.CharSequence,java.time.temporal.TemporalQuery) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_parse_CharSequence_TemporalQuery()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#parse(CharSequence) public
     * java.time.temporal.TemporalAccessor java.time.format.DateTimeFormatter.parse(java.lang.CharSequence)}.
     *
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#parse(CharSequence) public
     * java.time.temporal.TemporalAccessor java.time.format.DateTimeFormatter.parse(java.lang.CharSequence)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.format.DateTimeFormatter#parse(CharSequence) public java.time.temporal.TemporalAccessor
     *      java.time.format.DateTimeFormatter.parse(java.lang.CharSequence) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_parse_CharSequence()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#parse(CharSequence, java.text.ParsePosition) public
     * java.time.temporal.TemporalAccessor
     * java.time.format.DateTimeFormatter.parse(java.lang.CharSequence,java.text.ParsePosition)}.
     *
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#parse(CharSequence, java.text.ParsePosition) public
     * java.time.temporal.TemporalAccessor
     * java.time.format.DateTimeFormatter.parse(java.lang.CharSequence,java.text.ParsePosition)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.format.DateTimeFormatter#parse(CharSequence, java.text.ParsePosition) public
     *      java.time.temporal.TemporalAccessor
     *      java.time.format.DateTimeFormatter.parse(java.lang.CharSequence,java.text.ParsePosition) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_parse_CharSequence_ParsePosition()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#getZone() public java.time.ZoneId
     * java.time.format.DateTimeFormatter.getZone()}.
     *
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#getZone() public java.time.ZoneId
     * java.time.format.DateTimeFormatter.getZone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.format.DateTimeFormatter#getZone() public java.time.ZoneId
     *      java.time.format.DateTimeFormatter.getZone() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getZone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#format(java.time.temporal.TemporalAccessor) public
     * java.lang.String java.time.format.DateTimeFormatter.format(java.time.temporal.TemporalAccessor)}.
     *
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatter#format(java.time.temporal.TemporalAccessor) public
     * java.lang.String java.time.format.DateTimeFormatter.format(java.time.temporal.TemporalAccessor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.format.DateTimeFormatter#format(java.time.temporal.TemporalAccessor) public java.lang.String
     *      java.time.format.DateTimeFormatter.format(java.time.temporal.TemporalAccessor) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_format_TemporalAccessor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
