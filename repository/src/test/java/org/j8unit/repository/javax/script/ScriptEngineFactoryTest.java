package org.j8unit.repository.javax.script;

import javax.script.ScriptEngineFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ScriptEngineFactory} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.script.ScriptEngineFactoryTests}).
 */
@RunWith(J8Unit4.class)
public class ScriptEngineFactoryTest
implements ScriptEngineFactoryTests<ScriptEngineFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.script.ScriptEngineFactory]

    @Override
    public ScriptEngineFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.script.ScriptEngineFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.script.ScriptEngineFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.script.ScriptEngineFactory]

}
