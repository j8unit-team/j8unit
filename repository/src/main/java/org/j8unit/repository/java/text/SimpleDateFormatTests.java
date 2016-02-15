package org.j8unit.repository.java.text;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.text.SimpleDateFormat class java.text.SimpleDateFormat}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SimpleDateFormatClassTests}.
 * </p>
 *
 * @see java.text.SimpleDateFormat class java.text.SimpleDateFormat (the hereby targeted class-under-test class)
 * @see SimpleDateFormatClassTests SimpleDateFormatClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SimpleDateFormatTests<SUT extends java.text.SimpleDateFormat>
extends DateFormatTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.text.SimpleDateFormat#format(java.util.Date, StringBuffer, java.text.FieldPosition)
     * public java.lang.StringBuffer
     * java.text.SimpleDateFormat.format(java.util.Date,java.lang.StringBuffer,java.text.FieldPosition)}.
     *
     * <p>
     * Test method for {@link java.text.SimpleDateFormat#format(java.util.Date, StringBuffer, java.text.FieldPosition)
     * public java.lang.StringBuffer
     * java.text.SimpleDateFormat.format(java.util.Date,java.lang.StringBuffer,java.text.FieldPosition)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.SimpleDateFormat#format(java.util.Date, StringBuffer, java.text.FieldPosition) public
     *      java.lang.StringBuffer
     *      java.text.SimpleDateFormat.format(java.util.Date,java.lang.StringBuffer,java.text.FieldPosition) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_format_Date_StringBuffer_FieldPosition()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.SimpleDateFormat#parse(String, java.text.ParsePosition) public java.util.Date
     * java.text.SimpleDateFormat.parse(java.lang.String,java.text.ParsePosition)}.
     *
     * <p>
     * Test method for {@link java.text.SimpleDateFormat#parse(String, java.text.ParsePosition) public java.util.Date
     * java.text.SimpleDateFormat.parse(java.lang.String,java.text.ParsePosition)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.SimpleDateFormat#parse(String, java.text.ParsePosition) public java.util.Date
     *      java.text.SimpleDateFormat.parse(java.lang.String,java.text.ParsePosition) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_parse_String_ParsePosition()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.SimpleDateFormat#set2DigitYearStart(java.util.Date) public void
     * java.text.SimpleDateFormat.set2DigitYearStart(java.util.Date)}.
     *
     * <p>
     * Test method for {@link java.text.SimpleDateFormat#set2DigitYearStart(java.util.Date) public void
     * java.text.SimpleDateFormat.set2DigitYearStart(java.util.Date)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.SimpleDateFormat#set2DigitYearStart(java.util.Date) public void
     *      java.text.SimpleDateFormat.set2DigitYearStart(java.util.Date) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set2DigitYearStart_Date()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.SimpleDateFormat#toPattern() public java.lang.String
     * java.text.SimpleDateFormat.toPattern()}.
     *
     * <p>
     * Test method for {@link java.text.SimpleDateFormat#toPattern() public java.lang.String
     * java.text.SimpleDateFormat.toPattern()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.SimpleDateFormat#toPattern() public java.lang.String java.text.SimpleDateFormat.toPattern() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toPattern()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.SimpleDateFormat#formatToCharacterIterator(Object) public
     * java.text.AttributedCharacterIterator java.text.SimpleDateFormat.formatToCharacterIterator(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.text.SimpleDateFormat#formatToCharacterIterator(Object) public
     * java.text.AttributedCharacterIterator java.text.SimpleDateFormat.formatToCharacterIterator(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.SimpleDateFormat#formatToCharacterIterator(Object) public java.text.AttributedCharacterIterator
     *      java.text.SimpleDateFormat.formatToCharacterIterator(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_formatToCharacterIterator_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.SimpleDateFormat#applyLocalizedPattern(String) public void
     * java.text.SimpleDateFormat.applyLocalizedPattern(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.text.SimpleDateFormat#applyLocalizedPattern(String) public void
     * java.text.SimpleDateFormat.applyLocalizedPattern(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.SimpleDateFormat#applyLocalizedPattern(String) public void
     *      java.text.SimpleDateFormat.applyLocalizedPattern(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_applyLocalizedPattern_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.SimpleDateFormat#setDateFormatSymbols(java.text.DateFormatSymbols) public void
     * java.text.SimpleDateFormat.setDateFormatSymbols(java.text.DateFormatSymbols)}.
     *
     * <p>
     * Test method for {@link java.text.SimpleDateFormat#setDateFormatSymbols(java.text.DateFormatSymbols) public void
     * java.text.SimpleDateFormat.setDateFormatSymbols(java.text.DateFormatSymbols)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.SimpleDateFormat#setDateFormatSymbols(java.text.DateFormatSymbols) public void
     *      java.text.SimpleDateFormat.setDateFormatSymbols(java.text.DateFormatSymbols) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDateFormatSymbols_DateFormatSymbols()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.SimpleDateFormat#get2DigitYearStart() public java.util.Date
     * java.text.SimpleDateFormat.get2DigitYearStart()}.
     *
     * <p>
     * Test method for {@link java.text.SimpleDateFormat#get2DigitYearStart() public java.util.Date
     * java.text.SimpleDateFormat.get2DigitYearStart()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.SimpleDateFormat#get2DigitYearStart() public java.util.Date
     *      java.text.SimpleDateFormat.get2DigitYearStart() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get2DigitYearStart()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.SimpleDateFormat#clone() public java.lang.Object
     * java.text.SimpleDateFormat.clone()}.
     *
     * <p>
     * Test method for {@link java.text.SimpleDateFormat#clone() public java.lang.Object
     * java.text.SimpleDateFormat.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.SimpleDateFormat#clone() public java.lang.Object java.text.SimpleDateFormat.clone() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_clone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.SimpleDateFormat#getDateFormatSymbols() public java.text.DateFormatSymbols
     * java.text.SimpleDateFormat.getDateFormatSymbols()}.
     *
     * <p>
     * Test method for {@link java.text.SimpleDateFormat#getDateFormatSymbols() public java.text.DateFormatSymbols
     * java.text.SimpleDateFormat.getDateFormatSymbols()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.SimpleDateFormat#getDateFormatSymbols() public java.text.DateFormatSymbols
     *      java.text.SimpleDateFormat.getDateFormatSymbols() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDateFormatSymbols()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.SimpleDateFormat#applyPattern(String) public void
     * java.text.SimpleDateFormat.applyPattern(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.text.SimpleDateFormat#applyPattern(String) public void
     * java.text.SimpleDateFormat.applyPattern(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.SimpleDateFormat#applyPattern(String) public void
     *      java.text.SimpleDateFormat.applyPattern(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_applyPattern_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.SimpleDateFormat#toLocalizedPattern() public java.lang.String
     * java.text.SimpleDateFormat.toLocalizedPattern()}.
     *
     * <p>
     * Test method for {@link java.text.SimpleDateFormat#toLocalizedPattern() public java.lang.String
     * java.text.SimpleDateFormat.toLocalizedPattern()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.SimpleDateFormat#toLocalizedPattern() public java.lang.String
     *      java.text.SimpleDateFormat.toLocalizedPattern() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toLocalizedPattern()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.SimpleDateFormat#equals(Object) public boolean
     * java.text.SimpleDateFormat.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.text.SimpleDateFormat#equals(Object) public boolean
     * java.text.SimpleDateFormat.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.SimpleDateFormat#equals(Object) public boolean java.text.SimpleDateFormat.equals(java.lang.Object)
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
     * Test method for {@link java.text.SimpleDateFormat#hashCode() public int java.text.SimpleDateFormat.hashCode()}.
     *
     * <p>
     * Test method for {@link java.text.SimpleDateFormat#hashCode() public int java.text.SimpleDateFormat.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.SimpleDateFormat#hashCode() public int java.text.SimpleDateFormat.hashCode() (the hereby targeted
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

}
