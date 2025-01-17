/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeptit.QuanLyCuaHangLapTop.View;

import codeptit.QuanLyCuaHangLapTop.Model.NhaCungCap;
import codeptit.QuanLyCuaHangLapTop.Model.SanPham;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class SanPham_DanhMucView extends javax.swing.JFrame {

    private ArrayList<SanPham> list;
    private int listSize;
    private List<String> maXoa;
    private String filename = null;
    private byte[] SP_image = null;
    static int soMSP;

    /**
     * Creates new form DanhMucKHView
     */
    public SanPham_DanhMucView() {
        this.list = SanPham.sanPhamList();
        maXoa = new ArrayList<>();
        listSize = list.size();
        if(list.isEmpty()) {
            soMSP = 0;
        } else {
            soMSP = Integer.valueOf(list.get(list.size() - 1).getMaSP().substring(2, 5));
        }
        initComponents();
        jTextField_MaSP.setEditable(false);
        showJComboBox();
        showSanPham(list);
        jButton_Luu.setEnabled(false);
    }

    public static void showSanPham(ArrayList<SanPham> list) {
        DefaultTableModel dtm = (DefaultTableModel) jTable_SanPham.getModel();
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(dtm.getRowCount() - 1);
        }
        Object[] os = new Object[8];
        for (int i = 0; i < list.size(); i++) {
            os[0] = i + 1;
            os[1] = list.get(i).getMaSP();
            os[2] = list.get(i).getTenSP();
            os[3] = list.get(i).getNhaCC();
            os[4] = list.get(i).getSoLuong();
            os[5] = list.get(i).getGiaNhap();
            os[6] = list.get(i).getGiaBan();
            os[7] = list.get(i).getGhiChu();
            dtm.addRow(os);
        }
    }

    public void showJComboBox() {
        jComboBox_NCC.addItem("");
        List<String> data = NhaCungCap.tenNCC();
        for (int i = 0; i < data.size(); i++) {
            jComboBox_NCC.addItem(data.get(i));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_TenSP = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_SanPham = new javax.swing.JTable();
        jButton_Them = new javax.swing.JButton();
        jButton_Xoa = new javax.swing.JButton();
        jButton_Sua = new javax.swing.JButton();
        jButton_Luu = new javax.swing.JButton();
        jButton_Exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jComboBox_NCC = new javax.swing.JComboBox<>();
        jTextField_MaSP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_SoLuong = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_GiaNhap = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_GiaBan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_LinkAnh = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_GhiChu = new javax.swing.JTextArea();
        jLabel_Anh = new javax.swing.JLabel();
        jButton_OpenIma = new javax.swing.JButton();
        jButton_TimKiem = new javax.swing.JButton();
        jButton_LamMoi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Danh Mục Khách Hàng");
        setBackground(new java.awt.Color(255, 0, 0));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 153));
        jLabel6.setText("Mã sản phẩm:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 101, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("Tên sản phẩm:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 132, -1, -1));

        jTextField_TenSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jTextField_TenSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 129, 148, -1));

        jTable_SanPham = new JTable() {
            public boolean isCellEditable(int row, int column) {
                for(int i = 0; i < jTable_SanPham.getRowCount(); i++) {
                    if(row == i) return false;
                }
                return true;
            }
        };
        jTable_SanPham.setBackground(new java.awt.Color(255, 153, 255));
        jTable_SanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã sản phẩm", "Tên sản phẩm", "Nhà cung cấp", "Số lượng", "Đơn giá nhập", "Đơn giá bán", "Ghi chú"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Long.class, java.lang.Long.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_SanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_SanPhamMouseClicked(evt);
            }
        });
        jTable_SanPham.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable_SanPhamKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_SanPham);
        if (jTable_SanPham.getColumnModel().getColumnCount() > 0) {
            jTable_SanPham.getColumnModel().getColumn(0).setMinWidth(35);
            jTable_SanPham.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTable_SanPham.getColumnModel().getColumn(0).setMaxWidth(50);
            jTable_SanPham.getColumnModel().getColumn(1).setMinWidth(90);
            jTable_SanPham.getColumnModel().getColumn(1).setPreferredWidth(0);
            jTable_SanPham.getColumnModel().getColumn(1).setMaxWidth(140);
            jTable_SanPham.getColumnModel().getColumn(2).setMinWidth(95);
            jTable_SanPham.getColumnModel().getColumn(2).setPreferredWidth(0);
            jTable_SanPham.getColumnModel().getColumn(2).setMaxWidth(140);
            jTable_SanPham.getColumnModel().getColumn(3).setMinWidth(90);
            jTable_SanPham.getColumnModel().getColumn(3).setPreferredWidth(0);
            jTable_SanPham.getColumnModel().getColumn(3).setMaxWidth(140);
            jTable_SanPham.getColumnModel().getColumn(4).setMinWidth(65);
            jTable_SanPham.getColumnModel().getColumn(4).setPreferredWidth(0);
            jTable_SanPham.getColumnModel().getColumn(4).setMaxWidth(80);
            jTable_SanPham.getColumnModel().getColumn(5).setMinWidth(90);
            jTable_SanPham.getColumnModel().getColumn(5).setPreferredWidth(0);
            jTable_SanPham.getColumnModel().getColumn(5).setMaxWidth(140);
            jTable_SanPham.getColumnModel().getColumn(6).setMinWidth(80);
            jTable_SanPham.getColumnModel().getColumn(6).setPreferredWidth(0);
            jTable_SanPham.getColumnModel().getColumn(6).setMaxWidth(140);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 290, 808, 198));

        jButton_Them.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_Them.setIcon(new javax.swing.ImageIcon("D:\\Dai Hoc\\LapTrinhHuongDoiTuong\\QuanLyCuaHangMayTinh\\icon\\math-add-icon.png")); // NOI18N
        jButton_Them.setText("Thêm");
        jButton_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThemActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Them, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 506, -1, -1));

        jButton_Xoa.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_Xoa.setIcon(new javax.swing.ImageIcon("D:\\Dai Hoc\\LapTrinhHuongDoiTuong\\QuanLyCuaHangMayTinh\\icon\\delete-file-icon.png")); // NOI18N
        jButton_Xoa.setText("Xóa");
        jButton_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_XoaActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 506, -1, -1));

        jButton_Sua.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_Sua.setIcon(new javax.swing.ImageIcon("D:\\Dai Hoc\\LapTrinhHuongDoiTuong\\QuanLyCuaHangMayTinh\\icon\\edit-icon.png")); // NOI18N
        jButton_Sua.setText("Sửa");
        jButton_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SuaActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 506, -1, -1));

        jButton_Luu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_Luu.setIcon(new javax.swing.ImageIcon("D:\\Dai Hoc\\LapTrinhHuongDoiTuong\\QuanLyCuaHangMayTinh\\icon\\Save-icon.png")); // NOI18N
        jButton_Luu.setText("Lưu");
        jButton_Luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LuuActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Luu, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 506, -1, -1));

        jButton_Exit.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_Exit.setIcon(new javax.swing.ImageIcon("D:\\Dai Hoc\\LapTrinhHuongDoiTuong\\QuanLyCuaHangMayTinh\\icon\\Button-Close-icon.png")); // NOI18N
        jButton_Exit.setText("Thoát");
        jButton_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExitActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 506, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Danh Mục Sản Phẩm");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 23, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 67, 331, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Nhà cung cấp:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 162, -1, -1));

        jComboBox_NCC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jComboBox_NCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 159, 148, -1));

        jTextField_MaSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jTextField_MaSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 98, 148, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setText("Số lượng:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 192, -1, -1));

        jTextField_SoLuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jTextField_SoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 189, 148, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 153));
        jLabel7.setText("Đơn giá nhập:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 222, -1, -1));

        jTextField_GiaNhap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jTextField_GiaNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 219, 148, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 153));
        jLabel8.setText("Đơn giá bán:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 252, -1, -1));

        jTextField_GiaBan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jTextField_GiaBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 249, 148, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 153));
        jLabel9.setText("Ảnh:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 101, -1, -1));

        jTextField_LinkAnh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jTextField_LinkAnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 98, 147, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 153));
        jLabel10.setText("Ghi chú:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 132, -1, -1));

        jTextArea_GhiChu.setColumns(20);
        jTextArea_GhiChu.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea_GhiChu.setRows(5);
        jScrollPane1.setViewportView(jTextArea_GhiChu);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 129, 250, 143));

        jLabel_Anh.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(jLabel_Anh, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 95, 191, 177));

        jButton_OpenIma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_OpenIma.setForeground(new java.awt.Color(255, 0, 0));
        jButton_OpenIma.setIcon(new javax.swing.ImageIcon("D:\\Dai Hoc\\LapTrinhHuongDoiTuong\\QuanLyCuaHangMayTinh\\icon\\open-file-icon.png")); // NOI18N
        jButton_OpenIma.setText("Open");
        jButton_OpenIma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OpenImaActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_OpenIma, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 97, 96, -1));

        jButton_TimKiem.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_TimKiem.setIcon(new javax.swing.ImageIcon("D:\\Dai Hoc\\LapTrinhHuongDoiTuong\\QuanLyCuaHangMayTinh\\icon\\Zoom-icon.png")); // NOI18N
        jButton_TimKiem.setText("Tìm Kiếm");
        jButton_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TimKiemActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_TimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 506, -1, -1));

        jButton_LamMoi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_LamMoi.setIcon(new javax.swing.ImageIcon("D:\\Dai Hoc\\LapTrinhHuongDoiTuong\\QuanLyCuaHangMayTinh\\icon\\Reload-icon.png")); // NOI18N
        jButton_LamMoi.setText("Làm mới");
        jButton_LamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LamMoiActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_LamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 506, -1, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 45;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThemActionPerformed
        // TODO add your handling code here:
        SanPham_Them themSP = new SanPham_Them(list);
        themSP.setLocationRelativeTo(null);
        themSP.setVisible(true);
    }//GEN-LAST:event_jButton_ThemActionPerformed

    private void jButton_LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LuuActionPerformed
        // Xoa du lieu bi xoa
        for (int i = 0; i < maXoa.size(); i++) {
            SanPham.xoaDuLieuSanPham(maXoa.get(i));
        }
        
        // Them du lieu tu list vao bang:
        for (int i = 0; i < list.size(); i++) {
            if(i < listSize) {
                list.get(i).suaDuLieuSanPham();
            } else {
                list.get(i).nhapDuLieuSanPham();
            }
        }
        jButton_Luu.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Lưu dữ liệu thành công!", "Thực hiện thành công", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton_LuuActionPerformed

    private void jButton_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton_ExitActionPerformed

    private void jTable_SanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_SanPhamMouseClicked
        // TODO add your handling code here:
        int selectedRow = jTable_SanPham.getSelectedRow();
        DefaultTableModel dtm = (DefaultTableModel) jTable_SanPham.getModel();
        jTextField_MaSP.setText(dtm.getValueAt(selectedRow, 1).toString());
        jTextField_TenSP.setText(dtm.getValueAt(selectedRow, 2).toString());

        // Lay ma nha cung cap de doi du lieu jComboBox
        List<String> data = NhaCungCap.tenNCC();
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).contains(dtm.getValueAt(selectedRow, 3).toString())) {
                jComboBox_NCC.setSelectedItem(data.get(i));
            }
        }

        jTextField_SoLuong.setText(dtm.getValueAt(selectedRow, 4).toString());
        jTextField_GiaNhap.setText(dtm.getValueAt(selectedRow, 5).toString());
        jTextField_GiaBan.setText(dtm.getValueAt(selectedRow, 6).toString());
        jTextField_LinkAnh.setText("");
        jTextArea_GhiChu.setText(dtm.getValueAt(selectedRow, 7).toString());
        byte[] ima = list.get(selectedRow).getAnh();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(ima).getImage().getScaledInstance(jLabel_Anh.getWidth(), jLabel_Anh.getHeight(), Image.SCALE_SMOOTH));
        jLabel_Anh.setIcon(imageIcon);
    }//GEN-LAST:event_jTable_SanPhamMouseClicked

    private void jButton_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_XoaActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) jTable_SanPham.getModel();
        if (jTable_SanPham.getSelectedRowCount() == 1) {
            int selectedRow = jTable_SanPham.getSelectedRow();
            String maSP = dtm.getValueAt(selectedRow, 1).toString();
            if(selectedRow < listSize) listSize--;
            maXoa.add(maSP);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getMaSP().equals(maSP)) {
                    list.remove(i);
                    break;
                }
            }
            showSanPham(list);
            JOptionPane.showMessageDialog(null, "Đã xóa sản phẩm thành công!", "Thực hiện thành công", JOptionPane.INFORMATION_MESSAGE);
            jButton_Luu.setEnabled(true);
        } else {
            if (jTable_SanPham.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Bảng không có dữ liệu!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Hay chọn từng cột để xóa!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        jTextField_MaSP.setText("");
        jTextField_TenSP.setText("");
        jComboBox_NCC.setSelectedIndex(0);
        jTextField_SoLuong.setText("");
        jTextField_GiaNhap.setText("");
        jTextField_GiaBan.setText("");
        jTextField_LinkAnh.setText("");
        jTextArea_GhiChu.setText("");
        jLabel_Anh.setIcon(null);
    }//GEN-LAST:event_jButton_XoaActionPerformed

    private void jButton_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SuaActionPerformed
        // TODO add your handling code here:
        if (jTable_SanPham.getSelectedRowCount() == 1) {
            String maSP = jTextField_MaSP.getText();
            String tenSP = jTextField_TenSP.getText();
            String nhaCC = (String) jComboBox_NCC.getSelectedItem();
            String soLuong = jTextField_SoLuong.getText();
            String giaNhap = jTextField_GiaNhap.getText();
            String giaBan = jTextField_GiaBan.getText();
            String ghiChu = jTextArea_GhiChu.getText();
            // Lay ma nha cung cap:
            String[] temp = nhaCC.split("-");
            nhaCC = temp[0];
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getMaSP().equals(maSP)) {
                    list.get(i).setTenSP(tenSP);
                    list.get(i).setNhaCC(nhaCC);
                    list.get(i).setSoLuong(Integer.valueOf(soLuong));
                    list.get(i).setGiaNhap(Long.valueOf(giaNhap));
                    list.get(i).setGiaBan(Long.valueOf(giaBan));
                    if (!jTextField_LinkAnh.getText().equals("")) {
                        list.get(i).setAnh(SP_image);
                    }
                    list.get(i).setGhiChu(ghiChu);
                }
            }
            showSanPham(list);
            JOptionPane.showMessageDialog(null, "Đã sửa sản phẩm thành công!", "Thực hiện thành công", JOptionPane.INFORMATION_MESSAGE);
            jButton_Luu.setEnabled(true);
        } else {
            if (jTable_SanPham.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Bảng không có dữ liệu!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Hay chọn từng cột để sửa!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton_SuaActionPerformed

    private void jButton_OpenImaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OpenImaActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        if (f != null) {
            filename = f.getAbsolutePath();
            jTextField_LinkAnh.setText(filename);
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(jLabel_Anh.getWidth(), jLabel_Anh.getHeight(), Image.SCALE_SMOOTH));
            jLabel_Anh.setIcon(imageIcon);
            try {
                File image = new File(filename);
                FileInputStream fis = new FileInputStream(image);
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                byte[] buf = new byte[1024];
                for (int readNum; (readNum = fis.read(buf)) != -1;) {
                    baos.write(buf, 0, readNum);
                }
                SP_image = baos.toByteArray();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton_OpenImaActionPerformed

    private void jTable_SanPhamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_SanPhamKeyReleased
        // TODO add your handling code here:
        int selectedRow = jTable_SanPham.getSelectedRow();
        DefaultTableModel dtm = (DefaultTableModel) jTable_SanPham.getModel();
        jTextField_MaSP.setText(dtm.getValueAt(selectedRow, 1).toString());
        jTextField_TenSP.setText(dtm.getValueAt(selectedRow, 2).toString());

        // Lay ma nha cung cap de doi du lieu jComboBox
        List<String> data = NhaCungCap.tenNCC();
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).contains(dtm.getValueAt(selectedRow, 3).toString())) {
                jComboBox_NCC.setSelectedItem(data.get(i));
            }
        }

        jTextField_SoLuong.setText(dtm.getValueAt(selectedRow, 4).toString());
        jTextField_GiaNhap.setText(dtm.getValueAt(selectedRow, 5).toString());
        jTextField_GiaBan.setText(dtm.getValueAt(selectedRow, 6).toString());
        jTextField_LinkAnh.setText("");
        jTextArea_GhiChu.setText(dtm.getValueAt(selectedRow, 7).toString());
        byte[] ima = list.get(selectedRow).getAnh();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(ima).getImage().getScaledInstance(jLabel_Anh.getWidth(), jLabel_Anh.getHeight(), Image.SCALE_SMOOTH));
        jLabel_Anh.setIcon(imageIcon);
    }//GEN-LAST:event_jTable_SanPhamKeyReleased

    private void jButton_LamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LamMoiActionPerformed
        // TODO add your handling code here:
        showSanPham(list);
        
        //Xoa text
        jTextField_MaSP.setText("");
        jTextField_TenSP.setText("");
        jComboBox_NCC.setSelectedIndex(0);
        jTextField_SoLuong.setText("");
        jTextField_GiaNhap.setText("");
        jTextField_GiaBan.setText("");
        jTextField_LinkAnh.setText("");
        jTextArea_GhiChu.setText("");
        jLabel_Anh.setIcon(null);
    }//GEN-LAST:event_jButton_LamMoiActionPerformed

    private void jButton_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TimKiemActionPerformed
        // TODO add your handling code here:
        // Xoa table
        DefaultTableModel dtm = (DefaultTableModel) jTable_SanPham.getModel();
        while(jTable_SanPham.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        
        String tenSP = jTextField_TenSP.getText();
        String ncc = jComboBox_NCC.getSelectedItem().toString();
        String soLuong = jTextField_SoLuong.getText();
        String giaNhap = jTextField_GiaNhap.getText();
        String giaBan = jTextField_GiaBan.getText();
        
        if(tenSP.equals("") && ncc.equals("") && soLuong.equals("") && giaNhap.equals("") && giaBan.equals("")) {
            JOptionPane.showMessageDialog(null, "Hãy nhập một điều kiện tìm kiếm!!!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            List<SanPham> listSP = new ArrayList<>();
            try {
                String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
                Connection con = DriverManager.getConnection(connectionUrl);
                String sql = "SELECT * FROM tblSanPham WHERE 1 = 1";
                if(!tenSP.equals("")) {
                    sql = sql + " AND TenSP LIKE '%" + tenSP +"%'";
                }
                if(!ncc.equals("")) {
                    String[] temp = ncc.split("-");
                    sql = sql + " AND MaNCC LIKE '%" + temp[0] +"%'";
                }
                if(!soLuong.equals("")) {
                    sql = sql + " AND SoLuong <= " + soLuong;
                }
                if (!giaNhap.equals("")) {
                    sql = sql + " AND DonGiaNhap <= " + giaNhap;
                }
                if(!giaBan.equals("")) {
                    sql = sql + " AND DonGiaBan <=" + giaBan;
                }
                PreparedStatement pst = con.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                SanPham sp;
                while(rs.next()) {
                    sp = new SanPham(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4),
                    rs.getLong(5), rs.getLong(6), rs.getBytes(7), rs.getString(8));
                    listSP.add(sp);
                } 
                pst.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            
            if(listSP.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Không có sản phẩm thỏa mãn điều kiện!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            } else {
                Object[] os = new Object[8];
                for (int i = 0; i < listSP.size(); i++) {
                    SanPham get = listSP.get(i);
                    os[0] = i + 1;
                    os[1] = get.getMaSP();
                    os[2] = get.getTenSP();
                    os[3] = get.getNhaCC();
                    os[4] = get.getSoLuong();
                    os[5] = get.getGiaNhap();
                    os[6] = get.getGiaBan();
                    os[7] = get.getGhiChu();
                    dtm.addRow(os);
                }
            }
        }
        
    }//GEN-LAST:event_jButton_TimKiemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Exit;
    static javax.swing.JButton jButton_LamMoi;
    static javax.swing.JButton jButton_Luu;
    private javax.swing.JButton jButton_OpenIma;
    private javax.swing.JButton jButton_Sua;
    private javax.swing.JButton jButton_Them;
    private javax.swing.JButton jButton_TimKiem;
    private javax.swing.JButton jButton_Xoa;
    private javax.swing.JComboBox<String> jComboBox_NCC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Anh;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private static javax.swing.JTable jTable_SanPham;
    private javax.swing.JTextArea jTextArea_GhiChu;
    private javax.swing.JTextField jTextField_GiaBan;
    private javax.swing.JTextField jTextField_GiaNhap;
    private javax.swing.JTextField jTextField_LinkAnh;
    private javax.swing.JTextField jTextField_MaSP;
    private javax.swing.JTextField jTextField_SoLuong;
    private javax.swing.JTextField jTextField_TenSP;
    // End of variables declaration//GEN-END:variables
}
