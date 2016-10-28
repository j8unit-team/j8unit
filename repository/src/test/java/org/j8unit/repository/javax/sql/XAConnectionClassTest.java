package org.j8unit.repository.javax.sql;

import javax.sql.XAConnection;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XAConnectionClassTest
implements org.j8unit.repository.javax.sql.XAConnectionClassTests<XAConnection> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.XAConnection]

    @Override
    public Class<XAConnection> createNewSUT() {
        return XAConnection.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.XAConnection]

}
