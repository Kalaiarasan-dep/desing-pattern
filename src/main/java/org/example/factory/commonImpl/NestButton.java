package org.example.factory.commonImpl;

import org.example.factory.common.Button;

public class NestButton  implements Button {

    @Override
    public void render() {
        System.out.println("<button>Nest: Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }

}
