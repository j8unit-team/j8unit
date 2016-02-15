package org.j8unit.repository.java.text;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.text.Format class java.text.Format}. The complementary j8unit test
 * interface containing the class relevant aspects is {@link FormatClassTests}.
 * </p>
 *
 * @see java.text.Format class java.text.Format (the hereby targeted class-under-test class)
 * @see FormatClassTests FormatClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FormatTests<SUT extends java.text.Format>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.CloneableTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.text.Format#formatToCharacterIterator(Object) public
     * java.text.AttributedCharacterIterator java.text.Format.formatToCharacterIterator(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.text.Format#formatToCharacterIterator(Object) public
     * java.text.AttributedCharacterIterator java.text.Format.formatToCharacterIterator(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.Format#formatToCharacterIterator(Object) public java.text.AttributedCharacterIterator
     *      java.text.Format.formatToCharacterIterator(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.text.Format#clone() public java.lang.Object java.text.Format.clone()}.
     *
     * <p>
     * Test method for {@link java.text.Format#clone() public java.lang.Object java.text.Format.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.Format#clone() public java.lang.Object java.text.Format.clone() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.text.Format#format(Object, StringBuffer, java.text.FieldPosition) public abstract
     * java.lang.StringBuffer java.text.Format.format(java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition)}.
     *
     * <p>
     * Test method for {@link java.text.Format#format(Object, StringBuffer, java.text.FieldPosition) public abstract
     * java.lang.StringBuffer java.text.Format.format(java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.Format#format(Object, StringBuffer, java.text.FieldPosition) public abstract
     *      java.lang.StringBuffer
     *      java.text.Format.format(java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_format_Object_StringBuffer_FieldPosition()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.Format#format(Object) public final java.lang.String
     * java.text.Format.format(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.text.Format#format(Object) public final java.lang.String
     * java.text.Format.format(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.Format#format(Object) public final java.lang.String java.text.Format.format(java.lang.Object) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_format_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.Format#parseObject(String) public java.lang.Object
     * java.text.Format.parseObject(java.lang.String) throws java.text.ParseException}.
     *
     * <p>
     * Test method for {@link java.text.Format#parseObject(String) public java.lang.Object
     * java.text.Format.parseObject(java.lang.String) throws java.text.ParseException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.Format#parseObject(String) public java.lang.Object java.text.Format.parseObject(java.lang.String)
     *      throws java.text.ParseException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_parseObject_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.Format#parseObject(String, java.text.ParsePosition) public abstract
     * java.lang.Object java.text.Format.parseObject(java.lang.String,java.text.ParsePosition)}.
     *
     * <p>
     * Test method for {@link java.text.Format#parseObject(String, java.text.ParsePosition) public abstract
     * java.lang.Object java.text.Format.parseObject(java.lang.String,java.text.ParsePosition)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.Format#parseObject(String, java.text.ParsePosition) public abstract java.lang.Object
     *      java.text.Format.parseObject(java.lang.String,java.text.ParsePosition) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_parseObject_String_ParsePosition()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.text.Format.Field class java.text.Format$Field}. The
     * complementary j8unit test interface containing the class relevant aspects is
     * {@link FormatClassTests.FieldClassTests}.
     * </p>
     *
     * @see java.text.Format.Field class java.text.Format$Field (the hereby targeted class-under-test class)
     * @see FormatClassTests.FieldClassTests FormatClassTests.FieldClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FieldTests<SUT extends java.text.Format.Field>
    extends AttributedCharacterIteratorTests.AttributeTests<SUT> {

    }

}
