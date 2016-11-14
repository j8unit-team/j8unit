package org.j8unit.repository.java.text;

import java.text.MessageFormat;
import java.text.MessageFormat.Field;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MessageFormat} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.text.MessageFormatClassTests}).
 */

@RunWith(J8Unit4.class)
public class MessageFormatClassTest
implements MessageFormatClassTests<MessageFormat> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.text.MessageFormat]

    @Override
    public Class<MessageFormat> createNewSUT() {
        return MessageFormat.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.text.MessageFormat#MessageFormat(String)
     * public java.text.MessageFormat(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_MessageFormat_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MessageFormat sut = null; // = new MessageFormat(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.text.MessageFormat#MessageFormat(String, java.util.Locale) public
     * java.text.MessageFormat(java.lang.String,java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_MessageFormat_String_Locale()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MessageFormat sut = null; // = new MessageFormat(String, java.util.Locale);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.text.MessageFormat#format(String, Object...)
     * public static java.lang.String java.text.MessageFormat.format(java.lang.String,java.lang.Object...)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_format_String_ObjectArray()
    throws Exception {
        // write some test for {@link java.text.MessageFormat#format(String, Object...)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.text.MessageFormat]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.text.MessageFormat]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Field} (by simply reusing the J8Unit
     * test interface {@link org.j8unit.repository.java.text.MessageFormatClassTests.FieldClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class FieldClassTest
    implements org.j8unit.repository.java.text.MessageFormatClassTests.FieldClassTests<Field> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.text.MessageFormat$Field]

        @Override
        public Class<Field> createNewSUT() {
            return Field.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.text.MessageFormat$Field]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.text.MessageFormat$Field]

    }

}
