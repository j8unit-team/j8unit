package org.j8unit.repository.javax.script;

import javax.script.SimpleBindings;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SimpleBindings} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.script.SimpleBindingsClassTests}).
 */
@RunWith(J8Unit4.class)
public class SimpleBindingsClassTest
implements SimpleBindingsClassTests<SimpleBindings> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.script.SimpleBindings]

    @Override
    public Class<SimpleBindings> createNewSUT() {
        return SimpleBindings.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.script.SimpleBindings#SimpleBindings(java.util.Map) public
     * javax.script.SimpleBindings(java.util.Map<java.lang.String, java.lang.Object>)}.
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
    public void create_SimpleBindings_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SimpleBindings sut = null; // = new SimpleBindings(java.util.Map);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.script.SimpleBindings#SimpleBindings()
     * public javax.script.SimpleBindings()}.
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
    public void create_SimpleBindings()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SimpleBindings sut = new SimpleBindings();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.script.SimpleBindings]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.script.SimpleBindings]

}
