package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class LinkedBlockingDequeClassTest
implements org.j8unit.repository.java.util.concurrent.LinkedBlockingDequeClassTests<java.util.concurrent.LinkedBlockingDeque> {

    @Override
    public Class<java.util.concurrent.LinkedBlockingDeque> createNewSUT() {
        return java.util.concurrent.LinkedBlockingDeque.class;
    }

}
