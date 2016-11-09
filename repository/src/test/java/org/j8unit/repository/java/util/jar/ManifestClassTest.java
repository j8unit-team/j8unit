package org.j8unit.repository.java.util.jar;

import java.util.jar.Manifest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Manifest} (by simply reusing the J8Unit
 * test interface {@link ManifestClassTests}).
 */

@RunWith(J8Unit4.class)
public class ManifestClassTest
implements ManifestClassTests<Manifest> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.jar.Manifest]

    @Override
    public Class<Manifest> createNewSUT() {
        return Manifest.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.jar.Manifest#Manifest(java.util.jar.Manifest) public
     * java.util.jar.Manifest(java.util.jar.Manifest)}.
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
    public void create_Manifest_Manifest()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Manifest sut = null; // = new Manifest(java.util.jar.Manifest);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.jar.Manifest#Manifest(java.io.InputStream) public java.util.jar.Manifest(java.io.InputStream)
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
    public void create_Manifest_InputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Manifest sut = null; // = new Manifest(java.io.InputStream);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.jar.Manifest#Manifest() public
     * java.util.jar.Manifest()}.
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
    public void create_Manifest()
    throws Exception {
        // create new instance
        final Manifest sut = new Manifest();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.jar.Manifest]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.jar.Manifest]

}
