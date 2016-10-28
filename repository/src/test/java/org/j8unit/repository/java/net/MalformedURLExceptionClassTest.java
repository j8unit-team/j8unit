package org.j8unit.repository.java.net;

import java.net.MalformedURLException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MalformedURLExceptionClassTest
implements org.j8unit.repository.java.net.MalformedURLExceptionClassTests<MalformedURLException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.MalformedURLException]

    @Override
    public Class<MalformedURLException> createNewSUT() {
        return MalformedURLException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link MalformedURLException#MalformedURLException()
     * public java.net.MalformedURLException()}.
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
    public void create_MalformedURLException()
    throws Exception {
        // create new instance
        final MalformedURLException sut = new MalformedURLException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link MalformedURLException#MalformedURLException(String) public
     * java.net.MalformedURLException(java.lang.String)}.
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
    public void create_MalformedURLException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MalformedURLException sut = null; // = new MalformedURLException(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.MalformedURLException]

}
