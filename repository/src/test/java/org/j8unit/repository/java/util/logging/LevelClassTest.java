package org.j8unit.repository.java.util.logging;

import java.util.logging.Level;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LevelClassTest
implements org.j8unit.repository.java.util.logging.LevelClassTests<Level> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.logging.Level]

    @Override
    public Class<Level> createNewSUT() {
        return Level.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.logging.Level#parse(String) public static
     * synchronized java.util.logging.Level java.util.logging.Level.parse(java.lang.String) throws
     * java.lang.IllegalArgumentException}.
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
    public void test_parse_String()
    throws Exception {
        // write some test for {@link java.util.logging.Level#parse(String)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.logging.Level]

}
