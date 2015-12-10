package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ListTest
implements org.j8unit.repository.java.awt.ListTests<java.awt.List> {

    @Override
    public java.awt.List createNewSUT() {
        return new java.awt.List();
    }

}
