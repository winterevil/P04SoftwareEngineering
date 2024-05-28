/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package umbrella.hospital.p04.ui;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import umbrella.hospital.p04.chat.theClient;
import umbrella.hospital.p04.chat.theServer;
import umbrella.hospital.p04.model.Patient;
import umbrella.hospital.p04.monitor.SensorMachineSimulation;

/**
 *
 * @author Admin
 */
public class PatientMainInterface extends javax.swing.JFrame {

    private static Patient patient = null;
    private static SensorMachineSimulation ssMc = new SensorMachineSimulation();

    /**
     * Creates new form PatientMainInterface
     */
    public PatientMainInterface() {
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
        lblLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPatientName = new javax.swing.JLabel();
        lblNoti = new javax.swing.JLabel();
        lblAvatar = new javax.swing.JLabel();
        lblHeart = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        lblOut = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Overview = new umbrella.hospital.p04.ui.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        lblHeartRateOverview = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BloodPressure = new umbrella.hospital.p04.ui.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblPressure = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Temperature = new umbrella.hospital.p04.ui.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblTemperature = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        HeartRate = new umbrella.hospital.p04.ui.PanelRound();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblRate = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        HeartStat = new umbrella.hospital.p04.ui.PanelRound();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblStat = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Information = new umbrella.hospital.p04.ui.PanelRound();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lblAvatarDoctor = new javax.swing.JLabel();
        lblNameDoctor = new javax.swing.JLabel();
        btnConsult = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaAnalysis = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(239, 239, 239));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Hello,");

        lblPatientName.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblPatientName.setForeground(new java.awt.Color(0, 0, 0));
        lblPatientName.setText("Patient");

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Overview");

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Conditions");

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("My healh condition dashboard");

