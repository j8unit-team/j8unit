package org.j8unit.repository.java.time.temporal;

import java.time.temporal.IsoFields;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IsoFieldsClassTest
implements org.j8unit.repository.java.time.temporal.IsoFieldsClassTests<IsoFields> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.temporal.IsoFields]

    @Override
    public Class<IsoFields> createNewSUT() {
        return IsoFields.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.temporal.IsoFields]

}
