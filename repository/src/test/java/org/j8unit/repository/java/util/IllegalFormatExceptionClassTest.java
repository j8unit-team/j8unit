package org.j8unit.repository.java.util;

import java.util.IllegalFormatException;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IllegalFormatExceptionClassTest
implements org.j8unit.repository.java.util.IllegalFormatExceptionClassTests<IllegalFormatException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.IllegalFormatException]

    @Override
    public Class<IllegalFormatException> createNewSUT() {
        return IllegalFormatException.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.IllegalFormatException]

}
