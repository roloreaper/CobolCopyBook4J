package com.githib.roloreaper.cobalCopyBook4J;

import java.util.List;
import java.util.Map;

public class CopyBookDefinition {
    private String definition;
    private List<CopyBookField> fields;
    private List<CopyBookDefinition> lines;

    public void addLine(CopyBookDefinition copyBookDefinition) {
        lines.add(copyBookDefinition);
    }

    public void removeLine(CopyBookDefinition copyBookDefinition) {
    }
}
