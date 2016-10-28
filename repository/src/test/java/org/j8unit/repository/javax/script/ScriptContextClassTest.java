package org.j8unit.repository.javax.script;

import javax.script.ScriptContext;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ScriptContextClassTest
implements org.j8unit.repository.javax.script.ScriptContextClassTests<ScriptContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.script.ScriptContext]

    @Override
    public Class<ScriptContext> createNewSUT() {
        return ScriptContext.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.script.ScriptContext]

}
