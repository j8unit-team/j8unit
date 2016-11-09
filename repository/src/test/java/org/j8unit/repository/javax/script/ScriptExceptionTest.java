package org.j8unit.repository.javax.script;

import javax.script.ScriptException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ScriptException} (by simply reusing
 * the J8Unit test interface {@link ScriptExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class ScriptExceptionTest
implements ScriptExceptionTests<ScriptException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.script.ScriptException]

    @Override
    public ScriptException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.script.ScriptException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.script.ScriptException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.script.ScriptException]

}
