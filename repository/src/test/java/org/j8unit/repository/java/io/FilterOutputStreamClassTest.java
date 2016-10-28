package org.j8unit.repository.java.io;

import java.io.FilterOutputStream;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FilterOutputStreamClassTest
implements org.j8unit.repository.java.io.FilterOutputStreamClassTests<FilterOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.FilterOutputStream]

    @Override
    public Class<FilterOutputStream> createNewSUT() {
        return FilterOutputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.FilterOutputStream#FilterOutputStream(java.io.OutputStream) public
     * java.io.FilterOutputStream(java.io.OutputStream)}.
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
    public void create_FilterOutputStream_OutputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FilterOutputStream sut = null; // = new FilterOutputStream(java.io.OutputStream);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.FilterOutputStream]

}
