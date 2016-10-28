package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.concurrent.TimeUnit;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileTimeClassTest
implements org.j8unit.repository.java.nio.file.attribute.FileTimeClassTests<FileTime> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.attribute.FileTime]

    @Override
    public Class<FileTime> createNewSUT() {
        return FileTime.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link FileTime#from(Instant) public static
     * java.nio.file.attribute.FileTime java.nio.file.attribute.FileTime.from(java.time.Instant)}.
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
    public void test_from_Instant()
    throws Exception {
        // write some test for {@link FileTime#from(Instant)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link FileTime#from(long, TimeUnit) public static
     * java.nio.file.attribute.FileTime java.nio.file.attribute.FileTime.from(long,java.util.concurrent.TimeUnit)}.
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
    public void test_from_long_TimeUnit()
    throws Exception {
        // write some test for {@link FileTime#from(long, TimeUnit)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link FileTime#fromMillis(long) public static
     * java.nio.file.attribute.FileTime java.nio.file.attribute.FileTime.fromMillis(long)}.
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
    public void test_fromMillis_long()
    throws Exception {
        // write some test for {@link FileTime#fromMillis(long)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.attribute.FileTime]

}
