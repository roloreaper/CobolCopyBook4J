package com.github.roloreaper.cobolCopybook4J;

import java.io.OutputStream;

public interface Marshaller {
    Object marshall(Object object, OutputStream outputStream);
}
