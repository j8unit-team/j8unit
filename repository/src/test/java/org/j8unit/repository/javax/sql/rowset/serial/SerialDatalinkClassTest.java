package org.j8unit.repository.javax.sql.rowset.serial;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SerialDatalinkClassTest
implements org.j8unit.repository.javax.sql.rowset.serial.SerialDatalinkClassTests<javax.sql.rowset.serial.SerialDatalink> {

    @Override
    public Class<javax.sql.rowset.serial.SerialDatalink> createNewSUT() {
        return javax.sql.rowset.serial.SerialDatalink.class;
    }

}
