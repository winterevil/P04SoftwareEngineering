package umbrella.hospital.p04.chat;

import java.awt.Color;
import java.io.*;
import java.net.Socket;
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author acer
 */
public class theClient extends javax.swing.JFrame {

    Source OOP = new Source();
    String username, address = "localhost";
    ArrayList<String> users = new ArrayList();

    Boolean isConnected = false;

    Socket theSocket;
    BufferedReader theReader;
    PrintWriter theWriter;

    public theClient(Socket socket) {
        initComponents();
        this.theSocket = socket;
        isConnected = true; // Đánh dấu rằng đã kết nối
        ListenThread(); // Bắt đầu luồng lắng nghe tin nhắn
    }

    public void ListenThread() {
        Thread IncomingReader = new Thread(new Message());
        IncomingReader.start();
    }

    public void userAdd(String data) {

        users.add(data);

    }

    public void userRemove(String data) {
        sentMessage.append(data + " is now offline.\n");
    }

    public void writeUsers() {
        String[] tempList = new String[(users.size())];

        users.toArray(tempList);
        for (String token : tempList) {

        }

    }

    public void sendDisconnect() {
        String bye = (username + ": :Disconnect");
        try {
            theWriter.println(bye);
            theWriter.flush();
        } catch (Exception e) {
            sentMessage.append("You're not connected.\n");
        }
    }

    public void Disconnect() {
        try {
            sentMessage.append("Disconnected.\n");
            theSocket.close();
        } catch (Exception ex) {

        }
        isConnected = false;
        client_Name.setEditable(true);

    }

    public void disconnectOnClose() {
        sendDisconnect();
        Disconnect();
    }

    public theClient() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sentMessage = new javax.swing.JTextArea();
        Message = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        disConnect = new javax.swing.JLabel();
        client_Name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Send = new javax.swing.JLabel();
        isConnnected = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        sentMessage.setBackground(new java.awt.Color(240, 240, 240));
        sentMessage.setColumns(20);
        sentMessage.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        sentMessage.setRows(5);
        jScrollPane1.setViewportView(sentMessage);

