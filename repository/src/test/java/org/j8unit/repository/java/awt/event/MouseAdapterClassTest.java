package org.j8unit.repository.java.awt.event;

import static org.junit.Assert.fail;
import java.awt.event.MouseAdapter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MouseAdapterClassTest
implements org.j8unit.repository.java.awt.event.MouseAdapterClassTests<MouseAdapter> {

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

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.event.MouseAdapter]

}
