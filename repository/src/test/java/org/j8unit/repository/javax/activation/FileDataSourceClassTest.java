package org.j8unit.repository.javax.activation;

import javax.activation.FileDataSource;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FileDataSource} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.activation.FileDataSourceClassTests}).
 */
@RunWith(J8Unit4.class)
public class FileDataSourceClassTest
implements FileDataSourceClassTests<FileDataSource> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.activation.FileDataSource]

    @Override
    public Class<FileDataSource> createNewSUT() {
        return FileDataSource.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.activation.FileDataSource#FileDataSource(java.io.File) public
     * javax.activation.FileDataSource(java.io.File)}.
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
    public void create_FileDataSource_File()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileDataSource sut = null; // = new FileDataSource(java.io.File);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.activation.FileDataSource#FileDataSource(String) public
     * javax.activation.FileDataSource(java.lang.String)}.
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
    public void create_FileDataSource_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileDataSource sut = null; // = new FileDataSource(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.activation.FileDataSource]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.activation.FileDataSource]

}
