package org.j8unit.repository.java.sql;

import java.sql.SQLXML;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SQLXML} (by simply reusing the J8Unit
 * test interface {@link SQLXMLClassTests}).
 */

@RunWith(J8Unit4.class)
public class SQLXMLClassTest
implements SQLXMLClassTests<SQLXML> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.SQLXML]

    @Override
    public Class<SQLXML> createNewSUT() {
        return SQLXML.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.sql.SQLXML]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.SQLXML]

}
