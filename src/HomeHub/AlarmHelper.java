package HomeHub;


/**
* HomeHub/AlarmHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from HOMEH.idl
* Wednesday, 5 April 2017 11:04:16 o'clock BST
*/

abstract public class AlarmHelper
{
  private static String  _id = "IDL:HomeHub/Alarm:1.0";

  public static void insert (org.omg.CORBA.Any a, HomeHub.Alarm that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static HomeHub.Alarm extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [4];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "name",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "homeh",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[2] = new org.omg.CORBA.StructMember (
            "zone",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_boolean);
          _members0[3] = new org.omg.CORBA.StructMember (
            "status",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (HomeHub.AlarmHelper.id (), "Alarm", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static HomeHub.Alarm read (org.omg.CORBA.portable.InputStream istream)
  {
    HomeHub.Alarm value = new HomeHub.Alarm ();
    value.name = istream.read_string ();
    value.homeh = istream.read_string ();
    value.zone = istream.read_long ();
    value.status = istream.read_boolean ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, HomeHub.Alarm value)
  {
    ostream.write_string (value.name);
    ostream.write_string (value.homeh);
    ostream.write_long (value.zone);
    ostream.write_boolean (value.status);
  }

}
