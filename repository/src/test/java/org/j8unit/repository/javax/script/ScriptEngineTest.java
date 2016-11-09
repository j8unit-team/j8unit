package org.j8unit.repository.javax.script;

import javax.script.ScriptEngine;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ScriptEngine} (by simply reusing the
 * J8Unit test interface {@link ScriptEngineTests}).
 */

@RunWith(J8Unit4.class)
public class ScriptEngineTest
implements ScriptEngineTests<ScriptEngine> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.script.ScriptEngine]

    @Override
    public ScriptEngine createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.script.ScriptEngine], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.script.ScriptEngine]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.script.ScriptEngine]

}
