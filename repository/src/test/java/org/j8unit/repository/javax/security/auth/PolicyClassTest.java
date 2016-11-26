package org.j8unit.repository.javax.security.auth;

import javax.security.auth.Policy;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Policy} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.security.auth.PolicyClassTests}).
 */
@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class PolicyClassTest
implements PolicyClassTests<Policy> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.Policy]

    @Override
    public Class<Policy> createNewSUT() {
        return Policy.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.security.auth.Policy#setPolicy(javax.security.auth.Policy) public static void
     * javax.security.auth.Policy.setPolicy(javax.security.auth.Policy)}.
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
    public void test_setPolicy_Policy()
    throws Exception {
        // write some test for {@link javax.security.auth.Policy#setPolicy(javax.security.auth.Policy)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.security.auth.Policy#getPolicy() public static
     * javax.security.auth.Policy javax.security.auth.Policy.getPolicy()}.
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
    public void test_getPolicy()
    throws Exception {
        // write some test for {@link javax.security.auth.Policy#getPolicy()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.auth.Policy]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.Policy]

}
