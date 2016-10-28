package org.j8unit.repository.javax.swing.text;

import javax.swing.text.BadLocationException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BadLocationExceptionClassTest
implements org.j8unit.repository.javax.swing.text.BadLocationExceptionClassTests<BadLocationException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.BadLocationException]

    @Override
    public Class<BadLocationException> createNewSUT() {
        return BadLocationException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link BadLocationException#BadLocationException(String, int) public
     * javax.swing.text.BadLocationException(java.lang.String,int)}.
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
    public void create_BadLocationException_String_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BadLocationException sut = null; // = new BadLocationException(String, int);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.BadLocationException]

}
