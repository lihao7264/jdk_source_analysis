package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/DynArray.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-amd64-cygwin/jdk8u281/880/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Wednesday, December 9, 2020 1:55:54 PM UTC
*/


/**
    * DynArray objects support the manipulation of IDL arrays.
    * Note that the dimension of the array is contained in the TypeCode which is accessible
    * through the type attribute. It can also be obtained by calling the component_count operation.
    */
public interface DynArray extends DynArrayOperations, DynAny, org.omg.CORBA.portable.IDLEntity
{
} // interface DynArray