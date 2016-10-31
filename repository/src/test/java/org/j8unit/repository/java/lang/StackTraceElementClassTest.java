package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StackTraceElementClassTest
implements org.j8unit.repository.java.lang.StackTraceElementClassTests<StackTraceElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.StackTraceElement]

    @Override
    public Class<StackTraceElement> createNewSUT() {
        return StackTraceElement.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link StackTraceElement#StackTraceElement(String, String, String, int) public
     * java.lang.StackTraceElement(java.lang.String,java.lang.String,java.lang.String,int)}.
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
    public void create_StackTraceElement_String_String_String_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StackTraceElement sut = null; // = new StackTraceElement(String, String, String, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.StackTraceElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.StackTraceElement]

}
