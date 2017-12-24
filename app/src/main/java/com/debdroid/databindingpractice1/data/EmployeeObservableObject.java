package com.debdroid.databindingpractice1.data;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.debdroid.databindingpractice1.BR;

/**
 * Created by debashispaul on 15/12/2017.
 */

public class EmployeeObservableObject extends BaseObservable {
    private String firstName;
    private String lastName;
    private String age;
    private boolean isManager;

    public EmployeeObservableObject(String firstName, String lastName, int age, boolean isManager) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = Integer.toString(age);
        this.isManager = isManager;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    @Bindable
    public String getAge() {
        return age;
    }

    @Bindable
    public boolean getIsManager() {
        return isManager;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }

    public void setAge(String age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

    public void setManager(boolean manager) {
        isManager = manager;
        notifyPropertyChanged(BR.isManager);
    }
}
