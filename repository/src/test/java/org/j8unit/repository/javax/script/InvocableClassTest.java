package org.j8unit.repository.javax.script;

import javax.script.Invocable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Invocable} (by simply reusing the J8Unit
 * test interface {@link InvocableClassTests}).
 */

@RunWith(J8Unit4.class)
public class InvocableClassTest
implements InvocableClassTests<Invocable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.script.Invocable]

    @Override
    public Class<Invocable> createNewSUT() {
        return Invocable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.script.Invocable]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.script.Invocable]

}
