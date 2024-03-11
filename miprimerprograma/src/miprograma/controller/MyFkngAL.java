package miprograma.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import miprograma.view.Myframe;

public class MyFkngAL implements ActionListener {

    Myframe myframe;

    @Override
    public void actionPerformed(ActionEvent e) {
        myframe.tf.setText("null");
    }
    
}
