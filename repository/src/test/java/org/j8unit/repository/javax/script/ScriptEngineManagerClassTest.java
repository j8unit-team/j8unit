package org.j8unit.repository.javax.script;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ScriptEngineManagerClassTest
implements org.j8unit.repository.javax.script.ScriptEngineManagerClassTests<javax.script.ScriptEngineManager> {

    @Override
    public Class<javax.script.ScriptEngineManager> createNewSUT() {
        return javax.script.ScriptEngineManager.class;
    }

}
