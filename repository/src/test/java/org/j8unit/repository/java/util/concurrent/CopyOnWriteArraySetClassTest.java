package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class CopyOnWriteArraySetClassTest
implements org.j8unit.repository.java.util.concurrent.CopyOnWriteArraySetClassTests<java.util.concurrent.CopyOnWriteArraySet> {

    @Override
    public Class<java.util.concurrent.CopyOnWriteArraySet> createNewSUT() {
        return java.util.concurrent.CopyOnWriteArraySet.class;
    }

}
