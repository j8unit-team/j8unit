package org.j8unit.repository.java.io;

import java.io.File;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link File} (by simply reusing the J8Unit test
 * interface {@link FileClassTests}).
 */

@RunWith(J8Unit4.class)
public class FileClassTest
implements FileClassTests<File> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.File]

    @Override
    public Class<File> createNewSUT() {
        return File.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.io.File#File(String, String) public
     * java.io.File(java.lang.String,java.lang.String)}.
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
    public void create_File_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final File sut = null; // = new File(String, String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.io.File#File(String) public
     * java.io.File(java.lang.String)}.
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
    public void create_File_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final File sut = null; // = new File(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.io.File#File(java.io.File, String) public
     * java.io.File(java.io.File,java.lang.String)}.
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
    public void create_File_File_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final File sut = null; // = new File(java.io.File, String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.io.File#File(java.net.URI) public
     * java.io.File(java.net.URI)}.
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
    public void create_File_URI()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final File sut = null; // = new File(java.net.URI);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.io.File#createTempFile(String, String) public
     * static java.io.File java.io.File.createTempFile(java.lang.String,java.lang.String) throws java.io.IOException}.
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
    public void test_createTempFile_String_String()
    throws Exception {
        // write some test for {@link java.io.File#createTempFile(String, String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.io.File#createTempFile(String, String, java.io.File) public static java.io.File
     * java.io.File.createTempFile(java.lang.String,java.lang.String,java.io.File) throws java.io.IOException}.
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
    public void test_createTempFile_String_String_File()
    throws Exception {
        // write some test for {@link java.io.File#createTempFile(String, String, java.io.File)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.io.File#listRoots() public static
     * java.io.File[] java.io.File.listRoots()}.
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
    public void test_listRoots()
    throws Exception {
        // write some test for {@link java.io.File#listRoots()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.File]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.File]

}
