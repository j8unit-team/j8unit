package org.j8unit.repository.javax.sql.rowset.serial;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SerialExceptionClassTest
implements org.j8unit.repository.javax.sql.rowset.serial.SerialExceptionClassTests<javax.sql.rowset.serial.SerialException> {

    @Override
    public Class<javax.sql.rowset.serial.SerialException> createNewSUT() {
        return javax.sql.rowset.serial.SerialException.class;
    }

}
