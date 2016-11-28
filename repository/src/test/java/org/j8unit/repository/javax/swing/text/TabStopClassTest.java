package org.j8unit.repository.javax.swing.text;

import javax.swing.text.TabStop;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TabStop} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.text.TabStopClassTests}).
 */
@RunWith(J8Unit4.class)
public class TabStopClassTest
implements TabStopClassTests<TabStop> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.TabStop]

    @Override
    public Class<TabStop> createNewSUT() {
        return TabStop.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.text.TabStop#TabStop(float) public
     * javax.swing.text.TabStop(float)}.
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
    public void create_TabStop_float()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TabStop sut = null; // = new TabStop(float);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.TabStop#TabStop(float, int, int) public javax.swing.text.TabStop(float,int,int)}.
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
    public void create_TabStop_float_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TabStop sut = null; // = new TabStop(float, int, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.TabStop]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.TabStop]

}
