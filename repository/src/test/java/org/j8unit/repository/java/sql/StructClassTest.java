package org.j8unit.repository.java.sql;

import java.sql.Struct;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StructClassTest
implements org.j8unit.repository.java.sql.StructClassTests<Struct> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.Struct]

    @Override
    public Class<Struct> createNewSUT() {
        return Struct.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.sql.Struct]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.Struct]

}
