package org.j8unit.repository.java.awt.print;

import java.awt.print.Pageable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PageableTest
implements org.j8unit.repository.java.awt.print.PageableTests<Pageable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.print.Pageable]

    @Override
    public Pageable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.print.Pageable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.print.Pageable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.print.Pageable]

}
