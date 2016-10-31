package org.j8unit.repository.java.io;

import java.io.FileOutputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileOutputStreamTest
implements org.j8unit.repository.java.io.FileOutputStreamTests<FileOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.FileOutputStream]

    @Override
    public FileOutputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.io.FileOutputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.FileOutputStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.FileOutputStream]

}
