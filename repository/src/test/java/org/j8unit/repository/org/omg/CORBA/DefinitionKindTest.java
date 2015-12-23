package org.j8unit.repository.org.omg.CORBA;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DefinitionKindTest
implements org.j8unit.repository.org.omg.CORBA.DefinitionKindTests<org.omg.CORBA.DefinitionKind> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(org.omg.CORBA.DefinitionKind.dk_Sequence, //
                                org.omg.CORBA.DefinitionKind.dk_String, //
                                org.omg.CORBA.DefinitionKind.dk_Alias, //
                                org.omg.CORBA.DefinitionKind.dk_Struct, //
                                org.omg.CORBA.DefinitionKind.dk_Value, //
                                org.omg.CORBA.DefinitionKind.dk_ValueMember, //
                                org.omg.CORBA.DefinitionKind.dk_Attribute, //
                                org.omg.CORBA.DefinitionKind.dk_Enum, //
                                org.omg.CORBA.DefinitionKind.dk_Module, //
                                org.omg.CORBA.DefinitionKind.dk_AbstractInterface, //
                                org.omg.CORBA.DefinitionKind.dk_Interface, //
                                org.omg.CORBA.DefinitionKind.dk_Operation, //
                                org.omg.CORBA.DefinitionKind.dk_Repository, //
                                org.omg.CORBA.DefinitionKind.dk_none, //
                                org.omg.CORBA.DefinitionKind.dk_Fixed, //
                                org.omg.CORBA.DefinitionKind.dk_Typedef, //
                                org.omg.CORBA.DefinitionKind.dk_ValueBox, //
                                org.omg.CORBA.DefinitionKind.dk_Exception, //
                                org.omg.CORBA.DefinitionKind.dk_Constant, //
                                org.omg.CORBA.DefinitionKind.dk_Array, //
                                org.omg.CORBA.DefinitionKind.dk_Union, //
                                org.omg.CORBA.DefinitionKind.dk_Primitive, //
                                org.omg.CORBA.DefinitionKind.dk_Native, //
                                org.omg.CORBA.DefinitionKind.dk_all, //
                                org.omg.CORBA.DefinitionKind.dk_Wstring);
    }

    @Parameter(0)
    public org.omg.CORBA.DefinitionKind sut;

    @Override
    public org.omg.CORBA.DefinitionKind createNewSUT() {
        return this.sut;
    }

}
