package org.j8unit.repository.java.util.logging;

import java.util.logging.LogManager;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LogManagerTest
implements org.j8unit.repository.java.util.logging.LogManagerTests<LogManager> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.logging.LogManager]

    @Override
    public LogManager createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.logging.LogManager], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.logging.LogManager]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.logging.LogManager]

}
