package org.j8unit.repository.javax.script;

import javax.script.AbstractScriptEngine;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractScriptEngineTest
implements org.j8unit.repository.javax.script.AbstractScriptEngineTests<AbstractScriptEngine> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.script.AbstractScriptEngine]

    @Override
    public AbstractScriptEngine createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.script.AbstractScriptEngine], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.script.AbstractScriptEngine]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.script.AbstractScriptEngine]

}
