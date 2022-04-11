package org.tron.common.utils;

import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import org.tron.core.exception.EventBloomException;

public class ByteUtil {

  public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
  public static final byte[] ZERO_BYTE_ARRAY = new byte[]{0};
  public static final int WORD_SIZE = 32;


  
  public static byte[] cloneBytes(byte[] data) {
    if (data == null) {
      return null;
    }

    int length = data.length;
    byte[] rc = new byte[length];
    if (length > 0) {
      System.arraycopy(data, 0, rc, 0, length);
    }
    return rc;
  }

 
  public static byte[] bigIntegerToBytes(BigInteger b, int numBytes) {
    if (b == null) {
      return null;
    }
    byte[] bytes = new byte[numBytes];
    byte[] biBytes = b.toByteArray();
    int start = (biBytes.length == numBytes + 1) ? 1 : 0;
    int length = Math.min(biBytes.length, numBytes);
    System.arraycopy(biBytes, start, bytes, numBytes - length, length);
    return bytes;
  }

  
  public static byte[] bigIntegerToBytes(BigInteger value) {
    if (value == null) {
      return null;
    }

    byte[] data = value.toByteArray();

    if (data.length != 1 && data[0] == 0) {
      byte[] tmp = new byte[data.length - 1];
      System.arraycopy(data, 1, tmp, 0, tmp.length);
      data = tmp;
    }
    return data;
  }

  
  public static byte[] merge(byte[]... arrays) {
    int count = 0;
    for (byte[] array : arrays) {
      count += array.length;
    }

    // Create new array and copy all array contents
    byte[] mergedArray = new byte[count];
    int start = 0;
    for (byte[] array : arrays) {
      System.arraycopy(array, 0, mergedArray, start, array.length);
      start += array.length;
    }
    return mergedArray;
  }
