package matc89.exercicio1;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private TextView mensagem;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mensagem = (TextView)findViewById(R.id.labelMensagem);
        editText = (EditText)findViewById(R.id.editNome);
        //SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        //String texto = prefs.getString("texto", "");
        //editText.setText(texto);

        editText.setText("");
    }
    public void botaoClicado(View v) {
        mensagem.setText("Alô, "+editText.getText().toString()+"!");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("meutexto", mensagem.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String meutexto = savedInstanceState.getString("meutexto");
        mensagem.setText(meutexto);
    }
}