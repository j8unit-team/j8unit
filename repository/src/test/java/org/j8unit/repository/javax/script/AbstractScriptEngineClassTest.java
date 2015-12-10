package org.j8unit.repository.javax.script;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractScriptEngineClassTest
implements org.j8unit.repository.javax.script.AbstractScriptEngineClassTests<javax.script.AbstractScriptEngine> {

    @Override
    public Class<javax.script.AbstractScriptEngine> createNewSUT() {
        return javax.script.AbstractScriptEngine.class;
    }

}
