/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package reto7;

import java.awt.Dimension;

import java.sql.Statement;
import reto7.*;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import controller.*;
import classe.*;

import org.jfree.data.general.DefaultPieDataset;
import java.awt.BorderLayout;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;

/**
 *
 * @author Esteban Bv
 */
public class informes extends javax.swing.JFrame {

    ctlbase ctlbase;
    LinkedList<classess> userobjetlist = new LinkedList<>();

    /**
     * Creates new form informes
     */
    public informes() {
        initComponents();
        this.ctlbase = new ctlbase();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Primer informe", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Segundo informe", jPanel1);

        jButton1.setText("Informe 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Informe 1. numero de ciudadanos ");

        jLabel2.setText("por Ciudad");

        jLabel3.setText("----------------------------------------------");

        jLabel4.setText("Informe 2. Buscar ciudadanos  por");

        jLabel5.setText("nombre");

        jButton2.setText("Informe 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("----------------------------------------------");

        jLabel7.setText("Informe 3. Buscar informaci??n ");

        jLabel8.setText("a partir de la regi??n:");

        jButton3.setText("Informe 3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try { //hace conexion con la base de datos

            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/reto7", "root", "");

            if (conn != null) {
                JOptionPane.showMessageDialog(null, "Conexi??n a base de datos " + "jdbc:mysql://localhost:3306/reto7" + " ... Ok");
            }
            Statement grafic = conn.createStatement();
            ResultSet resultado = grafic.executeQuery("SELECT ciudad,numerohb FROM dato7"); // realiza una consulta donde ya estan procesados 
                                                                                            // el nmumero de ciudadanos por ciudad
            DefaultPieDataset Informe = new DefaultPieDataset();
            while (resultado.next()) {
                Informe.setValue(resultado.getString("ciudad"), resultado.getInt(2)); // recibe las columnas de la consulta

            }
            JFreeChart graph = ChartFactory.createPieChart("informe 1", Informe, true, true, true); // inserta los valores en el gr??fico de torta
            ChartPanel panel = new ChartPanel(graph);

            panel.setMouseWheelEnabled(true); // Hace que el mouse sea interactivo para ver en detalle los resultados
            //jScrollPane2.setPreferredSize(new Dimension (400,200));

            jPanel2.setLayout(new java.awt.BorderLayout()); // 
            jPanel2.add(panel, BorderLayout.CENTER);  // centra el grafico en el panel
            jPanel2.validate(); // valida  y cierra la conexi??n 
            conn.close();
        } catch (Exception e) {

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String letras = jTextField1.getText(); // se recibe la informaci??n del nombre por el que se va filtrar la base de datos 
        int count = 0;  // se inicilizan dos contadores
        int count2 = 0;
        try {

            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/reto7", "root", ""); // conexion con la base de dato

            if (conn != null) {
                JOptionPane.showMessageDialog(null, "Conexi??n a base de datos " + "jdbc:mysql://localhost:3306/reto7" + " ... Ok");
            }

            String query = " SELECT name   FROM tb_people  WHERE name   LIKE CONCAT('%', ?, '%')"; // se realiza la consulta filtrando a partir de las letras ingresadas por el usuario

            PreparedStatement statemenprov = conn.prepareStatement(query);
            statemenprov.setString(1, letras);
            ResultSet result = statemenprov.executeQuery();

            while (result.next()) {
                count++;                 // este contador nos va decir cuantas personas coinciden con la primera consulta
                
               
            }

            String query2 = " SELECT name   FROM tb_people";  // se hace una consulta sobre cuantos ciudadanos hay
            PreparedStatement statemenprov2 = conn.prepareStatement(query2);
            ResultSet result2 = statemenprov2.executeQuery();
            while (result2.next()) {
                count2++;  // se cuenta uno a uno los ciudadanos que hay
            }
            conn.close();

            DefaultPieDataset Informe = new DefaultPieDataset();
            //var dataset = new DefaultPieDataset();
            Informe.setValue("Nombres por:" + letras, count);   // se hace un grafico de torta donde se muestra el numero de ciudadanos que coiunciden con la busqueda
            // frente a los que no coinciden para mostrar el porcentaje
            Informe.setValue("Otros Nombres", (count2 - count));

            JFreeChart chart = ChartFactory.createPieChart("Coincidencia de nombre", // se crea el grafico interactivo
                    Informe, true, true, false);

            ChartPanel panel = new ChartPanel(chart);  // se crea el panel

            panel.setMouseWheelEnabled(true);
            //jScrollPane2.setPreferredSize(new Dimension (400,200));

            jPanel1.setLayout(new java.awt.BorderLayout());
            jPanel1.add(panel, BorderLayout.CENTER);
            jPanel1.validate();  // se valida y se cierra la conexi??n con la base de datos
            conn.close();
        } catch (Exception e) {

        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String lregi??n = jTextField2.getText(); // se reciben los caracteres por los que se van a filtrar las regiones
        //LinkedList<classess> userobjetlist = new LinkedList<>();
     
      
          this.userobjetlist = ctlbase.Listust(lregi??n); // se llama la linkedList que retornara la informaci??n de nuestra consulta
     
               // se crea el libro de excel y sus encabezados
            HSSFWorkbook book = new HSSFWorkbook();
            HSSFSheet sheet = book.createSheet();
            book.setSheetName(0, "ciudadanos");
            String[] headers = new String[]{
                "id",
                "name",
                "postalZup",
                "phone",
                "address",
                "country",
                "currency",
                "alphanumeric",
                "numberrange",
                "region",
                "text",
                "email",
                "list"
            };
            CellStyle headerCellStyle = book.createCellStyle();  // se crean las celdas y se le dan atributos
            HSSFFont font = book.createFont();
            font.setBold(true);
            headerCellStyle.setFont(font);

            HSSFRow headersRow = sheet.createRow(0);
            for (int i = 0; i < headers.length; i++) {  // se cuentan los encabezados y se agregan a los limites superiores de las coluimnas
                String header = headers[i];
                HSSFCell cell = headersRow.createCell(i);
                cell.setCellStyle(headerCellStyle);
                cell.setCellValue(header);
            }
            for (int i = 0; i < userobjetlist.size(); i++) {  // de la linked list se traen cada uno de los objetos y se llaman a sus atributos
                HSSFRow row = sheet.createRow(i + 1);
                int id = userobjetlist.get(i).getId();
                String named = userobjetlist.get(i).getNamed();
                String postalZip =userobjetlist.get(i).getPostalZip();
                String phone = userobjetlist.get(i).getNamed();
                String address =userobjetlist.get(i).getAddress();
                String country = userobjetlist.get(i).getCountry();
                String currency = userobjetlist.get(i).getCurrency();
                String alphanumeric = userobjetlist.get(i).getAlphanumeric();
                int numberrange = userobjetlist.get(i).getNumberrange();
                String region = userobjetlist.get(i).getRegion();
                String text = userobjetlist.get(i).getText();
                String email = userobjetlist.get(i).getEmail();
                String list = userobjetlist.get(i).getList();
                row.createCell(0).setCellValue(id);  // los atributos se ingresan en las celdas
                row.createCell(1).setCellValue(named);
                row.createCell(2).setCellValue(postalZip);
                row.createCell(3).setCellValue(phone);
                row.createCell(4).setCellValue(address);
                row.createCell(5).setCellValue(country);
                row.createCell(6).setCellValue(currency);
                row.createCell(7).setCellValue(alphanumeric);
                row.createCell(8).setCellValue(numberrange);
                row.createCell(9).setCellValue(region);
                row.createCell(10).setCellValue(text);
                row.createCell(11).setCellValue(email);
                row.createCell(12).setCellValue(list);

            }
        
            try  {
                FileOutputStream file = new FileOutputStream ("lista de personas.xls");  // se le da un nombre al archivo
                book.write(file);
                file.close();// se escribe y se cierra
                JOptionPane.showMessageDialog(null, "Revise el archivo raiz del proyecto");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(informes.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
            Logger.getLogger(informes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(informes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(informes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(informes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(informes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new informes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
