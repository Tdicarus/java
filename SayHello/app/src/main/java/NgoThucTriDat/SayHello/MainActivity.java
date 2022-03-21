package NgoThucTriDat.SayHello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void XinChao(android.view.View v)
    {
        Toast.makeText(MainActivity.this,"Xin chào, tôi là Ngô Thục Trí Đạt", Toast.LENGTH_LONG).show();
    }
}