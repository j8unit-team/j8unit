package org.j8unit.repository.javax.activation;

import static org.junit.Assert.fail;
import javax.activation.FileTypeMap;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileTypeMapClassTest
implements org.j8unit.repository.javax.activation.FileTypeMapClassTests<FileTypeMap> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.activation.FileTypeMap]

    @Override
    public Class<FileTypeMap> createNewSUT() {
        return FileTypeMap.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link FileTypeMap#FileTypeMap() public
     * javax.activation.FileTypeMap()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_FileTypeMap()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link FileTypeMap#setDefaultFileTypeMap(FileTypeMap)
     * public static synchronized void javax.activation.FileTypeMap.setDefaultFileTypeMap(javax.activation.FileTypeMap)}
     * .
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
    public void test_setDefaultFileTypeMap_FileTypeMap()
    throws Exception {
        // write some test for {@link FileTypeMap#setDefaultFileTypeMap(FileTypeMap)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link FileTypeMap#getDefaultFileTypeMap() public static
     * synchronized javax.activation.FileTypeMap javax.activation.FileTypeMap.getDefaultFileTypeMap()}.
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
    public void test_getDefaultFileTypeMap()
    throws Exception {
        // write some test for {@link FileTypeMap#getDefaultFileTypeMap()}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.activation.FileTypeMap]

}
