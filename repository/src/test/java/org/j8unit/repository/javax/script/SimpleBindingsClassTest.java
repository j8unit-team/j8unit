package org.j8unit.repository.javax.script;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SimpleBindingsClassTest
implements org.j8unit.repository.javax.script.SimpleBindingsClassTests<javax.script.SimpleBindings> {

    @Override
    public Class<javax.script.SimpleBindings> createNewSUT() {
        return javax.script.SimpleBindings.class;
    }

}
