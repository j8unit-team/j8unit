package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.print.attribute.standard.SheetCollate;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class SheetCollateTest
implements org.j8unit.repository.javax.print.attribute.standard.SheetCollateTests<SheetCollate> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.SheetCollate]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(SheetCollate.COLLATED, //
                                SheetCollate.UNCOLLATED);
    }

    @Parameter(0)
    public SheetCollate sut;

    @Override
    public SheetCollate createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.SheetCollate]

}
