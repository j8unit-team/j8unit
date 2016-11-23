package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CosNaming._NamingContextExtStub;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link _NamingContextExtStub} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.CosNaming._NamingContextExtStubClassTests}).
 */

@RunWith(J8Unit4.class)
public class _NamingContextExtStubClassTest
implements _NamingContextExtStubClassTests<_NamingContextExtStub> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming._NamingContextExtStub]

    @Override
    public Class<_NamingContextExtStub> createNewSUT() {
        return _NamingContextExtStub.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming._NamingContextExtStub#_NamingContextExtStub() public
     * org.omg.CosNaming._NamingContextExtStub()}.
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
    public void create__NamingContextExtStub()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final _NamingContextExtStub sut = new _NamingContextExtStub();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CosNaming._NamingContextExtStub]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming._NamingContextExtStub]

}
