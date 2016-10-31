package org.j8unit.repository.javax.script;

import javax.script.ScriptEngine;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ScriptEngineClassTest
implements org.j8unit.repository.javax.script.ScriptEngineClassTests<ScriptEngine> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.script.ScriptEngine]

    @Override
    public Class<ScriptEngine> createNewSUT() {
        return ScriptEngine.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.script.ScriptEngine]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.script.ScriptEngine]

}
