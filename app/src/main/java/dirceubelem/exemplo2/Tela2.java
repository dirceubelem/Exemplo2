package dirceubelem.exemplo2;

import android.app.Application;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class Tela2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        String valor = getIntent().getStringExtra("valor");

        Toast.makeText(this, valor, Toast.LENGTH_LONG).show();


    }


}
