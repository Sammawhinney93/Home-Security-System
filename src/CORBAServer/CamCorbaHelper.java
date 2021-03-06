package CORBAServer;




abstract public class CamCorbaHelper
{
  private static String  _id = "IDL:CORBAServer/CamCorba:1.0";

  public static void insert (org.omg.CORBA.Any a, CORBAServer.CamCorba that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CORBAServer.CamCorba extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CORBAServer.CamCorbaHelper.id (), "CamCorba");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CORBAServer.CamCorba read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (CamCorbaStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CORBAServer.CamCorba value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CORBAServer.CamCorba narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CORBAServer.CamCorba)
      return (CORBAServer.CamCorba)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CORBAServer.CamCorbaStub stub = new CORBAServer.CamCorbaStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CORBAServer.CamCorba unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CORBAServer.CamCorba)
      return (CORBAServer.CamCorba)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CORBAServer.CamCorbaStub stub = new CORBAServer.CamCorbaStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
