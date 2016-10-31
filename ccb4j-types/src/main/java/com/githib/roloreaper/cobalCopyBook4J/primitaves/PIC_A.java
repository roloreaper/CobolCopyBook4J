package com.githib.roloreaper.cobalCopyBook4J.primitaves;

import com.githib.roloreaper.cobalCopyBook4J.CopyBookType;

/**
 * Created by
 * User :roloreaper
 * Date :2016/10/31.
 */
public class PIC_A implements CopyBookType {
    public Class getPrimitiveType() {
        return String.class;
    }

    public String getRegexDefinition() {
        return "[A..Z][a..z]";
    }
}
