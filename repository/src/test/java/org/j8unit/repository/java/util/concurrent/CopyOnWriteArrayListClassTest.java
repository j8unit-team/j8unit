package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class CopyOnWriteArrayListClassTest
implements org.j8unit.repository.java.util.concurrent.CopyOnWriteArrayListClassTests<java.util.concurrent.CopyOnWriteArrayList> {

    @Override
    public Class<java.util.concurrent.CopyOnWriteArrayList> createNewSUT() {
        return java.util.concurrent.CopyOnWriteArrayList.class;
    }

}
