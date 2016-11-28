package org.j8unit.repository.org.omg.CORBA;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.CORBA.DefinitionKind;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DefinitionKind} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.DefinitionKindTests}).
 */
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DefinitionKindTest
implements DefinitionKindTests<DefinitionKind> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.DefinitionKind]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(DefinitionKind.dk_Sequence, //
                                DefinitionKind.dk_String, //
                                DefinitionKind.dk_Alias, //
                                DefinitionKind.dk_Struct, //
                                DefinitionKind.dk_Value, //
                                DefinitionKind.dk_ValueMember, //
                                DefinitionKind.dk_Attribute, //
                                DefinitionKind.dk_Enum, //
                                DefinitionKind.dk_Module, //
                                DefinitionKind.dk_AbstractInterface, //
                                DefinitionKind.dk_Interface, //
                                DefinitionKind.dk_Operation, //
                                DefinitionKind.dk_Repository, //
                                DefinitionKind.dk_none, //
                                DefinitionKind.dk_Fixed, //
                                DefinitionKind.dk_Typedef, //
                                DefinitionKind.dk_ValueBox, //
                                DefinitionKind.dk_Exception, //
                                DefinitionKind.dk_Constant, //
                                DefinitionKind.dk_Array, //
                                DefinitionKind.dk_Union, //
                                DefinitionKind.dk_Primitive, //
                                DefinitionKind.dk_Native, //
                                DefinitionKind.dk_all, //
                                DefinitionKind.dk_Wstring);
    }

    @Parameter(0)
    public DefinitionKind sut;

    @Override
    public DefinitionKind createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.DefinitionKind]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.DefinitionKind]

}
