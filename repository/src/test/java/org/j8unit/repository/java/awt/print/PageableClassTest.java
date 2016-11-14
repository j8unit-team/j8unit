package org.j8unit.repository.java.awt.print;

import java.awt.print.Pageable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Pageable} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.awt.print.PageableClassTests}).
 */

@RunWith(J8Unit4.class)
public class PageableClassTest
implements PageableClassTests<Pageable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.print.Pageable]

    @Override
    public Class<Pageable> createNewSUT() {
        return Pageable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.print.Pageable]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.print.Pageable]

}
