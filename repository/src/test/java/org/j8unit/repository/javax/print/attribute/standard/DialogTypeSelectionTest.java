package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.print.attribute.standard.DialogTypeSelection;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class DialogTypeSelectionTest
implements org.j8unit.repository.javax.print.attribute.standard.DialogTypeSelectionTests<DialogTypeSelection> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.DialogTypeSelection]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(DialogTypeSelection.NATIVE, //
                                DialogTypeSelection.COMMON);
    }

    @Parameter(0)
    public DialogTypeSelection sut;

    @Override
    public DialogTypeSelection createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.DialogTypeSelection]

}
