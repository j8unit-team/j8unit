package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CosNaming.BindingIteratorHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BindingIteratorHolder} (by simply reusing
 * the J8Unit test interface {@link BindingIteratorHolderClassTests}).
 */

@RunWith(J8Unit4.class)
public class BindingIteratorHolderClassTest
implements BindingIteratorHolderClassTests<BindingIteratorHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.BindingIteratorHolder]

    @Override
    public Class<BindingIteratorHolder> createNewSUT() {
        return BindingIteratorHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.BindingIteratorHolder#BindingIteratorHolder(org.omg.CosNaming.BindingIterator) public
     * org.omg.CosNaming.BindingIteratorHolder(org.omg.CosNaming.BindingIterator)}.
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
    public void create_BindingIteratorHolder_BindingIterator()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BindingIteratorHolder sut = null; // = new BindingIteratorHolder(org.omg.CosNaming.BindingIterator);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.BindingIteratorHolder#BindingIteratorHolder() public
     * org.omg.CosNaming.BindingIteratorHolder()}.
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
    public void create_BindingIteratorHolder()
    throws Exception {
        // create new instance
        final BindingIteratorHolder sut = new BindingIteratorHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CosNaming.BindingIteratorHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.BindingIteratorHolder]

}
