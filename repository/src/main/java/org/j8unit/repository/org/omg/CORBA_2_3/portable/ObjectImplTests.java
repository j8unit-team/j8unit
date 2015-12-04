package org.j8unit.repository.org.omg.CORBA_2_3.portable;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.CORBA_2_3.portable.ObjectImpl class org.omg.CORBA_2_3.portable.ObjectImpl}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.CORBA_2_3.portable.ObjectImplClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ObjectImplTests<SUT extends org.omg.CORBA_2_3.portable.ObjectImpl>
extends org.j8unit.repository.org.omg.CORBA.portable.ObjectImplTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CORBA_2_3.portable.ObjectImpl#_get_codebase() public java.lang.String
     * org.omg.CORBA_2_3.portable.ObjectImpl._get_codebase()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test__get_codebase()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
