package com.example.prilogenie;

import java.io.Serializable;

public class User implements Serializable {

    // класс для сохранния значий тренировки

    private String textView2;
    private String textView5;
    private String textView23;
    private String textView26;
    private String textView29;
    private String textView30;
    private String textView40;

    public User(String textView2, String textView5, String textView23, String textView26, String textView29, String textView30, String textView40) {
        this.textView2 = textView2;
        this.textView5 = textView5;
        this.textView23 = textView23;
        this.textView26 = textView26;
        this.textView29 = textView29;
        this.textView30 = textView30;
        this.textView40 = textView40;
    }

    public String getTextView2() {
        return textView2;
    }

    public void setTextView2(String textView2) {
        this.textView2 = textView2;
    }

    public String getTextView5() {
        return textView5;
    }

    public void setTextView5(String textView5) {
        this.textView5 = textView5;
    }

    public String getTextView23() {
        return textView23;
    }

    public void setTextView23(String textView23) {
        this.textView23 = textView23;
    }

    public String getTextView26() {
        return textView26;
    }

    public void setTextView26(String textView26) {
        this.textView26 = textView26;
    }

    public String getTextView29() {
        return textView29;
    }

    public void setTextView29(String textView29) {
        this.textView29 = textView29;
    }

    public String getTextView30() {
        return textView30;
    }

    public void setTextView30(String textView30) {
        this.textView30 = textView30;
    }

    public String getTextView40() {
        return textView40;
    }

    public void setTextView40(String textView40) {
        this.textView40 = textView40;
    }
}


