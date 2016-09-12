package id.sch.smktelkom_mlg.tugas01.xirpl315.formulirkartupelajar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNama;
    EditText etTtl;
    EditText etAlamat;
    Button bOK;
    TextView tvhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.Nama);
        etTtl = (EditText) findViewById(R.id.Ttl);
        etAlamat = (EditText) findViewById(R.id.Alamat);
        bOK = (Button) findViewById(R.id.OK);
        tvhasil = (TextView) findViewById(R.id.hasil);

        bOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = etNama.getText().toString();
                String Ttl = etTtl.getText().toString();
                String Alamat = etAlamat.getText().toString();
                tvhasil.setText(nama + " lahir di " + Ttl + " tinggal di ");

            }
        });

    }
}
