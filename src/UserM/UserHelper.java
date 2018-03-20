package UserM;


abstract public class UserHelper
{
  private static String  _id = "IDL:UserM/User:1.0";

  public static void insert (org.omg.CORBA.Any a, UserM.User that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static UserM.User extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (UserM.UserHelper.id (), "User");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static UserM.User read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (UserStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, UserM.User value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static UserM.User narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof UserM.User)
      return (UserM.User)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      UserM.UserStub stub = new UserM.UserStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static UserM.User unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof UserM.User)
      return (UserM.User)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      UserM.UserStub stub = new UserM.UserStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
