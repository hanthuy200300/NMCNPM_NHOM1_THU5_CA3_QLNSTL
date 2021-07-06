-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 30, 2021 at 07:22 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tds_company`
--

-- --------------------------------------------------------

--
-- Table structure for table `chucvu`
--

CREATE TABLE `chucvu` (
  `maChucVu` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `tenChucVu` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `chucvu`
--

INSERT INTO `chucvu` (`maChucVu`, `tenChucVu`) VALUES
('CT', 'Chủ Tịch'),
('GD', 'Giám Đốc'),
('NV', 'Nhân Viên'),
('PCT', 'Phó Chủ Tịch'),
('PGD', 'Phó Giám Đốc'),
('PP', 'Phó Phòng'),
('TP', 'Trưởng Phòng');

-- --------------------------------------------------------

--
-- Table structure for table `hopdonglaodong`
--

CREATE TABLE `hopdonglaodong` (
  `maHDLD` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `loaiHD` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `luongCB` int(11) NOT NULL,
  `heSoLuong` double NOT NULL,
  `ngayBD` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ngayKT` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `hopdonglaodong`
--

INSERT INTO `hopdonglaodong` (`maHDLD`, `loaiHD`, `luongCB`, `heSoLuong`, `ngayBD`, `ngayKT`) VALUES
('HD001', 'Chính Thức', 5000000, 1, '25062016', '25062021'),
('HD0013', 'Chính Thức', 1000000, 2, '29062021', '29062022'),
('HD002', 'Thử Việc', 2000000, 2, '25122018', '25122022'),
('HD006', 'Chính Thức', 230000, 10, '12032019', '12032021'),
('HD007', 'Chính Thức', 5000000, 1, '25062016', '25062021'),
('HD009', 'Chính Thức', 5000000, 1, '12092019', '12092025'),
('HD010', 'Thử Việc', 3900000, 2, '19122016', '19122026'),
('HD011', 'Chính Thức', 2500000, 2, '01012015', '01012022');

-- --------------------------------------------------------

--
-- Table structure for table `luong`
--

CREATE TABLE `luong` (
  `maNhanVien` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `luongCB` int(11) NOT NULL,
  `heSoLuong` double NOT NULL,
  `tienThuong` int(11) NOT NULL,
  `luongUng` int(11) NOT NULL,
  `tienPhat` int(11) NOT NULL,
  `tongLuong` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `luong`
--

INSERT INTO `luong` (`maNhanVien`, `luongCB`, `heSoLuong`, `tienThuong`, `luongUng`, `tienPhat`, `tongLuong`) VALUES
('A001', 1000000, 2, 0, 0, 0, 1000000000000),
('A002', 1000, 2, 0, 0, 0, 0),
('A006', 2000000, 2, 500000, 3000000, 1000000, 500000),
('A009', 5000000, 1, 0, 300000, 5000000, -300000),
('A010', 3900000, 2, 0, 0, 0, 7800000),
('A011', 2500000, 2, 1000000, 300000, 5000000, 700000);

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `maNhanVien` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `tenNhanVien` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `maPhongBan` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `hocVan` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `chuyenNganh` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `ngaySinh` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `gioiTinh` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `CMND` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `soDienThoai` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `maChucVu` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `maHDLD` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`maNhanVien`, `tenNhanVien`, `maPhongBan`, `hocVan`, `chuyenNganh`, `ngaySinh`, `gioiTinh`, `CMND`, `soDienThoai`, `maChucVu`, `maHDLD`) VALUES
('A001', 'Phan Thành Đoan', 'PR', 'Đại Học', 'Công nghệ thông tin', '16122000', 'nam', '251171509', '0862083141', 'PGD', 'HD0013'),
('A002', 'Luu Thi Hong Tham', 'NS', 'Cao Dang', 'Thiet bi dien tu', '31122000', 'nu', '2365987456', '0369856324', 'NV', 'HD002'),
('A006', 'Ly Van Hien', 'NS', 'Dai hoc', 'Cong nghe', '01011979', 'Nam', '222555369', '0123659874', 'NV', 'HD006'),
('A009', 'Vi Tieu Bao', 'NS', 'Dai hoc', 'Hach toan luong', '23121989', 'Nam', '12330256326', '0326596312', 'NV', 'HD009'),
('A010', 'Phung Minh Dat', 'HC', 'Cao dang', 'Giay to cong chung', '31052000', 'Nam', '965896583', '1596325874', 'TP', 'HD010'),
('A011', 'Tong Quoc Dat', 'TC', 'Dai hoc', 'Lich cong tac', '30062006', 'Nam', '654789963', '0256653987', 'PP', 'HD011');

