package com.sun.corba.se.spi.activation;

/**
* com/sun/corba/se/spi/activation/EndPointInfoHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-amd64-cygwin/jdk8u281/880/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Wednesday, December 9, 2020 1:55:54 PM UTC
*/

public final class EndPointInfoHolder implements org.omg.CORBA.portable.Streamable
{
  public EndPointInfo value = null;

  public EndPointInfoHolder ()
  {
  }

  public EndPointInfoHolder (EndPointInfo initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EndPointInfoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EndPointInfoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EndPointInfoHelper.type ();
  }

}
