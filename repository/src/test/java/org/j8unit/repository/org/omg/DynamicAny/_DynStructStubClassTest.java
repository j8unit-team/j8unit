package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.DynamicAny._DynStructStub;

@RunWith(J8Unit4.class)
public class _DynStructStubClassTest
implements org.j8unit.repository.org.omg.DynamicAny._DynStructStubClassTests<_DynStructStub> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny._DynStructStub]

    @Override
    public Class<_DynStructStub> createNewSUT() {
        return _DynStructStub.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link _DynStructStub#_DynStructStub() public
     * org.omg.DynamicAny._DynStructStub()}.
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
    public void create__DynStructStub()
    throws Exception {
        // create new instance
        final _DynStructStub sut = new _DynStructStub();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny._DynStructStub]

}
