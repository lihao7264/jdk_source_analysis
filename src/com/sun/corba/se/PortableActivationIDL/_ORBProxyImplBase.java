package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/_ORBProxyImplBase.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-amd64-cygwin/jdk8u281/880/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Wednesday, December 9, 2020 1:55:54 PM UTC
*/


/** ORB callback interface, passed to Activator in registerORB method.
    */
public abstract class _ORBProxyImplBase extends org.omg.CORBA.portable.ObjectImpl
                implements ORBProxy, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors
  public _ORBProxyImplBase ()
  {
  }

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("activate_adapter", new Integer (0));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    Integer __method = (Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {

  /** Method used to cause ORB to activate the named adapter, if possible.
	* This will cause the named POA to register itself with the activator as
	* a side effect.  This should always happen before this call can complete.
	* This method returns true if adapter activation succeeded, otherwise it
	* returns false.
	*/
       case 0:  // PortableActivationIDL/ORBProxy/activate_adapter
       {
         String name[] = org.omg.PortableInterceptor.AdapterNameHelper.read (in);
         boolean $result = false;
         $result = this.activate_adapter (name);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:PortableActivationIDL/ORBProxy:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }


} // class _ORBProxyImplBase
