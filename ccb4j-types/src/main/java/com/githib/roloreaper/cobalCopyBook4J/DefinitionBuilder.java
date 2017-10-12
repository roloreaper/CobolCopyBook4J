package com.githib.roloreaper.cobalCopyBook4J;

import java.io.InputStream;

public class DefinitionBuilder {

    private final CopyBookDefinition copyBookDefinition;

    private DefinitionBuilder() {
        copyBookDefinition = new CopyBookDefinition();
    }

    public static DefinitionBuilder getInstance() {
        return new DefinitionBuilder();
    }

    public DefinitionBuilder addCopybookDefinitionLine(CopyBookDefinition copyBookDefinition) {
        copyBookDefinition.addLine(copyBookDefinition);
        return this;
    }

    public static DefinitionBuilder load(InputStream inputStream) {
        return new DefinitionBuilder();
    }
}
