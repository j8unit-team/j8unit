package org.j8unit.repository.javax.script;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ScriptEngineClassTest
implements org.j8unit.repository.javax.script.ScriptEngineClassTests<javax.script.ScriptEngine> {

    @Override
    public Class<javax.script.ScriptEngine> createNewSUT() {
        return javax.script.ScriptEngine.class;
    }

}