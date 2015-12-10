package org.j8unit.repository.java.lang.management;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MemoryUsageTest
implements org.j8unit.repository.java.lang.management.MemoryUsageTests<java.lang.management.MemoryUsage> {

    @Override
    public java.lang.management.MemoryUsage createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.lang.management.MemoryUsage] available.");
    }

}
