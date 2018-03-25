package com.example.arif.muhammadarifwicaksono_1202154205_studycase5;

/**
 * Created by arif on 25/03/2018.
 */

public class AddDatabase {//deklarasi variable
    String todo, desc, priority;

    //konstruktor
    public AddDatabase(String todo, String desc, String prior){
        this.todo=todo;
        this.desc=desc;
        this.priority=prior;
    }

    //method setter dan getter untuk to do , description dan priority
    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrior() {
        return priority;
    }

    public void setPrior(String prior) {
        this.priority = prior;
    }
}



