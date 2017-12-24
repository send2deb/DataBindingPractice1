package com.debdroid.databindingpractice1.handler;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.debdroid.databindingpractice1.data.Employee;
import com.debdroid.databindingpractice1.data.EmployeeObservableObject;

/**
 * Created by debashispaul on 24/12/2017.
 */

public class EmployeeDataHandler {

    private Employee employee;
    private Context context;

    public EmployeeDataHandler(Employee employee, Context context) {
        this.employee = employee;
        this.context = context;
    }

    //This method is called from 'android:onClick="@{employeeDataHandler::showWelcomeToast}"'
    //It's an event handling with Method Reference. The signature of showWelcomeToast must match
    //with onClick method in onClickListener of the View (i.e. Button)
    public void showWelcomeToast(View view) {
        Toast.makeText(context, "Hello " + employee.firstName.get() + " " + employee.lastName.get(),
                Toast.LENGTH_LONG).show();
    }

    //This method is called from 'android:onClick="@{() -> employeeDataHandler.showAge()}"'
    //It's an event handling with Listener Binding. The parameter of the showAge does not needed to be
    //matched with onClick method in onClickListener of the View (i.e. Button) but the return type should
    public void showAge() {
        Toast.makeText(context, "Age of " + employee.firstName.get() + " is " + employee.age.get(),
                Toast.LENGTH_LONG).show();
    }

    public void changeFirstName() {
        employee.firstName.set("Ajit");
    }

    public void swapManagerFlag() {
        if(employee.isManager.get()) {
            employee.isManager.set(false);
        } else {
            employee.isManager.set(true);
        }
    }

}
