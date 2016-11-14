package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Package} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.lang.PackageClassTests}).
 */

@RunWith(J8Unit4.class)
public class PackageClassTest
implements PackageClassTests<Package> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.Package]

    @Override
    public Class<Package> createNewSUT() {
        return Package.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Package#getPackage(String) public static
     * java.lang.Package java.lang.Package.getPackage(java.lang.String)}.
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
    public void test_getPackage_String()
    throws Exception {
        // write some test for {@link Package#getPackage(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Package#getPackages() public static
     * java.lang.Package[] java.lang.Package.getPackages()}.
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
    public void test_getPackages()
    throws Exception {
        // write some test for {@link Package#getPackages()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.Package]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.Package]

}
