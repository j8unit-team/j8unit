package org.j8unit.repository.java.awt.print;

import java.awt.print.Pageable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PageableClassTest
implements org.j8unit.repository.java.awt.print.PageableClassTests<Pageable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.print.Pageable]

    @Override
    public Class<Pageable> createNewSUT() {
        return Pageable.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.print.Pageable]

}
