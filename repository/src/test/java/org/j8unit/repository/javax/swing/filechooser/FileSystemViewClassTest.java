package org.j8unit.repository.javax.swing.filechooser;

import static org.junit.Assert.fail;
import javax.swing.filechooser.FileSystemView;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FileSystemView} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.filechooser.FileSystemViewClassTests}).
 */

@RunWith(J8Unit4.class)
public class FileSystemViewClassTest
implements FileSystemViewClassTests<FileSystemView> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.filechooser.FileSystemView]

    @Override
    public Class<FileSystemView> createNewSUT() {
        return FileSystemView.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.filechooser.FileSystemView#FileSystemView() public javax.swing.filechooser.FileSystemView()}.
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
    public void create_FileSystemView()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.filechooser.FileSystemView#getFileSystemView() public static
     * javax.swing.filechooser.FileSystemView javax.swing.filechooser.FileSystemView.getFileSystemView()}.
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
    public void test_getFileSystemView()
    throws Exception {
        // write some test for {@link javax.swing.filechooser.FileSystemView#getFileSystemView()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.filechooser.FileSystemView]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.filechooser.FileSystemView]

}
