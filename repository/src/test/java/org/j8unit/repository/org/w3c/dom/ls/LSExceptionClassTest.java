package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.w3c.dom.ls.LSException;

@RunWith(J8Unit4.class)
public class LSExceptionClassTest
implements org.j8unit.repository.org.w3c.dom.ls.LSExceptionClassTests<LSException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.ls.LSException]

    @Override
    public Class<LSException> createNewSUT() {
        return LSException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.w3c.dom.ls.LSException#LSException(short, String) public
     * org.w3c.dom.ls.LSException(short,java.lang.String)}.
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
    public void create_LSException_short_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LSException sut = null; // = new LSException(short, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.ls.LSException]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.ls.LSException]

}
