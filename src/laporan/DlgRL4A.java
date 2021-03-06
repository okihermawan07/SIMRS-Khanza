package laporan;
import keuangan.*;
import fungsi.WarnaTable;
import fungsi.koneksiDB;
import fungsi.sekuel;
import fungsi.validasi;
import fungsi.var;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;

public class DlgRL4A extends javax.swing.JDialog {
    private sekuel Sequel=new sekuel();
    private validasi Valid=new validasi();
    private Jurnal jur=new Jurnal();
    private Connection koneksi=koneksiDB.condb();
    private PreparedStatement ps;
    private ResultSet rs;
    private String diagnosa="";
    
    /** Creates new form DlgProgramStudi
     * @param parent
     * @param modal */
    public DlgRL4A(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        LoadHTML.setEditable(true);
        HTMLEditorKit kit = new HTMLEditorKit();
        LoadHTML.setEditorKit(kit);
        StyleSheet styleSheet = kit.getStyleSheet();
        styleSheet.addRule(
                ".isi td{border-right: 1px solid #edf2e8;font: 8.5px tahoma;height:12px;border-bottom: 1px solid #edf2e8;background: #ffffff;color:#3c5032;}"+
                ".isi2 td{font: 8.5px tahoma;height:12px;background: #ffffff;color:#3c5032;}"+
                ".isi3 td{border-right: 1px solid #edf2e8;font: 8.5px tahoma;height:12px;border-top: 1px solid #edf2e8;background: #ffffff;color:#3c5032;}"+
                ".isi4 td{font: 11px tahoma;height:12px;border-top: 1px solid #edf2e8;background: #ffffff;color:#3c5032;}"
        );
        Document doc = kit.createDefaultDocument();
        LoadHTML.setDocument(doc);
    }
    private Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
    private int i=0;

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Kd2 = new widget.TextBox();
        internalFrame1 = new widget.InternalFrame();
        panelisi1 = new widget.panelisi();
        label11 = new widget.Label();
        Tgl1 = new widget.Tanggal();
        label18 = new widget.Label();
        Tgl2 = new widget.Tanggal();
        btnCari = new widget.Button();
        label9 = new widget.Label();
        BtnPrint = new widget.Button();
        BtnKeluar = new widget.Button();
        TabRawat = new javax.swing.JTabbedPane();
        internalFrame2 = new widget.InternalFrame();
        LoadHTML = new widget.editorpane();
        internalFrame3 = new widget.InternalFrame();
        LoadHTML1 = new widget.editorpane();

        Kd2.setName("Kd2"); // NOI18N
        Kd2.setPreferredSize(new java.awt.Dimension(207, 23));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        internalFrame1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 245, 235)), "::[ RL 4A Data Keadaan Morbiditas Pasien Rawat Inap ]::", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(50, 70, 40))); // NOI18N
        internalFrame1.setName("internalFrame1"); // NOI18N
        internalFrame1.setLayout(new java.awt.BorderLayout(1, 1));

        panelisi1.setName("panelisi1"); // NOI18N
        panelisi1.setPreferredSize(new java.awt.Dimension(100, 56));
        panelisi1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 9));

        label11.setText("Tanggal :");
        label11.setName("label11"); // NOI18N
        label11.setPreferredSize(new java.awt.Dimension(55, 23));
        panelisi1.add(label11);

        Tgl1.setEditable(false);
        Tgl1.setDisplayFormat("dd-MM-yyyy");
        Tgl1.setName("Tgl1"); // NOI18N
        Tgl1.setPreferredSize(new java.awt.Dimension(100, 23));
        panelisi1.add(Tgl1);

        label18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label18.setText("s.d.");
        label18.setName("label18"); // NOI18N
        label18.setPreferredSize(new java.awt.Dimension(30, 23));
        panelisi1.add(label18);

        Tgl2.setEditable(false);
        Tgl2.setDisplayFormat("dd-MM-yyyy");
        Tgl2.setName("Tgl2"); // NOI18N
        Tgl2.setPreferredSize(new java.awt.Dimension(100, 23));
        panelisi1.add(Tgl2);

        btnCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/accept.png"))); // NOI18N
        btnCari.setMnemonic('2');
        btnCari.setToolTipText("Alt+2");
        btnCari.setName("btnCari"); // NOI18N
        btnCari.setPreferredSize(new java.awt.Dimension(28, 23));
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        btnCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCariKeyPressed(evt);
            }
        });
        panelisi1.add(btnCari);

        label9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label9.setName("label9"); // NOI18N
        label9.setPreferredSize(new java.awt.Dimension(45, 30));
        panelisi1.add(label9);

        BtnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/b_print.png"))); // NOI18N
        BtnPrint.setMnemonic('T');
        BtnPrint.setText("Cetak");
        BtnPrint.setToolTipText("Alt+T");
        BtnPrint.setName("BtnPrint"); // NOI18N
        BtnPrint.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPrintActionPerformed(evt);
            }
        });
        BtnPrint.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnPrintKeyPressed(evt);
            }
        });
        panelisi1.add(BtnPrint);

        BtnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/exit.png"))); // NOI18N
        BtnKeluar.setMnemonic('K');
        BtnKeluar.setText("Keluar");
        BtnKeluar.setToolTipText("Alt+K");
        BtnKeluar.setName("BtnKeluar"); // NOI18N
        BtnKeluar.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKeluarActionPerformed(evt);
            }
        });
        BtnKeluar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnKeluarKeyPressed(evt);
            }
        });
        panelisi1.add(BtnKeluar);

        internalFrame1.add(panelisi1, java.awt.BorderLayout.PAGE_END);

        TabRawat.setBackground(new java.awt.Color(250, 255, 245));
        TabRawat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 235, 225)));
        TabRawat.setForeground(new java.awt.Color(50, 70, 40));
        TabRawat.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        TabRawat.setName("TabRawat"); // NOI18N
        TabRawat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabRawatMouseClicked(evt);
            }
        });

        internalFrame2.setBackground(new java.awt.Color(235, 255, 235));
        internalFrame2.setBorder(null);
        internalFrame2.setName("internalFrame2"); // NOI18N
        internalFrame2.setLayout(new java.awt.BorderLayout(1, 1));

        LoadHTML.setBorder(null);
        LoadHTML.setName("LoadHTML"); // NOI18N
        internalFrame2.add(LoadHTML, java.awt.BorderLayout.CENTER);

        TabRawat.addTab(".: Berdasar Tanggal Masuk  ", internalFrame2);

        internalFrame3.setBackground(new java.awt.Color(235, 255, 235));
        internalFrame3.setBorder(null);
        internalFrame3.setName("internalFrame3"); // NOI18N
        internalFrame3.setLayout(new java.awt.BorderLayout(1, 1));

        LoadHTML1.setBorder(null);
        LoadHTML1.setName("LoadHTML1"); // NOI18N
        internalFrame3.add(LoadHTML1, java.awt.BorderLayout.CENTER);

        TabRawat.addTab(".: Berdasar Tanggal Keluar  ", internalFrame3);

        internalFrame1.add(TabRawat, java.awt.BorderLayout.CENTER);

        getContentPane().add(internalFrame1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
private void KdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TKdKeyPressed
    Valid.pindah(evt,BtnCari,Nm);
}//GEN-LAST:event_TKdKeyPressed
*/

    private void BtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPrintActionPerformed
        
    }//GEN-LAST:event_BtnPrintActionPerformed

    private void BtnPrintKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnPrintKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            BtnPrintActionPerformed(null);
        }else{
            Valid.pindah(evt,Tgl2,BtnKeluar);
        }
    }//GEN-LAST:event_BtnPrintKeyPressed

    private void BtnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKeluarActionPerformed
        dispose();
    }//GEN-LAST:event_BtnKeluarActionPerformed

    private void BtnKeluarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnKeluarKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            dispose();
        }else{Valid.pindah(evt,BtnPrint,Tgl1);}
    }//GEN-LAST:event_BtnKeluarKeyPressed

