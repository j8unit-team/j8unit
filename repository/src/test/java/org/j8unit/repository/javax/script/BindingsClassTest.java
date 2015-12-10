package org.j8unit.repository.javax.script;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BindingsClassTest
implements org.j8unit.repository.javax.script.BindingsClassTests<javax.script.Bindings> {

    @Override
    public Class<javax.script.Bindings> createNewSUT() {
        return javax.script.Bindings.class;
    }

}
