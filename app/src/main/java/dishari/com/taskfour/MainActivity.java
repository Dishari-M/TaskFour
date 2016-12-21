package dishari.com.taskfour;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

private EditText name;
    private EditText age;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    name= (EditText)findViewById(R.id.editText3);
    age=(EditText)findViewById(R.id.editText2);
    button=(Button)findViewById(R.id.button);
    button.setOnClickListener(this);}

@Override
public void onClick(View v)
{
    Intent intent =new Intent( this,DisplayMessageActivity.class);
    String message= name.getText().toString();
    int message2=Integer.parseInt(age.getText().toString());
    intent.putExtra("user-name",message);
    intent.putExtra("user-age",message2);
    startActivity(intent);

}}
