package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.awt.Dialog;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dialog.ModalityType;
import org.j8unit.runners.J8Unit4;
import org.j8unit.util.TestParametersUtil;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class DialogTest
implements org.j8unit.repository.java.awt.DialogTests<Dialog> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Dialog]

    @Override
    public Dialog createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.Dialog], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Dialog]

    @RunWith(J8Unit4.class)
    public static class ModalExclusionTypeTest
    implements org.j8unit.repository.java.awt.DialogTests.ModalExclusionTypeTests<ModalExclusionType> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Dialog$ModalExclusionType]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(ModalExclusionType.class);
        }

        @Parameter(0)
        public ModalExclusionType sut;

        @Override
        public ModalExclusionType createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Dialog$ModalExclusionType]

    }

    @RunWith(J8Unit4.class)
    public static class ModalityTypeTest
    implements org.j8unit.repository.java.awt.DialogTests.ModalityTypeTests<ModalityType> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Dialog$ModalityType]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOfEnumClass(ModalityType.class);
        }

        @Parameter(0)
        public ModalityType sut;

        @Override
        public ModalityType createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Dialog$ModalityType]

    }

}
