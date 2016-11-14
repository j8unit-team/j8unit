package org.j8unit.generator.api;

public class MissingCompilerException
extends IllegalStateException {

    private static final long serialVersionUID = -8420553251871328283L;

    public MissingCompilerException() {
        super("The currently running Java™ platform does not provide a programming language compiler. Probably, you are running a JRE rather than a JDK?");
    }

}
