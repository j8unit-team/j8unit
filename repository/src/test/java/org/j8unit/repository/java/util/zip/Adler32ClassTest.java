package org.j8unit.repository.java.util.zip;

import java.util.zip.Adler32;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Adler32} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.zip.Adler32ClassTests}).
 */

@RunWith(J8Unit4.class)
public class Adler32ClassTest
implements Adler32ClassTests<Adler32> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.zip.Adler32]

    @Override
    public Class<Adler32> createNewSUT() {
        return Adler32.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.zip.Adler32#Adler32() public
     * java.util.zip.Adler32()}.
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
    public void create_Adler32()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Adler32 sut = new Adler32();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.zip.Adler32]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.zip.Adler32]

}
