package org.j8unit.repository.java.util.jar;

import java.util.jar.JarOutputStream;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JarOutputStream} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.jar.JarOutputStreamClassTests}).
 */
@RunWith(J8Unit4.class)
public class JarOutputStreamClassTest
implements JarOutputStreamClassTests<JarOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.jar.JarOutputStream]

    @Override
    public Class<JarOutputStream> createNewSUT() {
        return JarOutputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.jar.JarOutputStream#JarOutputStream(java.io.OutputStream) public
     * java.util.jar.JarOutputStream(java.io.OutputStream) throws java.io.IOException}.
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
    public void create_JarOutputStream_OutputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JarOutputStream sut = null; // = new JarOutputStream(java.io.OutputStream);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.jar.JarOutputStream#JarOutputStream(java.io.OutputStream, java.util.jar.Manifest) public
     * java.util.jar.JarOutputStream(java.io.OutputStream,java.util.jar.Manifest) throws java.io.IOException}.
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
    public void create_JarOutputStream_OutputStream_Manifest()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JarOutputStream sut = null; // = new JarOutputStream(java.io.OutputStream, java.util.jar.Manifest);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.jar.JarOutputStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.jar.JarOutputStream]

}
