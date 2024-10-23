package org.example.factory.concrete;

import org.example.factory.base.Dialog;
import org.example.factory.common.Button;
import org.example.factory.commonImpl.GoButton;

public class GoDialog extends Dialog {

    @Override
    public Button createButton() {
        return new GoButton();
    }
}
