package HomeHub;


/**
* HomeHub/HOMEHHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from HOMEH.idl
* Wednesday, 5 April 2017 11:04:16 o'clock BST
*/

abstract public class HOMEHHelper
{
  private static String  _id = "IDL:HomeHub/HOMEH:1.0";

  public static void insert (org.omg.CORBA.Any a, HomeHub.HOMEH that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static HomeHub.HOMEH extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (HomeHub.HOMEHHelper.id (), "HOMEH");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static HomeHub.HOMEH read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (HOMEHStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, HomeHub.HOMEH value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static HomeHub.HOMEH narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof HomeHub.HOMEH)
      return (HomeHub.HOMEH)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      HomeHub.HOMEHStub stub = new HomeHub.HOMEHStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static HomeHub.HOMEH unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof HomeHub.HOMEH)
      return (HomeHub.HOMEH)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      HomeHub.HOMEHStub stub = new HomeHub.HOMEHStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
