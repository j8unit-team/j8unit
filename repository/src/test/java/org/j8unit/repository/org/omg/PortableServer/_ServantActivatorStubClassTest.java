package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.PortableServer._ServantActivatorStub;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link _ServantActivatorStub} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.PortableServer._ServantActivatorStubClassTests}).
 */

@RunWith(J8Unit4.class)
public class _ServantActivatorStubClassTest
implements _ServantActivatorStubClassTests<_ServantActivatorStub> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer._ServantActivatorStub]

    @Override
    public Class<_ServantActivatorStub> createNewSUT() {
        return _ServantActivatorStub.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.PortableServer._ServantActivatorStub#_ServantActivatorStub() public
     * org.omg.PortableServer._ServantActivatorStub()}.
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
    public void create__ServantActivatorStub()
    throws Exception {
        // create new instance
        final _ServantActivatorStub sut = new _ServantActivatorStub();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer._ServantActivatorStub]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer._ServantActivatorStub]

}
