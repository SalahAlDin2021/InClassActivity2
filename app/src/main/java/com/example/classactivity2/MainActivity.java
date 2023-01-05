package com.example.classactivity2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;
import com.example.classactivity2.model.Employee;
import com.example.classactivity2.model.EmployeeData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText name,salary;
    Button add;
    Spinner spn;
    ListView lstv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setup();

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namee=name.getText().toString();
                String salaryy=salary.getText().toString();
                String work = spn.getSelectedItem().toString();

                try {
                    double sal=Double.parseDouble(salaryy);
                    if(work.equals("Part Time")){
                        Employee e=new Employee(namee,sal,false);
                        EmployeeData.addEmployee(e);
                    }else{
                        Employee e=new Employee(namee,sal,true);
                        EmployeeData.addEmployee(e);

                    }
                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"error,enter only numbers",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
    private void setup(){
        name=findViewById(R.id.edtname);
        salary=findViewById(R.id.edtsalary);
        add=findViewById(R.id.button);
        spn=findViewById(R.id.spinner);
        lstv=findViewById(R.id.listview);

        String[] arraySpinner = new String[] {
                "Part Time", "Full Time"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spn.setAdapter(adapter);
        spn.setSelected(true);
        ArrayList<String> listItems=EmployeeData.getData();

        ArrayAdapter<String> adapter2;
        adapter2=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listItems);
        lstv.setAdapter(adapter);

    }
}