package org.j8unit.repository.java.awt;

import java.awt.Container;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Container} (by simply reusing the J8Unit
 * test interface {@link ContainerClassTests}).
 */

@RunWith(J8Unit4.class)
public class ContainerClassTest
implements ContainerClassTests<Container> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.Container]

    @Override
    public Class<Container> createNewSUT() {
        return Container.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.Container#Container() public
     * java.awt.Container()}.
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
    public void create_Container()
    throws Exception {
        // create new instance
        final Container sut = new Container();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.Container]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.Container]

}
