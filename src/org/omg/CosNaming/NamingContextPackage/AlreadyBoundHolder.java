package org.omg.CosNaming.NamingContextPackage;

/**
* org/omg/CosNaming/NamingContextPackage/AlreadyBoundHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-amd64-cygwin/jdk8u281/880/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Wednesday, December 9, 2020 1:55:53 PM UTC
*/

public final class AlreadyBoundHolder implements org.omg.CORBA.portable.Streamable
{
  public AlreadyBound value = null;

  public AlreadyBoundHolder ()
  {
  }

  public AlreadyBoundHolder (AlreadyBound initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlreadyBoundHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlreadyBoundHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlreadyBoundHelper.type ();
  }

}
