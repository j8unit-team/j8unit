package org.j8unit.repository.javax.script;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ScriptEngineManagerTest
implements org.j8unit.repository.javax.script.ScriptEngineManagerTests<javax.script.ScriptEngineManager> {

    @Override
    public javax.script.ScriptEngineManager createNewSUT() {
        return new javax.script.ScriptEngineManager();
    }

}
