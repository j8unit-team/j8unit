package org.j8unit.repository.java.util.zip;

import java.util.zip.Deflater;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Deflater} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.zip.DeflaterClassTests}).
 */

@RunWith(J8Unit4.class)
public class DeflaterClassTest
implements DeflaterClassTests<Deflater> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.zip.Deflater]

    @Override
    public Class<Deflater> createNewSUT() {
        return Deflater.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.zip.Deflater#Deflater() public
     * java.util.zip.Deflater()}.
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
    public void create_Deflater()
    throws Exception {
        // create new instance
        final Deflater sut = new Deflater();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.zip.Deflater#Deflater(int) public
     * java.util.zip.Deflater(int)}.
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
    public void create_Deflater_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Deflater sut = null; // = new Deflater(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.zip.Deflater#Deflater(int, boolean)
     * public java.util.zip.Deflater(int,boolean)}.
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
    public void create_Deflater_int_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Deflater sut = null; // = new Deflater(int, boolean);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.zip.Deflater]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.zip.Deflater]

}
