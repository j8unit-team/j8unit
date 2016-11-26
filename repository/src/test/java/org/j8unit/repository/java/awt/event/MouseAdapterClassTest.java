package org.j8unit.repository.java.awt.event;

import static org.junit.Assert.fail;
import java.awt.event.MouseAdapter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MouseAdapter} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.event.MouseAdapterClassTests}).
 */
@RunWith(J8Unit4.class)
public class MouseAdapterClassTest
implements MouseAdapterClassTests<MouseAdapter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.event.MouseAdapter]

    @Override
    public Class<MouseAdapter> createNewSUT() {
        return MouseAdapter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.event.MouseAdapter#MouseAdapter()
     * public java.awt.event.MouseAdapter()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_MouseAdapter()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.event.MouseAdapter]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.event.MouseAdapter]

}
