package org.j8unit.repository.java.sql;

import java.sql.Array;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ArrayClassTest
implements org.j8unit.repository.java.sql.ArrayClassTests<Array> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.Array]

    @Override
    public Class<Array> createNewSUT() {
        return Array.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.sql.Array]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.Array]

}