        Message.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        Message.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Message.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MessageMouseEntered(evt);
            }
        });
        Message.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MessageActionPerformed(evt);
            }
        });
        Message.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MessageKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MessageKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MessageKeyTyped(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        disConnect.setBackground(new java.awt.Color(255, 0, 0));
        disConnect.setForeground(new java.awt.Color(255, 0, 0));
        disConnect.setIcon(new javax.swing.ImageIcon("D:\\CSE305\\P04SoftwareEngineering\\src\\main\\icons\\unlink.png")); // NOI18N
        disConnect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disConnectMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                disConnectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                disConnectMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(disConnect)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(disConnect))
        );

        client_Name.setBackground(new java.awt.Color(240, 240, 240));
        client_Name.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        client_Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        client_Name.setText("Your name");
        client_Name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        client_Name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                client_NameMouseExited(evt);
            }
        });
        client_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                client_NameActionPerformed(evt);
            }
        });
        client_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                client_NameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                client_NameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                client_NameKeyTyped(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\CSE305\\P04SoftwareEngineering\\src\\main\\icons\\umhos.png")); // NOI18N
        jLabel4.setText(".");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("...");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        Send.setBackground(new java.awt.Color(0, 0, 255));
        Send.setForeground(new java.awt.Color(0, 0, 255));
        Send.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Send.setIcon(new javax.swing.ImageIcon("D:\\CSE305\\P04SoftwareEngineering\\src\\main\\icons\\chat.png")); // NOI18N
        Send.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SendMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SendMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SendMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Send, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Send)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        isConnnected.setBackground(new java.awt.Color(0, 255, 0));
        isConnnected.setForeground(new java.awt.Color(0, 255, 0));
        isConnnected.setIcon(new javax.swing.ImageIcon("D:\\CSE305\\P04SoftwareEngineering\\src\\main\\icons\\api.png")); // NOI18N
        isConnnected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                isConnnectedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                isConnnectedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                isConnnectedMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(client_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(isConnnected)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(client_Name)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(isConnnected))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Message))
                        .addContainerGap(12, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void isConnnectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_isConnnectedMouseClicked
        // TODO add your handling code here:

        switch (client_Name.getText()) {
            case "":
                client_Name.setText("Input your name!!");
                break;
            case "Your name":
                client_Name.setText("Input your name!!");
                break;
            case "Input your name!!":
                break;
            default:

                jLabel5.setForeground(Color.GREEN);
                if (isConnected == false) {
                    username = client_Name.getText();
                    client_Name.setEditable(false);

                    try {
                        theSocket = new Socket(address, 2222);
                        InputStreamReader streamreader = new InputStreamReader(theSocket.getInputStream());
                        theReader = new BufferedReader(streamreader);
                        theWriter = new PrintWriter(theSocket.getOutputStream());
                        theWriter.println(username + ": has connected :Connect");
                        theWriter.flush();
                        isConnected = true;
                    } catch (Exception ex) {
                        sentMessage.append("Cannot Connect! Try Again. \n");
                        client_Name.setEditable(true);
                    }

                    ListenThread();

                } else if (isConnected == true) {
                    sentMessage.append("You are connected. \n");
                }

        }


    }//GEN-LAST:event_isConnnectedMouseClicked

    private void disConnectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disConnectMouseClicked
        // TODO add your handling code here:
        sendDisconnect();
        jLabel5.setForeground(Color.black);
        Disconnect();
    }//GEN-LAST:event_disConnectMouseClicked

    private void SendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SendMouseClicked

        switch (Message.getText()) {
            case "Your messages":
                Message.setText("Type your message here");
                Message.requestFocus();
                break;
            case "Your name":
                break;
            case "Input your name":
                break;
            default:
                try {
                    theWriter.println(username + " : " + Message.getText() + ":" + "Chat");
                    theWriter.flush();
                } catch (Exception ex) {
                    sentMessage.append("You're not connected. \n");
                }
                Message.setText("");
                Message.requestFocus();

        }

        Message.setText("Your messages");
        Message.requestFocus();
    }//GEN-LAST:event_SendMouseClicked

    private void MessageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MessageKeyPressed
        if (Message.getText().equals("Your messages"))
            Message.setText("");
    }//GEN-LAST:event_MessageKeyPressed

    private void client_NameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_client_NameKeyPressed
        // TODO add your handling code here:
        if (client_Name.getText().equals("Your name"))
            client_Name.setText("");
    }//GEN-LAST:event_client_NameKeyPressed

    private void isConnnectedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_isConnnectedMouseEntered
        // TODO add your handling code here:
        OOP.changeColor(jPanel4);
    }//GEN-LAST:event_isConnnectedMouseEntered

    private void isConnnectedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_isConnnectedMouseExited
        // TODO add your handling code here:
        OOP.NormalWhite(jPanel4);
        //tf_username.setText("Your name");
    }//GEN-LAST:event_isConnnectedMouseExited

    private void disConnectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disConnectMouseEntered
        // TODO add your handling code here:
        OOP.changeColor(jPanel3);
    }//GEN-LAST:event_disConnectMouseEntered

    private void disConnectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disConnectMouseExited
        // TODO add your handling code here:
        OOP.NormalWhite(jPanel3);
    }//GEN-LAST:event_disConnectMouseExited

    private void MessageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MessageMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_MessageMouseEntered

    private void client_NameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_client_NameMouseExited

    }//GEN-LAST:event_client_NameMouseExited

    private void client_NameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_client_NameKeyTyped
        // TODO add your handling code here:     
        switch (client_Name.getText()) {
            case "Your name":
                client_Name.setText("");
                break;
            case "Input your name!!":
                client_Name.setText("");
            default:
        }
    }//GEN-LAST:event_client_NameKeyTyped

    private void client_NameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_client_NameKeyReleased
        // TODO add your handling code here:
        switch (client_Name.getText()) {
            case "":
                client_Name.setText("Your name");
                break;
            default:
                String name = client_Name.getText();
                String result = name.substring(0, 1).toUpperCase() + name.substring(1);
                client_Name.setText(result);
        }

    }//GEN-LAST:event_client_NameKeyReleased

    private void SendMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SendMouseEntered
        // TODO add your handling code here:
        OOP.changeColor(jPanel5);
    }//GEN-LAST:event_SendMouseEntered

    private void SendMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SendMouseExited
        // TODO add your handling code here:
        OOP.NormalWhite(jPanel5);
    }//GEN-LAST:event_SendMouseExited

    private void MessageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MessageKeyReleased
        // TODO add your handling code here:
        switch (Message.getText()) {
            case "":
                Message.setText("Your messages");
                break;
            default:
                String name = Message.getText();
                String result = name.substring(0, 1).toUpperCase() + name.substring(1);
                Message.setText(result);
        }
    }//GEN-LAST:event_MessageKeyReleased

    private void MessageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MessageKeyTyped
        // TODO add your handling code here:\

    }//GEN-LAST:event_MessageKeyTyped

    private void MessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MessageActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_MessageActionPerformed

    private void client_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_client_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_client_NameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(theClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(theClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(theClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(theClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new theClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Message;
    private javax.swing.JLabel Send;
    private javax.swing.JTextField client_Name;
    private javax.swing.JLabel disConnect;
    private javax.swing.JLabel isConnnected;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea sentMessage;
    // End of variables declaration//GEN-END:variables
 public class Message implements Runnable {

        @Override
        public void run() {
            String[] data;
            String stream;

            try {
                while (!(stream = theReader.readLine()).equals(null)) {
                    data = stream.split(":");

                    switch (data[2]) {
                        case "Chat":
                            sentMessage.append(data[0] + ":" + data[1] + "\n");
                            sentMessage.setCaretPosition(sentMessage.getDocument().getLength());
                            break;
                        case "Connect":
                            sentMessage.removeAll();
                            userAdd(data[0]);
                            break;
                        case "Disconnect":
                            userRemove(data[0]);
                            break;
                        case "Done":
                            writeUsers();
                            users.clear();
                    }
                }
            } catch (Exception ex) {
            }
        }
    }
}
