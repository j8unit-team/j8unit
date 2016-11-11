package org.j8unit.repository.javax.script;

import javax.script.AbstractScriptEngine;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AbstractScriptEngine} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.script.AbstractScriptEngineTests}).
 */

@RunWith(J8Unit4.class)
public class AbstractScriptEngineTest
implements AbstractScriptEngineTests<AbstractScriptEngine> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.script.AbstractScriptEngine]

    @Override
    public AbstractScriptEngine createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.script.AbstractScriptEngine], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.script.AbstractScriptEngine]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.script.AbstractScriptEngine]

}
