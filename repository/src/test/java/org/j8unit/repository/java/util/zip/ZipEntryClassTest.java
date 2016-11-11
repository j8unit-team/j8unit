package org.j8unit.repository.java.util.zip;

import java.util.zip.ZipEntry;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ZipEntry} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.zip.ZipEntryClassTests}).
 */

@RunWith(J8Unit4.class)
public class ZipEntryClassTest
implements ZipEntryClassTests<ZipEntry> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.zip.ZipEntry]

    @Override
    public Class<ZipEntry> createNewSUT() {
        return ZipEntry.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.zip.ZipEntry#ZipEntry(java.util.zip.ZipEntry) public
     * java.util.zip.ZipEntry(java.util.zip.ZipEntry)}.
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
    public void create_ZipEntry_ZipEntry()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ZipEntry sut = null; // = new ZipEntry(java.util.zip.ZipEntry);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.zip.ZipEntry#ZipEntry(String) public
     * java.util.zip.ZipEntry(java.lang.String)}.
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
    public void create_ZipEntry_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ZipEntry sut = null; // = new ZipEntry(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.zip.ZipEntry]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.zip.ZipEntry]

}
