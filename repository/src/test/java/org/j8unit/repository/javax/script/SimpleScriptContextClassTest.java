package org.j8unit.repository.javax.script;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SimpleScriptContextClassTest
implements org.j8unit.repository.javax.script.SimpleScriptContextClassTests<javax.script.SimpleScriptContext> {

    @Override
    public Class<javax.script.SimpleScriptContext> createNewSUT() {
        return javax.script.SimpleScriptContext.class;
    }

}
