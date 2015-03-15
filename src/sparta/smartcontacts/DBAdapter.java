package sparta.smartcontacts;
import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
public class DBAdapter
{
	public DBAdapter(Context context)
	{
		DBHelper db = new DBHelper(context);
		db.getWritableDatabase();
	}

class DBHelper extends SQLiteOpenHelper
	{
	private static final String DATABASE_NAME = "CONTACTS_DB";
	private static final String COLUMN1 = "NAME";
	private static final String COLUMN2 = "NUMBER";
	private static final int DATABASEVERSION = 1;
	private static final String CONTACTSTABLE = "CONTACTS";
	private String TAG = "DBHelper";
	
	public DBHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASEVERSION);
		// TODO Auto-generated constructor stub
		Log.d(TAG,"Inside Constructor");
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		Log.d("TAG","Inside onCreate");	
		db.execSQL("CREATE TABLE CONTACTSTABLE (COLUMN1 VARCHAR(255) PRIMARY KEY,COLUMN2 VARCHAR(255))");
		Log.d(TAG,"Table Created successfully");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		Log.d(TAG,"Inside onUpgrade");
		db.execSQL("DROP TABLE IF EXISTS CONTACTSTABLE");
		Log.d(TAG,"Table dropped");
		onCreate(db);
		
	}
	
	}
}