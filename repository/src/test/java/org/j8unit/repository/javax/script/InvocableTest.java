package org.j8unit.repository.javax.script;

import javax.script.Invocable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Invocable} (by simply reusing the
 * J8Unit test interface {@link InvocableTests}).
 */

@RunWith(J8Unit4.class)
public class InvocableTest
implements InvocableTests<Invocable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.script.Invocable]

    @Override
    public Invocable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.script.Invocable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.script.Invocable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.script.Invocable]

}
