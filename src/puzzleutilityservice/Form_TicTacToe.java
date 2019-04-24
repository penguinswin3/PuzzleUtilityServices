package puzzleutilityservice;

/**
 * @author Nick Brougher
 * @author Brad
 */
public class Form_TicTacToe extends javax.swing.JFrame {

    /**
     * Creates new form Form_TicTacToe
     */
    public Form_TicTacToe() { initComponents(); }
    static String[] board = {"", "", "", "", "", "", "", "", ""};
    String player = "X";
    int numMoves = 1;
    // true = x 
    // false == o
    String Winner = "TBD";
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        toMainMenu = new javax.swing.JButton();
        turnLabel = new java.awt.Label();
        turnSymbol = new java.awt.Label();
        topMiddle = new javax.swing.JButton();
        topLeft = new javax.swing.JButton();
        topRight = new javax.swing.JButton();
        middleRight = new javax.swing.JButton();
        middleMiddle = new javax.swing.JButton();
        middleLeft = new javax.swing.JButton();
        bottomRight = new javax.swing.JButton();
        bottomMiddle = new javax.swing.JButton();
        bottomLeft = new javax.swing.JButton();
        newGame = new javax.swing.JButton();
        txtWinner = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        toMainMenu.setText("Main Menu");
        toMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toMainMenuActionPerformed(evt);
            }
        });

        turnLabel.setText("Turn: ");

        turnSymbol.setText("X");

        topMiddle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topMiddleActionPerformed(evt);
            }
        });

        topLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topLeftActionPerformed(evt);
            }
        });

        topRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topRightActionPerformed(evt);
            }
        });

        middleRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middleRightActionPerformed(evt);
            }
        });

        middleMiddle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middleMiddleActionPerformed(evt);
            }
        });

        middleLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middleLeftActionPerformed(evt);
            }
        });

        bottomRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottomRightActionPerformed(evt);
            }
        });

        bottomMiddle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottomMiddleActionPerformed(evt);
            }
        });

        bottomLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottomLeftActionPerformed(evt);
            }
        });

        newGame.setText("New Game");
        newGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameActionPerformed(evt);
            }
        });

        txtWinner.setEditable(false);
        txtWinner.setText("Winner: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(topLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(topMiddle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(topRight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(middleLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(middleMiddle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(middleRight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(bottomLeft, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(txtWinner))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(bottomMiddle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bottomRight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(toMainMenu, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(turnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(turnSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newGame)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(turnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turnSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newGame))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topMiddle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topRight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(middleMiddle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(middleLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(middleRight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bottomMiddle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bottomLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bottomRight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toMainMenu)
                    .addComponent(txtWinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    /*
    BOARD:
    0 1 2
    3 4 5
    6 7 8
    */
    
    private void toMainMenuActionPerformed(java.awt.event.ActionEvent evt) {                                           
        Form_Main.form_Main.setVisible(true);
        Form_Main.form_TicTacToe.setVisible(false);
    }                                          

    private void topLeftActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        if(move(0)) 
        { 
            topLeft.setText(player);
            checkWinner();
            switchPlayer();
        }
    }                                       

    private void topMiddleActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(move(1)) 
        { 
            topMiddle.setText(player);
            checkWinner();
            switchPlayer();
        }
    }                                         

    private void topRightActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(move(2)) 
        { 
            topRight.setText(player);
            checkWinner();
            switchPlayer();
        }
    }                                        

    private void middleLeftActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        if(move(3)) 
        { 
            middleLeft.setText(player);
            checkWinner();
            switchPlayer();
        }
    }                                          

    private void middleMiddleActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        if(move(4)) 
        {
            middleMiddle.setText(player);
            checkWinner();
            switchPlayer();
        }
    }                                            

    private void middleRightActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        if(move(5)) 
        { 
            middleRight.setText(player);
            checkWinner();
            switchPlayer();
        }
    }                                           

    private void bottomLeftActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        if(move(6)) 
        { 
            bottomLeft.setText(player);
            checkWinner();
            switchPlayer();
        }
    }                                          

    private void bottomMiddleActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        if(move(7)) 
        { 
            bottomMiddle.setText(player);
            checkWinner();
            switchPlayer();
        }
    }                                            

    private void bottomRightActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        if(move(8)) 
        { 
            bottomRight.setText(player);
            checkWinner();
            switchPlayer();
        }
    }                                           

    private void newGameActionPerformed(java.awt.event.ActionEvent evt) {                                        
        numMoves = 1;
        
        topLeft.setText("");
        topMiddle.setText("");
        topRight.setText("");
        
        middleLeft.setText("");
        middleMiddle.setText("");
        middleRight.setText("");
        
        bottomLeft.setText("");
        bottomMiddle.setText("");
        bottomRight.setText("");
        
        for(int i = 0; i < 9; i++) { board[i] = ""; }
        
        player = "X";
        turnSymbol.setText(player);
        txtWinner.setText("Winner: ");
        
        topLeft.setEnabled(true);
        topMiddle.setEnabled(true);
        topRight.setEnabled(true);
        middleLeft.setEnabled(true);
        middleMiddle.setEnabled(true);
        middleRight.setEnabled(true);
        bottomLeft.setEnabled(true);
        bottomMiddle.setEnabled(true);
        bottomRight.setEnabled(true);
    }                                       

    private boolean move(int pos)
    {
        if(board[pos] == "")
        {
            board[pos] = player;
            return true;
        }
        else { return false; } 
    }
    
    /*
    BOARD:
    0 1 2
    3 4 5
    6 7 8
    */
    private void checkWinner()
    {
        //horizontal top
        if(board[0] == player && board[1] == player && board[2] == player)
        {
            FoundWinner(player);
        }
        //horizontal middle
        else if(board[3] == player && board[4] == player && board[5] == player)
        {
            FoundWinner(player);
        }
        //horizontal bottom
        else if(board[6] == player && board[7] == player && board[8] == player)
        {
            FoundWinner(player);
        }
        //vertical left
        else if(board[0] == player && board[3] == player && board[6] == player)
        {
            FoundWinner(player);
        }
        //vertical middle
        else if(board[1] == player && board[4] == player && board[7] == player)
        {
            FoundWinner(player);
        }
        //vertical right
        else if(board[2] == player && board[5] == player && board[8] == player)
        {
            FoundWinner(player);
        }
        //main diagonal
        else if(board[0] == player && board[4] == player && board[8] == player)
        {
            FoundWinner(player);
        }
        //secondary diagonal
        else if(board[2] == player && board[4] == player && board[6] == player)
        {
            FoundWinner(player);
        }
        else if(numMoves == 9) { FoundWinner("Tie!"); }
    }
    
    private void switchPlayer()
    {
        if(player == "X") { player = "O"; }
        else { player = "X"; }
        turnSymbol.setText(player.toString());
        numMoves++;
    }
    
    private void FoundWinner(String player)
    {
        txtWinner.setText(txtWinner.getText() + " [ " + player + " ]");
        topLeft.setEnabled(false);
        topMiddle.setEnabled(false);
        topRight.setEnabled(false);
        middleLeft.setEnabled(false);
        middleMiddle.setEnabled(false);
        middleRight.setEnabled(false);
        bottomLeft.setEnabled(false);
        bottomMiddle.setEnabled(false);
        bottomRight.setEnabled(false);
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
            java.util.logging.Logger.getLogger(Form_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton bottomLeft;
    private javax.swing.JButton bottomMiddle;
    private javax.swing.JButton bottomRight;
    private javax.swing.JButton middleLeft;
    private javax.swing.JButton middleMiddle;
    private javax.swing.JButton middleRight;
    private javax.swing.JButton newGame;
    private javax.swing.JButton toMainMenu;
    private javax.swing.JButton topLeft;
    private javax.swing.JButton topMiddle;
    private javax.swing.JButton topRight;
    private java.awt.Label turnLabel;
    private java.awt.Label turnSymbol;
    private javax.swing.JTextField txtWinner;
    // End of variables declaration                   
}
