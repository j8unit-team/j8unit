package org.j8unit.repository.java.io;

import java.io.CharArrayReader;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CharArrayReader} (by simply reusing the
 * J8Unit test interface {@link CharArrayReaderClassTests}).
 */

@RunWith(J8Unit4.class)
public class CharArrayReaderClassTest
implements CharArrayReaderClassTests<CharArrayReader> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.CharArrayReader]

    @Override
    public Class<CharArrayReader> createNewSUT() {
        return CharArrayReader.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.io.CharArrayReader#CharArrayReader(char[])
     * public java.io.CharArrayReader(char[])}.
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
    public void create_CharArrayReader_charArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CharArrayReader sut = null; // = new CharArrayReader(char[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.CharArrayReader#CharArrayReader(char[], int, int) public java.io.CharArrayReader(char[],int,int)}.
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
    public void create_CharArrayReader_charArray_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CharArrayReader sut = null; // = new CharArrayReader(char[], int, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.CharArrayReader]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.CharArrayReader]

}
