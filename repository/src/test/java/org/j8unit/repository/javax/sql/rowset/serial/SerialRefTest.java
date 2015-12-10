package org.j8unit.repository.javax.sql.rowset.serial;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SerialRefTest
implements org.j8unit.repository.javax.sql.rowset.serial.SerialRefTests<javax.sql.rowset.serial.SerialRef> {

    @Override
    public javax.sql.rowset.serial.SerialRef createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.sql.rowset.serial.SerialRef] available.");
    }

}
