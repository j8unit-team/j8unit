package org.j8unit.repository.javax.sql.rowset.serial;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SerialArrayClassTest
implements org.j8unit.repository.javax.sql.rowset.serial.SerialArrayClassTests<javax.sql.rowset.serial.SerialArray> {

    @Override
    public Class<javax.sql.rowset.serial.SerialArray> createNewSUT() {
        return javax.sql.rowset.serial.SerialArray.class;
    }

}
