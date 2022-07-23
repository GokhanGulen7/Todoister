package com.gokhangulen.todoister.adapter;

import com.gokhangulen.todoister.model.Task;

public interface OnTodoClickListener {
    void onTodoClick(Task task);
    void onTodoRadioButtonClick(Task task);
}
