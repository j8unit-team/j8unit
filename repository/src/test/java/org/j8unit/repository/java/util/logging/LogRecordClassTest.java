package org.j8unit.repository.java.util.logging;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LogRecordClassTest
implements org.j8unit.repository.java.util.logging.LogRecordClassTests<java.util.logging.LogRecord> {

    @Override
    public Class<java.util.logging.LogRecord> createNewSUT() {
        return java.util.logging.LogRecord.class;
    }

}
