package org.j8unit.repository.java.io;

import java.io.FileNotFoundException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileNotFoundExceptionClassTest
implements org.j8unit.repository.java.io.FileNotFoundExceptionClassTests<FileNotFoundException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.FileNotFoundException]

    @Override
    public Class<FileNotFoundException> createNewSUT() {
        return FileNotFoundException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.FileNotFoundException#FileNotFoundException() public java.io.FileNotFoundException()}.
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
    public void create_FileNotFoundException()
    throws Exception {
        // create new instance
        final FileNotFoundException sut = new FileNotFoundException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.FileNotFoundException#FileNotFoundException(String) public
     * java.io.FileNotFoundException(java.lang.String)}.
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
    public void create_FileNotFoundException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileNotFoundException sut = null; // = new FileNotFoundException(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.FileNotFoundException]

}
