package HomeHub;

/**
* HomeHub/HOMEHHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from HOMEH.idl
* Wednesday, 5 April 2017 11:04:16 o'clock BST
*/

public final class HOMEHHolder implements org.omg.CORBA.portable.Streamable
{
  public HomeHub.HOMEH value = null;

  public HOMEHHolder ()
  {
  }

  public HOMEHHolder (HomeHub.HOMEH initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = HomeHub.HOMEHHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    HomeHub.HOMEHHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return HomeHub.HOMEHHelper.type ();
  }

}
