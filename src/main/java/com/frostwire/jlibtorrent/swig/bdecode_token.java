/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class bdecode_token {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected bdecode_token(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(bdecode_token obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_bdecode_token(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public bdecode_token(long off, bdecode_token.type_t t) {
    this(libtorrent_jni.new_bdecode_token__SWIG_0(off, t.swigValue()), true);
  }

  public bdecode_token(long off, long next, bdecode_token.type_t t, short header_size) {
    this(libtorrent_jni.new_bdecode_token__SWIG_1(off, next, t.swigValue(), header_size), true);
  }

  public bdecode_token(long off, long next, bdecode_token.type_t t) {
    this(libtorrent_jni.new_bdecode_token__SWIG_2(off, next, t.swigValue()), true);
  }

  public int start_offset() {
    return libtorrent_jni.bdecode_token_start_offset(swigCPtr, this);
  }

  public void setOffset(long value) {
    libtorrent_jni.bdecode_token_offset_set(swigCPtr, this, value);
  }

  public long getOffset() {
    return libtorrent_jni.bdecode_token_offset_get(swigCPtr, this);
  }

  public void setType(long value) {
    libtorrent_jni.bdecode_token_type_set(swigCPtr, this, value);
  }

  public long getType() {
    return libtorrent_jni.bdecode_token_type_get(swigCPtr, this);
  }

  public void setNext_item(long value) {
    libtorrent_jni.bdecode_token_next_item_set(swigCPtr, this, value);
  }

  public long getNext_item() {
    return libtorrent_jni.bdecode_token_next_item_get(swigCPtr, this);
  }

  public void setHeader(long value) {
    libtorrent_jni.bdecode_token_header_set(swigCPtr, this, value);
  }

  public long getHeader() {
    return libtorrent_jni.bdecode_token_header_get(swigCPtr, this);
  }

  public enum type_t {
    none,
    dict,
    list,
    string,
    integer,
    end;

    public final int swigValue() {
      return swigValue;
    }

    public static type_t swigToEnum(int swigValue) {
      type_t[] swigValues = type_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (type_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + type_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private type_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private type_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private type_t(type_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum limits_t {
    max_offset((1 << 29) -1),
    max_next_item((1 << 29) -1),
    max_header((1 << 3) -1);

    public final int swigValue() {
      return swigValue;
    }

    public static limits_t swigToEnum(int swigValue) {
      limits_t[] swigValues = limits_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (limits_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + limits_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private limits_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private limits_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private limits_t(limits_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}