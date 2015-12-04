package org.j8unit.repository.org.omg.CORBA_2_3.portable;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.CORBA_2_3.portable.Delegate class org.omg.CORBA_2_3.portable.Delegate}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.CORBA_2_3.portable.DelegateClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DelegateTests<SUT extends org.omg.CORBA_2_3.portable.Delegate>
extends org.j8unit.repository.org.omg.CORBA.portable.DelegateTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CORBA_2_3.portable.Delegate#get_codebase(org.omg.CORBA.Object) public
     * java.lang.String org.omg.CORBA_2_3.portable.Delegate.get_codebase(org.omg.CORBA.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_codebase_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
