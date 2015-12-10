package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ArrayClassTest
implements org.j8unit.repository.java.sql.ArrayClassTests<java.sql.Array> {

    @Override
    public Class<java.sql.Array> createNewSUT() {
        return java.sql.Array.class;
    }

}
