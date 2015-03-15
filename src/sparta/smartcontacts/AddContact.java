package sparta.smartcontacts;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.os.Bundle;

public class AddContact extends ActionBarActivity
{
	private final String TAG ="ADDContact";
	public void onCreate(Bundle b)
	{
		super.onCreate(b);
		setContentView(R.layout.add_contact);
	}
	public void invokeDB()
	{
	Log.d(TAG, "Hey.. I am going to ivoke db..");
	DBAdapter db = new DBAdapter(this);
	}
}