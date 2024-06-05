package com.javarush.task.task32.task3209;



import com.javarush.task.task32.task3209.listeners.FrameListener;
import com.javarush.task.task32.task3209.listeners.TabbedPaneChangeListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {
   private Controller controller;
    private JTabbedPane tabbedPane = new JTabbedPane();
    private JTextPane htmlTextPane = new JTextPane();
    private JEditorPane plainTextPane = new JEditorPane();
    private TabbedPaneChangeListener tabbedPaneChangeListener;

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public void init(){
        initGui();

       addWindowListener(new FrameListener(this));
        setVisible(true);
    }
    public void exit(){
        controller.exit();
    }
    public void initMenuBar(){

    }

    public void initEditor(){
        htmlTextPane.setContentType("text/html");
        JScrollPane jScrollHtml = new JScrollPane(htmlTextPane);
        Component html = tabbedPane.add("HTML", jScrollHtml);
        JScrollPane jScrollPlain = new JScrollPane(plainTextPane);
        Component text = tabbedPane.add("Текст", jScrollPlain);
        Dimension preferredSize = new Dimension(400, 300);
        tabbedPane.setPreferredSize(preferredSize);
        tabbedPane.addChangeListener(tabbedPaneChangeListener);
        getContentPane().add(tabbedPane, BorderLayout.CENTER);

    }
    public void  initGui(){
        initMenuBar();
        initEditor();
        pack();
    }

    public void selectedTabChanged(){

    }
}
