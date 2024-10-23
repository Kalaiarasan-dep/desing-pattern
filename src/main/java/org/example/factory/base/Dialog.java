package org.example.factory.base;

import org.example.factory.common.Button;

public abstract class Dialog {

    public void showDialog(){
        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();
}
