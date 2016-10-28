package org.j8unit.repository.java.util;

import java.util.UnknownFormatFlagsException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownFormatFlagsExceptionClassTest
implements org.j8unit.repository.java.util.UnknownFormatFlagsExceptionClassTests<UnknownFormatFlagsException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.UnknownFormatFlagsException]

    @Override
    public Class<UnknownFormatFlagsException> createNewSUT() {
        return UnknownFormatFlagsException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link UnknownFormatFlagsException#UnknownFormatFlagsException(String) public
     * java.util.UnknownFormatFlagsException(java.lang.String)}.
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
    public void create_UnknownFormatFlagsException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnknownFormatFlagsException sut = null; // = new UnknownFormatFlagsException(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.UnknownFormatFlagsException]

}
