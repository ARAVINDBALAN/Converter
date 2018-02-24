package com.example.user.myapplication;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText itd = (EditText)findViewById(R.id.indian);
        EditText dti = (EditText)findViewById(R.id.dollar);
        itd.setText("0.0");
        dti.setText("0.0");
    }

    public void itod(View view){
        EditText itd = (EditText)findViewById(R.id.indian);
        EditText dti = (EditText)findViewById(R.id.dollar);
        if (itd.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),"Enter a number",Toast.LENGTH_SHORT).show();
            return;
        }
        String ind = itd.getText().toString();
        double a = Double.valueOf(ind);
        a=a/64.71;
        dti.setText(String.valueOf(a));


    }
    public void dtoi(View view){
        EditText itd = (EditText)findViewById(R.id.indian);
        EditText dti = (EditText)findViewById(R.id.dollar);
        if (dti.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(),"Enter a number",Toast.LENGTH_SHORT).show();
            return;
        }
        String ind = dti.getText().toString();
        double a = Double.valueOf(ind);
        a=a*64.71;
        itd.setText(String.valueOf(a));


    }
}

