-- phpMyAdmin SQL Dump
-- version 4.9.2deb1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Aug 08, 2021 at 09:53 AM
-- Server version: 10.3.22-MariaDB-1
-- PHP Version: 7.3.15-3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `smk_nasional`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id_admin` int(5) NOT NULL,
  `nama` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id_admin`, `nama`) VALUES
(16000, 'Bayu Saputra'),
(16021, 'Widi Afandi'),
(17083, 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `pendaftaran`
--

CREATE TABLE `pendaftaran` (
  `id_pendaftaran` int(5) NOT NULL,
  `nama` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `alamat` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ttl` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL,
  `jenis_kelamin` char(1) COLLATE utf8mb4_unicode_ci NOT NULL,
  `no_hp` varchar(12) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `total_nilai` float NOT NULL,
  `jurusan_pil1` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL,
  `jurusan_pil2` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL,
  `status_lulus` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `status_test` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `pendaftaran`
--

INSERT INTO `pendaftaran` (`id_pendaftaran`, `nama`, `alamat`, `ttl`, `jenis_kelamin`, `no_hp`, `total_nilai`, `jurusan_pil1`, `jurusan_pil2`, `status_lulus`, `status_test`) VALUES
(21002, 'Rizky Ade Hermawan', 'Sijeruk, Sragi, Pekalongan', 'Pekalongan, 19-01-2001', 'L', '085289790011', 32, 'TKR', 'AK', 'Evaluasi', 0),
(21003, 'Ayu Wulan', 'Sragi Pekalongan', 'Pemalang, 10-09-2001', 'P', '087884225211', 46.5, 'AK', 'TKJ', 'AK', 1),
(21007, 'widi afandi', 'pekalongan', 'pekalongan, 25-05-2001', 'L', '082314795845', 36, 'TKJ', 'TKR', 'Evaluasi', 1),
(21009, 'Bayu Setyaji', 'Tegal Lontar, Pekalongan', 'Pekalonga, 12-09-2000', 'L', '082314795845', 46.2, 'TKR', 'TKJ', 'TKR', 1),
(21010, 'Ahmad Saiful H', 'Tegal Suruh, Pekalongan', 'Peklongan, 12-09-2000', 'L', '0987', 39.9, 'TKJ', 'TKR', 'TKJ', 0),
(21011, 'Bayu S', 'Sragi, Pekalongan', 'Pekalongan, 07-08-2001', 'L', '0823156723', 37.1, 'TKR', 'TKJ', 'TKR', 0),
(21012, 'Arul', 'Pekalongan', 'Pekalongan, 25-07-2016', 'L', '082314567835', 50, 'TKR', 'TKJ', 'TKR', 1),
(21013, 'Widi', 'pekalomgan', 'pekalongan, 06-01-2003', 'L', '12345', 36.1, 'TKR', 'TKJ', 'Evaluasi', 1),
(21014, 'fandi', 'ssss', 'sss', 'L', '0987', 38, 'TKJ', 'TKR', 'Evaluasi', 0),
(21015, 'widia', 'q', 'd', 'L', 'd', 12, 'TKR', 'TKJ', 'Tidak Lulus', 1),
(21016, 'a', 'a', 'a', 'L', 'a', 5, 'AK', 'TKJ', 'Evaluasi', 1),
(21017, 'wid', 'w', 'pekalongan, 06-01-2001', 'L', '082314795845', 34, 'TKJ', 'TKR', 'TKJ', 1),
(21018, 'Widi Afandiu', 'Pekalongan', 'Pekalongan, 06-01-2001', 'L', '082314795845', 35, 'TKJ', 'TKR', 'TKJ', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indexes for table `pendaftaran`
--
ALTER TABLE `pendaftaran`
  ADD PRIMARY KEY (`id_pendaftaran`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id_admin` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17084;

--
-- AUTO_INCREMENT for table `pendaftaran`
--
ALTER TABLE `pendaftaran`
  MODIFY `id_pendaftaran` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21019;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
