package org.j8unit.repository.javax.sql.rowset.serial;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SerialClobClassTest
implements org.j8unit.repository.javax.sql.rowset.serial.SerialClobClassTests<javax.sql.rowset.serial.SerialClob> {

    @Override
    public Class<javax.sql.rowset.serial.SerialClob> createNewSUT() {
        return javax.sql.rowset.serial.SerialClob.class;
    }

}
