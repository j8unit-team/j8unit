package org.j8unit.repository.java.util.concurrent.locks;

import java.util.concurrent.locks.Condition;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Condition} (by simply reusing the J8Unit
 * test interface {@link ConditionClassTests}).
 */

@RunWith(J8Unit4.class)
public class ConditionClassTest
implements ConditionClassTests<Condition> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.locks.Condition]

    @Override
    public Class<Condition> createNewSUT() {
        return Condition.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.locks.Condition]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.locks.Condition]

}
