package org.j8unit.repository.javax.sql;

import javax.sql.StatementEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StatementEvent} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sql.StatementEventClassTests}).
 */

@RunWith(J8Unit4.class)
public class StatementEventClassTest
implements StatementEventClassTests<StatementEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.StatementEvent]

    @Override
    public Class<StatementEvent> createNewSUT() {
        return StatementEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sql.StatementEvent#StatementEvent(javax.sql.PooledConnection, java.sql.PreparedStatement, java.sql.SQLException)
     * public javax.sql.StatementEvent(javax.sql.PooledConnection,java.sql.PreparedStatement,java.sql.SQLException)}.
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
    public void create_StatementEvent_PooledConnection_PreparedStatement_SQLException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StatementEvent sut = null; // = new StatementEvent(javax.sql.PooledConnection, java.sql.PreparedStatement,
                                         // java.sql.SQLException);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sql.StatementEvent#StatementEvent(javax.sql.PooledConnection, java.sql.PreparedStatement) public
     * javax.sql.StatementEvent(javax.sql.PooledConnection,java.sql.PreparedStatement)}.
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
    public void create_StatementEvent_PooledConnection_PreparedStatement()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StatementEvent sut = null; // = new StatementEvent(javax.sql.PooledConnection,
                                         // java.sql.PreparedStatement);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.StatementEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.StatementEvent]

}
