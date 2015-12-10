package org.j8unit.repository.javax.sql.rowset.serial;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SerialExceptionTest
implements org.j8unit.repository.javax.sql.rowset.serial.SerialExceptionTests<javax.sql.rowset.serial.SerialException> {

    @Override
    public javax.sql.rowset.serial.SerialException createNewSUT() {
        return new javax.sql.rowset.serial.SerialException();
    }

}
