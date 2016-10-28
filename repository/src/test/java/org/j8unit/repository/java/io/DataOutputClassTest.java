package org.j8unit.repository.java.io;

import java.io.DataOutput;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DataOutputClassTest
implements org.j8unit.repository.java.io.DataOutputClassTests<DataOutput> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.DataOutput]

    @Override
    public Class<DataOutput> createNewSUT() {
        return DataOutput.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.DataOutput]

}
