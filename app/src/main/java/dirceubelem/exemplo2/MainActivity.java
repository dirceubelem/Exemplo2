package dirceubelem.exemplo2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    public Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEntrar = (Button) findViewById(R.id.btnEntrar);
        btnEntrar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        EditText txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        EditText txtSenha = (EditText) findViewById(R.id.txtSenha);

        if (txtUsuario.getText().toString().equals("admin") && txtSenha.getText().toString().equals("senha")) {

            Intent i = new Intent(this, Tela2.class);
            i.putExtra("valor", "xxx");
            startActivity(i);

        }else{

            Toast.makeText(this, "Usuário e/ou senha inválidos!", Toast.LENGTH_SHORT).show();

        }

    }
}
