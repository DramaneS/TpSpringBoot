-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mar. 05 oct. 2021 à 11:17
-- Version du serveur : 10.4.20-MariaDB
-- Version de PHP : 7.3.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `odk_db`
--

-- --------------------------------------------------------

--
-- Structure de la table `apprenant`
--

CREATE TABLE `apprenant` (
  `id_apprenant` int(11) NOT NULL,
  `age_apprenant` int(11) NOT NULL,
  `date_creation` date DEFAULT NULL,
  `date_modification` date DEFAULT NULL,
  `email_apprenant` varchar(255) DEFAULT NULL,
  `genre_apprenant` varchar(255) DEFAULT NULL,
  `login_apprenant` varchar(255) DEFAULT NULL,
  `nom_apprenant` varchar(255) DEFAULT NULL,
  `password_apprenant` varchar(255) DEFAULT NULL,
  `prenom_apprenant` varchar(255) DEFAULT NULL,
  `status_apprenant` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `apprenant`
--

INSERT INTO `apprenant` (`id_apprenant`, `age_apprenant`, `date_creation`, `date_modification`, `email_apprenant`, `genre_apprenant`, `login_apprenant`, `nom_apprenant`, `password_apprenant`, `prenom_apprenant`, `status_apprenant`) VALUES
(1, 32, '2020-09-04', '2021-11-10', 'dra213@gmail.com', 'Masculin', 'mallaDesign', 'DIARRA', 'YHJKLL', 'Dramane', 0),
(4, 3, '2020-09-04', '2021-11-10', 'dra213@gmail.com', 'Masculin', 'mallaDesign', 'KONATE', 'YHJKLL', 'ggg', 0),
(5, 27, '2020-09-04', '2021-11-10', 'dra213@gmail.com', 'Masculin', 'dra1', 'DIARRA', 'YHJKLL', 'Dramane', 0),
(6, 25, '2020-09-04', '2021-11-10', 'malla213@gmail.com', 'Masculin', 'malladesign', 'KONE', 'bcjdjij', 'Mohamed Lamine', 1);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `apprenant`
--
ALTER TABLE `apprenant`
  ADD PRIMARY KEY (`id_apprenant`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `apprenant`
--
ALTER TABLE `apprenant`
  MODIFY `id_apprenant` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
