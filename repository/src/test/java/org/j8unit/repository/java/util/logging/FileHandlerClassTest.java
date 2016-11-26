package org.j8unit.repository.java.util.logging;

import java.util.logging.FileHandler;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FileHandler} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.logging.FileHandlerClassTests}).
 */
@RunWith(J8Unit4.class)
public class FileHandlerClassTest
implements FileHandlerClassTests<FileHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.logging.FileHandler]

    @Override
    public Class<FileHandler> createNewSUT() {
        return FileHandler.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.logging.FileHandler#FileHandler(String, int, int) public
     * java.util.logging.FileHandler(java.lang.String,int,int) throws java.io.IOException,java.lang.SecurityException}.
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
    public void create_FileHandler_String_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileHandler sut = null; // = new FileHandler(String, int, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.logging.FileHandler#FileHandler()
     * public java.util.logging.FileHandler() throws java.io.IOException,java.lang.SecurityException}.
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
    public void create_FileHandler()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileHandler sut = new FileHandler();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.logging.FileHandler#FileHandler(String) public java.util.logging.FileHandler(java.lang.String)
     * throws java.io.IOException,java.lang.SecurityException}.
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
    public void create_FileHandler_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileHandler sut = null; // = new FileHandler(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.logging.FileHandler#FileHandler(String, int, int, boolean) public
     * java.util.logging.FileHandler(java.lang.String,int,int,boolean) throws
     * java.io.IOException,java.lang.SecurityException}.
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
    public void create_FileHandler_String_int_int_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileHandler sut = null; // = new FileHandler(String, int, int, boolean);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.logging.FileHandler#FileHandler(String, boolean) public
     * java.util.logging.FileHandler(java.lang.String,boolean) throws java.io.IOException,java.lang.SecurityException}.
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
    public void create_FileHandler_String_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileHandler sut = null; // = new FileHandler(String, boolean);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.logging.FileHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.logging.FileHandler]

}
