package org.j8unit.repository.javax.script;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ScriptExceptionTest
implements org.j8unit.repository.javax.script.ScriptExceptionTests<javax.script.ScriptException> {

    @Override
    public javax.script.ScriptException createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.script.ScriptException] available.");
    }

}
