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
public class TCKindTest
implements org.j8unit.repository.org.omg.CORBA.TCKindTests<org.omg.CORBA.TCKind> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(org.omg.CORBA.TCKind.tk_float, //
                                org.omg.CORBA.TCKind.tk_array, //
                                org.omg.CORBA.TCKind.tk_struct, //
                                org.omg.CORBA.TCKind.tk_string, //
                                org.omg.CORBA.TCKind.tk_sequence, //
                                org.omg.CORBA.TCKind.tk_alias, //
                                org.omg.CORBA.TCKind.tk_any, //
                                org.omg.CORBA.TCKind.tk_ulonglong, //
                                org.omg.CORBA.TCKind.tk_value, //
                                org.omg.CORBA.TCKind.tk_ulong, //
                                org.omg.CORBA.TCKind.tk_longdouble, //
                                org.omg.CORBA.TCKind.tk_octet, //
                                org.omg.CORBA.TCKind.tk_boolean, //
                                org.omg.CORBA.TCKind.tk_ushort, //
                                org.omg.CORBA.TCKind.tk_long, //
                                org.omg.CORBA.TCKind.tk_except, //
                                org.omg.CORBA.TCKind.tk_short, //
                                org.omg.CORBA.TCKind.tk_TypeCode, //
                                org.omg.CORBA.TCKind.tk_objref, //
                                org.omg.CORBA.TCKind.tk_enum, //
                                org.omg.CORBA.TCKind.tk_null, //
                                org.omg.CORBA.TCKind.tk_wchar, //
                                org.omg.CORBA.TCKind.tk_double, //
                                org.omg.CORBA.TCKind.tk_longlong, //
                                org.omg.CORBA.TCKind.tk_fixed, //
                                org.omg.CORBA.TCKind.tk_value_box, //
                                org.omg.CORBA.TCKind.tk_Principal, //
                                org.omg.CORBA.TCKind.tk_void, //
                                org.omg.CORBA.TCKind.tk_abstract_interface, //
                                org.omg.CORBA.TCKind.tk_union, //
                                org.omg.CORBA.TCKind.tk_native, //
                                org.omg.CORBA.TCKind.tk_char, //
                                org.omg.CORBA.TCKind.tk_wstring);
    }

    @Parameter(0)
    public org.omg.CORBA.TCKind sut;

    @Override
    public org.omg.CORBA.TCKind createNewSUT() {
        return this.sut;
    }

}
