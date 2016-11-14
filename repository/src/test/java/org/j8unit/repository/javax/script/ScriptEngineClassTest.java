package org.j8unit.repository.javax.script;

import javax.script.ScriptEngine;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ScriptEngine} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.script.ScriptEngineClassTests}).
 */

@RunWith(J8Unit4.class)
public class ScriptEngineClassTest
implements ScriptEngineClassTests<ScriptEngine> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.script.ScriptEngine]

    @Override
    public Class<ScriptEngine> createNewSUT() {
        return ScriptEngine.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.script.ScriptEngine]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.script.ScriptEngine]

}
