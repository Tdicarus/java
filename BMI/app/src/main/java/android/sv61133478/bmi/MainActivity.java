package android.sv61133478.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button chiso;
        chiso = (Button) findViewById(R.id.bmi);

    }

    public void TinhBmi(View view)
    {
        EditText cannang = (EditText) findViewById(R.id.weight);
        float soA = Float.parseFloat ( cannang.getText().toString() );
        EditText chieucao = (EditText) findViewById(R.id.height);
        float soB = Float.parseFloat ( chieucao.getText().toString() );
        float Kq = soA / (soB*soB);
        TextView dk_KQ = (TextView) findViewById(R.id.ketqua);
        dk_KQ.setText ( String.valueOf(Kq) );
        TextView phanloai = (TextView) findViewById(R.id.xeploai);
        if (Kq >= 40)
        {
            phanloai.setText("Obese III");
        }
        else if (Kq >= 35 && Kq <= 39.9)
        {
            phanloai.setText("Obese II");
        }
        else if (Kq >= 30 && Kq <= 34.9)
        {
            phanloai.setText("Obese I");
        }
        else if (Kq >= 25 && Kq <= 29.9)
        {
            phanloai.setText("Overweight");
        }
        else if (Kq >= 18.5 && Kq <=24.9)
        {
            phanloai.setText("Normal");
        }
        else phanloai.setText("Underweight");
    }
}