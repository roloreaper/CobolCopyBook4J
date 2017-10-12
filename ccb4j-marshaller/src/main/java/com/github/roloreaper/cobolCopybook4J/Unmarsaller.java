package com.github.roloreaper.cobolCopybook4J;

import java.io.DataOutput;
import java.io.InputStream;
import java.io.OutputStream;

public interface Unmarsaller {
    void unmarshall(Object object, InputStream inputStream);
}
