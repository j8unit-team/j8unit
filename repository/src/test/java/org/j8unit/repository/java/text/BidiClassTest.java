package org.j8unit.repository.java.text;

import java.text.Bidi;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Bidi} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.java.text.BidiClassTests}).
 */

@RunWith(J8Unit4.class)
public class BidiClassTest
implements BidiClassTests<Bidi> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.text.Bidi]

    @Override
    public Class<Bidi> createNewSUT() {
        return Bidi.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.text.Bidi#Bidi(java.text.AttributedCharacterIterator) public
     * java.text.Bidi(java.text.AttributedCharacterIterator)}.
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
    public void create_Bidi_AttributedCharacterIterator()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Bidi sut = null; // = new Bidi(java.text.AttributedCharacterIterator);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.text.Bidi#Bidi(char[], int, byte[], int, int, int) public
     * java.text.Bidi(char[],int,byte[],int,int,int)}.
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
    public void create_Bidi_charArray_int_byteArray_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Bidi sut = null; // = new Bidi(char[], int, byte[], int, int, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.text.Bidi#Bidi(String, int) public
     * java.text.Bidi(java.lang.String,int)}.
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
    public void create_Bidi_String_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Bidi sut = null; // = new Bidi(String, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.text.Bidi#reorderVisually(byte[], int, Object[], int, int) public static void
     * java.text.Bidi.reorderVisually(byte[],int,java.lang.Object[],int,int)}.
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
    public void test_reorderVisually_byteArray_int_ObjectArray_int_int()
    throws Exception {
        // write some test for {@link java.text.Bidi#reorderVisually(byte[], int, Object[], int, int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.text.Bidi#requiresBidi(char[], int, int) public
     * static boolean java.text.Bidi.requiresBidi(char[],int,int)}.
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
    public void test_requiresBidi_charArray_int_int()
    throws Exception {
        // write some test for {@link java.text.Bidi#requiresBidi(char[], int, int)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.text.Bidi]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.text.Bidi]

}
