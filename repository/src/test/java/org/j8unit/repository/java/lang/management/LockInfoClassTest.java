package org.j8unit.repository.java.lang.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LockInfoClassTest
implements org.j8unit.repository.java.lang.management.LockInfoClassTests<java.lang.management.LockInfo> {

    @Override
    public Class<java.lang.management.LockInfo> createNewSUT() {
        return java.lang.management.LockInfo.class;
    }

}
