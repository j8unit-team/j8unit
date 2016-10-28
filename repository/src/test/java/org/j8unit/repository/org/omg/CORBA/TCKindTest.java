package org.j8unit.repository.org.omg.CORBA;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.omg.CORBA.TCKind;

@RunWith(J8Unit4.class)
public class TCKindTest
implements org.j8unit.repository.org.omg.CORBA.TCKindTests<TCKind> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.TCKind]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(TCKind.tk_float, //
                                TCKind.tk_array, //
                                TCKind.tk_struct, //
                                TCKind.tk_string, //
                                TCKind.tk_sequence, //
                                TCKind.tk_alias, //
                                TCKind.tk_any, //
                                TCKind.tk_ulonglong, //
                                TCKind.tk_value, //
                                TCKind.tk_ulong, //
                                TCKind.tk_longdouble, //
                                TCKind.tk_octet, //
                                TCKind.tk_boolean, //
                                TCKind.tk_ushort, //
                                TCKind.tk_long, //
                                TCKind.tk_except, //
                                TCKind.tk_short, //
                                TCKind.tk_TypeCode, //
                                TCKind.tk_objref, //
                                TCKind.tk_enum, //
                                TCKind.tk_null, //
                                TCKind.tk_wchar, //
                                TCKind.tk_double, //
                                TCKind.tk_longlong, //
                                TCKind.tk_fixed, //
                                TCKind.tk_value_box, //
                                TCKind.tk_Principal, //
                                TCKind.tk_void, //
                                TCKind.tk_abstract_interface, //
                                TCKind.tk_union, //
                                TCKind.tk_native, //
                                TCKind.tk_char, //
                                TCKind.tk_wstring);
    }

    @Parameter(0)
    public TCKind sut;

    @Override
    public TCKind createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.TCKind]

}
