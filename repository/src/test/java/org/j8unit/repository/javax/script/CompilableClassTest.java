package org.j8unit.repository.javax.script;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompilableClassTest
implements org.j8unit.repository.javax.script.CompilableClassTests<javax.script.Compilable> {

    @Override
    public Class<javax.script.Compilable> createNewSUT() {
        return javax.script.Compilable.class;
    }

}
