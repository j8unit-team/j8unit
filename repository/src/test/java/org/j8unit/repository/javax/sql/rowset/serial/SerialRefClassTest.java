package org.j8unit.repository.javax.sql.rowset.serial;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SerialRefClassTest
implements org.j8unit.repository.javax.sql.rowset.serial.SerialRefClassTests<javax.sql.rowset.serial.SerialRef> {

    @Override
    public Class<javax.sql.rowset.serial.SerialRef> createNewSUT() {
        return javax.sql.rowset.serial.SerialRef.class;
    }

}
