package org.j8unit.repository.javax.script;

import javax.script.Compilable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Compilable} (by simply reusing the
 * J8Unit test interface {@link CompilableTests}).
 */

@RunWith(J8Unit4.class)
public class CompilableTest
implements CompilableTests<Compilable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.script.Compilable]

    @Override
    public Compilable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.script.Compilable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.script.Compilable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.script.Compilable]

}
