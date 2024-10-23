package org.example;

import org.example.factory.base.Dialog;
import org.example.factory.concrete.GoDialog;
import org.example.factory.concrete.NestDialog;

public class Main {

  private static Dialog dialog;

    public static void main(String[] args) {
        configure(new GoDialog());
    }

    static void configure(Dialog n){
        dialog = n;
        dialog.showDialog();
    }


}