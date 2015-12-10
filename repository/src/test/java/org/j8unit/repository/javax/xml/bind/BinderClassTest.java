package org.j8unit.repository.javax.xml.bind;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class BinderClassTest
implements org.j8unit.repository.javax.xml.bind.BinderClassTests<javax.xml.bind.Binder> {

    @Override
    public Class<javax.xml.bind.Binder> createNewSUT() {
        return javax.xml.bind.Binder.class;
    }

}
