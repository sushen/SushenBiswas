package blog.biswasvideo.sushenbiswas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAbout();
    }

    public void btnAbout(){
        Button nextButton = (Button) findViewById(R.id.btnAbout);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("MyApps","I am happy");
                Toast.makeText(getApplicationContext(),"I am in Function",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Print Line Activety
                Intent intent = new Intent(MainActivity.this,About.class);
                startActivity(intent);
            }
        });
    }
}
