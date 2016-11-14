package org.j8unit.repository.java.util.zip;

import java.util.zip.Inflater;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Inflater} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.zip.InflaterClassTests}).
 */

@RunWith(J8Unit4.class)
public class InflaterClassTest
implements InflaterClassTests<Inflater> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.zip.Inflater]

    @Override
    public Class<Inflater> createNewSUT() {
        return Inflater.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.zip.Inflater#Inflater(boolean) public
     * java.util.zip.Inflater(boolean)}.
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
    public void create_Inflater_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Inflater sut = null; // = new Inflater(boolean);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.zip.Inflater#Inflater() public
     * java.util.zip.Inflater()}.
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
    public void create_Inflater()
    throws Exception {
        // create new instance
        final Inflater sut = new Inflater();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.zip.Inflater]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.zip.Inflater]

}
