package projects.richie.com.projects;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button_Spotify;
    private Button button_Scores;
    private Button button_Library;
    private Button button_Build;
    private Button button_Reader;
    private Button button_Capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_Spotify  = (Button) findViewById(R.id.spotify);
        button_Scores  = (Button) findViewById(R.id.scroes);
        button_Library  = (Button) findViewById(R.id.library);
        button_Build  = (Button) findViewById(R.id.builtbig);
        button_Reader  = (Button) findViewById(R.id.reader);
        button_Capstone  = (Button) findViewById(R.id.capstone);

        button_Spotify.setOnClickListener(spotify);
        button_Scores.setOnClickListener(scores);
        button_Library.setOnClickListener(library);
        button_Build.setOnClickListener(build);
        button_Reader.setOnClickListener(reader);
        button_Capstone.setOnClickListener(capstones);

    }

       View.OnClickListener spotify  = new View.OnClickListener() {
           @Override
           public void onClick(View v) {
Toast.makeText(getApplicationContext(),"This button launches the Spotify app",Toast.LENGTH_SHORT).show();
           }
       };

    View.OnClickListener scores  = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(),"This button launches the Scores app",Toast.LENGTH_SHORT).show();

        }
    };
    View.OnClickListener library  = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(),"This button launches the Library app",Toast.LENGTH_SHORT).show();

        }
    };
    View.OnClickListener build  = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(),"This button launches the Build app",Toast.LENGTH_SHORT).show();

        }
    };
    View.OnClickListener reader  = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(),"This button launches the Reader app",Toast.LENGTH_SHORT).show();

        }
    };
    View.OnClickListener capstones  = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(),"This button launches the Capstones app",Toast.LENGTH_SHORT).show();

        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
