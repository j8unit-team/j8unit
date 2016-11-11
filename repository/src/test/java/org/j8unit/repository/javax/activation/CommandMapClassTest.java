package org.j8unit.repository.javax.activation;

import static org.junit.Assert.fail;
import javax.activation.CommandMap;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CommandMap} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.activation.CommandMapClassTests}).
 */

@RunWith(J8Unit4.class)
public class CommandMapClassTest
implements CommandMapClassTests<CommandMap> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.activation.CommandMap]

    @Override
    public Class<CommandMap> createNewSUT() {
        return CommandMap.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.activation.CommandMap#CommandMap() public
     * javax.activation.CommandMap()}.
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
    public void create_CommandMap()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.activation.CommandMap#getDefaultCommandMap()
     * public static synchronized javax.activation.CommandMap javax.activation.CommandMap.getDefaultCommandMap()}.
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
    public void test_getDefaultCommandMap()
    throws Exception {
        // write some test for {@link javax.activation.CommandMap#getDefaultCommandMap()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.activation.CommandMap#setDefaultCommandMap(javax.activation.CommandMap) public static synchronized
     * void javax.activation.CommandMap.setDefaultCommandMap(javax.activation.CommandMap)}.
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
    public void test_setDefaultCommandMap_CommandMap()
    throws Exception {
        // write some test for {@link javax.activation.CommandMap#setDefaultCommandMap(javax.activation.CommandMap)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.activation.CommandMap]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.activation.CommandMap]

}
