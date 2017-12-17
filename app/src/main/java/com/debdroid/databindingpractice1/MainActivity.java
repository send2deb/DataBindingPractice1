package com.debdroid.databindingpractice1;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.debdroid.databindingpractice1.data.Employee;
import com.debdroid.databindingpractice1.databinding.EmployeeBinding;
import com.debdroid.databindingpractice1.handler.EmployeeDataHandler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Create a new instance of the Binding class (Custom class name, refer the layout file)
        EmployeeBinding employeeBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //Create a new employee
        Employee employee = new Employee("Rakesh", "Sharma", 36);

        //Create a new instance of handler class
        EmployeeDataHandler employeeDataHandler = new EmployeeDataHandler(employee, this);

        //Set the Employee object for 'employee' property in XML
        employeeBinding.setEmployee(employee);

        //Set the EmployeeDataHandler for 'employeeDataHandler' property in XML
        employeeBinding.setEmployeeDataHandler(employeeDataHandler);

        //Using Data Binding we can access the view without findViewById
        //Let's change the color of the Button's text
        employeeBinding.btWelcomeToastButton.setTextColor(getResources().getColor(R.color.colorAccent));
        employeeBinding.btAgeToastButton.setTextColor(getResources().getColor(R.color.colorAccent));
    }

}
