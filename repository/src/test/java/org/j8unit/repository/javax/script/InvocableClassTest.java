package org.j8unit.repository.javax.script;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvocableClassTest
implements org.j8unit.repository.javax.script.InvocableClassTests<javax.script.Invocable> {

    @Override
    public Class<javax.script.Invocable> createNewSUT() {
        return javax.script.Invocable.class;
    }

}
