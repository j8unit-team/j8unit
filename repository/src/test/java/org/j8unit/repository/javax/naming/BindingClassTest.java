package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BindingClassTest
implements org.j8unit.repository.javax.naming.BindingClassTests<javax.naming.Binding> {

    @Override
    public Class<javax.naming.Binding> createNewSUT() {
        return javax.naming.Binding.class;
    }

}
