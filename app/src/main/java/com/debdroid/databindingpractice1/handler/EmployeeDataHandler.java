package com.debdroid.databindingpractice1.handler;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.debdroid.databindingpractice1.data.Employee;

/**
 * Created by debashispaul on 15/12/2017.
 */

public class EmployeeDataHandler {
    private Employee employee;
    private Context context;

    public EmployeeDataHandler (Employee employee, Context context) {
        this.employee = employee;
        this.context = context;
    }

    //This method is called from 'android:onClick="@{employeeDataHandler::showWelcomeToast}"'
    //It's an event handling with Method Reference. The signature of showWelcomeToast must match
    //with onClick method in onClickListener of the View (i.e. Button)
    public void showWelcomeToast(View view) {
        Toast.makeText(context, "Hello " + employee.getFirstName() + " " + employee.getLastName(),
                Toast.LENGTH_LONG).show();
    }

    //This method is called from 'android:onClick="@{() -> employeeDataHandler.showAge()}"'
    //It's an event handling with Listener Binding. The parameter of the showAge does not needed to be
    //matched with onClick method in onClickListener of the View (i.e. Button) but the return type should
    public void showAge() {
        Toast.makeText(context, "Age of " + employee.getFirstName() + " is " + employee.getAge(),
                Toast.LENGTH_LONG).show();
    }
}

