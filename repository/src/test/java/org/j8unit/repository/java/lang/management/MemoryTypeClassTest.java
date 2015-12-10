package org.j8unit.repository.java.lang.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MemoryTypeClassTest
implements org.j8unit.repository.java.lang.management.MemoryTypeClassTests<java.lang.management.MemoryType> {

    @Override
    public Class<java.lang.management.MemoryType> createNewSUT() {
        return java.lang.management.MemoryType.class;
    }

}
