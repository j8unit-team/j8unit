package org.j8unit.repository.javax.sql;

import javax.sql.XAConnection;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XAConnection} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sql.XAConnectionClassTests}).
 */

@RunWith(J8Unit4.class)
public class XAConnectionClassTest
implements XAConnectionClassTests<XAConnection> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.XAConnection]

    @Override
    public Class<XAConnection> createNewSUT() {
        return XAConnection.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.XAConnection]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.XAConnection]

}
