package org.j8unit.repository.java.awt.print;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PageableClassTest
implements org.j8unit.repository.java.awt.print.PageableClassTests<java.awt.print.Pageable> {

    @Override
    public Class<java.awt.print.Pageable> createNewSUT() {
        return java.awt.print.Pageable.class;
    }

}
