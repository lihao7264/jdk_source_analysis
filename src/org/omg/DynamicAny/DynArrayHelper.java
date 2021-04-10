package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/DynArrayHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-amd64-cygwin/jdk8u281/880/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Wednesday, December 9, 2020 1:55:54 PM UTC
*/


/**
    * DynArray objects support the manipulation of IDL arrays.
    * Note that the dimension of the array is contained in the TypeCode which is accessible
    * through the type attribute. It can also be obtained by calling the component_count operation.
    */
abstract public class DynArrayHelper
{
  private static String  _id = "IDL:omg.org/DynamicAny/DynArray:1.0";

  public static void insert (org.omg.CORBA.Any a, DynArray that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static DynArray extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (DynArrayHelper.id (), "DynArray");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static DynArray read (org.omg.CORBA.portable.InputStream istream)
  {
      throw new org.omg.CORBA.MARSHAL ();
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, DynArray value)
  {
      throw new org.omg.CORBA.MARSHAL ();
  }

  public static DynArray narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof DynArray)
      return (DynArray)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _DynArrayStub stub = new _DynArrayStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static DynArray unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof DynArray)
      return (DynArray)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _DynArrayStub stub = new _DynArrayStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
