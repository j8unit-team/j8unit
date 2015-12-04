package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.CORBA.DynamicImplementation class org.omg.CORBA.DynamicImplementation}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.CORBA.DynamicImplementationClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DynamicImplementationTests<SUT extends org.omg.CORBA.DynamicImplementation>
extends org.j8unit.repository.org.omg.CORBA.portable.ObjectImplTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.DynamicImplementation#_ids() public java.lang.String[]
     * org.omg.CORBA.DynamicImplementation._ids()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test__ids()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.DynamicImplementation#invoke(org.omg.CORBA.ServerRequest) public void
     * org.omg.CORBA.DynamicImplementation.invoke(org.omg.CORBA.ServerRequest)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_invoke_ServerRequest()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
