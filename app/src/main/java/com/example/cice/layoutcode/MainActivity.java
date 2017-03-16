package com.example.cice.layoutcode;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //Crear interfaaz mediante codigo
        Button myButton = new Button(this);

        //Customizar el boton
        myButton.setText("Hola");
        myButton.setBackgroundColor(Color.YELLOW);

        RelativeLayout layout = new RelativeLayout(this);
        layout.setBackgroundColor(Color.CYAN);

        //Creamos el editText
        EditText editText = new EditText(this);

        //Pasamos Ids a los elementos
        //myButton.setId(R.id.myButtonId);
        editText.setId(R.id.myEditTextId);

        RelativeLayout.LayoutParams buttonParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);

        buttonParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonParams.addRule(RelativeLayout.CENTER_VERTICAL);
        layout.addView(myButton);
        setContentView(layout);
    }
}
