package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.CosNaming.BindingIteratorOperations interface
 * org.omg.CosNaming.BindingIteratorOperations}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.org.omg.CosNaming.BindingIteratorOperationsTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.CosNaming.BindingIteratorOperationsClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.CosNaming.BindingIteratorOperations
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BindingIteratorOperationsTests<SUT extends org.omg.CosNaming.BindingIteratorOperations>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CosNaming.BindingIteratorOperations#destroy() public abstract void
     * org.omg.CosNaming.BindingIteratorOperations.destroy()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CosNaming.BindingIteratorOperations#destroy()
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
     * {@link org.omg.CosNaming.BindingIteratorOperations#next_n(int, org.omg.CosNaming.BindingListHolder) public
     * abstract boolean org.omg.CosNaming.BindingIteratorOperations.next_n(int,org.omg.CosNaming.BindingListHolder)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CosNaming.BindingIteratorOperations#next_n(int, org.omg.CosNaming.BindingListHolder)
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
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CosNaming.BindingIteratorOperations#next_one(org.omg.CosNaming.BindingHolder)
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
