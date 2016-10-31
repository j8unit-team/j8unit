package org.j8unit.repository.java.util.zip;

import java.util.zip.DataFormatException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DataFormatExceptionClassTest
implements org.j8unit.repository.java.util.zip.DataFormatExceptionClassTests<DataFormatException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.zip.DataFormatException]

    @Override
    public Class<DataFormatException> createNewSUT() {
        return DataFormatException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.zip.DataFormatException#DataFormatException() public java.util.zip.DataFormatException()}.
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
    public void create_DataFormatException()
    throws Exception {
        // create new instance
        final DataFormatException sut = new DataFormatException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.zip.DataFormatException#DataFormatException(String) public
     * java.util.zip.DataFormatException(java.lang.String)}.
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
    public void create_DataFormatException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DataFormatException sut = null; // = new DataFormatException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.zip.DataFormatException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.zip.DataFormatException]

}
