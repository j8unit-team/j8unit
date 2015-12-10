package org.j8unit.repository.javax.xml.bind;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DataBindingExceptionClassTest
implements org.j8unit.repository.javax.xml.bind.DataBindingExceptionClassTests<javax.xml.bind.DataBindingException> {

    @Override
    public Class<javax.xml.bind.DataBindingException> createNewSUT() {
        return javax.xml.bind.DataBindingException.class;
    }

}
