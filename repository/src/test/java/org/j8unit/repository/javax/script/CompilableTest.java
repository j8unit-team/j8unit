package org.j8unit.repository.javax.script;

import javax.script.Compilable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompilableTest
implements org.j8unit.repository.javax.script.CompilableTests<Compilable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.script.Compilable]

    @Override
    public Compilable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.script.Compilable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.script.Compilable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.script.Compilable]

}
