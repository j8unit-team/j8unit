package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HeadlessExceptionClassTest
implements org.j8unit.repository.java.awt.HeadlessExceptionClassTests<java.awt.HeadlessException> {

    @Override
    public Class<java.awt.HeadlessException> createNewSUT() {
        return java.awt.HeadlessException.class;
    }

}
