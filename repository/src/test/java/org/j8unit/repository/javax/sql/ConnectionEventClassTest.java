package org.j8unit.repository.javax.sql;

import javax.sql.ConnectionEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConnectionEventClassTest
implements org.j8unit.repository.javax.sql.ConnectionEventClassTests<ConnectionEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.ConnectionEvent]

    @Override
    public Class<ConnectionEvent> createNewSUT() {
        return ConnectionEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sql.ConnectionEvent#ConnectionEvent(javax.sql.PooledConnection, java.sql.SQLException) public
     * javax.sql.ConnectionEvent(javax.sql.PooledConnection,java.sql.SQLException)}.
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
    public void create_ConnectionEvent_PooledConnection_SQLException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ConnectionEvent sut = null; // = new ConnectionEvent(javax.sql.PooledConnection, java.sql.SQLException);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sql.ConnectionEvent#ConnectionEvent(javax.sql.PooledConnection) public
     * javax.sql.ConnectionEvent(javax.sql.PooledConnection)}.
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
    public void create_ConnectionEvent_PooledConnection()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ConnectionEvent sut = null; // = new ConnectionEvent(javax.sql.PooledConnection);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.ConnectionEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.ConnectionEvent]

}
