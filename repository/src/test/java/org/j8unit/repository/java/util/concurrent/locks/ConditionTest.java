package org.j8unit.repository.java.util.concurrent.locks;

import java.util.concurrent.locks.Condition;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConditionTest
implements org.j8unit.repository.java.util.concurrent.locks.ConditionTests<Condition> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.locks.Condition]

    @Override
    public Condition createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.concurrent.locks.Condition], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.locks.Condition]

}
