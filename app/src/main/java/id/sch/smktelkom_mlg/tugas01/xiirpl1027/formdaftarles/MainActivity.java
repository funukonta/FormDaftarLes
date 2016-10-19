package id.sch.smktelkom_mlg.tugas01.xiirpl1027.formdaftarles;

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

    Spinner spProv;
    TextView hasil;
    EditText address, name, email;
    RadioButton gnLk, gnPr;
    CheckBox grammar, speaking, writing;
    Button btn;
    String kl, gr, sp, wr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Join Us!");

        spProv = (Spinner) findViewById(R.id.spinnerProvinsi);
        hasil = (TextView) findViewById(R.id.textViewHasil);
        address = (EditText) findViewById(R.id.editTextAddress);
        name = (EditText) findViewById(R.id.editTextNama);
        email = (EditText) findViewById(R.id.editTextEmail);
        gnLk = (RadioButton) findViewById(R.id.radioButtonM);
        gnPr = (RadioButton) findViewById(R.id.radioButtonF);
        grammar = (CheckBox) findViewById(R.id.cgrammar);
        speaking = (CheckBox) findViewById(R.id.cspeaking);
        writing = (CheckBox) findViewById(R.id.cwriting);


        findViewById(R.id.buttonOK).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doclick();
            }


        });





    }


}

