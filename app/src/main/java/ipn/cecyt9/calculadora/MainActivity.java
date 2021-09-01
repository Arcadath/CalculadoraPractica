package ipn.cecyt9.calculadora;

import static android.widget.Toast.LENGTH_SHORT;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    Double numero1,numero2,resultado;
    String operador;

    public void Uno(View miView)
    {
        TextView tv = (Text) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "1");
    }
    public void Dos(View miView)
    {
        TextView tv = (Text) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "2");
    }
    public void Tres(View miView)
    {
        TextView tv = (Text) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "3");
    }
    public void Cuatro(View miView)
    {
        TextView tv = (Text) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "4");
    }
    public void Cinco(View miView)
    {
        TextView tv = (Text) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "5");
    }
    public void Seis(View miView)
    {
        TextView tv = (Text) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "6");
    }
    public void Siete(View miView)
    {
        TextView tv = (Text) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "7");
    }
    public void Ocho(View miView)
    {
        TextView tv = (Text) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "8");
    }
    public void Nueve(View miView)
    {
        TextView tv = (Text) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "9");
    }
    public void Cero(View miView)
    {
        TextView tv = (Text) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "0");
    }

    public void Punto(View miView)
    {
        TextView tv = (Text) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + ".");
    }

    public void onClickOperacionCapturaNumero1(View miView)
    {
        TextView tv = (Text) findViewById(R.id.textViewNumero) ;
        numero1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void OperMas(View miView)
    {
        operador="+";
        onClickOperacionCapturaNumero1(miView);
    }
    public void OperMenos(View miView)
    {
        operador="-";
        onClickOperacionCapturaNumero1(miView);
    }
    public void OperMultipli(View miView)
    {
        operador="*";
        onClickOperacionCapturaNumero1(miView);
    }
    public void OperDivicion(View miView)
    {
        operador="/";
        onClickOperacionCapturaNumero1(miView);
    }
    public void logaritmo(View miView) {
        operador="log10";
        onClickOperacionCapturaNumero1(miView);
    }
    public void Raiz(View miView){
        operador="√";
        onClickOperacionCapturaNumero1(miView);
    }
    public void Potencia(View miView) {
        operador="^";
        onClickOperacionCapturaNumero1(miView);
    }
    public void Resultado(View miView)
    {
        TextView tv = (Text) findViewById(R.id.textViewNumero) ;
        numero2 = Double.parseDouble(tv.getText().toString());

        try {

            if (operador.equals("+")) {
                resultado = numero1 + numero2;
            } else if (operador.equals("-")) {
                resultado = numero1 - numero2;
            } else if (operador.equals("*")) {
                resultado = numero1 * numero2;
            } else if (operador.equals("/")) {
                resultado = numero1 / numero2;
            }else if(operador.equals("log10")) {
                resultado = Math.log10(numero1);
            }else if(operador.equals("√")) {
                resultado = Math.sqrt(numero1);
            }else if(operador.equals("^")) {
                resultado = Math.pow(numero1);
            }
            tv.setText(resultado.toString());
        }catch(NumberFormatException nfe){
            Toast.makeText(this,"Numero Incorrecto", LENGTH_SHORT).show();
        }
    }

    public void LimpiarResultado(View miView)
    {
        numero1=0.0;
        numero2=0.0;
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText("0");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}