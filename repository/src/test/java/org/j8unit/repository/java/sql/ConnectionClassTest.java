package org.j8unit.repository.java.sql;

import java.sql.Connection;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Connection} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.sql.ConnectionClassTests}).
 */

@RunWith(J8Unit4.class)
public class ConnectionClassTest
implements ConnectionClassTests<Connection> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.Connection]

    @Override
    public Class<Connection> createNewSUT() {
        return Connection.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.sql.Connection]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.Connection]

}
