///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package DAO;
//
//import Model.Account;
//import Model.HDLD;
//import Model.Luong;
//import Model.NhanVien;
//import Model.PhongBan;
//import java.io.File;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.Scanner;
//
///**
// *
// * @author asus
// */
//public class IOFile {
//
//    public IOFile() {
//    }
//    
////    public void writeNV(ArrayList<NhanVien> list) {
////        try (PrintWriter pw = new PrintWriter(new File("D:\\HTNSTL_TDS_3.0\\HTNSTL\\src\\DSNV.DAT"))){
////            for(NhanVien nv : list) {
////                pw.println(nv.getId());
////                pw.println(nv.getName());
////                pw.println(nv.getRole());
////                pw.println(nv.getRoom());
////                pw.println(nv.getDegree());
////                pw.println(nv.getSpecialize());
////                pw.println(nv.getDate());
////                pw.println(nv.getSex());
////                pw.println(nv.getSdt());
////                pw.println(nv.getCMND());
////                pw.println(nv.getHDLD());
////                
////            }
////        }catch (Exception e) {
////            System.out.println("Got an exception");
////        }
////    }
////    
//    public ArrayList readNV() {
//        ArrayList<NhanVien> list = new ArrayList<>();
//        try(Scanner sc = new Scanner(new File("D:\\HTNSTL_TDS_3.0\\HTNSTL\\src\\DSNV.DAT"))) {
//            while(sc.hasNext()) {
//                NhanVien nv = new NhanVien();
//                nv.setMaNhanVien(sc.nextLine());
//                nv.setTenNhanVien(sc.nextLine());
//                nv.setQuyen(sc.nextLine());
//                nv.setMaPhongBan(sc.nextLine());
//                nv.setHocVan(sc.nextLine());
//                nv.setChuyenMon(sc.nextLine());
//                nv.setNgaySinh(sc.nextLine());
//                nv.setGioiTinh(sc.nextLine());
//                nv.setSoDienThoai(sc.nextLine());
//                nv.setCMND(sc.nextLine());
//                nv.setMaHDLD(sc.nextLine());;
//               
//                list.add(nv);
//            }
//        } catch (Exception e) {
//        }
//        
//        return list;
//    }
//    
//    public void writeHDLD(ArrayList<HDLD> list) {
//        try (PrintWriter pw = new PrintWriter(new File("D:\\HTNSTL_TDS_3.0\\HTNSTL\\src\\HDLD.DAT"))){
//            for (HDLD hdld : list) {
//                pw.println(hdld.getIdHDLD());
//                pw.println(hdld.getTypeHD());
//                pw.println(hdld.getLuongCB());
//                pw.println(hdld.getHeSoLuong());
//                pw.println(hdld.getNgayBD());
//                pw.println(hdld.getNgayKT());
//            }
//        }catch (Exception e) {
//            System.out.println("Got an exception");
//        }
//    }
//    
//    public ArrayList readHDLD() {
//        ArrayList<HDLD> list = new ArrayList<>();
//        try(Scanner sc = new Scanner(new File("D:\\HTNSTL_TDS_3.0\\HTNSTL\\src\\HDLD.DAT"))) {
//            while(sc.hasNext()) {
//                HDLD hdld = new HDLD();
//                hdld.setIdHDLD(sc.nextLine());
//                hdld.setTypeHD(sc.nextLine());
//                hdld.setLuongCB(sc.nextLine());
//                hdld.setHeSoLuong(sc.nextLine());
//                hdld.setNgayBD(sc.nextLine());
//                hdld.setNgayKT(sc.nextLine());
//                list.add(hdld);
//            }
//        } catch (Exception e) {
//        }
//        
//        return list;
//    }
//    
//    public void writeLuong(ArrayList<Luong> list) {
//        try (PrintWriter pw = new PrintWriter(new File("D:\\HTNSTL_TDS_3.0\\HTNSTL\\src\\LUONG.DAT"))){
//            for (Luong luong : list) {
//                pw.println(luong.getIdNhanVien());
//                pw.println(luong.getTenNhanVien());
//                pw.println(luong.getLuongCb());
//                pw.println(luong.getHsLuong());
//                pw.println(luong.getTienThuong());
//                pw.println(luong.getLuongUng());
//                pw.println(luong.getTienPhat());
//                pw.println(luong.getTongLuong());
//            }
//        }catch (Exception e) {
//            System.out.println("Got an exception");
//        }
//    }
//    
//    public ArrayList readLuong() {
//        ArrayList<Luong> list = new ArrayList<>();
//        try(Scanner sc = new Scanner(new File("D:\\HTNSTL_TDS_3.0\\HTNSTL\\src\\LUONG.DAT"))) {
//            while(sc.hasNext()) {
//                Luong luong = new Luong();
//                luong.setIdNhanVien(sc.nextLine());
//                sc.nextLine();
//                luong.setLuongCb(sc.nextLine());
//                luong.setHsLuong(sc.nextLine());
//                luong.setTienThuong(sc.nextLine());
//                luong.setLuongUng(sc.nextLine());
//                luong.setTienPhat(sc.nextLine());
//                luong.setTongLuong(sc.nextLine());
//                
//                list.add(luong);
//            }
//        } catch (Exception e) {
//        }
//        
//        return list;
//    }
//    
//    public void writePhongBan(ArrayList<PhongBan> list) {
//        try (PrintWriter pw = new PrintWriter(new File("D:\\HTNSTL_TDS_3.0\\HTNSTL\\src\\PHONGBAN.DAT"))) {
//            for (PhongBan phongBan : list) {
//                pw.println(phongBan.getMaPhongBan());
//                pw.println(phongBan.getTenPhongBan());
//            }
//        } catch (Exception e) {
//            System.out.println("Got an exception");
//        }
//    }
//    
//    public ArrayList<PhongBan> readPhongBan() {
//        ArrayList<PhongBan> list = new ArrayList<>();
//        try(Scanner sc = new Scanner(new File("D:\\HTNSTL_TDS_3.0\\HTNSTL\\src\\PHONGBAN.DAT"))) {
//            while(sc.hasNext()) {
//                PhongBan phongBan = new PhongBan();
//                phongBan.setMaPhongBan(sc.nextLine());
//                phongBan.setTenPhongBan(sc.nextLine());
//                
//                list.add(phongBan);
//            }
//        } catch (Exception e) {
//        }
//        
//        return list;
//    }
//    
//    public void writeAccout(ArrayList<Account> list) {
//        try (PrintWriter pw = new PrintWriter(new File("D:\\HTNSTL_TDS_3.0\\HTNSTL\\src\\ACCOUNT.DAT"))){
//            for(Account acc: list) {
//                pw.println(acc.getUsername());
//                pw.println(acc.getPassword());
//                pw.println(acc.getAccess());
//            }
//        }catch (Exception e) {
//            System.out.println("Got an exception");
//        }
//    }
//    
//    public ArrayList<Account> readAccount() {
//        ArrayList<Account> list = new ArrayList<>();
//        try(Scanner sc = new Scanner(new File("D:\\HTNSTL_TDS_3.0\\HTNSTL\\src\\ACCOUNT.DAT"))) {
//            while(sc.hasNext()) {
//                Account acc = new Account();
//                acc.setUsername(sc.nextLine());
//                acc.setPassword(sc.nextLine());
//                acc.setAccess(sc.nextLine());
//                list.add(acc);
//            }
//        } catch (Exception e) {
//        }
//        
//        return list;
//    }
//    
//   
//}
