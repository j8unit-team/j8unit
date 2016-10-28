package org.j8unit.repository.javax.swing.text;

import javax.swing.text.TabSet;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TabSetClassTest
implements org.j8unit.repository.javax.swing.text.TabSetClassTests<TabSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.TabSet]

    @Override
    public Class<TabSet> createNewSUT() {
        return TabSet.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.TabSet#TabSet(javax.swing.text.TabStop[]) public
     * javax.swing.text.TabSet(javax.swing.text.TabStop[])}.
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
    public void create_TabSet_TabStopArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TabSet sut = null; // = new TabSet(javax.swing.text.TabStop[]);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.TabSet]

}
