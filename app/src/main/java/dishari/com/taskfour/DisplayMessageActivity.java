package dishari.com.taskfour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent=getIntent();
        String data= intent.getStringExtra("user-name");
        int data2=intent.getIntExtra("user-age",30);
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText("Your name is "+ data+"  and your age is "+data2);
    }
}
