package com.debdroid.databindingpractice1.data;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;

/**
 * Created by debashispaul on 24/12/2017.
 */

public class Employee {
    public ObservableField<String> firstName = new ObservableField<>();
    public ObservableField<String> lastName =new ObservableField<>();
    public ObservableField<String> age = new ObservableField<>();
    public ObservableBoolean isManager = new ObservableBoolean();

    public Employee(String firstName, String lastName, int age, boolean isManager) {
        this.firstName.set(firstName);
        this.lastName.set(lastName);
        this.age.set(Integer.toString(age));
        this.isManager.set(isManager);
    }
}
