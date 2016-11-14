package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CosNaming._BindingIteratorStub;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link _BindingIteratorStub} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.CosNaming._BindingIteratorStubClassTests}).
 */

@RunWith(J8Unit4.class)
public class _BindingIteratorStubClassTest
implements _BindingIteratorStubClassTests<_BindingIteratorStub> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming._BindingIteratorStub]

    @Override
    public Class<_BindingIteratorStub> createNewSUT() {
        return _BindingIteratorStub.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming._BindingIteratorStub#_BindingIteratorStub() public
     * org.omg.CosNaming._BindingIteratorStub()}.
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
    public void create__BindingIteratorStub()
    throws Exception {
        // create new instance
        final _BindingIteratorStub sut = new _BindingIteratorStub();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CosNaming._BindingIteratorStub]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming._BindingIteratorStub]

}
