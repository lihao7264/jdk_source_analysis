package org.omg.IOP;

/**
* org/omg/IOP/IORHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-amd64-cygwin/jdk8u281/880/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Wednesday, December 9, 2020 1:55:54 PM UTC
*/

public final class IORHolder implements org.omg.CORBA.portable.Streamable
{
  public IOR value = null;

  public IORHolder ()
  {
  }

  public IORHolder (IOR initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IORHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IORHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IORHelper.type ();
  }

}
