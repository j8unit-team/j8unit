package org.j8unit.repository.javax.swing;

import javax.swing.ActionMap;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActionMapClassTest
implements org.j8unit.repository.javax.swing.ActionMapClassTests<ActionMap> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.ActionMap]

    @Override
    public Class<ActionMap> createNewSUT() {
        return ActionMap.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.ActionMap#ActionMap() public
     * javax.swing.ActionMap()}.
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
    public void create_ActionMap()
    throws Exception {
        // create new instance
        final ActionMap sut = new ActionMap();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.ActionMap]

}
