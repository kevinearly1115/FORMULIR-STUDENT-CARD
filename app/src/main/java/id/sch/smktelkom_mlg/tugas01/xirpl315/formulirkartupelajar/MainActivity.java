package id.sch.smktelkom_mlg.tugas01.xirpl315.formulirkartupelajar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNama;
    EditText etTtl;
    EditText etAlamat;
    Button bOK;
    TextView tvhasil;

    RadioButton laki, perempuan;
    TextView tvhasil2;

    Spinner Jurusan;
    TextView tvhasil3;

    CheckBox ngoding, design, ngegame;
    TextView tvhasil4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.Nama);
        etTtl = (EditText) findViewById(R.id.Ttl);
        etAlamat = (EditText) findViewById(R.id.Alamat);
        bOK = (Button) findViewById(R.id.OK);
        tvhasil = (TextView) findViewById(R.id.hasil);

        laki = (RadioButton) findViewById(R.id.laki);
        perempuan = (RadioButton) findViewById(R.id.perempuan);
        tvhasil2 = (TextView) findViewById(R.id.hasil2);

        Jurusan = (Spinner) findViewById(R.id.Jurusan);
        tvhasil3 = (TextView) findViewById(R.id.hasil3);

        ngoding = (CheckBox) findViewById(R.id.ngoding);
        design = (CheckBox) findViewById(R.id.design);
        ngegame = (CheckBox) findViewById(R.id.ngegame);
        tvhasil4 = (TextView) findViewById(R.id.hasil4);

        findViewById(R.id.OK4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doHobi();
            }
        });


        findViewById(R.id.OK3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doJurusan();
            }
        });

        findViewById(R.id.OK2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doClick();
            }
        });


        bOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doProcess();

            }
        });


    }

    private void doHobi() {
        String hasil4 = "Hobi Anda :\n";
        int startlen = hasil4.length();
        if (ngoding.isChecked()) hasil4 += ngoding.getText() + "\n";
        if (design.isChecked()) hasil4 += design.getText() + "\n";
        if (ngegame.isChecked()) hasil4 += ngegame.getText() + "\n";


        if (hasil4.length() == startlen) hasil4 += "Tidak Ada Pilihan";
        tvhasil4.setText(hasil4);
    }

    private void doJurusan() {
        tvhasil3.setText("Jurusan Anda " + Jurusan.getSelectedItem().toString());
    }

    private void doClick() {
        String hasil2 = null;

        if (laki.isChecked()) {
            hasil2 = laki.getText().toString();
        } else if (perempuan.isChecked()) {
            hasil2 = perempuan.getText().toString();
        }
        if (hasil2 == null) {
            tvhasil2.setText("Anda Belum Memilih Gender");
        } else {
            tvhasil2.setText("Gender anda " + hasil2);
        }
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
