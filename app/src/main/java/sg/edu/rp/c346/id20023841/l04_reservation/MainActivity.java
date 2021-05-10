package sg.edu.rp.c346.id20023841.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText number;
    EditText size;
    Button reset;
    Button confirm;
    DatePicker dp;
    TimePicker tp;
    RadioGroup rgSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editTextPersonName);
        number = findViewById(R.id.editTextPhoneNumber);
        size = findViewById(R.id.editTextNumberSize);
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        reset = findViewById(R.id.buttonReset);
        confirm = findViewById(R.id.buttonConfirm);
        rgSelect = findViewById(R.id.radioGroupSelection);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                tp.setCurrentHour(19);
                tp.setCurrentMinute(30);
                dp.updateDate(2021,5, 1 );
            }
        });

    }
}