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
                doProcess();

            }
        });

    }

    private void doProcess() {
        if (isValid()) {
            String nama = etNama.getText().toString();
            String Ttl = etTtl.getText().toString();
            String Alamat = etAlamat.getText().toString();
            tvhasil.setText(nama + " lahir di " + Ttl + " tinggal di " + Alamat);
        }
    }

    private boolean isValid() {
        boolean valid = true;

        String nama = etNama.getText().toString();
        String Ttl = etTtl.getText().toString();
        String Alamat = etAlamat.getText().toString();

        if (nama.isEmpty()) {
            etNama.setError("Nama Belum Diisi");
            valid = false;
        } else {
            etNama.setError(null);
        }
        if (Ttl.isEmpty()) {
            etTtl.setError("Tempat Tanggal Lahir Belum Diisi");
            valid = false;
        } else {
            etAlamat.setError(null);
        }
        if (Alamat.isEmpty()) {
            etAlamat.setError("Alamat Belum Diisi");
            valid = false;
        } else {
            etAlamat.setError(null);
        }

        return valid;
    }
}
