package org.j8unit.repository.java.nio.file.spi;

import java.nio.file.spi.FileSystemProvider;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileSystemProviderClassTest
implements org.j8unit.repository.java.nio.file.spi.FileSystemProviderClassTests<FileSystemProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.spi.FileSystemProvider]

    @Override
    public Class<FileSystemProvider> createNewSUT() {
        return FileSystemProvider.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.nio.file.spi.FileSystemProvider#installedProviders() public static java.util.List
     * <java.nio.file.spi.FileSystemProvider> java.nio.file.spi.FileSystemProvider.installedProviders()}.
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
    public void test_installedProviders()
    throws Exception {
        // write some test for {@link java.nio.file.spi.FileSystemProvider#installedProviders()}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.spi.FileSystemProvider]

}
