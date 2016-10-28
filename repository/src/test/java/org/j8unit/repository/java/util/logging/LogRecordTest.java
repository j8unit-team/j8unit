package org.j8unit.repository.java.util.logging;

import java.util.logging.LogRecord;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LogRecordTest
implements org.j8unit.repository.java.util.logging.LogRecordTests<LogRecord> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.logging.LogRecord]

    @Override
    public LogRecord createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.logging.LogRecord], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.logging.LogRecord]

}
