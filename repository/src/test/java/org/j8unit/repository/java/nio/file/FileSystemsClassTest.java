package org.j8unit.repository.java.nio.file;

import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Map;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileSystemsClassTest
implements org.j8unit.repository.java.nio.file.FileSystemsClassTests<FileSystems> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.FileSystems]

    @Override
    public Class<FileSystems> createNewSUT() {
        return FileSystems.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link FileSystems#getDefault() public static
     * java.nio.file.FileSystem java.nio.file.FileSystems.getDefault()}.
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
    public void test_getDefault()
    throws Exception {
        // write some test for {@link FileSystems#getDefault()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link FileSystems#getFileSystem(URI) public static
     * java.nio.file.FileSystem java.nio.file.FileSystems.getFileSystem(java.net.URI)}.
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
    public void test_getFileSystem_URI()
    throws Exception {
        // write some test for {@link FileSystems#getFileSystem(URI)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link FileSystems#newFileSystem(Path, ClassLoader) public
     * static java.nio.file.FileSystem java.nio.file.FileSystems.newFileSystem(java.nio.file.Path,java.lang.ClassLoader)
     * throws java.io.IOException}.
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
    public void test_newFileSystem_Path_ClassLoader()
    throws Exception {
        // write some test for {@link FileSystems#newFileSystem(Path, ClassLoader)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link FileSystems#newFileSystem(URI, Map, ClassLoader)
     * public static java.nio.file.FileSystem
     * java.nio.file.FileSystems.newFileSystem(java.net.URI,java.util.Map<java.lang.String, ?>,java.lang.ClassLoader)
     * throws java.io.IOException}.
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
    public void test_newFileSystem_URI_Map_ClassLoader()
    throws Exception {
        // write some test for {@link FileSystems#newFileSystem(URI, Map, ClassLoader)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link FileSystems#newFileSystem(URI, Map) public static
     * java.nio.file.FileSystem java.nio.file.FileSystems.newFileSystem(java.net.URI,java.util.Map<java.lang.String, ?>)
     * throws java.io.IOException}.
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
    public void test_newFileSystem_URI_Map()
    throws Exception {
        // write some test for {@link FileSystems#newFileSystem(URI, Map)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.FileSystems]

}
