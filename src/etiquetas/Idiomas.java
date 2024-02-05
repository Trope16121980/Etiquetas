package etiquetas;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author cgsen
 */
public class Idiomas extends javax.swing.JFrame {

    String user = System.getProperty("user.name");
    String rutaFoto = ("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\Etiquetas\\src\\img\\");

    /**
     * Creates new form Idiomas
     */
    public Idiomas() {
        initComponents();
        this.setTitle("Language - Idioma");
        this.setLocationRelativeTo(Idiomas.this);
        setIconImage(new ImageIcon(getClass().getResource("/img/IconoJFrame.png")).getImage());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        fotoInicio();
        fotoInicioPara();
        fotoInicioPiensa();
        fotoInicioProtege();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnEnter = new javax.swing.JButton();
        jComboBoxIdioma = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(104, 144, 196));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoBunge1.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Idioma  /  Language", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 0, 255))); // NOI18N

        btnEnter.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnEnter.setForeground(new java.awt.Color(0, 0, 255));
        btnEnter.setText("Enter");
        btnEnter.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        jComboBoxIdioma.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jComboBoxIdioma.setForeground(new java.awt.Color(0, 0, 255));
        jComboBoxIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English", "Español" }));
        jComboBoxIdioma.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnEnter, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addComponent(jComboBoxIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(628, 628, 628)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(jLabel2))))
                    .addComponent(jLabel3)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        pantalla();
    }//GEN-LAST:event_btnEnterActionPerformed

     public void fotoInicio() {
        File prueba = new File(rutaFoto);
        BufferedImage bufferedImage;
        try {
            bufferedImage = ImageIO.read(new File(prueba + "\\Stand_for_Safety.png"));
            Image image = bufferedImage.getScaledInstance(185, 113, Image.SCALE_DEFAULT);
            ImageIcon icon = new ImageIcon(image);
            jLabel4.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(Idiomas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void fotoInicioPara() {
        File prueba = new File(rutaFoto);
        BufferedImage bufferedImage;
        try {
            bufferedImage = ImageIO.read(new File(prueba + "\\STP_Stop.png"));
            Image image = bufferedImage.getScaledInstance(80, 80, Image.SCALE_DEFAULT);
            ImageIcon icon = new ImageIcon(image);
            jLabel6.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(Idiomas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void fotoInicioPiensa() {
        File prueba = new File(rutaFoto);
        BufferedImage bufferedImage;
        try {
            bufferedImage = ImageIO.read(new File(prueba + "\\STP_Think.png"));
            Image image = bufferedImage.getScaledInstance(80, 80, Image.SCALE_DEFAULT);
            ImageIcon icon = new ImageIcon(image);
            jLabel7.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(Idiomas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void fotoInicioProtege() {
        File prueba = new File(rutaFoto);
        BufferedImage bufferedImage;
        try {
            bufferedImage = ImageIO.read(new File(prueba + "\\STP_Protect.png"));
            Image image = bufferedImage.getScaledInstance(75, 75, Image.SCALE_DEFAULT);
            ImageIcon icon = new ImageIcon(image);
            jLabel5.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(Idiomas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void pantalla() {
            String selectValue = jComboBoxIdioma.getSelectedItem().toString();
            jComboBoxIdioma.setToolTipText(String.valueOf(selectValue));
            if (selectValue.equalsIgnoreCase("Español")) {
                new Inicial().setVisible(true);
                dispose();
            } else {
                new InicialEnglish().setVisible(true);
                dispose();
            }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JComboBox<String> jComboBoxIdioma;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
