package org.j8unit.repository.javax.script;

import javax.script.ScriptContext;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ScriptContext} (by simply reusing the
 * J8Unit test interface {@link ScriptContextClassTests}).
 */

@RunWith(J8Unit4.class)
public class ScriptContextClassTest
implements ScriptContextClassTests<ScriptContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.script.ScriptContext]

    @Override
    public Class<ScriptContext> createNewSUT() {
        return ScriptContext.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.script.ScriptContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.script.ScriptContext]

}
