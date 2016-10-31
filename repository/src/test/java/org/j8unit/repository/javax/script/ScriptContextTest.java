package org.j8unit.repository.javax.script;

import javax.script.ScriptContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ScriptContextTest
implements org.j8unit.repository.javax.script.ScriptContextTests<ScriptContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.script.ScriptContext]

    @Override
    public ScriptContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.script.ScriptContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.script.ScriptContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.script.ScriptContext]

}
