package org.j8unit.repository.java.awt;

import java.awt.Font;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Font} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.java.awt.FontClassTests}).
 */

@RunWith(J8Unit4.class)
public class FontClassTest
implements FontClassTests<Font> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.Font]

    @Override
    public Class<Font> createNewSUT() {
        return Font.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.Font#Font(java.util.Map) public
     * java.awt.Font(java.util.Map<? extends java.text.AttributedCharacterIterator$Attribute, ?>)}.
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
    public void create_Font_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Font sut = null; // = new Font(java.util.Map);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.Font#Font(String, int, int) public
     * java.awt.Font(java.lang.String,int,int)}.
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
    public void create_Font_String_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Font sut = null; // = new Font(String, int, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.awt.Font#decode(String) public static
     * java.awt.Font java.awt.Font.decode(java.lang.String)}.
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
    public void test_decode_String()
    throws Exception {
        // write some test for {@link java.awt.Font#decode(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.awt.Font#createFont(int, java.io.InputStream)
     * public static java.awt.Font java.awt.Font.createFont(int,java.io.InputStream) throws
     * java.awt.FontFormatException,java.io.IOException}.
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
    public void test_createFont_int_InputStream()
    throws Exception {
        // write some test for {@link java.awt.Font#createFont(int, java.io.InputStream)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.awt.Font#createFont(int, java.io.File) public
     * static java.awt.Font java.awt.Font.createFont(int,java.io.File) throws
     * java.awt.FontFormatException,java.io.IOException}.
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
    public void test_createFont_int_File()
    throws Exception {
        // write some test for {@link java.awt.Font#createFont(int, java.io.File)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.awt.Font#getFont(String) public static
     * java.awt.Font java.awt.Font.getFont(java.lang.String)}.
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
    public void test_getFont_String()
    throws Exception {
        // write some test for {@link java.awt.Font#getFont(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.awt.Font#getFont(String, java.awt.Font) public
     * static java.awt.Font java.awt.Font.getFont(java.lang.String,java.awt.Font)}.
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
    public void test_getFont_String_Font()
    throws Exception {
        // write some test for {@link java.awt.Font#getFont(String, java.awt.Font)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.awt.Font#getFont(java.util.Map) public static
     * java.awt.Font java.awt.Font.getFont(java.util.Map<? extends java.text.AttributedCharacterIterator$Attribute,
     * ?>)}.
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
    public void test_getFont_Map()
    throws Exception {
        // write some test for {@link java.awt.Font#getFont(java.util.Map)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.Font]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.Font]

}
