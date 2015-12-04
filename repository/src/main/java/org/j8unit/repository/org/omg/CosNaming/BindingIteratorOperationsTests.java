package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.CosNaming.BindingIteratorOperations interface
 * org.omg.CosNaming.BindingIteratorOperations}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.CosNaming.BindingIteratorOperationsClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BindingIteratorOperationsTests<SUT extends org.omg.CosNaming.BindingIteratorOperations>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CosNaming.BindingIteratorOperations#destroy() public abstract void
     * org.omg.CosNaming.BindingIteratorOperations.destroy()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_destroy()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.CosNaming.BindingIteratorOperations#next_n(int,org.omg.CosNaming.BindingListHolder) public
     * abstract boolean org.omg.CosNaming.BindingIteratorOperations.next_n(int,org.omg.CosNaming.BindingListHolder)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_next_n_int_BindingListHolder()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CosNaming.BindingIteratorOperations#next_one(org.omg.CosNaming.BindingHolder)
     * public abstract boolean org.omg.CosNaming.BindingIteratorOperations.next_one(org.omg.CosNaming.BindingHolder)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_next_one_BindingHolder()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
