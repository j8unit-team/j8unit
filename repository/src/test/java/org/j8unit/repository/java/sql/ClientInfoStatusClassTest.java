package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClientInfoStatusClassTest
implements org.j8unit.repository.java.sql.ClientInfoStatusClassTests<java.sql.ClientInfoStatus> {

    @Override
    public Class<java.sql.ClientInfoStatus> createNewSUT() {
        return java.sql.ClientInfoStatus.class;
    }

}
