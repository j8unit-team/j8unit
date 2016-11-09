package org.j8unit.repository.javax.swing.plaf.basic;

import javax.swing.plaf.basic.BasicButtonListener;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BasicButtonListener} (by simply reusing
 * the J8Unit test interface {@link BasicButtonListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class BasicButtonListenerClassTest
implements BasicButtonListenerClassTests<BasicButtonListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicButtonListener]

    @Override
    public Class<BasicButtonListener> createNewSUT() {
        return BasicButtonListener.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.plaf.basic.BasicButtonListener#BasicButtonListener(javax.swing.AbstractButton) public
     * javax.swing.plaf.basic.BasicButtonListener(javax.swing.AbstractButton)}.
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
    public void create_BasicButtonListener_AbstractButton()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BasicButtonListener sut = null; // = new BasicButtonListener(javax.swing.AbstractButton);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicButtonListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicButtonListener]

}
