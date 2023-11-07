
package com.example.section6test1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private EditText PopNameET, PopNumberET, PopTypeET, FandomET, UltimateET,PriceET;
    private RadioGroup radioGroupOn;
    private Button buttonSubmit;
    Cursor mCursor;

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //get info from layout
            String popName= PopNameET.getText().toString();
            int popNumber = Integer.parseInt(PopNumberET.getText().toString());
            String popType= PopTypeET.getText().toString();
            String fandom= FandomET.getText().toString();
            int selectedRadioId = radioGroupOn.getCheckedRadioButtonId();
            boolean on = (selectedRadioId == R.id.radioButtonOn);
            String ultimate= UltimateET.getText().toString();
            double price = Double.parseDouble(PriceET.getText().toString());
            // Insert the FunkoPOP object into the database
            Uri contentUri = NamesProvider.CONTENT_URI; // Use the correct content URI
            ContentResolver contentResolver = getContentResolver();
            ContentValues values = new ContentValues();


            values.put(NamesProvider.COLUMN_POP_NAME, popName);
            values.put(NamesProvider.COLUMN_POP_NUMBER, popNumber);
            values.put(NamesProvider.COLUMN_POP_TYPE, popType);
            values.put(NamesProvider.COLUMN_FANDOM, fandom);
            values.put(NamesProvider.COLUMN_ON, on ? 1 : 0); // 1 is true or 0 is false
            values.put(NamesProvider.COLUMN_ULTIMATE, ultimate);
            values.put(NamesProvider.COLUMN_PRICE, price);

            Uri insertedUri = contentResolver.insert(contentUri, values);
        }
    };

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        PopNameET = findViewById(R.id.PopNameET);
        PopNumberET = findViewById(R.id.PopNumberET);
        PopTypeET = findViewById(R.id.PopTypeET);
        FandomET = findViewById(R.id.FandomET);
        radioGroupOn = findViewById(R.id.radioGroupOn);
        UltimateET = findViewById(R.id.UltimateET);
        PriceET = findViewById(R.id.PriceET);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(listener);
    }

}