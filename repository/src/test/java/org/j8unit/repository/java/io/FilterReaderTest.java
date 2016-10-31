package org.j8unit.repository.java.io;

import java.io.FilterReader;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FilterReaderTest
implements org.j8unit.repository.java.io.FilterReaderTests<FilterReader> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.FilterReader]

    @Override
    public FilterReader createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.io.FilterReader], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.FilterReader]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.FilterReader]

}
