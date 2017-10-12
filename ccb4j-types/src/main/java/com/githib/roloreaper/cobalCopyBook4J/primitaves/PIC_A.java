package com.githib.roloreaper.cobalCopyBook4J.primitaves;

import com.githib.roloreaper.cobalCopyBook4J.CopyBookType;

/**
 * Created by
 * User :roloreaper
 * Date :2016/10/31.
 */
public class PIC_A implements CopyBookType {
    private int length;
    private PIC_A() { }

    public PIC_A(int length) {
        this.length=length;
    }
    public Class getPrimitiveType() {
        return String.class;
    }

    public String getRegexDefinition() {
        return "[A-Za-z0-9 ]{"+length+","+length+"}";
    }

    public int getLength() {
        return length;
    }
}
