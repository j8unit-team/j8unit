package org.j8unit.repository.javax.management.remote.rmi;

import javax.management.remote.rmi._RMIConnectionImpl_Tie;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link _RMIConnectionImpl_Tie} (by simply
 * reusing the J8Unit test interface {@link _RMIConnectionImpl_TieClassTests}).
 */

@RunWith(J8Unit4.class)
public class _RMIConnectionImpl_TieClassTest
implements _RMIConnectionImpl_TieClassTests<_RMIConnectionImpl_Tie> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.remote.rmi._RMIConnectionImpl_Tie]

    @Override
    public Class<_RMIConnectionImpl_Tie> createNewSUT() {
        return _RMIConnectionImpl_Tie.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.remote.rmi._RMIConnectionImpl_Tie#_RMIConnectionImpl_Tie() public
     * javax.management.remote.rmi._RMIConnectionImpl_Tie()}.
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
    public void create__RMIConnectionImpl_Tie()
    throws Exception {
        // create new instance
        final _RMIConnectionImpl_Tie sut = new _RMIConnectionImpl_Tie();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.remote.rmi._RMIConnectionImpl_Tie]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.remote.rmi._RMIConnectionImpl_Tie]

}
