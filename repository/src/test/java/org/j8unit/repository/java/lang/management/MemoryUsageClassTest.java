package org.j8unit.repository.java.lang.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MemoryUsageClassTest
implements org.j8unit.repository.java.lang.management.MemoryUsageClassTests<java.lang.management.MemoryUsage> {

    @Override
    public Class<java.lang.management.MemoryUsage> createNewSUT() {
        return java.lang.management.MemoryUsage.class;
    }

}
