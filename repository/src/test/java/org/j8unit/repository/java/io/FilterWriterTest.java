package org.j8unit.repository.java.io;

import java.io.FilterWriter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FilterWriterTest
implements org.j8unit.repository.java.io.FilterWriterTests<FilterWriter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.FilterWriter]

    @Override
    public FilterWriter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.io.FilterWriter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.FilterWriter]

}
