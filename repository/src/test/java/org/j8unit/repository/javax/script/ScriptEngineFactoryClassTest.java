package org.j8unit.repository.javax.script;

import javax.script.ScriptEngineFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ScriptEngineFactoryClassTest
implements org.j8unit.repository.javax.script.ScriptEngineFactoryClassTests<ScriptEngineFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.script.ScriptEngineFactory]

    @Override
    public Class<ScriptEngineFactory> createNewSUT() {
        return ScriptEngineFactory.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.script.ScriptEngineFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.script.ScriptEngineFactory]

}
