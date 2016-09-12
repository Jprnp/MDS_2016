/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Ullrick
 */
public class Principal extends javax.swing.JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	boolean pbust = false, dbust = false, done = false, dend = false;
    BlackJack BJack;
    

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonExit = new javax.swing.JButton();
        buttonNext = new javax.swing.JButton();
        buttonEnd = new javax.swing.JButton();
        labelTurno = new javax.swing.JLabel();
        labelDealer = new javax.swing.JLabel();
        labelDealerPoints = new javax.swing.JLabel();
        labelPlayer2 = new javax.swing.JLabel();
        labelPlayerPoints1 = new javax.swing.JLabel();
        buttonInit = new javax.swing.JButton();
        buttonDist = new javax.swing.JButton();
        labelLog = new javax.swing.JLabel();
        buttonOk = new javax.swing.JButton();
        buttonRetry = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BJack");
        setMinimumSize(new java.awt.Dimension(375, 170));
        setMaximumSize(new java.awt.Dimension(375, 170));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        buttonExit.setText("Sair");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });
        getContentPane().add(buttonExit);
        buttonExit.setBounds(300, 100, 51, 23);

        buttonNext.setText("Proxima Carta");
        buttonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNextActionPerformed(evt);
            }
        });
        getContentPane().add(buttonNext);
        buttonNext.setBounds(10, 100, 110, 23);

        buttonEnd.setText("Finalizar");
        buttonEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEndActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEnd);
        buttonEnd.setBounds(140, 100, 80, 23);

        labelTurno.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelTurno.setText("Turno X");
        getContentPane().add(labelTurno);
        labelTurno.setBounds(10, 10, 160, 22);

        labelDealer.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelDealer.setText("Dealer:");
        getContentPane().add(labelDealer);
        labelDealer.setBounds(140, 70, 50, 15);

        labelDealerPoints.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelDealerPoints.setText("xx");
        labelDealerPoints.setToolTipText("");
        getContentPane().add(labelDealerPoints);
        labelDealerPoints.setBounds(190, 70, 20, 15);

        labelPlayer2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelPlayer2.setText("Jogador:");
        getContentPane().add(labelPlayer2);
        labelPlayer2.setBounds(10, 70, 50, 15);

        labelPlayerPoints1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelPlayerPoints1.setText("xx");
        labelPlayerPoints1.setToolTipText("");
        getContentPane().add(labelPlayerPoints1);
        labelPlayerPoints1.setBounds(70, 70, 20, 15);

        buttonInit.setText("Iniciar Partida");
        buttonInit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInitActionPerformed(evt);
            }
        });
        getContentPane().add(buttonInit);
        buttonInit.setBounds(10, 90, 330, 23);

        buttonDist.setText("Distribuir Cartas");
        buttonDist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDistActionPerformed(evt);
            }
        });
        getContentPane().add(buttonDist);
        buttonDist.setBounds(10, 90, 330, 23);
        getContentPane().add(labelLog);
        labelLog.setBounds(10, 40, 240, 20);
      //  labelImg.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ullrick\\Desktop\\bj.png"));       
        
        buttonOk.setText("OK");
        buttonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOkActionPerformed(evt);
            }
        });
        getContentPane().add(buttonOk);
        buttonOk.setBounds(140, 100, 47, 23);
        
        buttonRetry.setText("Retry");
        buttonRetry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRetryActionPerformed(evt);
            }
        });
        getContentPane().add(buttonRetry);
        buttonRetry.setBounds(140, 100, 90, 23);

        pack();
    }// </editor-fold>                        

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {                                           
        System.exit(0);
    }                                          

    private void buttonNextActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.labelLog.setText(BJack.nextCardPlayer());
        this.labelPlayerPoints1.setText(Integer.toString(BJack.playerpts));
        if(BJack.playerpts > 21) {
            this.pbust = true;
            this.labelLog.setText("Voce estourou... Vez do dealer!");
            this.dealerTurn();
        }
    }  
    
    private void buttonRetryActionPerformed(java.awt.event.ActionEvent evt) {   
    	dispose();
    	new Principal().setVisible(true);
    } 

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        this.labelTurno.setVisible(false);
        this.labelDealer.setVisible(false);
        this.buttonOk.setVisible(false);
        this.labelDealerPoints.setVisible(false);
        this.labelPlayer2.setVisible(false);
        this.labelPlayerPoints1.setVisible(false);
        this.buttonNext.setVisible(false);
        this.buttonEnd.setVisible(false);
        this.buttonExit.setVisible(false);
        this.buttonDist.setVisible(false);
        this.buttonRetry.setVisible(false);
        
        BJack = new BlackJack();
    }                                 

    private void buttonEndActionPerformed(java.awt.event.ActionEvent evt) {
    	this.done = true;
        this.dealerTurn();
    }                                         

    private void buttonInitActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.buttonInit.setVisible(false);
        this.buttonOk.setVisible(false);
        this.labelTurno.setVisible(true);
        this.labelDealer.setVisible(true);
        this.labelDealerPoints.setVisible(true);
        this.labelPlayer2.setVisible(true);
        this.labelPlayerPoints1.setVisible(true);
        this.buttonDist.setVisible(true);
        this.labelTurno.setText("In�cio da Rodada");
        try {
            BJack.init();
            this.labelPlayerPoints1.setText(Integer.toString
                                                         (BJack.playerpts));
            this.labelDealerPoints.setText(Integer.toString
                                                         (BJack.dealerpts));
        } catch (InterruptedException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null,
                                                                            ex);
        }
    }                                          

    private void buttonDistActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.buttonDist.setVisible(false);
        this.labelLog.setText(BJack.nextCardPlayer());
        this.buttonOk.setVisible(true);
        this.labelPlayerPoints1.setText(Integer.toString
                                                         (BJack.playerpts));
        this.labelDealerPoints.setText(Integer.toString
                                                         (BJack.dealerpts));
    }             
    

    private void buttonOkActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(this.pbust == false && this.done == false) {
            if(BJack.counter == 1) {
                this.labelLog.setText(BJack.nextCardDealer());
            }
            else {
                if(BJack.counter == 2) {
                    this.labelLog.setText(BJack.nextCardPlayer());
                }
                else {
                    this.labelTurno.setText("Turno do Player");
                    this.buttonOk.setVisible(false);
                    this.buttonNext.setVisible(true);
                    this.buttonEnd.setVisible(true);
                    this.buttonExit.setVisible(true);
                }
            }
        }    
        else {
            if(this.dbust == false && this.dend == false) {
                this.labelLog.setText(BJack.nextCardDealer());
                if(BJack.dealerpts > 21) {
                    this.labelLog.setText("Dealer Estourou!");
                    this.dbust = true;
                }
                else {
                    if(BJack.dealerpts >= 17) {
                        this.labelLog.setText("Dealer Encerra");
                        this.dend = true;
                    }
                }
            }
            else {
                this.endGame();
            }
        }
        this.labelPlayerPoints1.setText(Integer.toString
                                                         (BJack.playerpts));
        this.labelDealerPoints.setText(Integer.toString
                                                         (BJack.dealerpts));
    }
    
    private void endGame() {
        if (this.dbust) {
            this.labelLog.setText("Voce Venceu!");
            BlackJack.playWin();
		} 
        else if (!this.dbust && this.pbust) {
			this.labelLog.setText("Voce Perdeu!");
			BlackJack.play();
		}
        else {
			if (BJack.playerpts > BJack.dealerpts) {
				this.labelLog.setText("Voce Venceu!");
				BlackJack.playWin();
			} else if (BJack.playerpts < BJack.dealerpts) {
				this.labelLog.setText("Voce Perdeu!");
				BlackJack.play();
			}
			else {
				this.labelLog.setText("Empate!");
			}
		}
        this.buttonOk.setVisible(false);
        this.buttonRetry.setVisible(true);
        this.buttonExit.setVisible(true);
    }
    
    private void dealerTurn() {
        this.labelTurno.setText("Turno do Dealer");
        this.buttonNext.setVisible(false);
        this.buttonEnd.setVisible(false);
        this.buttonExit.setVisible(false);
        this.buttonOk.setVisible(true);
    }

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify                     
    private javax.swing.JButton buttonDist;
    private javax.swing.JButton buttonEnd;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonInit;
    private javax.swing.JButton buttonNext;
    private javax.swing.JButton buttonOk;
    private javax.swing.JButton buttonRetry;
    private javax.swing.JLabel labelDealer;
    private javax.swing.JLabel labelDealerPoints;
    private javax.swing.JLabel labelLog;
    private javax.swing.JLabel labelPlayer2;
    private javax.swing.JLabel labelPlayerPoints1;
    private javax.swing.JLabel labelTurno;
    // End of variables declaration                   
}