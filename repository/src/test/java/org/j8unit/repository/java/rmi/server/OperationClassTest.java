package org.j8unit.repository.java.rmi.server;

import java.rmi.server.Operation;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Operation} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.rmi.server.OperationClassTests}).
 */

@RunWith(J8Unit4.class)
public class OperationClassTest
implements OperationClassTests<Operation> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.server.Operation]

    @Override
    public Class<Operation> createNewSUT() {
        return Operation.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.rmi.server.Operation#Operation(String)
     * public java.rmi.server.Operation(java.lang.String)}.
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
    public void create_Operation_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Operation sut = null; // = new Operation(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.server.Operation]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.server.Operation]

}
