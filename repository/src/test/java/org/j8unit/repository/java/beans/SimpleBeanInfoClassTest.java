package org.j8unit.repository.java.beans;

import java.beans.SimpleBeanInfo;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SimpleBeanInfo} (by simply reusing the
 * J8Unit test interface {@link SimpleBeanInfoClassTests}).
 */

@RunWith(J8Unit4.class)
public class SimpleBeanInfoClassTest
implements SimpleBeanInfoClassTests<SimpleBeanInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.SimpleBeanInfo]

    @Override
    public Class<SimpleBeanInfo> createNewSUT() {
        return SimpleBeanInfo.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.beans.SimpleBeanInfo#SimpleBeanInfo()
     * public java.beans.SimpleBeanInfo()}.
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
    public void create_SimpleBeanInfo()
    throws Exception {
        // create new instance
        final SimpleBeanInfo sut = new SimpleBeanInfo();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.SimpleBeanInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.SimpleBeanInfo]

}
