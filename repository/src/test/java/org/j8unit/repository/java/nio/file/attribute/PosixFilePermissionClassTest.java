package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.PosixFilePermission;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PosixFilePermission} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.nio.file.attribute.PosixFilePermissionClassTests}).
 */
@RunWith(J8Unit4.class)
public class PosixFilePermissionClassTest
implements PosixFilePermissionClassTests<PosixFilePermission> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.attribute.PosixFilePermission]

    @Override
    public Class<PosixFilePermission> createNewSUT() {
        return PosixFilePermission.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.nio.file.attribute.PosixFilePermission#values()
     * public static java.nio.file.attribute.PosixFilePermission[]
     * java.nio.file.attribute.PosixFilePermission.values()}.
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
    public void test_values()
    throws Exception {
        // write some test for {@link java.nio.file.attribute.PosixFilePermission#values()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.nio.file.attribute.PosixFilePermission#valueOf(String) public static
     * java.nio.file.attribute.PosixFilePermission
     * java.nio.file.attribute.PosixFilePermission.valueOf(java.lang.String)}.
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
    public void test_valueOf_String()
    throws Exception {
        // write some test for {@link java.nio.file.attribute.PosixFilePermission#valueOf(String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.attribute.PosixFilePermission]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.attribute.PosixFilePermission]

}
