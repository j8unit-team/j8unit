package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObservableClassTest
implements org.j8unit.repository.java.util.ObservableClassTests<java.util.Observable> {

    @Override
    public Class<java.util.Observable> createNewSUT() {
        return java.util.Observable.class;
    }

}
