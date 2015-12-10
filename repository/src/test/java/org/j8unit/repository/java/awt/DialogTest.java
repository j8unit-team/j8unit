package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class DialogTest
implements org.j8unit.repository.java.awt.DialogTests<java.awt.Dialog> {

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class ModalExclusionTypeTest
    implements org.j8unit.repository.java.awt.DialogTests.ModalExclusionTypeTests<java.awt.Dialog.ModalExclusionType> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(java.awt.Dialog.ModalExclusionType.class);
        }

        @Parameter(0)
        public java.awt.Dialog.ModalExclusionType sut;

        @Override
        public java.awt.Dialog.ModalExclusionType createNewSUT() {
            return this.sut;
        }

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class ModalityTypeTest
    implements org.j8unit.repository.java.awt.DialogTests.ModalityTypeTests<java.awt.Dialog.ModalityType> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(java.awt.Dialog.ModalityType.class);
        }

        @Parameter(0)
        public java.awt.Dialog.ModalityType sut;

        @Override
        public java.awt.Dialog.ModalityType createNewSUT() {
            return this.sut;
        }

    }

    @Override
    public java.awt.Dialog createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.awt.Dialog] available.");
    }

}
