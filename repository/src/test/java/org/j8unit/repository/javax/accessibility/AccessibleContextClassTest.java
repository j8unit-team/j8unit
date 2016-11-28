package org.j8unit.repository.javax.accessibility;

import static org.junit.Assert.fail;
import javax.accessibility.AccessibleContext;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AccessibleContext} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.accessibility.AccessibleContextClassTests}).
 */
@RunWith(J8Unit4.class)
public class AccessibleContextClassTest
implements AccessibleContextClassTests<AccessibleContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.accessibility.AccessibleContext]

    @Override
    public Class<AccessibleContext> createNewSUT() {
        return AccessibleContext.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.accessibility.AccessibleContext#AccessibleContext() public javax.accessibility.AccessibleContext()}.
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
    public void create_AccessibleContext()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.accessibility.AccessibleContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.accessibility.AccessibleContext]

}
