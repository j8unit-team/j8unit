package org.j8unit.repository.javax.swing.text;

import javax.swing.text.SimpleAttributeSet;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SimpleAttributeSet} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.text.SimpleAttributeSetClassTests}).
 */
@RunWith(J8Unit4.class)
public class SimpleAttributeSetClassTest
implements SimpleAttributeSetClassTests<SimpleAttributeSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.SimpleAttributeSet]

    @Override
    public Class<SimpleAttributeSet> createNewSUT() {
        return SimpleAttributeSet.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.SimpleAttributeSet#SimpleAttributeSet() public javax.swing.text.SimpleAttributeSet()}.
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
    public void create_SimpleAttributeSet()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SimpleAttributeSet sut = new SimpleAttributeSet();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.SimpleAttributeSet#SimpleAttributeSet(javax.swing.text.AttributeSet) public
     * javax.swing.text.SimpleAttributeSet(javax.swing.text.AttributeSet)}.
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
    public void create_SimpleAttributeSet_AttributeSet()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SimpleAttributeSet sut = null; // = new SimpleAttributeSet(javax.swing.text.AttributeSet);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.SimpleAttributeSet]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.SimpleAttributeSet]

}
