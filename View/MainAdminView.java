/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeptit.QuanLyCuaHangLapTop.View;

/**
 *
 * @author Admin
 */
public class MainAdminView extends javax.swing.JFrame {
    private String tk;
    /**
     * Creates new form MainView
     */
    public MainAdminView(String tk) {
        this.tk = tk;
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_ThongTinCaNhan = new javax.swing.JMenuItem();
        jMenuItem_DoiMK = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_DangXuat = new javax.swing.JMenuItem();
        jMenu_DanhMuc = new javax.swing.JMenu();
        jMenuItem_TaiKhoan = new javax.swing.JMenuItem();
        jMenuItem_NhanVien = new javax.swing.JMenuItem();
        jMenuItem_KhachHang = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_SanPham = new javax.swing.JMenuItem();
        jMenuItem_NhaCC = new javax.swing.JMenuItem();
        jMenu_HoaDon = new javax.swing.JMenu();
        jMenuItem_HDBan = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_TimKiem = new javax.swing.JMenuItem();
        jMenu_DoanhThu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hệ Thống Quản Lý Cửa Hàng Bán Máy Tính");
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Hệ thống quản lý");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 223, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Cửa Hàng Bán Máy Tính");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 161, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Chào mừng đến với chương trình quản lý cửa hàng bán máy tính.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 46, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Hệ thống quản lý cửa hàng là một phương thức để chủ doanh nghiệp có thể");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 46, 0, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("giám sát được hoạt động bán hàng của nhân viên. Đồng thời, xem xét tính ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 46, 0, 0);
        jPanel1.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("trung thực của nhân viên bán hàng.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 46, 0, 0);
        jPanel1.add(jLabel6, gridBagConstraints);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 468;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 129, 0, 0);
        jPanel1.add(jSeparator3, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Ngoài ra, hệ thống còn giúp cho chủ doanh nghiệp và nhân viên có thể quản ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 46, 0, 56);
        jPanel1.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("lý các sản phẩm trong kho, các nhà cung cấp và thông tin của khách hàng và");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 46, 0, 0);
        jPanel1.add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("cả chính người sử dụng chương trình.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 46, 0, 0);
        jPanel1.add(jLabel9, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Nếu cần được hỗ trợ. Vui lòng gọi điện cho người quản lý cửa hàng để biết");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 46, 0, 0);
        jPanel1.add(jLabel10, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("thêm thông tin chi tiết!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 46, 0, 0);
        jPanel1.add(jLabel11, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Xin chân trọng cảm ơn vì đã sử dụng sản phẩm của chúng tôi!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 46, 29, 0);
        jPanel1.add(jLabel12, gridBagConstraints);

        getContentPane().add(jPanel1);

        jMenu1.setText("Tài Khoản");

        jMenuItem_ThongTinCaNhan.setIcon(new javax.swing.ImageIcon("D:\\Dai Hoc\\LapTrinhHuongDoiTuong\\QuanLyCuaHangMayTinh\\icon\\Settings-icon.png")); // NOI18N
        jMenuItem_ThongTinCaNhan.setText("Thông tin cá nhân");
        jMenuItem_ThongTinCaNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ThongTinCaNhanActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_ThongTinCaNhan);

        jMenuItem_DoiMK.setIcon(new javax.swing.ImageIcon("D:\\Dai Hoc\\LapTrinhHuongDoiTuong\\QuanLyCuaHangMayTinh\\icon\\Status-dialog-password-icon.png")); // NOI18N
        jMenuItem_DoiMK.setText("Đổi mật khẩu");
        jMenuItem_DoiMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_DoiMKActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_DoiMK);
        jMenu1.add(jSeparator2);

        jMenuItem_DangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_DangXuat.setIcon(new javax.swing.ImageIcon("D:\\Dai Hoc\\LapTrinhHuongDoiTuong\\QuanLyCuaHangMayTinh\\icon\\User-Interface-Logout-icon.png")); // NOI18N
        jMenuItem_DangXuat.setText("Đăng xuất");
        jMenuItem_DangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_DangXuatActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_DangXuat);

        jMenuBar1.add(jMenu1);

        jMenu_DanhMuc.setText("Danh Mục");

        jMenuItem_TaiKhoan.setIcon(new javax.swing.ImageIcon("D:\\Dai Hoc\\LapTrinhHuongDoiTuong\\QuanLyCuaHangMayTinh\\icon\\client-account-template-icon.png")); // NOI18N
        jMenuItem_TaiKhoan.setText("Tài Khoản");
        jMenuItem_TaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_TaiKhoanActionPerformed(evt);
            }
        });
        jMenu_DanhMuc.add(jMenuItem_TaiKhoan);

        jMenuItem_NhanVien.setIcon(new javax.swing.ImageIcon("D:\\Dai Hoc\\LapTrinhHuongDoiTuong\\QuanLyCuaHangMayTinh\\icon\\engineer-icon.png")); // NOI18N
        jMenuItem_NhanVien.setText("Nhân Viên");
        jMenuItem_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_NhanVienActionPerformed(evt);
            }
        });
        jMenu_DanhMuc.add(jMenuItem_NhanVien);

        jMenuItem_KhachHang.setIcon(new javax.swing.ImageIcon("D:\\Dai Hoc\\LapTrinhHuongDoiTuong\\QuanLyCuaHangMayTinh\\icon\\User-Group-icon.png")); // NOI18N
        jMenuItem_KhachHang.setText("Khách Hàng");
        jMenuItem_KhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_KhachHangActionPerformed(evt);
            }
        });
        jMenu_DanhMuc.add(jMenuItem_KhachHang);
        jMenu_DanhMuc.add(jSeparator1);

        jMenuItem_SanPham.setIcon(new javax.swing.ImageIcon("D:\\Dai Hoc\\LapTrinhHuongDoiTuong\\QuanLyCuaHangMayTinh\\icon\\product-icon.png")); // NOI18N
        jMenuItem_SanPham.setText("Sản Phẩm");
        jMenuItem_SanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_SanPhamActionPerformed(evt);
            }
        });
        jMenu_DanhMuc.add(jMenuItem_SanPham);

        jMenuItem_NhaCC.setIcon(new javax.swing.ImageIcon("D:\\Dai Hoc\\LapTrinhHuongDoiTuong\\QuanLyCuaHangMayTinh\\icon\\RefreshCL-icon.png")); // NOI18N
        jMenuItem_NhaCC.setText("Nhà Cung Cấp");
        jMenuItem_NhaCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_NhaCCActionPerformed(evt);
            }
        });
        jMenu_DanhMuc.add(jMenuItem_NhaCC);

        jMenuBar1.add(jMenu_DanhMuc);

        jMenu_HoaDon.setText("Hóa Đơn");

        jMenuItem_HDBan.setIcon(new javax.swing.ImageIcon("D:\\Dai Hoc\\LapTrinhHuongDoiTuong\\QuanLyCuaHangMayTinh\\icon\\news-icon.png")); // NOI18N
        jMenuItem_HDBan.setText("Hóa Đơn Bán");
        jMenuItem_HDBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_HDBanActionPerformed(evt);
            }
        });
        jMenu_HoaDon.add(jMenuItem_HDBan);
        jMenu_HoaDon.add(jSeparator4);

        jMenuItem_TimKiem.setIcon(new javax.swing.ImageIcon("D:\\Dai Hoc\\LapTrinhHuongDoiTuong\\QuanLyCuaHangMayTinh\\icon\\Zoom-icon.png")); // NOI18N
        jMenuItem_TimKiem.setText("Tìm kiếm");
        jMenuItem_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_TimKiemActionPerformed(evt);
            }
        });
        jMenu_HoaDon.add(jMenuItem_TimKiem);

        jMenuBar1.add(jMenu_HoaDon);

        jMenu_DoanhThu.setText("Doanh Thu");
        jMenu_DoanhThu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_DoanhThuMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu_DoanhThu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_DangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_DangXuatActionPerformed
        // TODO add your handling code here:
        dispose();
        LoginSysView loginSysView = new LoginSysView();
        loginSysView.setLocationRelativeTo(null);
        loginSysView.setVisible(true);
    }//GEN-LAST:event_jMenuItem_DangXuatActionPerformed

    private void jMenuItem_ThongTinCaNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ThongTinCaNhanActionPerformed
        // TODO add your handling code here:
        TaiKhoan_SettingView settingView = new TaiKhoan_SettingView(tk);
        settingView.setLocationRelativeTo(null);
        settingView.setVisible(true);
    }//GEN-LAST:event_jMenuItem_ThongTinCaNhanActionPerformed

    private void jMenuItem_DoiMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_DoiMKActionPerformed
        // TODO add your handling code here:
        TaiKhoan_ChangePassView changePassView = new TaiKhoan_ChangePassView(tk);
        changePassView.setLocationRelativeTo(null);
        changePassView.setVisible(true);
    }//GEN-LAST:event_jMenuItem_DoiMKActionPerformed

    private void jMenuItem_KhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_KhachHangActionPerformed
        // TODO add your handling code here:
        Khach_DanhMucView danhMucKHView = new Khach_DanhMucView();
        danhMucKHView.setLocationRelativeTo(null);
        danhMucKHView.setVisible(true);
    }//GEN-LAST:event_jMenuItem_KhachHangActionPerformed

    private void jMenuItem_NhaCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_NhaCCActionPerformed
        // TODO add your handling code here:
        NhaCC_DanhMucView danhMucNhaCCView = new NhaCC_DanhMucView();
        danhMucNhaCCView.setLocationRelativeTo(null);
        danhMucNhaCCView.setVisible(true);
    }//GEN-LAST:event_jMenuItem_NhaCCActionPerformed

    private void jMenuItem_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_SanPhamActionPerformed
        // TODO add your handling code here:
        SanPham_DanhMucView danhMucSanPhamView = new SanPham_DanhMucView();
        danhMucSanPhamView.setLocationRelativeTo(null);
        danhMucSanPhamView.setVisible(true);
    }//GEN-LAST:event_jMenuItem_SanPhamActionPerformed

    private void jMenuItem_HDBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_HDBanActionPerformed
        // TODO add your handling code here:
        HoaDon_BanView hoaDonBanView = new HoaDon_BanView(tk);
        hoaDonBanView.setLocationRelativeTo(null);
        hoaDonBanView.setVisible(true);
    }//GEN-LAST:event_jMenuItem_HDBanActionPerformed

    private void jMenuItem_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_TimKiemActionPerformed
        // TODO add your handling code here:
        HoaDon_TimKiemView timKiemHoaDonView = new HoaDon_TimKiemView();
        timKiemHoaDonView.setLocationRelativeTo(null);
        timKiemHoaDonView.setVisible(true);
    }//GEN-LAST:event_jMenuItem_TimKiemActionPerformed

    private void jMenuItem_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_NhanVienActionPerformed
        // TODO add your handling code here:
        NhanVien_DanhMucView nhanVien_DanhMucView = new NhanVien_DanhMucView();
        nhanVien_DanhMucView.setLocationRelativeTo(null);
        nhanVien_DanhMucView.setVisible(true);
    }//GEN-LAST:event_jMenuItem_NhanVienActionPerformed

    private void jMenuItem_TaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_TaiKhoanActionPerformed
        // TODO add your handling code here:
        TaiKhoan_DanhMucView taiKhoan_DanhMucView = new TaiKhoan_DanhMucView();
        taiKhoan_DanhMucView.setLocationRelativeTo(null);
        taiKhoan_DanhMucView.setVisible(true);
    }//GEN-LAST:event_jMenuItem_TaiKhoanActionPerformed

    private void jMenu_DoanhThuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_DoanhThuMouseClicked
        // TODO add your handling code here:
        DoanhThu_View doanhThu_View = new DoanhThu_View();
        doanhThu_View.setLocationRelativeTo(null);
        doanhThu_View.setVisible(true);
    }//GEN-LAST:event_jMenu_DoanhThuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_DangXuat;
    private javax.swing.JMenuItem jMenuItem_DoiMK;
    private javax.swing.JMenuItem jMenuItem_HDBan;
    private javax.swing.JMenuItem jMenuItem_KhachHang;
    private javax.swing.JMenuItem jMenuItem_NhaCC;
    private javax.swing.JMenuItem jMenuItem_NhanVien;
    private javax.swing.JMenuItem jMenuItem_SanPham;
    private javax.swing.JMenuItem jMenuItem_TaiKhoan;
    private javax.swing.JMenuItem jMenuItem_ThongTinCaNhan;
    private javax.swing.JMenuItem jMenuItem_TimKiem;
    private javax.swing.JMenu jMenu_DanhMuc;
    private javax.swing.JMenu jMenu_DoanhThu;
    private javax.swing.JMenu jMenu_HoaDon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
