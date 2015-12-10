package org.j8unit.repository.javax.sql.rowset.serial;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SerialBlobClassTest
implements org.j8unit.repository.javax.sql.rowset.serial.SerialBlobClassTests<javax.sql.rowset.serial.SerialBlob> {

    @Override
    public Class<javax.sql.rowset.serial.SerialBlob> createNewSUT() {
        return javax.sql.rowset.serial.SerialBlob.class;
    }

}
