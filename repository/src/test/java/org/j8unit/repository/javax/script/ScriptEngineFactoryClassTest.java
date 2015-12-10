package org.j8unit.repository.javax.script;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ScriptEngineFactoryClassTest
implements org.j8unit.repository.javax.script.ScriptEngineFactoryClassTests<javax.script.ScriptEngineFactory> {

    @Override
    public Class<javax.script.ScriptEngineFactory> createNewSUT() {
        return javax.script.ScriptEngineFactory.class;
    }

}
