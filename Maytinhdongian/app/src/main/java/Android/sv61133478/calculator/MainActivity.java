package Android.sv61133478.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button NutCong,NutNhan,NutTru,NutChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimWidget();

    }
    public void TimWidget()
    {
        NutCong = (Button) findViewById(R.id.btnCong);
        NutTru = (Button) findViewById(R.id.btnTru);
        NutNhan = (Button) findViewById(R.id.btnNhan);
        NutChia = (Button) findViewById(R.id.btnChia);
    }

    //Hàm xử lý cộng
    public void Xuly_Cong (View view)
    {
        EditText dk_soA = (EditText) findViewById(R.id.edtA);
        int soA = Integer.parseInt ( dk_soA.getText().toString() );
        EditText dk_soB = (EditText) findViewById(R.id.edtB);
        int soB = Integer.parseInt ( dk_soB.getText().toString() );
        int Kq = soA + soB;
        TextView dk_KQ = (TextView) findViewById(R.id.tvResult);
        dk_KQ.setText ( "Tổng là: " + Kq );
    }

    //Hàm xử lý trừ
    public void Xuly_Tru (View view)
    {
        EditText dk_soA = (EditText) findViewById(R.id.edtA);
        int soA = Integer.parseInt ( dk_soA.getText().toString() );
        EditText dk_soB = (EditText) findViewById(R.id.edtB);
        int soB = Integer.parseInt ( dk_soB.getText().toString() );
        int Kq = soA - soB;
        TextView dk_KQ = (TextView) findViewById(R.id.tvResult);
        dk_KQ.setText ( "Hiệu là: " + Kq );
    }

    //Hàm xử lý nhân
    public void Xuly_Nhan (View view)
    {
        EditText dk_soA = (EditText) findViewById(R.id.edtA);
        int soA = Integer.parseInt ( dk_soA.getText().toString() );
        EditText dk_soB = (EditText) findViewById(R.id.edtB);
        int soB = Integer.parseInt ( dk_soB.getText().toString() );
        int Kq = soA * soB;
        TextView dk_KQ = (TextView) findViewById(R.id.tvResult);
        dk_KQ.setText ( "Tích là: " + Kq );
    }

    //Hàm xử lý chia
    public void Xuly_Chia (View view)
    {
        EditText dk_soA = (EditText) findViewById(R.id.edtA);
        float soA = Float.parseFloat ( dk_soA.getText().toString() );
        EditText dk_soB = (EditText) findViewById(R.id.edtB);
        float soB = Float.parseFloat ( dk_soB.getText().toString() );
        float Kq =   soA / soB;
        TextView dk_KQ = (TextView) findViewById(R.id.tvResult);
        dk_KQ.setText ( "Thương là: " + Kq );
    }
}

