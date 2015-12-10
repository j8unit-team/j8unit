package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLPermissionClassTest
implements org.j8unit.repository.java.sql.SQLPermissionClassTests<java.sql.SQLPermission> {

    @Override
    public Class<java.sql.SQLPermission> createNewSUT() {
        return java.sql.SQLPermission.class;
    }

}
