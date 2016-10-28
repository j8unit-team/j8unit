package org.j8unit.repository.java.io;

import java.io.OptionalDataException;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OptionalDataExceptionClassTest
implements org.j8unit.repository.java.io.OptionalDataExceptionClassTests<OptionalDataException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.OptionalDataException]

    @Override
    public Class<OptionalDataException> createNewSUT() {
        return OptionalDataException.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.OptionalDataException]

}