-- --------------------------------------------------------

--
-- Table structure for table `phieuthuchi`
--

CREATE TABLE `phieuthuchi` (
  `maPhieu` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `tenChuPhieu` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `loaiPhieu` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `diaChi` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `lyDo` text COLLATE utf8_unicode_ci NOT NULL,
  `thoiGian` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `tien` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `phieuthuchi`
--

INSERT INTO `phieuthuchi` (`maPhieu`, `tenChuPhieu`, `loaiPhieu`, `diaChi`, `lyDo`, `thoiGian`, `tien`) VALUES
('PC001', 'Phan Thành Đoan', 'PHIỂU CHI', 'KTX Khu B', 'Mua vật liệu', '30062021', '100000');

-- --------------------------------------------------------

--
-- Table structure for table `phongban`
--

CREATE TABLE `phongban` (
  `maPhongBan` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `tenPhongBan` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `phongban`
--

INSERT INTO `phongban` (`maPhongBan`, `tenPhongBan`) VALUES
('HC', 'Hanh Chinh'),
('KE', 'Ke Toan'),
('KT', 'Kinh Te'),
('MK', 'Marketing'),
('NS', 'Nhan Su'),
('PR', 'Truyen Thong'),
('QS', 'Quan Su'),
('QT', 'Quan Tri'),
('QTKD', 'Quan Tri Kinh Doanh'),
('TC', 'Tai Chinh');

-- --------------------------------------------------------

--
-- Table structure for table `taikhoan`
--

CREATE TABLE `taikhoan` (
  `stt` int(11) NOT NULL,
  `tendangnhap` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `matkhau` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `quyen` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `taikhoan`
--

INSERT INTO `taikhoan` (`stt`, `tendangnhap`, `matkhau`, `quyen`) VALUES
(2, 'ketoan', 'ketoan', 'ketoan'),
(3, 'admin', 'admin', 'admin'),
(4, 'nhansu', 'nhansu', 'nhansu');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chucvu`
--
ALTER TABLE `chucvu`
  ADD PRIMARY KEY (`maChucVu`);

--
-- Indexes for table `hopdonglaodong`
--
ALTER TABLE `hopdonglaodong`
  ADD PRIMARY KEY (`maHDLD`);

--
-- Indexes for table `luong`
--
ALTER TABLE `luong`
  ADD PRIMARY KEY (`maNhanVien`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`maNhanVien`),
  ADD KEY `fk_maPhongBan` (`maPhongBan`),
  ADD KEY `fk_maHDLD` (`maHDLD`),
  ADD KEY `fk_maChucVu` (`maChucVu`);

--
-- Indexes for table `phieuthuchi`
--
ALTER TABLE `phieuthuchi`
  ADD PRIMARY KEY (`maPhieu`);

--
-- Indexes for table `phongban`
--
ALTER TABLE `phongban`
  ADD PRIMARY KEY (`maPhongBan`);

--
-- Indexes for table `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`stt`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `taikhoan`
--
ALTER TABLE `taikhoan`
  MODIFY `stt` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `luong`
--
ALTER TABLE `luong`
  ADD CONSTRAINT `fk_maNhanVien_Luong` FOREIGN KEY (`maNhanVien`) REFERENCES `nhanvien` (`maNhanVien`);

--
-- Constraints for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `fk_maChucVu` FOREIGN KEY (`maChucVu`) REFERENCES `chucvu` (`maChucVu`),
  ADD CONSTRAINT `fk_maHDLD` FOREIGN KEY (`maHDLD`) REFERENCES `hopdonglaodong` (`maHDLD`),
  ADD CONSTRAINT `fk_maPhongBan` FOREIGN KEY (`maPhongBan`) REFERENCES `phongban` (`maPhongBan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
