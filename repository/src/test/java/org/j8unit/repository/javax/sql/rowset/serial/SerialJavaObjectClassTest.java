package org.j8unit.repository.javax.sql.rowset.serial;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SerialJavaObjectClassTest
implements org.j8unit.repository.javax.sql.rowset.serial.SerialJavaObjectClassTests<javax.sql.rowset.serial.SerialJavaObject> {

    @Override
    public Class<javax.sql.rowset.serial.SerialJavaObject> createNewSUT() {
        return javax.sql.rowset.serial.SerialJavaObject.class;
    }

}