private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        if(TabRawat.getSelectedIndex()==0){
            prosesCari();
        }else if(TabRawat.getSelectedIndex()==1){
            prosesCari2();
        }
}//GEN-LAST:event_btnCariActionPerformed

private void btnCariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCariKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            btnCariActionPerformed(null);
        }else{
            Valid.pindah(evt, Tgl2, BtnPrint);
        }
}//GEN-LAST:event_btnCariKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        prosesCari();
    }//GEN-LAST:event_formWindowOpened

    private void TabRawatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabRawatMouseClicked
        if(TabRawat.getSelectedIndex()==0){
            prosesCari();
        }else if(TabRawat.getSelectedIndex()==1){
            prosesCari2();
        }
    }//GEN-LAST:event_TabRawatMouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            DlgRL4A dialog = new DlgRL4A(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widget.Button BtnKeluar;
    private widget.Button BtnPrint;
    private widget.TextBox Kd2;
    private widget.editorpane LoadHTML;
    private widget.editorpane LoadHTML1;
    private javax.swing.JTabbedPane TabRawat;
    private widget.Tanggal Tgl1;
    private widget.Tanggal Tgl2;
    private widget.Button btnCari;
    private widget.InternalFrame internalFrame1;
    private widget.InternalFrame internalFrame2;
    private widget.InternalFrame internalFrame3;
    private widget.Label label11;
    private widget.Label label18;
    private widget.Label label9;
    private widget.panelisi panelisi1;
    // End of variables declaration//GEN-END:variables

    private void prosesCari() {
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            StringBuilder htmlContent = new StringBuilder();
            htmlContent.append(                             
                "<tr class='isi3'>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center' width='2%' rowspan='3'>No.Urut</td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center' width='5%' rowspan='3'>No.Daftar Terperinci</td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center' width='18%' rowspan='3'>Golongan Sebab Penyakit</td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center' width='55%' colspan='18'>Jumlah Pasien Hidup dan Mati menurut Golongan Umur & Jenis Kelamin</td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center' width='10%' colspan='2'>Pasien Keluar (Hidup & Mati) Menurut Jenis Kelamin</td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center' width='5%' rowspan='3'>Jumlah Pasien Keluar Hidup (23+24)</td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center' width='5%' rowspan='3'>Jumlah Pasien Keluar Mati</td>"+
                "</tr>"+
                "<tr class='isi3'>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                "</tr>"+
                "<tr class='isi3'>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                    "<td valign='middle' bgcolor='#f8fdf3' align='center'></td>"+
                "</tr>"
            );
            
            LoadHTML.setText(
                    "<html>"+
                      "<table width='100%' border='0' align='center' cellpadding='3px' cellspacing='0' class='tbl_form'>"+
                       htmlContent.toString()+
                      "</table>"+
                    "</html>");
        } catch (Exception e) {
            System.out.println("laporan.DlgRL4A.prosesCari() : "+e);
        } 
        this.setCursor(Cursor.getDefaultCursor());
        
    }
    
     private void prosesCari2() {
       
        
    }
    
    
    
    public void isCek(){
        BtnPrint.setEnabled(var.getrl4a());
    }
    
}
