package org.j8unit.repository.javax.script;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ScriptContextClassTest
implements org.j8unit.repository.javax.script.ScriptContextClassTests<javax.script.ScriptContext> {

    @Override
    public Class<javax.script.ScriptContext> createNewSUT() {
        return javax.script.ScriptContext.class;
    }

}
