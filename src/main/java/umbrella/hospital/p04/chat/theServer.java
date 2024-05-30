package umbrella.hospital.p04.chat;


import java.io.*;
import java.net.*;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author acer
 */
public class theServer extends javax.swing.JFrame {

    Source OOP = new Source();
    ArrayList clientOutputStreams;
    ArrayList<String> users;

    public class ClientHandler implements Runnable {

        BufferedReader reader;
        Socket sock;
        PrintWriter client;

        public ClientHandler(Socket clientSocket, PrintWriter user) {
            client = user;
            try {
                sock = clientSocket;
                InputStreamReader isReader = new InputStreamReader(sock.getInputStream());
                reader = new BufferedReader(isReader);
            } catch (Exception ex) {
                dataStored.append("Unexpected error... \n");
            }

        }

        @Override
        public void run() {

            String message, chat = "Chat";
            String[] data;

            try {
                while ((message = reader.readLine()) != null) {

                    dataStored.append("Received: " + message + "\n");
                    data = message.split(":");

                    for (String token : data) {
                        dataStored.append(token + "\n");
                    }

                    switch (data[2]) {
                        case "Connect":
                            tellEveryone((data[0] + ":" + data[1] + ":" + chat));
                            userAdd(data[0]);
                            break;
                        case "Disconnect":
                            tellEveryone((data[0] + ":has disconnected." + ":" + chat));
                            userRemove(data[0]);
                            break;
                        case "Chat":
                            tellEveryone(message);
                            break;
                        default:
                            dataStored.append("No Conditions were met. \n");
                    }

                }
            } catch (Exception ex) {
                dataStored.append("Lost a connection. \n");
                ex.printStackTrace();
                clientOutputStreams.remove(client);
            }
        }
    }

    public theServer() {
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
        dataStored = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        lblStart = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblStop = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblClear = new javax.swing.JLabel();
        server = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        dataStored.setColumns(20);
        dataStored.setFont(new java.awt.Font("Segoe Script", 1, 11)); // NOI18N
        dataStored.setRows(5);
        dataStored.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(dataStored);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        lblStart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStart.setText("Start");
        lblStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStartMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblStartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblStartMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblStart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblStart, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        lblStop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStop.setText("Stop");
        lblStop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStopMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblStopMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblStopMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblStop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblStop, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setText("Users");
        lblUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblUserMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        lblClear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClear.setText("Clear");
        lblClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblClearMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblClear, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        server.setBackground(new java.awt.Color(153, 153, 153));
        server.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        server.setText("Server");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(server, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(server)
                        .addGap(64, 64, 64)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStartMouseClicked
        OOP.serverChange(server);
        Thread starter = new Thread(new StartServer());
        starter.start();

        dataStored.append("Server started...\n");
    }//GEN-LAST:event_lblStartMouseClicked

    private void lblStopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStopMouseClicked
        // TODO add your handling code here:
        OOP.serverNormal(server);
        try {
            Thread.sleep(50);
            tellEveryone("Server:is stopping and all users will be disconnected.\n:Chat");
            dataStored.append("Server stopping... \n");
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        dataStored.setText("");
    }//GEN-LAST:event_lblStopMouseClicked

    private void lblStartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStartMouseEntered
        // TODO add your handling code here:
        OOP.changeColor(jPanel2);
    }//GEN-LAST:event_lblStartMouseEntered

    private void lblStartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStartMouseExited
        // TODO add your handling code here:
        OOP.normalColor(jPanel2);
    }//GEN-LAST:event_lblStartMouseExited

    private void lblStopMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStopMouseEntered
        // TODO add your handling code here:
        OOP.changeColor(jPanel3);
    }//GEN-LAST:event_lblStopMouseEntered

    private void lblStopMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStopMouseExited
        // TODO add your handling code here:
        OOP.normalColor(jPanel3);
    }//GEN-LAST:event_lblStopMouseExited

    private void lblUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserMouseClicked
        // TODO add your handling code here:
        dataStored.append("\n Online users : \n");
        for (String current_user : users) {
            dataStored.append(current_user);
            dataStored.append("\n");
        }
    }//GEN-LAST:event_lblUserMouseClicked

    private void lblUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserMouseEntered
        // TODO add your handling code here:
        OOP.changeColor(jPanel4);
    }//GEN-LAST:event_lblUserMouseEntered

    private void lblUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserMouseExited
        // TODO add your handling code here:
        OOP.normalColor(jPanel4);
    }//GEN-LAST:event_lblUserMouseExited

    private void lblClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClearMouseClicked
        // TODO add your handling code here:
        dataStored.setText("");
    }//GEN-LAST:event_lblClearMouseClicked

    private void lblClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClearMouseEntered
        // TODO add your handling code here:
        OOP.changeColor(jPanel5);
    }//GEN-LAST:event_lblClearMouseEntered

    private void lblClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClearMouseExited
        // TODO add your handling code here:
        OOP.normalColor(jPanel5);
    }//GEN-LAST:event_lblClearMouseExited

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
            java.util.logging.Logger.getLogger(theServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(theServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(theServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(theServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new theServer().setVisible(true);
            }
        });
    }

    public void userAdd(String data) {
        String message, add = ": :Connect", done = "Server: :Done", name = data;
        dataStored.append("Before " + name + " added. \n");
        users.add(name);
        dataStored.append("After " + name + " added. \n");
        String[] tempList = new String[(users.size())];
        users.toArray(tempList);

        for (String token : tempList) {
            message = (token + add);
            tellEveryone(message);
        }
        tellEveryone(done);
    }

    public void userRemove(String data) {
        String message, add = ": :Connect", done = "Server: :Done", name = data;
        users.remove(name);
        String[] tempList = new String[(users.size())];
        users.toArray(tempList);

        for (String token : tempList) {
            message = (token + add);
            tellEveryone(message);
        }
        tellEveryone(done);
    }

    public void tellEveryone(String message) {
        Iterator it = clientOutputStreams.iterator();

        while (it.hasNext()) {
            try {
                PrintWriter writer = (PrintWriter) it.next();
                writer.println(message);
                dataStored.append("Sending: " + message + "\n");
                writer.flush();
                dataStored.setCaretPosition(dataStored.getDocument().getLength());

            } catch (Exception ex) {
                dataStored.append("Error telling everyone. \n");
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea dataStored;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClear;
    private javax.swing.JLabel lblStart;
    private javax.swing.JLabel lblStop;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel server;
    // End of variables declaration//GEN-END:variables
 public class StartServer implements Runnable {

        @Override
        public void run() {
            clientOutputStreams = new ArrayList();
            users = new ArrayList();

            try {
                ServerSocket serverSock = new ServerSocket(2222);

                while (true) {
                    Socket clientSock = serverSock.accept();
                    PrintWriter writer = new PrintWriter(clientSock.getOutputStream());
                    clientOutputStreams.add(writer);

                    Thread listener = new Thread(new ClientHandler(clientSock, writer));
                    listener.start();
                    dataStored.append("Got a connection. \n");
                }
            } catch (Exception ex) {
                dataStored.append("Server was already started. \n");
            }
        }
    }

}
