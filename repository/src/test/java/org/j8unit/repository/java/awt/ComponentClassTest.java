package org.j8unit.repository.java.awt;

import java.awt.Component;
import java.awt.Component.BaselineResizeBehavior;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ComponentClassTest
implements org.j8unit.repository.java.awt.ComponentClassTests<Component> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.Component]

    @Override
    public Class<Component> createNewSUT() {
        return Component.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.Component]

    @RunWith(J8Unit4.class)
    public static class BaselineResizeBehaviorClassTest
    implements org.j8unit.repository.java.awt.ComponentClassTests.BaselineResizeBehaviorClassTests<BaselineResizeBehavior> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.Component$BaselineResizeBehavior]

        @Override
        public Class<BaselineResizeBehavior> createNewSUT() {
            return BaselineResizeBehavior.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link BaselineResizeBehavior#valueOf(String) public
         * static java.awt.Component$BaselineResizeBehavior
         * java.awt.Component$BaselineResizeBehavior.valueOf(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void test_valueOf_String()
        throws Exception {
            // write some test for {@link BaselineResizeBehavior#valueOf(String)}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link BaselineResizeBehavior#values() public static
         * java.awt.Component$BaselineResizeBehavior[] java.awt.Component$BaselineResizeBehavior.values()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void test_values()
        throws Exception {
            // write some test for {@link BaselineResizeBehavior#values()}
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.Component$BaselineResizeBehavior]

    }

}
