/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package umbrella.hospital.p04;

import umbrella.hospital.p04.chat.Server;
import umbrella.hospital.p04.ui.LoginInterface;

/**
 *
 * @author Admin
 */
public class P04 {

    public static void main(String[] args) {
        Server server = new Server();
        
        server.setVisible(true);
        
        LoginInterface login = new LoginInterface();
        login.setVisible(true);
    }
}
