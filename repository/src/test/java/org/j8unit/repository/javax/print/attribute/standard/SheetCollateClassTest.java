package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.SheetCollate;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SheetCollate} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.print.attribute.standard.SheetCollateClassTests}).
 */
@RunWith(J8Unit4.class)
public class SheetCollateClassTest
implements SheetCollateClassTests<SheetCollate> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.SheetCollate]

    @Override
    public Class<SheetCollate> createNewSUT() {
        return SheetCollate.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.SheetCollate]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.SheetCollate]

}
