package org.j8unit.repository.java.sql;

import java.sql.NClob;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NClobClassTest
implements org.j8unit.repository.java.sql.NClobClassTests<NClob> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.NClob]

    @Override
    public Class<NClob> createNewSUT() {
        return NClob.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.sql.NClob]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.NClob]

}
