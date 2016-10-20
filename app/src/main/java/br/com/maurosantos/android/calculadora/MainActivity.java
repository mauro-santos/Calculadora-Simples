package br.com.maurosantos.android.calculadora;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtValor1;
    private EditText edtValor2;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValor1 = (EditText) findViewById(R.id.edtValor1);
        edtValor2 = (EditText) findViewById(R.id.edtValor2);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(this);
    }

    public void onClick(View v) {
        String v1 = edtValor1.getText().toString().trim();
        String v2 = edtValor2.getText().toString().trim();

        AlertDialog.Builder dlg = new AlertDialog.Builder(this);

        if (v1.isEmpty() || v2.isEmpty()) {
            dlg.setMessage("Há valores em branco!");
        } else {
            dlg.setMessage("O resultado da soma é: " + (Double.parseDouble(v1) + Double.parseDouble(v2)));
        }

        dlg.setNeutralButton("OK", null);
        dlg.show();
    }
}
