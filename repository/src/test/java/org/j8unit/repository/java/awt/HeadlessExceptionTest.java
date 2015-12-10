package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HeadlessExceptionTest
implements org.j8unit.repository.java.awt.HeadlessExceptionTests<java.awt.HeadlessException> {

    @Override
    public java.awt.HeadlessException createNewSUT() {
        return new java.awt.HeadlessException();
    }

}
