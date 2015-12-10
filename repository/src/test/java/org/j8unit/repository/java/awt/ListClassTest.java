package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ListClassTest
implements org.j8unit.repository.java.awt.ListClassTests<java.awt.List> {

    @Override
    public Class<java.awt.List> createNewSUT() {
        return java.awt.List.class;
    }

}
