package org.j8unit.repository.java.sql;

import java.sql.SQLXML;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SQLXML} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.sql.SQLXMLTests}).
 */
@RunWith(J8Unit4.class)
public class SQLXMLTest
implements SQLXMLTests<SQLXML> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.SQLXML]

    @Override
    public SQLXML createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.sql.SQLXML], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.sql.SQLXML]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.sql.SQLXML]

}
