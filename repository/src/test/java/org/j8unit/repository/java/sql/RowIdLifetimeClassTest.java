package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowIdLifetimeClassTest
implements org.j8unit.repository.java.sql.RowIdLifetimeClassTests<java.sql.RowIdLifetime> {

    @Override
    public Class<java.sql.RowIdLifetime> createNewSUT() {
        return java.sql.RowIdLifetime.class;
    }

}
