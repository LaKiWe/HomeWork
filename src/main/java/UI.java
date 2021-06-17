import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Sat Jun 05 03:38:34 CST 2021
 */



/**
 * @author unknown
 */
public class UI {
    public UI() {
        initComponents();
    }

    private void Recv_PageMouseClicked(MouseEvent e) {
        // TODO add your code here
        CardLayout cl=(CardLayout) Cardpanel.getLayout();
        cl.next(Cardpanel);
    }

    private void Send_BtnMouseClicked(MouseEvent e) {
        // TODO add your code here
        CardLayout cl=(CardLayout) Cardpanel.getLayout();
        cl.next(Cardpanel);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        mainFrame = new JFrame();
        selectPanel = new JPanel();
        Send_Btn = new JButton();
        Recv_Page = new JButton();
        Maillist = new JList();
        Cardpanel = new JPanel();
        panel2 = new JPanel();
        scrollPane2 = new JScrollPane();
        textArea1 = new JTextArea();
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        editorPane1 = new JEditorPane();
        settingPanel = new JPanel();
        Btn_send = new JButton();
        textField1 = new JTextField();
        label1 = new JLabel();
        passwordField1 = new JPasswordField();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        comboBox1 = new JComboBox();
        label4 = new JLabel();

        //======== mainFrame ========
        {
            mainFrame.setTitle("SocketMail");
            mainFrame.setBackground(new Color(253, 250, 246));
            var mainFrameContentPane = mainFrame.getContentPane();

            //======== selectPanel ========
            {
                selectPanel.setBackground(new Color(6, 68, 32));
                selectPanel.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.
                border.EmptyBorder(0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn",javax.swing.border.TitledBorder.CENTER
                ,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font
                .BOLD,12),java.awt.Color.red),selectPanel. getBorder()));selectPanel. addPropertyChangeListener(
                new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062ord\u0065r"
                .equals(e.getPropertyName()))throw new RuntimeException();}});

                //---- Send_Btn ----
                Send_Btn.setText("Send_Page");
                Send_Btn.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        Send_BtnMouseClicked(e);
                    }
                });

                //---- Recv_Page ----
                Recv_Page.setText("Recv_Page");
                Recv_Page.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        Recv_PageMouseClicked(e);
                    }
                });

                //---- Maillist ----
                Maillist.setBackground(new Color(0, 0, 0, 0));

                GroupLayout selectPanelLayout = new GroupLayout(selectPanel);
                selectPanel.setLayout(selectPanelLayout);
                selectPanelLayout.setHorizontalGroup(
                    selectPanelLayout.createParallelGroup()
                        .addGroup(selectPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(selectPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(Send_Btn, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                .addComponent(Recv_Page, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(Maillist, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(6, 6, 6))
                );
                selectPanelLayout.setVerticalGroup(
                    selectPanelLayout.createParallelGroup()
                        .addGroup(selectPanelLayout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(Send_Btn)
                            .addGap(18, 18, 18)
                            .addComponent(Recv_Page)
                            .addGap(112, 112, 112)
                            .addComponent(Maillist, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap())
                );
            }

            //======== Cardpanel ========
            {
                Cardpanel.setLayout(new CardLayout());

                //======== panel2 ========
                {

                    //======== scrollPane2 ========
                    {

                        //---- textArea1 ----
                        textArea1.setBackground(new Color(250, 241, 230));
                        scrollPane2.setViewportView(textArea1);
                    }

                    GroupLayout panel2Layout = new GroupLayout(panel2);
                    panel2.setLayout(panel2Layout);
                    panel2Layout.setHorizontalGroup(
                        panel2Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                    panel2Layout.setVerticalGroup(
                        panel2Layout.createParallelGroup()
                            .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                    );
                }
                Cardpanel.add(panel2, "card2");

                //======== panel1 ========
                {

                    //======== scrollPane1 ========
                    {

                        //---- editorPane1 ----
                        editorPane1.setBackground(new Color(250, 241, 230));
                        scrollPane1.setViewportView(editorPane1);
                    }

                    //======== settingPanel ========
                    {
                        settingPanel.setBackground(new Color(228, 239, 231));

                        //---- Btn_send ----
                        Btn_send.setText("Send");

                        //---- label1 ----
                        label1.setText("SendTo: ");
                        label1.setForeground(new Color(6, 68, 32));

                        //---- label2 ----
                        label2.setText("Password: ");
                        label2.setForeground(new Color(6, 68, 32));

                        //---- label3 ----
                        label3.setText("Account: ");
                        label3.setForeground(new Color(6, 68, 32));

                        //---- label4 ----
                        label4.setText("MailBox");
                        label4.setForeground(new Color(6, 68, 32));

                        GroupLayout settingPanelLayout = new GroupLayout(settingPanel);
                        settingPanel.setLayout(settingPanelLayout);
                        settingPanelLayout.setHorizontalGroup(
                            settingPanelLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, settingPanelLayout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addGroup(settingPanelLayout.createParallelGroup()
                                        .addComponent(label4)
                                        .addComponent(label3)
                                        .addComponent(label1))
                                    .addGap(18, 18, 18)
                                    .addGroup(settingPanelLayout.createParallelGroup()
                                        .addGroup(settingPanelLayout.createSequentialGroup()
                                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Btn_send))
                                        .addComponent(comboBox1, GroupLayout.Alignment.TRAILING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, settingPanelLayout.createSequentialGroup()
                                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)))
                                    .addGap(22, 22, 22))
                        );
                        settingPanelLayout.setVerticalGroup(
                            settingPanelLayout.createParallelGroup()
                                .addGroup(settingPanelLayout.createSequentialGroup()
                                    .addContainerGap(49, Short.MAX_VALUE)
                                    .addGroup(settingPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label4)
                                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(settingPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label3)
                                        .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label2)
                                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(settingPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label1)
                                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Btn_send))
                                    .addGap(25, 25, 25))
                        );
                    }

                    GroupLayout panel1Layout = new GroupLayout(panel1);
                    panel1.setLayout(panel1Layout);
                    panel1Layout.setHorizontalGroup(
                        panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(settingPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(scrollPane1))
                                .addContainerGap())
                    );
                    panel1Layout.setVerticalGroup(
                        panel1Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(settingPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                    );
                }
                Cardpanel.add(panel1, "card1");
            }

            GroupLayout mainFrameContentPaneLayout = new GroupLayout(mainFrameContentPane);
            mainFrameContentPane.setLayout(mainFrameContentPaneLayout);
            mainFrameContentPaneLayout.setHorizontalGroup(
                mainFrameContentPaneLayout.createParallelGroup()
                    .addGroup(mainFrameContentPaneLayout.createSequentialGroup()
                        .addComponent(selectPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cardpanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            mainFrameContentPaneLayout.setVerticalGroup(
                mainFrameContentPaneLayout.createParallelGroup()
                    .addComponent(selectPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(GroupLayout.Alignment.TRAILING, mainFrameContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Cardpanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            mainFrame.setSize(585, 470);
            mainFrame.setLocationRelativeTo(mainFrame.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JFrame mainFrame;
    private JPanel selectPanel;
    private JButton Send_Btn;
    private JButton Recv_Page;
    private JList Maillist;
    private JPanel Cardpanel;
    private JPanel panel2;
    private JScrollPane scrollPane2;
    private JTextArea textArea1;
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JEditorPane editorPane1;
    private JPanel settingPanel;
    private JButton Btn_send;
    private JTextField textField1;
    private JLabel label1;
    private JPasswordField passwordField1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JComboBox comboBox1;
    private JLabel label4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
