package org.j8unit.repository.java.awt;

import java.awt.CheckboxGroup;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CheckboxGroupClassTest
implements org.j8unit.repository.java.awt.CheckboxGroupClassTests<CheckboxGroup> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.CheckboxGroup]

    @Override
    public Class<CheckboxGroup> createNewSUT() {
        return CheckboxGroup.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link CheckboxGroup#CheckboxGroup() public
     * java.awt.CheckboxGroup()}.
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
    public void create_CheckboxGroup()
    throws Exception {
        // create new instance
        final CheckboxGroup sut = new CheckboxGroup();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.CheckboxGroup]

}
