package org.j8unit.repository.java.awt;

import java.awt.RenderingHints;
import java.awt.RenderingHints.Key;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RenderingHintsClassTest
implements org.j8unit.repository.java.awt.RenderingHintsClassTests<RenderingHints> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.RenderingHints]

    @Override
    public Class<RenderingHints> createNewSUT() {
        return RenderingHints.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.RenderingHints#RenderingHints(java.util.Map) public
     * java.awt.RenderingHints(java.util.Map<java.awt.RenderingHints$Key, ?>)}.
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
    public void create_RenderingHints_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RenderingHints sut = null; // = new RenderingHints(java.util.Map);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.RenderingHints#RenderingHints(java.awt.RenderingHints.Key, Object) public
     * java.awt.RenderingHints(java.awt.RenderingHints$Key,java.lang.Object)}.
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
    public void create_RenderingHints_Key_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RenderingHints sut = null; // = new RenderingHints(java.awt.RenderingHints.Key, Object);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.RenderingHints]

    @RunWith(J8Unit4.class)
    public static class KeyClassTest
    implements org.j8unit.repository.java.awt.RenderingHintsClassTests.KeyClassTests<Key> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.RenderingHints$Key]

        @Override
        public Class<Key> createNewSUT() {
            return Key.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.RenderingHints$Key]

    }

}
