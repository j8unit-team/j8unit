package org.j8unit.repository.java.nio.file;

import java.nio.file.Paths;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PathsClassTest
implements org.j8unit.repository.java.nio.file.PathsClassTests<Paths> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.Paths]

    @Override
    public Class<Paths> createNewSUT() {
        return Paths.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.nio.file.Paths#get(String, String...) public
     * static java.nio.file.Path java.nio.file.Paths.get(java.lang.String,java.lang.String...)}.
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
    public void test_get_String_StringArray()
    throws Exception {
        // write some test for {@link java.nio.file.Paths#get(String, String...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.nio.file.Paths#get(java.net.URI) public static
     * java.nio.file.Path java.nio.file.Paths.get(java.net.URI)}.
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
    public void test_get_URI()
    throws Exception {
        // write some test for {@link java.nio.file.Paths#get(java.net.URI)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.Paths]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.Paths]

}
