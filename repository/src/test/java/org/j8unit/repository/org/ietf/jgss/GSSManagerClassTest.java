package org.j8unit.repository.org.ietf.jgss;

import static org.junit.Assert.fail;
import org.ietf.jgss.GSSManager;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GSSManagerClassTest
implements org.j8unit.repository.org.ietf.jgss.GSSManagerClassTests<GSSManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.ietf.jgss.GSSManager]

    @Override
    public Class<GSSManager> createNewSUT() {
        return GSSManager.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.ietf.jgss.GSSManager#GSSManager() public
     * org.ietf.jgss.GSSManager()}.
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
    public void create_GSSManager()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link org.ietf.jgss.GSSManager#getInstance() public static
     * org.ietf.jgss.GSSManager org.ietf.jgss.GSSManager.getInstance()}.
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
    public void test_getInstance()
    throws Exception {
        // write some test for {@link org.ietf.jgss.GSSManager#getInstance()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.ietf.jgss.GSSManager]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.ietf.jgss.GSSManager]

}
