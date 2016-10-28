package org.j8unit.repository.java.io;

import java.io.DataInput;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DataInputClassTest
implements org.j8unit.repository.java.io.DataInputClassTests<DataInput> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.DataInput]

    @Override
    public Class<DataInput> createNewSUT() {
        return DataInput.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.DataInput]

}
