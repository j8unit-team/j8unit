package org.j8unit.repository.javax.xml.transform;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ErrorListenerClassTest
implements org.j8unit.repository.javax.xml.transform.ErrorListenerClassTests<javax.xml.transform.ErrorListener> {

    @Override
    public Class<javax.xml.transform.ErrorListener> createNewSUT() {
        return javax.xml.transform.ErrorListener.class;
    }

}
