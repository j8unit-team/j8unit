package org.j8unit.repository.javax.script;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompiledScriptClassTest
implements org.j8unit.repository.javax.script.CompiledScriptClassTests<javax.script.CompiledScript> {

    @Override
    public Class<javax.script.CompiledScript> createNewSUT() {
        return javax.script.CompiledScript.class;
    }

}
