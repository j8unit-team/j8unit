package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA._PolicyStub;

@RunWith(J8Unit4.class)
public class _PolicyStubClassTest
implements org.j8unit.repository.org.omg.CORBA._PolicyStubClassTests<_PolicyStub> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA._PolicyStub]

    @Override
    public Class<_PolicyStub> createNewSUT() {
        return _PolicyStub.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA._PolicyStub#_PolicyStub() public
     * org.omg.CORBA._PolicyStub()}.
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
    public void create__PolicyStub()
    throws Exception {
        // create new instance
        final _PolicyStub sut = new _PolicyStub();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA._PolicyStub#_PolicyStub(org.omg.CORBA.portable.Delegate) public
     * org.omg.CORBA._PolicyStub(org.omg.CORBA.portable.Delegate)}.
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
    public void create__PolicyStub_Delegate()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final _PolicyStub sut = null; // = new _PolicyStub(org.omg.CORBA.portable.Delegate);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA._PolicyStub]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA._PolicyStub]

}
