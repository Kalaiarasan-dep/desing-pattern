package org.example.factory.concrete;

import org.example.factory.base.Dialog;
import org.example.factory.common.Button;
import org.example.factory.commonImpl.NestButton;

public class NestDialog extends Dialog {
    @Override
    public Button createButton() {
        return new NestButton();
    }
}
