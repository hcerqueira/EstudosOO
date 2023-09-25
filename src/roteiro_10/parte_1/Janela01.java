package roteiro_10.parte_1;

import javax.swing.*;

public class Janela01 extends JFrame {
    private int largura = 600;
    private int altura = 500;

    public Janela01() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(largura, altura);
        this.setVisible(true);
    }
}

