package org.j8unit.repository.java.util.concurrent.locks;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConditionClassTest
implements org.j8unit.repository.java.util.concurrent.locks.ConditionClassTests<java.util.concurrent.locks.Condition> {

    @Override
    public Class<java.util.concurrent.locks.Condition> createNewSUT() {
        return java.util.concurrent.locks.Condition.class;
    }

}
