package nonsquarematrisreverse;

import java.util.Random;

public class Matris extends javax.swing.JFrame {
    
    static int row, column, number = 0;
    static double[][] matris;
    
    public Matris() {
        initComponents();
    }
    
    public Matris(int row, int column) {
        this.row = row;
        this.column = column;
        matris = new double[row][column];
        
        initComponents();
        
        if(column <= 5){
            if(column < 5){
                num04.setVisible(false);  num14.setVisible(false);
                num24.setVisible(false);  num34.setVisible(false);
                num44.setVisible(false);
                if(column < 4){
                    num03.setVisible(false);  num13.setVisible(false);
                    num23.setVisible(false);  num33.setVisible(false);
                    num43.setVisible(false);
                    if(column < 3){
                        num02.setVisible(false);  num12.setVisible(false);
                        num22.setVisible(false);  num32.setVisible(false);
                        num42.setVisible(false);
                        if(column < 2){
                            num01.setVisible(false);  num11.setVisible(false);
                            num21.setVisible(false);  num31.setVisible(false);
                            num41.setVisible(false);}}}}}
        
        if(row <= 5){
            if(row < 5){
                num40.setVisible(false);  num41.setVisible(false);
                num42.setVisible(false);  num43.setVisible(false);
                num44.setVisible(false);
                if(row < 4){
                    num30.setVisible(false);  num31.setVisible(false);
                    num32.setVisible(false);  num33.setVisible(false);
                    num34.setVisible(false);
                    if(row < 3){
                        num20.setVisible(false);  num21.setVisible(false);
                        num22.setVisible(false);  num23.setVisible(false);
                        num24.setVisible(false);
                        if(row < 2){
                            num10.setVisible(false);  num11.setVisible(false);
                            num12.setVisible(false);  num13.setVisible(false);
                            num14.setVisible(false);}}}}}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        num01 = new javax.swing.JTextField();
        num00 = new javax.swing.JTextField();
        num04 = new javax.swing.JTextField();
        num03 = new javax.swing.JTextField();
        num02 = new javax.swing.JTextField();
        num14 = new javax.swing.JTextField();
        num13 = new javax.swing.JTextField();
        num12 = new javax.swing.JTextField();
        num11 = new javax.swing.JTextField();
        num10 = new javax.swing.JTextField();
        num24 = new javax.swing.JTextField();
        num23 = new javax.swing.JTextField();
        num22 = new javax.swing.JTextField();
        num34 = new javax.swing.JTextField();
        num33 = new javax.swing.JTextField();
        num32 = new javax.swing.JTextField();
        num31 = new javax.swing.JTextField();
        num30 = new javax.swing.JTextField();
        num21 = new javax.swing.JTextField();
        num20 = new javax.swing.JTextField();
        num44 = new javax.swing.JTextField();
        num43 = new javax.swing.JTextField();
        num42 = new javax.swing.JTextField();
        num41 = new javax.swing.JTextField();
        num40 = new javax.swing.JTextField();
        btnTers = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        num01.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num01.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                num01CaretUpdate(evt);
            }
        });

        num00.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num00.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num00.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                num00CaretUpdate(evt);
            }
        });

        num04.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num04.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num04.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                num04CaretUpdate(evt);
            }
        });

        num03.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num03.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num03.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                num03CaretUpdate(evt);
            }
        });

        num02.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num02.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num02.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                num02CaretUpdate(evt);
            }
        });

        num14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num14.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                num14CaretUpdate(evt);
            }
        });

        num13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num13.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                num13CaretUpdate(evt);
            }
        });

        num12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num12.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                num12CaretUpdate(evt);
            }
        });

        num11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num11.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                num11CaretUpdate(evt);
            }
        });

        num10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num10.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                num10CaretUpdate(evt);
            }
        });

        num24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num24.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                num24CaretUpdate(evt);
            }
        });

        num23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num23.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                num23CaretUpdate(evt);
            }
        });

        num22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num22.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                num22CaretUpdate(evt);
            }
        });

        num34.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num34.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                num34CaretUpdate(evt);
            }
        });

        num33.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num33.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                num33CaretUpdate(evt);
            }
        });

        num32.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num32.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                num32CaretUpdate(evt);
            }
        });

        num31.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num31.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                num31CaretUpdate(evt);
            }
        });

        num30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num30.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                num30CaretUpdate(evt);
            }
        });

        num21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num21.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                num21CaretUpdate(evt);
            }
        });

        num20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num20.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                num20CaretUpdate(evt);
            }
        });

        num44.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num44.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                num44CaretUpdate(evt);
            }
        });

        num43.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num43.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                num43CaretUpdate(evt);
            }
        });

        num42.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num42.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                num42CaretUpdate(evt);
            }
        });

        num41.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num41.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                num41CaretUpdate(evt);
            }
        });

        num40.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num40.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                num40CaretUpdate(evt);
            }
        });

        btnTers.setText("TERS CEVIR");
        btnTers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(num30, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(num31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(num32, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(num33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(num34, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(num20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(num21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(num22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(num23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(num24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(num10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(num11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(num12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(num13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(num14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(num00, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(num01, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(num02, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(num03, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(num04, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(num40, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(num41, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(num42, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(num43, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(num44, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(btnTers)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num01, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num04, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num00, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num03, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num02, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num34, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num30, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num32, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num41, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num44, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num40, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num43, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num42, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnTers)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void num00CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_num00CaretUpdate

        try {
            number = Integer.parseInt(num00.getText());
            if (number > 0 && number <= 9) {
                matris[0][0] = number;
            } else {
                matris[0][0] = 0;
            }
        } catch (NumberFormatException e) {
            matris[0][0] = 0;
        }

    }//GEN-LAST:event_num00CaretUpdate

    private void num01CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_num01CaretUpdate
        try {
            number = Integer.parseInt(num01.getText());
            if (number > 0 && number <= 9) {
                matris[0][1] = number;
            } else {
                matris[0][1] = 0;
            }
        } catch (NumberFormatException e) {
            matris[0][1] = 0;
        }
    }//GEN-LAST:event_num01CaretUpdate

    private void num02CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_num02CaretUpdate
        try {
            number = Integer.parseInt(num02.getText());
            if (number > 0 && number <= 9) {
                matris[0][2] = number;
            } else {
                matris[0][2] = 0;
            }
        } catch (NumberFormatException e) {
            matris[0][2] = 0;
        }
    }//GEN-LAST:event_num02CaretUpdate

    private void num03CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_num03CaretUpdate
        try {
            number = Integer.parseInt(num03.getText());
            if (number > 0 && number <= 9) {
                matris[0][3] = number;
            } else {
                matris[0][3] = 0;
            }
        } catch (NumberFormatException e) {
            matris[0][3] = 0;
        }
    }//GEN-LAST:event_num03CaretUpdate

    private void num04CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_num04CaretUpdate
        try {
            number = Integer.parseInt(num04.getText());
            if (number > 0 && number <= 9) {
                matris[0][4] = number;
            } else {
                matris[0][4] = 0;
            }
        } catch (NumberFormatException e) {
            matris[0][4] = 0;
        }
    }//GEN-LAST:event_num04CaretUpdate

    private void num10CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_num10CaretUpdate
        try {
            number = Integer.parseInt(num10.getText());
            if (number > 0 && number <= 9) {
                matris[1][0] = number;
            } else {
                matris[1][0] = 0;
            }
        } catch (NumberFormatException e) {
            matris[1][0] = 0;
        }
    }//GEN-LAST:event_num10CaretUpdate

    private void num11CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_num11CaretUpdate
        try {
            number = Integer.parseInt(num11.getText());
            if (number > 0 && number <= 9) {
                matris[1][1] = number;
            } else {
                matris[1][1] = 0;
            }
        } catch (NumberFormatException e) {
            matris[1][1] = 0;
        }
    }//GEN-LAST:event_num11CaretUpdate

    private void num12CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_num12CaretUpdate
        try {
            number = Integer.parseInt(num12.getText());
            if (number > 0 && number <= 9) {
                matris[1][2] = number;
            } else {
                matris[1][2] = 0;
            }
        } catch (NumberFormatException e) {
            matris[1][2] = 0;
        }
    }//GEN-LAST:event_num12CaretUpdate

    private void num13CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_num13CaretUpdate
        try {
            number = Integer.parseInt(num13.getText());
            if (number > 0 && number <= 9) {
                matris[1][3] = number;
            } else {
                matris[1][3] = 0;
            }
        } catch (NumberFormatException e) {
            matris[1][3] = 0;
        }
    }//GEN-LAST:event_num13CaretUpdate

    private void num14CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_num14CaretUpdate
        try {
            number = Integer.parseInt(num14.getText());
            if (number > 0 && number <= 9) {
                matris[1][4] = number;
            } else {
                matris[1][4] = 0;
            }
        } catch (NumberFormatException e) {
            matris[1][4] = 0;
        }
    }//GEN-LAST:event_num14CaretUpdate

    private void num20CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_num20CaretUpdate
        try {
            number = Integer.parseInt(num20.getText());
            if (number > 0 && number <= 9) {
                matris[2][0] = number;
            } else {
                matris[2][0] = 0;
            }
        } catch (NumberFormatException e) {
            matris[2][0] = 0;
        }
    }//GEN-LAST:event_num20CaretUpdate

    private void num21CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_num21CaretUpdate
        try {
            number = Integer.parseInt(num21.getText());
            if (number > 0 && number <= 9) {
                matris[2][1] = number;
            } else {
                matris[2][1] = 0;
            }
        } catch (NumberFormatException e) {
            matris[2][1] = 0;
        }
    }//GEN-LAST:event_num21CaretUpdate

    private void num22CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_num22CaretUpdate
        try {
            number = Integer.parseInt(num22.getText());
            if (number > 0 && number <= 9) {
                matris[2][2] = number;
            } else {
                matris[2][2] = 0;
            }
        } catch (NumberFormatException e) {
            matris[2][2] = 0;
        }
    }//GEN-LAST:event_num22CaretUpdate

    private void num23CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_num23CaretUpdate
        try {
            number = Integer.parseInt(num23.getText());
            if (number > 0 && number <= 9) {
                matris[2][3] = number;
            } else {
                matris[2][3] = 0;
            }
        } catch (NumberFormatException e) {
            matris[2][3] = 0;
        }
    }//GEN-LAST:event_num23CaretUpdate

    private void num24CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_num24CaretUpdate
        try {
            number = Integer.parseInt(num24.getText());
            if (number > 0 && number <= 9) {
                matris[2][4] = number;
            } else {
                matris[2][4] = 0;
            }
        } catch (NumberFormatException e) {
            matris[2][4] = 0;
        }
    }//GEN-LAST:event_num24CaretUpdate

    private void num30CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_num30CaretUpdate
        try {
            number = Integer.parseInt(num30.getText());
            if (number > 0 && number <= 9) {
                matris[3][0] = number;
            } else {
                matris[3][0] = 0;
            }
        } catch (NumberFormatException e) {
            matris[3][0] = 0;
        }
    }//GEN-LAST:event_num30CaretUpdate

    private void num40CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_num40CaretUpdate
        try {
            number = Integer.parseInt(num40.getText());
            if (number > 0 && number <= 9) {
                matris[4][0] = number;
            } else {
                matris[4][0] = 0;
            }
        } catch (NumberFormatException e) {
            matris[4][0] = 0;
        }
    }//GEN-LAST:event_num40CaretUpdate

    private void num31CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_num31CaretUpdate
        try {
            number = Integer.parseInt(num31.getText());
            if (number > 0 && number <= 9) {
                matris[3][1] = number;
            } else {
                matris[3][1] = 0;
            }
        } catch (NumberFormatException e) {
            matris[3][1] = 0;
        }
    }//GEN-LAST:event_num31CaretUpdate

    private void num41CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_num41CaretUpdate
        try {
            number = Integer.parseInt(num41.getText());
            if (number > 0 && number <= 9) {
                matris[4][1] = number;
            } else {
                matris[4][1] = 0;
            }
        } catch (NumberFormatException e) {
            matris[4][1] = 0;
        }
    }//GEN-LAST:event_num41CaretUpdate

    private void num32CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_num32CaretUpdate
        try {
            number = Integer.parseInt(num32.getText());
            if (number > 0 && number <= 9) {
                matris[3][2] = number;
            } else {
                matris[3][2] = 0;
            }
        } catch (NumberFormatException e) {
            matris[3][2] = 0;
        }
    }//GEN-LAST:event_num32CaretUpdate

    private void num42CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_num42CaretUpdate
        try {
            number = Integer.parseInt(num42.getText());
            if (number > 0 && number <= 9) {
                matris[4][2] = number;
            } else {
                matris[4][2] = 0;
            }
        } catch (NumberFormatException e) {
            matris[4][2] = 0;
        }
    }//GEN-LAST:event_num42CaretUpdate

    private void num33CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_num33CaretUpdate
        try {
            number = Integer.parseInt(num33.getText());
            if (number > 0 && number <= 9) {
                matris[3][3] = number;
            } else {
                matris[3][3] = 0;
            }
        } catch (NumberFormatException e) {
            matris[3][3] = 0;
        }
    }//GEN-LAST:event_num33CaretUpdate

    private void num34CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_num34CaretUpdate
        try {
            number = Integer.parseInt(num34.getText());
            if (number > 0 && number <= 9) {
                matris[3][4] = number;
            } else {
                matris[3][4] = 0;
            }
        } catch (NumberFormatException e) {
            matris[3][4] = 0;
        }
    }//GEN-LAST:event_num34CaretUpdate

    private void num44CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_num44CaretUpdate
        try {
            number = Integer.parseInt(num44.getText());
            if (number > 0 && number <= 9) {
                matris[4][4] = number;
            } else {
                matris[4][4] = 0;
            }
        } catch (NumberFormatException e) {
            matris[4][4] = 0;
        }
    }//GEN-LAST:event_num44CaretUpdate

    private void num43CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_num43CaretUpdate
        try {
            number = Integer.parseInt(num43.getText());
            if (number > 0 && number <= 9) {
                matris[4][3] = number;
            } else {
                matris[4][3] = 0;
            }
        } catch (NumberFormatException e) {
            matris[4][3] = 0;
        }
    }//GEN-LAST:event_num43CaretUpdate

    private void btnTersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTersActionPerformed
        boolean doluMu = true;
        TersCevir.yazdir(matris);
        for(int i = 0; i < matris.length; i++){
            for(int j = 0; j < matris[i].length;j++){
                if(matris[i][j] == 0.0){
                    doluMu = false;
                }
            }
        }
        
        if(doluMu){
            this.setVisible(false);
            new TersCevir(matris, row, column);
        }
        
    }//GEN-LAST:event_btnTersActionPerformed

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
            java.util.logging.Logger.getLogger(Matris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTers;
    private javax.swing.JTextField num00;
    private javax.swing.JTextField num01;
    private javax.swing.JTextField num02;
    private javax.swing.JTextField num03;
    private javax.swing.JTextField num04;
    private javax.swing.JTextField num10;
    private javax.swing.JTextField num11;
    private javax.swing.JTextField num12;
    private javax.swing.JTextField num13;
    private javax.swing.JTextField num14;
    private javax.swing.JTextField num20;
    private javax.swing.JTextField num21;
    private javax.swing.JTextField num22;
    private javax.swing.JTextField num23;
    private javax.swing.JTextField num24;
    private javax.swing.JTextField num30;
    private javax.swing.JTextField num31;
    private javax.swing.JTextField num32;
    private javax.swing.JTextField num33;
    private javax.swing.JTextField num34;
    private javax.swing.JTextField num40;
    private javax.swing.JTextField num41;
    private javax.swing.JTextField num42;
    private javax.swing.JTextField num43;
    private javax.swing.JTextField num44;
    // End of variables declaration//GEN-END:variables
}
