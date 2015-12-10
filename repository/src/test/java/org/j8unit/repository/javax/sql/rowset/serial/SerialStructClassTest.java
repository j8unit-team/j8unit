package org.j8unit.repository.javax.sql.rowset.serial;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SerialStructClassTest
implements org.j8unit.repository.javax.sql.rowset.serial.SerialStructClassTests<javax.sql.rowset.serial.SerialStruct> {

    @Override
    public Class<javax.sql.rowset.serial.SerialStruct> createNewSUT() {
        return javax.sql.rowset.serial.SerialStruct.class;
    }

}
