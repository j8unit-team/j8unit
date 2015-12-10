package org.j8unit.repository.java.lang.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ThreadInfoClassTest
implements org.j8unit.repository.java.lang.management.ThreadInfoClassTests<java.lang.management.ThreadInfo> {

    @Override
    public Class<java.lang.management.ThreadInfo> createNewSUT() {
        return java.lang.management.ThreadInfo.class;
    }

}
