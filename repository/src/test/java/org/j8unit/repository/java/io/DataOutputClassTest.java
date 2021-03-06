package org.j8unit.repository.java.io;

import java.io.DataOutput;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DataOutput} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.io.DataOutputClassTests}).
 */
@RunWith(J8Unit4.class)
public class DataOutputClassTest
implements DataOutputClassTests<DataOutput> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.DataOutput]

    @Override
    public Class<DataOutput> createNewSUT() {
        return DataOutput.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.DataOutput]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.DataOutput]

}
