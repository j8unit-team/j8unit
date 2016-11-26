package org.j8unit.repository.javax.activation;

import javax.activation.MimetypesFileTypeMap;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MimetypesFileTypeMap} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.activation.MimetypesFileTypeMapClassTests}).
 */
@RunWith(J8Unit4.class)
public class MimetypesFileTypeMapClassTest
implements MimetypesFileTypeMapClassTests<MimetypesFileTypeMap> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.activation.MimetypesFileTypeMap]

    @Override
    public Class<MimetypesFileTypeMap> createNewSUT() {
        return MimetypesFileTypeMap.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.activation.MimetypesFileTypeMap#MimetypesFileTypeMap() public
     * javax.activation.MimetypesFileTypeMap()}.
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
    public void create_MimetypesFileTypeMap()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MimetypesFileTypeMap sut = new MimetypesFileTypeMap();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.activation.MimetypesFileTypeMap#MimetypesFileTypeMap(String) public
     * javax.activation.MimetypesFileTypeMap(java.lang.String) throws java.io.IOException}.
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
    public void create_MimetypesFileTypeMap_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MimetypesFileTypeMap sut = null; // = new MimetypesFileTypeMap(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.activation.MimetypesFileTypeMap#MimetypesFileTypeMap(java.io.InputStream) public
     * javax.activation.MimetypesFileTypeMap(java.io.InputStream)}.
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
    public void create_MimetypesFileTypeMap_InputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MimetypesFileTypeMap sut = null; // = new MimetypesFileTypeMap(java.io.InputStream);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.activation.MimetypesFileTypeMap]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.activation.MimetypesFileTypeMap]

}
