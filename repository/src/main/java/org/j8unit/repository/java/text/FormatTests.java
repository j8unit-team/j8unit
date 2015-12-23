package org.j8unit.repository.java.text;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.text.Format class java.text.Format}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test
 * interface containing the class relevant test methods is {@link org.j8unit.repository.java.text.FormatTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.text.FormatClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.text.Format
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FormatTests<SUT extends java.text.Format>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.CloneableTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.text.Format.Field class java.text.Format$Field}, containing
     * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart
     * J8Unit test interface containing the class relevant test methods is
     * {@link org.j8unit.repository.java.text.FormatTests.FieldTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.text.FormatClassTests.FieldClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.text.Format.Field
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FieldTests<SUT extends java.text.Format.Field>
    extends org.j8unit.repository.java.text.AttributedCharacterIteratorTests.AttributeTests<SUT> {

    }

    /**
     * <p>
     * Test method for {@link java.text.Format#clone() public java.lang.Object java.text.Format.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.text.Format#clone()
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
     * Test method for {@link java.text.Format#format(java.lang.Object) public final java.lang.String
     * java.text.Format.format(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.text.Format#format(java.lang.Object)
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
     * Test method for {@link java.text.Format#format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)
     * public abstract java.lang.StringBuffer
     * java.text.Format.format(java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.text.Format#format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)
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
     * Test method for {@link java.text.Format#formatToCharacterIterator(java.lang.Object) public
     * java.text.AttributedCharacterIterator java.text.Format.formatToCharacterIterator(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.text.Format#formatToCharacterIterator(java.lang.Object)
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
     * Test method for {@link java.text.Format#parseObject(java.lang.String) public java.lang.Object
     * java.text.Format.parseObject(java.lang.String) throws java.text.ParseException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.text.Format#parseObject(java.lang.String)
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
     * Test method for {@link java.text.Format#parseObject(java.lang.String, java.text.ParsePosition) public abstract
     * java.lang.Object java.text.Format.parseObject(java.lang.String,java.text.ParsePosition)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.text.Format#parseObject(java.lang.String, java.text.ParsePosition)
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

}
