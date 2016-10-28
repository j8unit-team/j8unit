package org.j8unit.repository.java.lang.annotation;

import java.lang.annotation.RetentionPolicy;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RetentionPolicyClassTest
implements org.j8unit.repository.java.lang.annotation.RetentionPolicyClassTests<RetentionPolicy> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.annotation.RetentionPolicy]

    @Override
    public Class<RetentionPolicy> createNewSUT() {
        return RetentionPolicy.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.lang.annotation.RetentionPolicy#values() public
     * static java.lang.annotation.RetentionPolicy[] java.lang.annotation.RetentionPolicy.values()}.
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
    public void test_values()
    throws Exception {
        // write some test for {@link java.lang.annotation.RetentionPolicy#values()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.lang.annotation.RetentionPolicy#valueOf(String)
     * public static java.lang.annotation.RetentionPolicy
     * java.lang.annotation.RetentionPolicy.valueOf(java.lang.String)}.
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
    public void test_valueOf_String()
    throws Exception {
        // write some test for {@link java.lang.annotation.RetentionPolicy#valueOf(String)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.annotation.RetentionPolicy]

}
