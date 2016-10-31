package org.j8unit.repository.java.awt;

import java.awt.DefaultKeyboardFocusManager;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultKeyboardFocusManagerClassTest
implements org.j8unit.repository.java.awt.DefaultKeyboardFocusManagerClassTests<DefaultKeyboardFocusManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.DefaultKeyboardFocusManager]

    @Override
    public Class<DefaultKeyboardFocusManager> createNewSUT() {
        return DefaultKeyboardFocusManager.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.DefaultKeyboardFocusManager#DefaultKeyboardFocusManager() public
     * java.awt.DefaultKeyboardFocusManager()}.
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
    public void create_DefaultKeyboardFocusManager()
    throws Exception {
        // create new instance
        final DefaultKeyboardFocusManager sut = new DefaultKeyboardFocusManager();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.DefaultKeyboardFocusManager]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.DefaultKeyboardFocusManager]

}
