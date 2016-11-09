package org.j8unit.repository.java.sql;

import java.sql.Clob;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Clob} (by simply reusing the J8Unit test
 * interface {@link ClobClassTests}).
 */

@RunWith(J8Unit4.class)
public class ClobClassTest
implements ClobClassTests<Clob> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.Clob]

    @Override
    public Class<Clob> createNewSUT() {
        return Clob.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.sql.Clob]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.Clob]

}
