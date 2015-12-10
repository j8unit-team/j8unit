package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RecursiveActionClassTest
implements org.j8unit.repository.java.util.concurrent.RecursiveActionClassTests<java.util.concurrent.RecursiveAction> {

    @Override
    public Class<java.util.concurrent.RecursiveAction> createNewSUT() {
        return java.util.concurrent.RecursiveAction.class;
    }

}
