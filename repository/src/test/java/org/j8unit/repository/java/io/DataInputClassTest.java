package org.j8unit.repository.java.io;

import java.io.DataInput;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DataInput} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.io.DataInputClassTests}).
 */

@RunWith(J8Unit4.class)
public class DataInputClassTest
implements DataInputClassTests<DataInput> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.DataInput]

    @Override
    public Class<DataInput> createNewSUT() {
        return DataInput.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.DataInput]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.DataInput]

}