        Overview.setBackground(new java.awt.Color(239, 239, 239));
        Overview.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Heart rate");
        Overview.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        lblHeartRateOverview.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        lblHeartRateOverview.setForeground(new java.awt.Color(0, 0, 0));
        lblHeartRateOverview.setText("120");
        Overview.add(lblHeartRateOverview, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("bpm");
        Overview.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));
        Overview.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 240));

        BloodPressure.setBackground(new java.awt.Color(255, 255, 255));
        BloodPressure.setRoundBottomLeft(20);
        BloodPressure.setRoundBottomRight(20);
        BloodPressure.setRoundTopLeft(20);
        BloodPressure.setRoundTopRight(20);

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Blood Pressure");

        lblPressure.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblPressure.setForeground(new java.awt.Color(0, 0, 0));
        lblPressure.setText("119/67");

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("mmHg");

        javax.swing.GroupLayout BloodPressureLayout = new javax.swing.GroupLayout(BloodPressure);
        BloodPressure.setLayout(BloodPressureLayout);
        BloodPressureLayout.setHorizontalGroup(
            BloodPressureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BloodPressureLayout.createSequentialGroup()
                .addGroup(BloodPressureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BloodPressureLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(BloodPressureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BloodPressureLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPressure)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BloodPressureLayout.setVerticalGroup(
            BloodPressureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BloodPressureLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BloodPressureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addGroup(BloodPressureLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BloodPressureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPressure)
                            .addComponent(jLabel11))
                        .addGap(12, 12, 12))))
        );

        Temperature.setBackground(new java.awt.Color(255, 255, 255));
        Temperature.setForeground(new java.awt.Color(255, 255, 255));
        Temperature.setRoundBottomLeft(20);
        Temperature.setRoundBottomRight(20);
        Temperature.setRoundTopLeft(20);
        Temperature.setRoundTopRight(20);

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Temperature");

        lblTemperature.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblTemperature.setForeground(new java.awt.Color(0, 0, 0));
        lblTemperature.setText("200");

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("°F");

        javax.swing.GroupLayout TemperatureLayout = new javax.swing.GroupLayout(Temperature);
        Temperature.setLayout(TemperatureLayout);
        TemperatureLayout.setHorizontalGroup(
            TemperatureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TemperatureLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TemperatureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addGroup(TemperatureLayout.createSequentialGroup()
                        .addComponent(lblTemperature)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        TemperatureLayout.setVerticalGroup(
            TemperatureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TemperatureLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TemperatureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemperature)
                    .addComponent(jLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        HeartRate.setBackground(new java.awt.Color(255, 255, 255));
        HeartRate.setRoundBottomLeft(20);
        HeartRate.setRoundBottomRight(20);
        HeartRate.setRoundTopLeft(20);
        HeartRate.setRoundTopRight(20);

        jLabel14.setBackground(new java.awt.Color(0, 104, 255));

        jLabel16.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Heart rate");

        lblRate.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblRate.setForeground(new java.awt.Color(0, 0, 0));
        lblRate.setText("200");

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("bpm");

        javax.swing.GroupLayout HeartRateLayout = new javax.swing.GroupLayout(HeartRate);
        HeartRate.setLayout(HeartRateLayout);
        HeartRateLayout.setHorizontalGroup(
            HeartRateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeartRateLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(HeartRateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeartRateLayout.createSequentialGroup()
                        .addComponent(lblRate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17))
                    .addComponent(jLabel14)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addContainerGap())
        );
        HeartRateLayout.setVerticalGroup(
            HeartRateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeartRateLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(HeartRateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addGroup(HeartRateLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(HeartRateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRate)
                            .addComponent(jLabel17))
                        .addGap(12, 12, 12))))
        );

        HeartStat.setBackground(new java.awt.Color(255, 255, 255));
        HeartStat.setForeground(new java.awt.Color(255, 255, 255));
        HeartStat.setRoundBottomLeft(20);
        HeartStat.setRoundBottomRight(20);
        HeartStat.setRoundTopLeft(20);
        HeartStat.setRoundTopRight(20);

        jLabel20.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Heart stats");

        lblStat.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblStat.setForeground(new java.awt.Color(0, 0, 0));
        lblStat.setText("abnormal");

        javax.swing.GroupLayout HeartStatLayout = new javax.swing.GroupLayout(HeartStat);
        HeartStat.setLayout(HeartStatLayout);
        HeartStatLayout.setHorizontalGroup(
            HeartStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeartStatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HeartStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(lblStat)
                    .addComponent(jLabel19))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeartStatLayout.setVerticalGroup(
            HeartStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeartStatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStat)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Information and schedule");

        Information.setBackground(new java.awt.Color(255, 255, 255));
        Information.setRoundBottomLeft(20);
        Information.setRoundBottomRight(20);
        Information.setRoundTopLeft(20);
        Information.setRoundTopRight(20);

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Health analysis");

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Your doctor");

        lblNameDoctor.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        lblNameDoctor.setForeground(new java.awt.Color(0, 0, 0));
        lblNameDoctor.setText("Doctor Strange");

        btnConsult.setBackground(new java.awt.Color(0, 104, 255));
        btnConsult.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        btnConsult.setForeground(new java.awt.Color(255, 255, 255));
        btnConsult.setText("Consult Now ");
        btnConsult.setBorder(null);
        btnConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultActionPerformed(evt);
            }
        });

        txaAnalysis.setColumns(20);
        txaAnalysis.setRows(5);
        jScrollPane1.setViewportView(txaAnalysis);

        javax.swing.GroupLayout InformationLayout = new javax.swing.GroupLayout(Information);
        Information.setLayout(InformationLayout);
        InformationLayout.setHorizontalGroup(
            InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformationLayout.createSequentialGroup()
                .addGroup(InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InformationLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(InformationLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)))
                .addGroup(InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(InformationLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(52, 52, 52))
                    .addGroup(InformationLayout.createSequentialGroup()
                        .addGroup(InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InformationLayout.createSequentialGroup()
                                .addComponent(lblAvatarDoctor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNameDoctor))
                            .addComponent(btnConsult, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        InformationLayout.setVerticalGroup(
            InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(InformationLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel23))
                    .addGroup(InformationLayout.createSequentialGroup()
                        .addGroup(InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InformationLayout.createSequentialGroup()
                                .addGroup(InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAvatarDoctor)
                                    .addComponent(lblNameDoctor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnConsult, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InformationLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblLogo)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPatientName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNoti)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAvatar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(133, 133, 133)
                                        .addComponent(jLabel12))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(412, 412, 412)
                                .addComponent(HeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Temperature, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HeartStat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOut)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblMessage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblHeart, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(57, 57, 57)
                        .addComponent(Overview, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel21)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Information, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAvatar)
                    .addComponent(lblNoti)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(lblLogo))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPatientName)
                                .addComponent(jLabel2)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Temperature, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BloodPressure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(HeartStat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Information, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblHeart)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMessage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblOut))
                            .addComponent(Overview, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultActionPerformed
        // TODO add your handling code here:
        theClient client = new theClient();
        
        client.setVisible(true);
    }//GEN-LAST:event_btnConsultActionPerformed

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
            java.util.logging.Logger.getLogger(PatientMainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientMainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientMainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientMainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientMainInterface().setVisible(true);
                ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
                Runnable updateDataTask = new Runnable() {
                    @Override
                    public void run() {
                        ssMc.run();
                        lblPressure.setText(ssMc.getBloodPressureString());
                        lblHeartRateOverview.setText(String.valueOf(ssMc.getAverageHeartRate()));
                        lblRate.setText(String.valueOf(ssMc.getHeartRate()));
                        lblTemperature.setText(String.valueOf(ssMc.getTemperature()));
                        lblStat.setText(ssMc.getGeneralHealthStatus());
                    }
                };
                int intervalSeconds = 2;
                scheduler.scheduleAtFixedRate(updateDataTask, 0, intervalSeconds, TimeUnit.SECONDS);
            }
        });
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private umbrella.hospital.p04.ui.PanelRound BloodPressure;
    private umbrella.hospital.p04.ui.PanelRound HeartRate;
    private umbrella.hospital.p04.ui.PanelRound HeartStat;
    private umbrella.hospital.p04.ui.PanelRound Information;
    private umbrella.hospital.p04.ui.PanelRound Overview;
    private umbrella.hospital.p04.ui.PanelRound Temperature;
    private javax.swing.JButton btnConsult;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvatar;
    private javax.swing.JLabel lblAvatarDoctor;
    private javax.swing.JLabel lblHeart;
    private static javax.swing.JLabel lblHeartRateOverview;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblNameDoctor;
    private javax.swing.JLabel lblNoti;
    private javax.swing.JLabel lblOut;
    public javax.swing.JLabel lblPatientName;
    private static javax.swing.JLabel lblPressure;
    private static javax.swing.JLabel lblRate;
    private static javax.swing.JLabel lblStat;
    private static javax.swing.JLabel lblTemperature;
    private javax.swing.JTextArea txaAnalysis;
    // End of variables declaration//GEN-END:variables
}
