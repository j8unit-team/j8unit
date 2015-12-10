package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StructClassTest
implements org.j8unit.repository.java.sql.StructClassTests<java.sql.Struct> {

    @Override
    public Class<java.sql.Struct> createNewSUT() {
        return java.sql.Struct.class;
    }

}
