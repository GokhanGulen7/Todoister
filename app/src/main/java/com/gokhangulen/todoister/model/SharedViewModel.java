package com.gokhangulen.todoister.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {
    private final MutableLiveData<Task> selectedItem = new MutableLiveData<>();
    private boolean isEdited;

    public void selectItem(Task task) {
        selectedItem.setValue(task);
    }

    public LiveData<Task> getSelectedItem() {
        return selectedItem;
    }

    public void setIsEdited(boolean isEdited) {
        this.isEdited = isEdited;
    }

    public boolean getIsEdited() {
        return isEdited;
    }
}
